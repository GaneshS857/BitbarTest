import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')
WebUI.navigateToUrl('https://google.com/')

long startTime = System.currentTimeMillis()
long duration = 5 * 60 * 60 * 1000 // 5 hours

int iteration = 1

while (System.currentTimeMillis() - startTime < duration) {

println("Starting iteration: " + iteration)

// Action 1: Refresh page
WebUI.refresh()

// Action 2: Wait until page loads
WebUI.waitForPageLoad(30)

// Action 3: Scroll down
WebUI.executeJavaScript(
'window.scrollTo(0, document.body.scrollHeight);',
null
)

WebUI.delay(2)

// Action 4: Scroll back up
WebUI.executeJavaScript(
'window.scrollTo(0, 0);',
null
)

WebUI.delay(2)

// Action 5: Navigate again
WebUI.navigateToUrl('https://google.com/')

WebUI.waitForPageLoad(30)

iteration++
}

WebUI.closeBrowser()

 