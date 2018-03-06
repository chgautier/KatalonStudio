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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://10.30.2.201/centreon/main.php')

WebUI.click(findTestObject('Page_Centreon - IT  Network Monitor (7)/a_Administration'))

WebUI.click(findTestObject('Page_Centreon - IT  Network Monitor (7)/a_ACL'))

WebUI.click(findTestObject('Page_Centreon - IT  Network Monitor (7)/a_Menus Access'))

WebUI.click(findTestObject('Page_Centreon - IT  Network Monitor (7)/a_Add_1'))

WebUI.setText(findTestObject('Page_Centreon - IT  Network Monitor (7)/input_acl_topo_name'), 'no split')

WebUI.click(findTestObject('Page_Centreon - IT  Network Monitor (7)/img_img_1'))

WebUI.click(findTestObject('Page_Centreon - IT  Network Monitor (7)/input_acl_r_topos143'))

WebUI.click(findTestObject('Page_Centreon - IT  Network Monitor (7)/img_img_1_1'))

WebUI.click(findTestObject('Page_Centreon - IT  Network Monitor (7)/input_acl_r_topos145'))

WebUI.click(findTestObject('Page_Centreon - IT  Network Monitor (7)/input_submitA'))

WebUI.closeBrowser()

