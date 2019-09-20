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

	private TestObject genericImageItem = new TestObject("Image Item")
	private TestObject genericTextItem  = new TestObject("Text Item")
	
	@Keyword
	def verifyNewItemCreated(String filepath, String text){
		assert true == imageIsVisible(filepath)
		assert true == textIsVisible(text)
	}

	def imageIsVisible(String filepath){
		genericImageItem  = new Utils().addImageContainsXpathToTestObject(genericImageItem, filepath)
		return WebUI.waitForElementPresent(genericImageItem, GlobalVariable.DEFAULT_WAIT)
	}

	def imageNotVisible(String filepath){
		genericImageItem  = new Utils().addImageContainsXpathToTestObject(genericImageItem, filepath)
		return WebUI.waitForElementNotPresent(genericImageItem, GlobalVariable.DEFAULT_WAIT)
	}
	
	def textIsVisible(String text){
		return 	WebUI.verifyTextPresent(text, false, FailureHandling.OPTIONAL)
	}
	
	def textIsNotVisible(String text){
		return 	WebUI.verifyTextNotPresent(text, false, FailureHandling.OPTIONAL)
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
		WebUI.delay(1)
		WebUI.takeScreenshot()
	}

	@Keyword
	def verifyItemDeleted(String filepath, String text){
		assert true == imageNotVisible(filepath)
		assert true == textIsNotVisible(text)
	}
	
	@Keyword
	def verifyIfItemWithTextExists(String text){
		String xpathItem = "//li[@ng-repeat='item in items']//*[text()='" + text + "']"
		genericTextItem  = new Utils().addXpathToTestObject(genericTextItem,xpathItem)
		
		assert true == WebUI.waitForElementVisible(genericTextItem, GlobalVariable.DEFAULT_WAIT,FailureHandling.OPTIONAL)
	}
}
