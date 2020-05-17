package typingsSlinky.webdriver.WebDriver

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.webdriver.anon.Browser
import typingsSlinky.webdriver.anon.BufferUsageReportingInterval
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DesiredCapabilities extends Capabilities {
  var acceptSslCerts: js.UndefOr[Boolean] = js.native
  var adbExecTimeout: js.UndefOr[Double] = js.native
  var adbPort: js.UndefOr[Double] = js.native
  var addCustomRequestHeaders: js.UndefOr[Boolean] = js.native
  var allowTestPackages: js.UndefOr[Boolean] = js.native
  var androidCoverage: js.UndefOr[String] = js.native
  var androidCoverageEndIntent: js.UndefOr[String] = js.native
  var androidDeviceReadyTimeout: js.UndefOr[Double] = js.native
  var androidDeviceSocket: js.UndefOr[String] = js.native
  var androidInstallPath: js.UndefOr[String] = js.native
  var androidInstallTimeout: js.UndefOr[Double] = js.native
  var androidScreenshotPath: js.UndefOr[String] = js.native
  var app: js.UndefOr[String] = js.native
  // Appium Android Only
  var appActivity: js.UndefOr[String] = js.native
  var appName: js.UndefOr[String] = js.native
  var appPackage: js.UndefOr[String] = js.native
  var appWaitActivity: js.UndefOr[String] = js.native
  var appWaitDuration: js.UndefOr[Double] = js.native
  var appWaitPackage: js.UndefOr[String] = js.native
  var applicationCacheEnabled: js.UndefOr[Boolean] = js.native
  var autoAcceptAlerts: js.UndefOr[Boolean] = js.native
  var autoDismissAlerts: js.UndefOr[Boolean] = js.native
  var autoGrantPermissions: js.UndefOr[Boolean] = js.native
  var autoLaunch: js.UndefOr[Boolean] = js.native
  var autoWebview: js.UndefOr[Boolean] = js.native
  var autoWebviewTimeout: js.UndefOr[Double] = js.native
  // Appium General Capabilities
  var automationName: js.UndefOr[String] = js.native
  var avd: js.UndefOr[String] = js.native
  var avdArgs: js.UndefOr[String] = js.native
  var avdLaunchTimeout: js.UndefOr[Double] = js.native
  var avdReadyTimeout: js.UndefOr[Double] = js.native
  var avoidProxy: js.UndefOr[Boolean] = js.native
  var browserAttachTimeout: js.UndefOr[Double] = js.native
  var browserConnectionEnabled: js.UndefOr[Boolean] = js.native
  var browserSideLog: js.UndefOr[Boolean] = js.native
  // Browserstack w3c specific
  @JSName("bstack:options")
  var bstackColonoptions: js.UndefOr[StringDictionary[js.Any]] = js.native
  // wdio-sauce-service specific
  var build: js.UndefOr[String] = js.native
  var bundleId: js.UndefOr[String] = js.native
  // Appium iOS Only
  var calendarFormat: js.UndefOr[String] = js.native
  var captureNetworkTraffic: js.UndefOr[Boolean] = js.native
  var changeMaxConnections: js.UndefOr[Boolean] = js.native
  // Chrome specific
  var chromeOptions: js.UndefOr[ChromeOptions] = js.native
  var chromedriverArgs: js.UndefOr[js.Array[String]] = js.native
  var chromedriverChromeMappingFile: js.UndefOr[String] = js.native
  var chromedriverDisableBuildCheck: js.UndefOr[Boolean] = js.native
  var chromedriverExecutable: js.UndefOr[String] = js.native
  var chromedriverExecutableDir: js.UndefOr[String] = js.native
  var chromedriverPort: js.UndefOr[Double] = js.native
  var chromedriverPorts: js.UndefOr[js.Array[Double | js.Array[Double]]] = js.native
  var chromedriverUseSystemExecutable: js.UndefOr[Boolean] = js.native
  var cleanSession: js.UndefOr[Boolean] = js.native
  // Selenium RC (1.0) only
  var commandLineFlags: js.UndefOr[String] = js.native
  // Read-only capabilities
  var cssSelectorsEnabled: js.UndefOr[Boolean] = js.native
  var customSSLCert: js.UndefOr[String] = js.native
  var databaseEnabled: js.UndefOr[Boolean] = js.native
  var deviceName: js.UndefOr[String] = js.native
  var deviceReadyTimeout: js.UndefOr[Double] = js.native
  var disableAndroidWatchers: js.UndefOr[Boolean] = js.native
  var disableWindowAnimation: js.UndefOr[Boolean] = js.native
  var dontInjectRegex: js.UndefOr[js.RegExp] = js.native
  var dontStopAppOnReset: js.UndefOr[Boolean] = js.native
  var elementScrollBehavior: js.UndefOr[Double] = js.native
  var enableAsyncExecuteFromHttps: js.UndefOr[Boolean] = js.native
  var enableElementCacheCleanup: js.UndefOr[Boolean] = js.native
  var enablePerformanceLogging: js.UndefOr[Boolean] = js.native
  var enablePersistentHover: js.UndefOr[Boolean] = js.native
  var environment: js.UndefOr[String] = js.native
  var espressoServerLaunchTimeout: js.UndefOr[Double] = js.native
  var eventTimings: js.UndefOr[Boolean] = js.native
  var exclude: js.UndefOr[js.Array[String]] = js.native
  var executablePath: js.UndefOr[String] = js.native
  var extractPath: js.UndefOr[String] = js.native
  var firefoxProfileTemplate: js.UndefOr[String] = js.native
  // Firefox
  var firefox_binary: js.UndefOr[String] = js.native
  var fullReset: js.UndefOr[Boolean] = js.native
  @JSName("goog:chromeOptions")
  var googColonchromeOptions: js.UndefOr[ChromeOptions] = js.native
  var gpsEnabled: js.UndefOr[Boolean] = js.native
  var handlesAlerts: js.UndefOr[Boolean] = js.native
  var host: js.UndefOr[String] = js.native
  @JSName("ie.browserCommandLineSwitches")
  var ieDotbrowserCommandLineSwitches: js.UndefOr[String] = js.native
  @JSName("ie.ensureCleanSession")
  var ieDotensureCleanSession: js.UndefOr[Boolean] = js.native
  // IE specific
  @JSName("ie.forceCreateProcessApi")
  var ieDotforceCreateProcessApi: js.UndefOr[Boolean] = js.native
  @JSName("ie.setProxyByServer")
  var ieDotsetProxyByServer: js.UndefOr[Boolean] = js.native
  @JSName("ie.usePerProcessProxy")
  var ieDotusePerProcessProxy: js.UndefOr[Boolean] = js.native
  var ignoreProtectedModeSettings: js.UndefOr[Boolean] = js.native
  var ignoreUnimportantViews: js.UndefOr[Boolean] = js.native
  var ignoreZoomSetting: js.UndefOr[Boolean] = js.native
  var initialBrowserUrl: js.UndefOr[String] = js.native
  var intentAction: js.UndefOr[String] = js.native
  var intentCategory: js.UndefOr[String] = js.native
  var intentFlags: js.UndefOr[String] = js.native
  var interKeyDelay: js.UndefOr[Double] = js.native
  var isHeadless: js.UndefOr[Boolean] = js.native
  // Read-write capabilities
  var javascriptEnabled: js.UndefOr[Boolean] = js.native
  var keepKeyChains: js.UndefOr[Boolean] = js.native
  var keyAlias: js.UndefOr[String] = js.native
  var keyPassword: js.UndefOr[String] = js.native
  var keystorePassword: js.UndefOr[String] = js.native
  var keystorePath: js.UndefOr[String] = js.native
  var killProcessesByName: js.UndefOr[Boolean] = js.native
  var language: js.UndefOr[String] = js.native
  var launchTimeout: js.UndefOr[Double] = js.native
  var locale: js.UndefOr[String] = js.native
  var localeScript: js.UndefOr[String] = js.native
  var localizableStringsDir: js.UndefOr[String] = js.native
  var locationContextEnabled: js.UndefOr[Boolean] = js.native
  var locationServicesAuthorized: js.UndefOr[Boolean] = js.native
  var locationServicesEnabled: js.UndefOr[Boolean] = js.native
  var logFile: js.UndefOr[String] = js.native
  var logLevel: js.UndefOr[String] = js.native
  var loggingPrefs: js.UndefOr[Browser] = js.native
  var maxInstances: js.UndefOr[Double] = js.native
  var mobileEmulationEnabled: js.UndefOr[Boolean] = js.native
  @JSName("moz:firefoxOptions")
  var mozColonfirefoxOptions: js.UndefOr[FirefoxOptions] = js.native
  @JSName("ms:extensionPaths")
  var msColonextensionPaths: js.UndefOr[js.Array[String]] = js.native
  // Edge specific
  @JSName("ms:inPrivate")
  var msColoninPrivate: js.UndefOr[Boolean] = js.native
  @JSName("ms:startPage")
  var msColonstartPage: js.UndefOr[String] = js.native
  var nativeEvents: js.UndefOr[Boolean] = js.native
  var nativeInstrumentsLib: js.UndefOr[Boolean] = js.native
  var nativeWebScreenshot: js.UndefOr[Boolean] = js.native
  var nativeWebTap: js.UndefOr[Boolean] = js.native
  var networkSpeed: js.UndefOr[String] = js.native
  var newCommandTimeout: js.UndefOr[Double] = js.native
  var noReset: js.UndefOr[Boolean] = js.native
  var noSign: js.UndefOr[Boolean] = js.native
  var onlyProxySeleniumTraffic: js.UndefOr[Boolean] = js.native
  var optionalIntentArguments: js.UndefOr[String] = js.native
  var optionsSet: js.UndefOr[Boolean] = js.native
  var orientation: js.UndefOr[String] = js.native
  var otherApps: js.UndefOr[String] = js.native
  var pageLoadingStrategy: js.UndefOr[String] = js.native
  var perfLoggingPrefs: js.UndefOr[BufferUsageReportingInterval] = js.native
  var platform: js.UndefOr[String] = js.native
  var platformVersion: js.UndefOr[String] = js.native
  var printPageSourceOnFindFailure: js.UndefOr[Boolean] = js.native
  var processArguments: js.UndefOr[String] = js.native
  var profile: js.UndefOr[String] = js.native
  var proxyEverything: js.UndefOr[Boolean] = js.native
  var proxyRequired: js.UndefOr[Boolean] = js.native
  var recreateChromeDriverSessions: js.UndefOr[Boolean] = js.native
  var remoteAdbHost: js.UndefOr[String] = js.native
  var remoteDebugProxy: js.UndefOr[String] = js.native
  var requireWindowFocus: js.UndefOr[Boolean] = js.native
  var resetKeyboard: js.UndefOr[Boolean] = js.native
  var rotatable: js.UndefOr[Boolean] = js.native
  var safariAllowPopups: js.UndefOr[Boolean] = js.native
  // Safari specific
  @JSName("safari.options")
  var safariDotoptions: js.UndefOr[StringDictionary[js.Any]] = js.native
  var safariIgnoreFraudWarning: js.UndefOr[Boolean] = js.native
  var safariInitialUrl: js.UndefOr[String] = js.native
  var safariOpenLinksInBackground: js.UndefOr[Boolean] = js.native
  // Saucelabs w3c specific
  @JSName("sauce:options")
  var sauceColonoptions: js.UndefOr[StringDictionary[js.Any]] = js.native
  var screenshotWaitTimeout: js.UndefOr[Double] = js.native
  // Selenese-Backed-WebDriver specific
  @JSName("selenium.server.url")
  var seleniumDotserverDoturl: js.UndefOr[String] = js.native
  // Grid-specific
  var seleniumProtocol: js.UndefOr[String] = js.native
  var sendKeyStrategy: js.UndefOr[String] = js.native
  var showIOSLog: js.UndefOr[Boolean] = js.native
  var silent: js.UndefOr[String] = js.native
  var singleWindow: js.UndefOr[Boolean] = js.native
  var skipDeviceInitialization: js.UndefOr[Boolean] = js.native
  var skipLogCapture: js.UndefOr[Boolean] = js.native
  var skipLogcatCapture: js.UndefOr[Boolean] = js.native
  var skipServerInstallation: js.UndefOr[Boolean] = js.native
  var skipUnlock: js.UndefOr[Boolean] = js.native
  // webdriverio specific
  var specs: js.UndefOr[js.Array[String]] = js.native
  var systemPort: js.UndefOr[Double] = js.native
  // Testingbot w3c specific
  @JSName("tb:options")
  var tbColonoptions: js.UndefOr[StringDictionary[js.Any]] = js.native
  var timeoutInSeconds: js.UndefOr[Double] = js.native
  var trustAllSSLCertificates: js.UndefOr[Boolean] = js.native
  var udid: js.UndefOr[String] = js.native
  var uiautomator2ServerInstallTimeout: js.UndefOr[Double] = js.native
  var uiautomator2ServerLaunchTimeout: js.UndefOr[Double] = js.native
  var unexpectedAlertBehaviour: js.UndefOr[String] = js.native
  var unicodeKeyboard: js.UndefOr[Boolean] = js.native
  var uninstallOtherPackages: js.UndefOr[String] = js.native
  var unlockKey: js.UndefOr[String] = js.native
  var unlockType: js.UndefOr[String] = js.native
  var useKeystore: js.UndefOr[Boolean] = js.native
  var userExtensions: js.UndefOr[String] = js.native
  var userJSInjection: js.UndefOr[Boolean] = js.native
  var version: js.UndefOr[String] = js.native
  var waitForAppScript: js.UndefOr[String] = js.native
  var webStorageEnabled: js.UndefOr[Boolean] = js.native
  @JSName("webdriver.remote.quietExceptions")
  var webdriverDotremoteDotquietExceptions: js.UndefOr[Boolean] = js.native
  // RemoteWebDriver specific
  @JSName("webdriver.remote.sessionid")
  var webdriverDotremoteDotsessionid: js.UndefOr[String] = js.native
  var webkitDebugProxyPort: js.UndefOr[Double] = js.native
  var webkitResponseTimeout: js.UndefOr[Double] = js.native
  var webviewConnectRetries: js.UndefOr[Double] = js.native
}

object DesiredCapabilities {
  @scala.inline
  def apply(): DesiredCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DesiredCapabilities]
  }
  @scala.inline
  implicit class DesiredCapabilitiesOps[Self <: DesiredCapabilities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceptSslCerts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptSslCerts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceptSslCerts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptSslCerts")(js.undefined)
        ret
    }
    @scala.inline
    def withAdbExecTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adbExecTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdbExecTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adbExecTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withAdbPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adbPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdbPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adbPort")(js.undefined)
        ret
    }
    @scala.inline
    def withAddCustomRequestHeaders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addCustomRequestHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddCustomRequestHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addCustomRequestHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowTestPackages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowTestPackages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowTestPackages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowTestPackages")(js.undefined)
        ret
    }
    @scala.inline
    def withAndroidCoverage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidCoverage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroidCoverage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidCoverage")(js.undefined)
        ret
    }
    @scala.inline
    def withAndroidCoverageEndIntent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidCoverageEndIntent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroidCoverageEndIntent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidCoverageEndIntent")(js.undefined)
        ret
    }
    @scala.inline
    def withAndroidDeviceReadyTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidDeviceReadyTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroidDeviceReadyTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidDeviceReadyTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withAndroidDeviceSocket(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidDeviceSocket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroidDeviceSocket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidDeviceSocket")(js.undefined)
        ret
    }
    @scala.inline
    def withAndroidInstallPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidInstallPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroidInstallPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidInstallPath")(js.undefined)
        ret
    }
    @scala.inline
    def withAndroidInstallTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidInstallTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroidInstallTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidInstallTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withAndroidScreenshotPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidScreenshotPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroidScreenshotPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidScreenshotPath")(js.undefined)
        ret
    }
    @scala.inline
    def withApp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app")(js.undefined)
        ret
    }
    @scala.inline
    def withAppActivity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appActivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppActivity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appActivity")(js.undefined)
        ret
    }
    @scala.inline
    def withAppName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appName")(js.undefined)
        ret
    }
    @scala.inline
    def withAppPackage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appPackage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppPackage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appPackage")(js.undefined)
        ret
    }
    @scala.inline
    def withAppWaitActivity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appWaitActivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppWaitActivity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appWaitActivity")(js.undefined)
        ret
    }
    @scala.inline
    def withAppWaitDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appWaitDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppWaitDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appWaitDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withAppWaitPackage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appWaitPackage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppWaitPackage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appWaitPackage")(js.undefined)
        ret
    }
    @scala.inline
    def withApplicationCacheEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationCacheEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationCacheEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationCacheEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoAcceptAlerts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAcceptAlerts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoAcceptAlerts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAcceptAlerts")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoDismissAlerts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDismissAlerts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoDismissAlerts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDismissAlerts")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoGrantPermissions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoGrantPermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoGrantPermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoGrantPermissions")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoLaunch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoLaunch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoLaunch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoLaunch")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoWebview(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoWebview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoWebview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoWebview")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoWebviewTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoWebviewTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoWebviewTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoWebviewTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withAutomationName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutomationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automationName")(js.undefined)
        ret
    }
    @scala.inline
    def withAvd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avd")(js.undefined)
        ret
    }
    @scala.inline
    def withAvdArgs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avdArgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvdArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avdArgs")(js.undefined)
        ret
    }
    @scala.inline
    def withAvdLaunchTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avdLaunchTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvdLaunchTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avdLaunchTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withAvdReadyTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avdReadyTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvdReadyTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avdReadyTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withAvoidProxy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avoidProxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvoidProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avoidProxy")(js.undefined)
        ret
    }
    @scala.inline
    def withBrowserAttachTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserAttachTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowserAttachTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserAttachTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withBrowserConnectionEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserConnectionEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowserConnectionEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserConnectionEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withBrowserSideLog(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserSideLog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowserSideLog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserSideLog")(js.undefined)
        ret
    }
    @scala.inline
    def withBstackColonoptions(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bstack:options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBstackColonoptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bstack:options")(js.undefined)
        ret
    }
    @scala.inline
    def withBuild(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(js.undefined)
        ret
    }
    @scala.inline
    def withBundleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBundleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundleId")(js.undefined)
        ret
    }
    @scala.inline
    def withCalendarFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalendarFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withCaptureNetworkTraffic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureNetworkTraffic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptureNetworkTraffic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureNetworkTraffic")(js.undefined)
        ret
    }
    @scala.inline
    def withChangeMaxConnections(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeMaxConnections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangeMaxConnections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeMaxConnections")(js.undefined)
        ret
    }
    @scala.inline
    def withChromeOptions(value: ChromeOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chromeOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChromeOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chromeOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withChromedriverArgs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chromedriverArgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChromedriverArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chromedriverArgs")(js.undefined)
        ret
    }
    @scala.inline
    def withChromedriverChromeMappingFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chromedriverChromeMappingFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChromedriverChromeMappingFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chromedriverChromeMappingFile")(js.undefined)
        ret
    }
    @scala.inline
    def withChromedriverDisableBuildCheck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chromedriverDisableBuildCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChromedriverDisableBuildCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chromedriverDisableBuildCheck")(js.undefined)
        ret
    }
    @scala.inline
    def withChromedriverExecutable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chromedriverExecutable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChromedriverExecutable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chromedriverExecutable")(js.undefined)
        ret
    }
    @scala.inline
    def withChromedriverExecutableDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chromedriverExecutableDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChromedriverExecutableDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chromedriverExecutableDir")(js.undefined)
        ret
    }
    @scala.inline
    def withChromedriverPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chromedriverPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChromedriverPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chromedriverPort")(js.undefined)
        ret
    }
    @scala.inline
    def withChromedriverPorts(value: js.Array[Double | js.Array[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chromedriverPorts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChromedriverPorts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chromedriverPorts")(js.undefined)
        ret
    }
    @scala.inline
    def withChromedriverUseSystemExecutable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chromedriverUseSystemExecutable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChromedriverUseSystemExecutable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chromedriverUseSystemExecutable")(js.undefined)
        ret
    }
    @scala.inline
    def withCleanSession(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanSession")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCleanSession: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanSession")(js.undefined)
        ret
    }
    @scala.inline
    def withCommandLineFlags(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commandLineFlags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommandLineFlags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commandLineFlags")(js.undefined)
        ret
    }
    @scala.inline
    def withCssSelectorsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssSelectorsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssSelectorsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssSelectorsEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomSSLCert(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customSSLCert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomSSLCert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customSSLCert")(js.undefined)
        ret
    }
    @scala.inline
    def withDatabaseEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("databaseEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatabaseEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("databaseEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceName")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceReadyTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceReadyTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceReadyTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceReadyTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableAndroidWatchers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAndroidWatchers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableAndroidWatchers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAndroidWatchers")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableWindowAnimation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableWindowAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableWindowAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableWindowAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withDontInjectRegex(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dontInjectRegex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDontInjectRegex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dontInjectRegex")(js.undefined)
        ret
    }
    @scala.inline
    def withDontStopAppOnReset(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dontStopAppOnReset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDontStopAppOnReset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dontStopAppOnReset")(js.undefined)
        ret
    }
    @scala.inline
    def withElementScrollBehavior(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementScrollBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElementScrollBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementScrollBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableAsyncExecuteFromHttps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAsyncExecuteFromHttps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableAsyncExecuteFromHttps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAsyncExecuteFromHttps")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableElementCacheCleanup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableElementCacheCleanup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableElementCacheCleanup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableElementCacheCleanup")(js.undefined)
        ret
    }
    @scala.inline
    def withEnablePerformanceLogging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePerformanceLogging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablePerformanceLogging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePerformanceLogging")(js.undefined)
        ret
    }
    @scala.inline
    def withEnablePersistentHover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePersistentHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablePersistentHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePersistentHover")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvironment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(js.undefined)
        ret
    }
    @scala.inline
    def withEspressoServerLaunchTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("espressoServerLaunchTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEspressoServerLaunchTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("espressoServerLaunchTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withEventTimings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTimings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventTimings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTimings")(js.undefined)
        ret
    }
    @scala.inline
    def withExclude(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutablePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executablePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutablePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executablePath")(js.undefined)
        ret
    }
    @scala.inline
    def withExtractPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extractPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtractPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extractPath")(js.undefined)
        ret
    }
    @scala.inline
    def withFirefoxProfileTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firefoxProfileTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirefoxProfileTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firefoxProfileTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withFirefox_binary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firefox_binary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirefox_binary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firefox_binary")(js.undefined)
        ret
    }
    @scala.inline
    def withFullReset(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullReset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullReset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullReset")(js.undefined)
        ret
    }
    @scala.inline
    def withGoogColonchromeOptions(value: ChromeOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goog:chromeOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoogColonchromeOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goog:chromeOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withGpsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gpsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGpsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gpsEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withHandlesAlerts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlesAlerts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandlesAlerts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlesAlerts")(js.undefined)
        ret
    }
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
    @scala.inline
    def withIeDotbrowserCommandLineSwitches(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ie.browserCommandLineSwitches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIeDotbrowserCommandLineSwitches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ie.browserCommandLineSwitches")(js.undefined)
        ret
    }
    @scala.inline
    def withIeDotensureCleanSession(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ie.ensureCleanSession")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIeDotensureCleanSession: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ie.ensureCleanSession")(js.undefined)
        ret
    }
    @scala.inline
    def withIeDotforceCreateProcessApi(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ie.forceCreateProcessApi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIeDotforceCreateProcessApi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ie.forceCreateProcessApi")(js.undefined)
        ret
    }
    @scala.inline
    def withIeDotsetProxyByServer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ie.setProxyByServer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIeDotsetProxyByServer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ie.setProxyByServer")(js.undefined)
        ret
    }
    @scala.inline
    def withIeDotusePerProcessProxy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ie.usePerProcessProxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIeDotusePerProcessProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ie.usePerProcessProxy")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreProtectedModeSettings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreProtectedModeSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreProtectedModeSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreProtectedModeSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreUnimportantViews(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreUnimportantViews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreUnimportantViews: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreUnimportantViews")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreZoomSetting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreZoomSetting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreZoomSetting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreZoomSetting")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialBrowserUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialBrowserUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialBrowserUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialBrowserUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withIntentAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intentAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntentAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intentAction")(js.undefined)
        ret
    }
    @scala.inline
    def withIntentCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intentCategory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntentCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intentCategory")(js.undefined)
        ret
    }
    @scala.inline
    def withIntentFlags(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intentFlags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntentFlags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intentFlags")(js.undefined)
        ret
    }
    @scala.inline
    def withInterKeyDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interKeyDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterKeyDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interKeyDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withIsHeadless(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHeadless")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsHeadless: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHeadless")(js.undefined)
        ret
    }
    @scala.inline
    def withJavascriptEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("javascriptEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJavascriptEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("javascriptEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepKeyChains(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepKeyChains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepKeyChains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepKeyChains")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyAlias(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyAlias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyAlias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyAlias")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyPassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyPassword")(js.undefined)
        ret
    }
    @scala.inline
    def withKeystorePassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keystorePassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeystorePassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keystorePassword")(js.undefined)
        ret
    }
    @scala.inline
    def withKeystorePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keystorePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeystorePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keystorePath")(js.undefined)
        ret
    }
    @scala.inline
    def withKillProcessesByName(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("killProcessesByName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKillProcessesByName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("killProcessesByName")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withLaunchTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunchTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withLocaleScript(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localeScript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocaleScript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localeScript")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalizableStringsDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localizableStringsDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalizableStringsDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localizableStringsDir")(js.undefined)
        ret
    }
    @scala.inline
    def withLocationContextEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationContextEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocationContextEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationContextEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withLocationServicesAuthorized(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationServicesAuthorized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocationServicesAuthorized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationServicesAuthorized")(js.undefined)
        ret
    }
    @scala.inline
    def withLocationServicesEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationServicesEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocationServicesEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationServicesEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withLogFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logFile")(js.undefined)
        ret
    }
    @scala.inline
    def withLogLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withLoggingPrefs(value: Browser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loggingPrefs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoggingPrefs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loggingPrefs")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxInstances(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxInstances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxInstances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxInstances")(js.undefined)
        ret
    }
    @scala.inline
    def withMobileEmulationEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileEmulationEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMobileEmulationEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileEmulationEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withMozColonfirefoxOptions(value: FirefoxOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moz:firefoxOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMozColonfirefoxOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moz:firefoxOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withMsColonextensionPaths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ms:extensionPaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMsColonextensionPaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ms:extensionPaths")(js.undefined)
        ret
    }
    @scala.inline
    def withMsColoninPrivate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ms:inPrivate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMsColoninPrivate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ms:inPrivate")(js.undefined)
        ret
    }
    @scala.inline
    def withMsColonstartPage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ms:startPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMsColonstartPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ms:startPage")(js.undefined)
        ret
    }
    @scala.inline
    def withNativeEvents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNativeEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withNativeInstrumentsLib(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeInstrumentsLib")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNativeInstrumentsLib: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeInstrumentsLib")(js.undefined)
        ret
    }
    @scala.inline
    def withNativeWebScreenshot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeWebScreenshot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNativeWebScreenshot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeWebScreenshot")(js.undefined)
        ret
    }
    @scala.inline
    def withNativeWebTap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeWebTap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNativeWebTap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeWebTap")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkSpeed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkSpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withNewCommandTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCommandTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewCommandTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCommandTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withNoReset(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noReset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoReset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noReset")(js.undefined)
        ret
    }
    @scala.inline
    def withNoSign(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoSign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSign")(js.undefined)
        ret
    }
    @scala.inline
    def withOnlyProxySeleniumTraffic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyProxySeleniumTraffic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnlyProxySeleniumTraffic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyProxySeleniumTraffic")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionalIntentArguments(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionalIntentArguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionalIntentArguments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionalIntentArguments")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionsSet(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionsSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionsSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionsSet")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
        ret
    }
    @scala.inline
    def withOtherApps(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherApps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOtherApps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherApps")(js.undefined)
        ret
    }
    @scala.inline
    def withPageLoadingStrategy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageLoadingStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageLoadingStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageLoadingStrategy")(js.undefined)
        ret
    }
    @scala.inline
    def withPerfLoggingPrefs(value: BufferUsageReportingInterval): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perfLoggingPrefs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerfLoggingPrefs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perfLoggingPrefs")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatformVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platformVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatformVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platformVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withPrintPageSourceOnFindFailure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printPageSourceOnFindFailure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrintPageSourceOnFindFailure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printPageSourceOnFindFailure")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessArguments(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processArguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessArguments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processArguments")(js.undefined)
        ret
    }
    @scala.inline
    def withProfile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(js.undefined)
        ret
    }
    @scala.inline
    def withProxyEverything(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyEverything")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxyEverything: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyEverything")(js.undefined)
        ret
    }
    @scala.inline
    def withProxyRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxyRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyRequired")(js.undefined)
        ret
    }
    @scala.inline
    def withRecreateChromeDriverSessions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recreateChromeDriverSessions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecreateChromeDriverSessions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recreateChromeDriverSessions")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoteAdbHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteAdbHost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoteAdbHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteAdbHost")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoteDebugProxy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteDebugProxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoteDebugProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteDebugProxy")(js.undefined)
        ret
    }
    @scala.inline
    def withRequireWindowFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireWindowFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequireWindowFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireWindowFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withResetKeyboard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetKeyboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResetKeyboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetKeyboard")(js.undefined)
        ret
    }
    @scala.inline
    def withRotatable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotatable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotatable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotatable")(js.undefined)
        ret
    }
    @scala.inline
    def withSafariAllowPopups(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safariAllowPopups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSafariAllowPopups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safariAllowPopups")(js.undefined)
        ret
    }
    @scala.inline
    def withSafariDotoptions(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safari.options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSafariDotoptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safari.options")(js.undefined)
        ret
    }
    @scala.inline
    def withSafariIgnoreFraudWarning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safariIgnoreFraudWarning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSafariIgnoreFraudWarning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safariIgnoreFraudWarning")(js.undefined)
        ret
    }
    @scala.inline
    def withSafariInitialUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safariInitialUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSafariInitialUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safariInitialUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withSafariOpenLinksInBackground(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safariOpenLinksInBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSafariOpenLinksInBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safariOpenLinksInBackground")(js.undefined)
        ret
    }
    @scala.inline
    def withSauceColonoptions(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sauce:options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSauceColonoptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sauce:options")(js.undefined)
        ret
    }
    @scala.inline
    def withScreenshotWaitTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenshotWaitTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreenshotWaitTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenshotWaitTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withSeleniumDotserverDoturl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selenium.server.url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeleniumDotserverDoturl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selenium.server.url")(js.undefined)
        ret
    }
    @scala.inline
    def withSeleniumProtocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seleniumProtocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeleniumProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seleniumProtocol")(js.undefined)
        ret
    }
    @scala.inline
    def withSendKeyStrategy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendKeyStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSendKeyStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendKeyStrategy")(js.undefined)
        ret
    }
    @scala.inline
    def withShowIOSLog(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showIOSLog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowIOSLog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showIOSLog")(js.undefined)
        ret
    }
    @scala.inline
    def withSilent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSilent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(js.undefined)
        ret
    }
    @scala.inline
    def withSingleWindow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleWindow")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipDeviceInitialization(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipDeviceInitialization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipDeviceInitialization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipDeviceInitialization")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipLogCapture(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipLogCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipLogCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipLogCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipLogcatCapture(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipLogcatCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipLogcatCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipLogcatCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipServerInstallation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipServerInstallation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipServerInstallation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipServerInstallation")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipUnlock(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipUnlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipUnlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipUnlock")(js.undefined)
        ret
    }
    @scala.inline
    def withSpecs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpecs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specs")(js.undefined)
        ret
    }
    @scala.inline
    def withSystemPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSystemPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemPort")(js.undefined)
        ret
    }
    @scala.inline
    def withTbColonoptions(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tb:options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTbColonoptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tb:options")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeoutInSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutInSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeoutInSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutInSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withTrustAllSSLCertificates(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trustAllSSLCertificates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrustAllSSLCertificates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trustAllSSLCertificates")(js.undefined)
        ret
    }
    @scala.inline
    def withUdid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("udid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUdid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("udid")(js.undefined)
        ret
    }
    @scala.inline
    def withUiautomator2ServerInstallTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uiautomator2ServerInstallTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUiautomator2ServerInstallTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uiautomator2ServerInstallTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withUiautomator2ServerLaunchTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uiautomator2ServerLaunchTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUiautomator2ServerLaunchTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uiautomator2ServerLaunchTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withUnexpectedAlertBehaviour(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unexpectedAlertBehaviour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnexpectedAlertBehaviour: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unexpectedAlertBehaviour")(js.undefined)
        ret
    }
    @scala.inline
    def withUnicodeKeyboard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unicodeKeyboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnicodeKeyboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unicodeKeyboard")(js.undefined)
        ret
    }
    @scala.inline
    def withUninstallOtherPackages(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uninstallOtherPackages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUninstallOtherPackages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uninstallOtherPackages")(js.undefined)
        ret
    }
    @scala.inline
    def withUnlockKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlockKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnlockKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlockKey")(js.undefined)
        ret
    }
    @scala.inline
    def withUnlockType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlockType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnlockType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlockType")(js.undefined)
        ret
    }
    @scala.inline
    def withUseKeystore(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useKeystore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseKeystore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useKeystore")(js.undefined)
        ret
    }
    @scala.inline
    def withUserExtensions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userExtensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userExtensions")(js.undefined)
        ret
    }
    @scala.inline
    def withUserJSInjection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userJSInjection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserJSInjection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userJSInjection")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitForAppScript(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForAppScript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitForAppScript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForAppScript")(js.undefined)
        ret
    }
    @scala.inline
    def withWebStorageEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webStorageEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebStorageEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webStorageEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withWebdriverDotremoteDotquietExceptions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webdriver.remote.quietExceptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebdriverDotremoteDotquietExceptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webdriver.remote.quietExceptions")(js.undefined)
        ret
    }
    @scala.inline
    def withWebdriverDotremoteDotsessionid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webdriver.remote.sessionid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebdriverDotremoteDotsessionid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webdriver.remote.sessionid")(js.undefined)
        ret
    }
    @scala.inline
    def withWebkitDebugProxyPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webkitDebugProxyPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebkitDebugProxyPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webkitDebugProxyPort")(js.undefined)
        ret
    }
    @scala.inline
    def withWebkitResponseTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webkitResponseTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebkitResponseTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webkitResponseTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withWebviewConnectRetries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webviewConnectRetries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebviewConnectRetries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webviewConnectRetries")(js.undefined)
        ret
    }
  }
  
}

