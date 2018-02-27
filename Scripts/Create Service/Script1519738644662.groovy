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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://10.30.2.47/centreon/main.php')

WebUI.click(findTestObject('Page_Centreon - IT  Network Monitor (2)/a_Configuration'))

WebUI.click(findTestObject('Page_Centreon - IT  Network Monitor (2)/a_Services'))

WebUI.click(findTestObject('Page_Centreon - IT  Network Monitor (2)/a_Add'))

WebUI.setText(findTestObject('Page_Centreon - IT  Network Monitor (2)/input_service_description'), 'new')

WebUI.click(findTestObject('Page_Centreon - IT  Network Monitor (2)/div_Centreon-Server'))

WebUI.click(findTestObject('Page_Centreon - IT  Network Monitor (2)/span_Template'))

WebUI.click(findTestObject('Page_Centreon - IT  Network Monitor (2)/div_generic-active-service'))

WebUI.click(findTestObject('Page_Centreon - IT  Network Monitor (2)/span_Check Command'))

WebUI.click(findTestObject('Page_Centreon - IT  Network Monitor (2)/div_base_host_alive'))

WebUI.click(findTestObject('Page_Centreon - IT  Network Monitor (2)/input_submitA'))

WebUI.closeBrowser()

