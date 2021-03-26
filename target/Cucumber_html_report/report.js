$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FeatureFiles/Search.feature");
formatter.feature({
  "line": 1,
  "name": "Search Functionality SCenarios",
  "description": "",
  "id": "search-functionality-scenarios",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3996303100,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Verify User is able to search the products",
  "description": "",
  "id": "search-functionality-scenarios;verify-user-is-able-to-search-the-products",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Search"
    },
    {
      "line": 4,
      "name": "@One"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I search for a product \"Samsung SyncMaster 941BW\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should see the product in Serch Results",
  "keyword": "Then "
});
formatter.match({
  "location": "Register1.i_launch_the_application()"
});
formatter.result({
  "duration": 3305814600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Samsung SyncMaster 941BW",
      "offset": 24
    }
  ],
  "location": "Search1.i_search_for_a_product(String)"
});
formatter.result({
  "duration": 628980200,
  "status": "passed"
});
formatter.match({
  "location": "Search1.i_should_see_the_product_in_Serch_Results()"
});
formatter.result({
  "duration": 3083316400,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\"content\"]/div[3]/div[1]/div/div[2]/div[1]/h4/a\"}\n  (Session info: chrome\u003d89.0.4389.90)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027DESKTOP-CT6L3AM\u0027, ip: \u0027172.19.208.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_231\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 89.0.4389.90, chrome: {chromedriverVersion: 88.0.4324.96 (68dba2d8a0b14..., userDataDir: C:\\Users\\Shrey\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:55701}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: bdc426619fc8557a0027cd3b08b81c0d\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\"content\"]/div[3]/div[1]/div/div[2]/div[1]/h4/a}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:319)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:421)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:311)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.isDisplayed(Unknown Source)\r\n\tat com.automation.framework.Elements1.isDisplayed(Elements1.java:98)\r\n\tat com.automation.stepdef.Search1.i_should_see_the_product_in_Serch_Results(Search1.java:35)\r\n\tat ✽.Then I should see the product in Serch Results(FeatureFiles/Search.feature:8)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 2093352700,
  "status": "passed"
});
});