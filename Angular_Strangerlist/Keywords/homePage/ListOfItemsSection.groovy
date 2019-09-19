package homePage

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import helper.Utils
import internal.GlobalVariable

public class ListOfItemsSection {

	private static final TestObject BUTTON_EDIT_ITEM_1			= findTestObject("Object Repository/HomePage/ListOfItemsSection/Button_Edit_1")
	private static final TestObject BUTTON_DELETE_LAST_ITEM 	= findTestObject("Object Repository/HomePage/ListOfItemsSection/Button_Delete_Last")
	private static final TestObject TEXT_ITEM_1	  				= findTestObject("Object Repository/HomePage/ListOfItemsSection/Text_Item_1")
	private static final TestObject BUTTON_DELETE_CONFIRMATION  = findTestObject("Object Repository/HomePage/ItemDetailsSections/DeleteItemPopUp/Button_Yes_Delete_It")
	
	private TestObject imageItem = new TestObject("Image Item")

	@Keyword
	def verifyNewItemCreated(String filepath, String text){
		assert true == imageIsVisible(filepath)
		assert true == textIsVisible(text)
	}

	def imageIsVisible(String filepath){
		String filename = new Utils().getFilename(filepath)
		String imageXpath = "//img[contains(@src,'" + filename + "')]"
		imageItem  = new Utils().addXpathToTestObject(imageItem,imageXpath)

		return WebUI.waitForElementVisible(imageItem, GlobalVariable.DEFAULT_WAIT)
	}	

	def textIsVisible(String text){
		return 	WebUI.verifyTextPresent(text, false, FailureHandling.OPTIONAL)
	}

	@Keyword
	def clickFirstEditButton(){
		WebUI.click(BUTTON_EDIT_ITEM_1)
		WebUI.takeScreenshot()
	}
	
	@Keyword
	def verifyItemIsUpdated(String text){
		assert text == WebUI.getText(TEXT_ITEM_1)
	}
	
	@Keyword
	def deleteNewestItem(){
		WebUI.click(BUTTON_DELETE_LAST_ITEM)
		WebUI.click(BUTTON_DELETE_CONFIRMATION)
		WebUI.takeScreenshot()
	}
	
	@Keyword
	def verifyItemDeleted(String filepath, String text){
		assert false == imageIsVisible(filepath)
		assert false == textIsVisible(text)
	}
}
