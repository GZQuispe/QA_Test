import com.kms.katalon.core.util.KeywordUtil

CustomKeywords.'strangerList.HomePage.navigate'()

CustomKeywords.'homePage.ItemDetailsSection.enterText'(itemDescription)

KeywordUtil.logInfo("Text character count: " + itemDescription.toString().length())

CustomKeywords.'homePage.ItemDetailsSection.verifyCreateItemButtonDisabled'()