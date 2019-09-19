package helper

import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject

public abstract class Utils {
	
	public String getFilename(String filepath){
		int lastSlashIndex = filepath.lastIndexOf("\\") + 1
		return filepath.substring(lastSlashIndex)
	}
	
	public TestObject addXpathToTestObject(TestObject testObject, String xpath){
		return 	testObject.addProperty("xpath", ConditionType.EQUALS, xpath)
	}
}
