import com.kms.katalon.core.util.KeywordUtil

import internal.GlobalVariable

CustomKeywords.'strangerList.HomePage.navigate'()

CustomKeywords.'homePage.ItemDetailsSection.attachImage'(GlobalVariable.DIRECTORY_PATH + itemImageFilePath)

CustomKeywords.'homePage.ItemDetailsSection.enterText'(itemDescription)

CustomKeywords.'homePage.ItemDetailsSection.clickCreateItemButton'()

CustomKeywords.'homePage.ListOfItemsSection.verifyNewItemCreated'(itemImageFilePath, itemDescription)