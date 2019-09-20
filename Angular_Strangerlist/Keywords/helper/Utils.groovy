package helper

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil

import internal.GlobalVariable

public class Utils {

	public String getFilename(String filepath){
		int lastSlashIndex = filepath.lastIndexOf("\\") + 1
		return filepath.substring(lastSlashIndex)
	}

	public TestObject addXpathToTestObject(TestObject testObject, String xpath){
		return 	testObject.addProperty("xpath", ConditionType.EQUALS, xpath)
	}
	
	public TestObject addImageContainsXpathToTestObject(TestObject testObject,String filepath){
		String filename = new Utils().getFilename(filepath)
		String imageXpath = "//img[contains(@src,'" + filename + "')]"
		return new Utils().addXpathToTestObject(testObject,imageXpath)
	}
	
	@Keyword
	def setDirectoryPath(){
		GlobalVariable.DIRECTORY_PATH = RunConfiguration.getProjectDir() + '\\'
		GlobalVariable.DIRECTORY_PATH = GlobalVariable.DIRECTORY_PATH.toString().replace('/', '\\')
	}
}
