package homePage

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class ItemDetailsSection {

	private static final TestObject BUTTON_CHOOSE_FILE = findTestObject('Object Repository/HomePage/ItemDetailsSections/Button_Choose_File')
	private static final TestObject INPUT_TEXT_AREA	   = findTestObject('Object Repository/HomePage/ItemDetailsSections/Input_Text_Area')
	private static final TestObject BUTTON_CREATE_ITEM = findTestObject('Object Repository/HomePage/ItemDetailsSections/Button_Create_Item')
	private static final TestObject BUTTON_UPDATE_ITEM = findTestObject('Object Repository/HomePage/ItemDetailsSections/Button_Update_Item')

	@Keyword
	def attachImage(String filePath){
		WebUI.sendKeys(BUTTON_CHOOSE_FILE, filePath)
		WebUI.takeScreenshot()
	}

	@Keyword
	def enterText(String text){
		WebUI.setText(INPUT_TEXT_AREA, text)
		WebUI.takeScreenshot()
	}

	@Keyword
	def clickCreateItemButton(){
		WebUI.verifyElementClickable(BUTTON_CREATE_ITEM)
		WebUI.click(BUTTON_CREATE_ITEM)
		WebUI.takeScreenshot()
	}

	@Keyword
	def clickUpdateItemButton(){
		WebUI.verifyElementClickable(BUTTON_UPDATE_ITEM)
		WebUI.click(BUTTON_UPDATE_ITEM)
		WebUI.waitForElementNotPresent(BUTTON_UPDATE_ITEM, GlobalVariable.DEFAULT_WAIT)
		WebUI.takeScreenshot()
	}
}
