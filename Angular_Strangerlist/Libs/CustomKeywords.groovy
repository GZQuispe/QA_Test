
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String


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

def static "homePage.ItemDetailsSection.clickCreateItemButton"() {
    (new homePage.ItemDetailsSection()).clickCreateItemButton()
}

def static "homePage.ItemDetailsSection.clickUpdateItemButton"() {
    (new homePage.ItemDetailsSection()).clickUpdateItemButton()
}

def static "strangerList.HomePage.navigate"() {
    (new strangerList.HomePage()).navigate()
}

def static "homePage.ListOfItemsSection.verifyNewItemCreated"(
    	String filepath	
     , 	String text	) {
    (new homePage.ListOfItemsSection()).verifyNewItemCreated(
        	filepath
         , 	text)
}

def static "homePage.ListOfItemsSection.clickFirstEditButton"() {
    (new homePage.ListOfItemsSection()).clickFirstEditButton()
}

def static "homePage.ListOfItemsSection.verifyItemIsUpdated"(
    	String text	) {
    (new homePage.ListOfItemsSection()).verifyItemIsUpdated(
        	text)
}

def static "homePage.ListOfItemsSection.deleteNewestItem"() {
    (new homePage.ListOfItemsSection()).deleteNewestItem()
}

def static "homePage.ListOfItemsSection.verifyItemDeleted"(
    	String filepath	
     , 	String text	) {
    (new homePage.ListOfItemsSection()).verifyItemDeleted(
        	filepath
         , 	text)
}
