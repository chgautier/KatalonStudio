import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
int n,count=0;



for (int i = 0; i<5; i++)

{


WebUI.click(findTestObject('Page_Centreon - IT  Network Monitor (1)/a_Configuration'))

WebUI.click(findTestObject('Page_Centreon - IT  Network Monitor (1)/a_Hosts'))

WebUI.click(findTestObject('Page_Centreon - IT  Network Monitor (1)/a_Add'))

WebUI.setText(findTestObject('Page_Centreon - IT  Network Monitor (1)/input_host_name'), variable)

WebUI.setText(findTestObject('Page_Centreon - IT  Network Monitor (1)/input_host_alias'), 'new_host_katalon')

WebUI.setText(findTestObject('Page_Centreon - IT  Network Monitor (1)/input_host_address'), '127.0.0.1')

WebUI.setText(findTestObject('Page_Centreon - IT  Network Monitor (1)/input_host_snmp_community'), 'public')

WebUI.selectOptionByValue(findTestObject('Page_Centreon - IT  Network Monitor (1)/select_12c3'), '2c', true)

WebUI.click(findTestObject('Page_Centreon - IT  Network Monitor (1)/a_Notification'))

WebUI.click(findTestObject('Page_Centreon - IT  Network Monitor (1)/a_Relations'))

WebUI.click(findTestObject('Page_Centreon - IT  Network Monitor (1)/a_Data Processing'))

WebUI.click(findTestObject('Page_Centreon - IT  Network Monitor (1)/a_Host Extended Infos'))

WebUI.click(findTestObject('Page_Centreon - IT  Network Monitor (1)/input_submitA'))

while (count<n) {
	variable= (variable+"new"+count);
	count++;
}

}
