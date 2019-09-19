
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String


def static "homePage.ListOfItemsSection.verifyNewItemCreated"(
    	String filepath	
     , 	String text	) {
    (new homePage.ListOfItemsSection()).verifyNewItemCreated(
        	filepath
         , 	text)
}

def static "homePage.ItemDetailsSection.attachImage"(
    	String filePath	) {
    (new homePage.ItemDetailsSection()).attachImage(
        	filePath)
}

def static "homePage.ItemDetailsSection.enterText"(
    	String text	) {
    (new homePage.ItemDetailsSection()).enterText(
        	text)
}

def static "homePage.ItemDetailsSection.clickButtonCreateItem"() {
    (new homePage.ItemDetailsSection()).clickButtonCreateItem()
}

def static "strangerList.HomePage.navigate"() {
    (new strangerList.HomePage()).navigate()
}
