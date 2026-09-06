import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('https://sauce-demo.myshopify.com/')

WebUI.waitForPageLoad(30)

WebUI.closeBrowser()

