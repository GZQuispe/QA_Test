
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String


def static "helper.Utils.setDirectoryPath"() {
    (new helper.Utils()).setDirectoryPath()
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

def static "homePage.ListOfItemsSection.verifyIfItemWithTextExists"(
    	String text	) {
    (new homePage.ListOfItemsSection()).verifyIfItemWithTextExists(
        	text)
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

def static "homePage.ItemDetailsSection.clickCreateItemButton"() {
    (new homePage.ItemDetailsSection()).clickCreateItemButton()
}

def static "homePage.ItemDetailsSection.clickUpdateItemButton"() {
    (new homePage.ItemDetailsSection()).clickUpdateItemButton()
}

def static "homePage.ItemDetailsSection.verifyCreateItemButtonDisabled"() {
    (new homePage.ItemDetailsSection()).verifyCreateItemButtonDisabled()
}

def static "strangerList.HomePage.navigate"() {
    (new strangerList.HomePage()).navigate()
}
