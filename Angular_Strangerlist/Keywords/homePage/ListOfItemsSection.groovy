package homePage

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import helper.Utils
import internal.GlobalVariable

public class ListOfItemsSection {

	private static final TestObject BUTTON_EDIT_1 = findTestObject("Object Repository/HomePage/ListOfItemsSection/Button_Edit_1")
	private static final TestObject TEXT_ITEM_1	  = findTestObject("Object Repository/HomePage/ListOfItemsSection/Text_Item_1")
	private TestObject imageItem = new TestObject("Image Item")

	@Keyword
	def verifyNewItemCreated(String filepath, String text){
		verifyImageIsVisible(filepath)
		verifyTextIsVisible(text)
	}

	def verifyImageIsVisible(String filepath){
		String filename = Utils.getFilename(filepath)
		String imageXpath = "//img[contains(@src,'" + filename + "')]"
		imageItem  = Utils.addXpathToTestObject(imageItem,imageXpath)

		assert true == WebUI.waitForElementVisible(imageItem, GlobalVariable.DEFAULT_WAIT)
	}	

	def verifyTextIsVisible(String text){
		assert true == WebUI.verifyTextPresent(text, false)
	}

	@Keyword
	def clickFirstEditButton(){
		WebUI.click(BUTTON_EDIT_1)
		WebUI.takeScreenshot()
	}
	
	@Keyword
	def verifyItemIsUpdated(String text){
		assert text == WebUI.getText(TEXT_ITEM_1)
	}
}
