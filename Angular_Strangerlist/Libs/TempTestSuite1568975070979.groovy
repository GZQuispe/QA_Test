import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/QA_Test')

suiteProperties.put('name', 'QA_Test')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\gquispe\\Documents\\Stensul\\QA_Test\\Angular_Strangerlist\\Reports\\QA_Test\\20190920_072426\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/QA_Test', suiteProperties, [new TestCaseBinding('Test Cases/TC1_Create_An_Item', 'Test Cases/TC1_Create_An_Item',  [ 'itemDescription' : 'Cat' , 'itemImageFilePath' : 'Data_Sets\\cat.jpg' ,  ]), new TestCaseBinding('Test Cases/TC2_Edit_Another_Existing_Item', 'Test Cases/TC2_Edit_Another_Existing_Item',  [ 'newDescription' : 'New Description' ,  ]), new TestCaseBinding('Test Cases/TC3_Delete_The_Item_Created', 'Test Cases/TC3_Delete_The_Item_Created',  [ 'itemDescription' : 'Cat' , 'itemImageFilePath' : 'Data_Sets\\cat.jpg' ,  ]), new TestCaseBinding('Test Cases/TC4_Check_Max_Long_In_Description', 'Test Cases/TC4_Check_Max_Long_In_Description',  [ 'itemDescription' : 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec at commodo nulla, sed dictum magna. Proin nunc est, commodo vitae urna quis, tempus volutpat nunc. Vestibulum vitae iaculis felis, et dapibus turpis. Cras sed bibendum enim. Vestibulum posuere quam mattis vulputate dignissim orci aliquam.' ,  ]), new TestCaseBinding('Test Cases/TC5_Check_If_Exists_In_The_List_The_Item_With_Text', 'Test Cases/TC5_Check_If_Exists_In_The_List_The_Item_With_Text',  [ 'itemDescription' : 'Creators: Matt Duffer, Ross Duffer' ,  ])])
