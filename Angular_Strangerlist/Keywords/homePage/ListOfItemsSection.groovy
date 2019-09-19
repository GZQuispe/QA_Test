package homePage

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class ListOfItemsSection {

	private TestObject imageItem = new TestObject("Image Item")

	@Keyword
	def verifyNewItemCreated(String filepath, String text){
		verifyImageIsVisible(filepath)
		verifyTextIsVisible(text)
	}

	def verifyImageIsVisible(String filepath){
		String filename = getFilename(filepath)
		String imageXpath = "//img[contains(@src,'" + filename + "')]"
		imageItem.addProperty("xpath", ConditionType.EQUALS, imageXpath)
		assert true == WebUI.waitForElementVisible(imageItem, GlobalVariable.DEFAULT_WAIT)
	}

	def getFilename(String filepath){
		int lastSlashIndex = filepath.lastIndexOf("\\") + 1
		return filepath.substring(lastSlashIndex)
	}

	def verifyTextIsVisible(String text){
		assert true == WebUI.verifyTextPresent(text, false)
	}
}
