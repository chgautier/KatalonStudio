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

WebUI.navigateToUrl('http://10.30.2.201/centreon/main.php')

WebUI.click(findTestObject('Page_Centreon - IT  Network Monitor (5)/a_Configuration'))

WebUI.click(findTestObject('Page_Centreon - IT  Network Monitor (5)/a_Administration'))

WebUI.click(findTestObject('Page_Centreon - IT  Network Monitor (5)/a_ACL'))

WebUI.click(findTestObject('Page_Centreon - IT  Network Monitor (5)/a_Access Groups'))

WebUI.click(findTestObject('Page_Centreon - IT  Network Monitor (5)/a_Add'))

WebUI.setText(findTestObject('Page_Centreon - IT  Network Monitor (5)/input_acl_group_name'), 'non admin')

WebUI.setText(findTestObject('Page_Centreon - IT  Network Monitor (5)/input_acl_group_alias'), 'non admin')

WebUI.selectOptionByValue(findTestObject('Page_Centreon - IT  Network Monitor (5)/select_editedreporting-user'), '46', true)

WebUI.click(findTestObject('Page_Centreon - IT  Network Monitor (5)/input_add'))

WebUI.click(findTestObject('Page_Centreon - IT  Network Monitor (5)/a_Authorizations information'))

WebUI.selectOptionByValue(findTestObject('Page_Centreon - IT  Network Monitor (5)/select_CentreonBI-Training'), '16', true)

WebUI.doubleClick(findTestObject('Page_Centreon - IT  Network Monitor (5)/option_CentreonBI-Training'))

WebUI.selectOptionByValue(findTestObject('Page_Centreon - IT  Network Monitor (5)/select_Training Centreon BI Me'), '31', 
    true)

WebUI.doubleClick(findTestObject('Page_Centreon - IT  Network Monitor (5)/option_Training Centreon BI Me'))

WebUI.selectOptionByValue(findTestObject('Page_Centreon - IT  Network Monitor (5)/select_CIO-ActionFake-Admin-Ac'), '7', 
    true)

WebUI.doubleClick(findTestObject('Page_Centreon - IT  Network Monitor (5)/option_Fake-Admin-Action'))

WebUI.click(findTestObject('Page_Centreon - IT  Network Monitor (5)/input_submitA'))

WebUI.closeBrowser()

