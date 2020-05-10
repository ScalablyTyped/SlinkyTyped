package typingsSlinky.webpagetest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestOptions extends js.Object {
  /** string to hash test to a specific test agent. tester will be picked by index among available testers */
  var affinity: js.UndefOr[String] = js.native
  /** type of authentication: 0 = Basic, 1 = SNS [0] */
  var authenticationType: js.UndefOr[Double] = js.native
  /** download bandwidth in Kbps (used when specifying a custom connectivity profile) */
  var bandwidthDown: js.UndefOr[String] = js.native
  /** upload bandwidth in Kbps (used when specifying a custom connectivity profile) */
  var bandwidthUp: js.UndefOr[String] = js.native
  /** space-delimited list of urls to block (substring match) */
  var block: js.UndefOr[String] = js.native
  /** block ads defined by http://adblockplus.org */
  var blockAds: js.UndefOr[Boolean] = js.native
  /** capture chrome trace (about://tracing) (Chrome only) */
  var chromeTrace: js.UndefOr[Boolean] = js.native
  /** clear SSL certificate caches */
  var clearCerts: js.UndefOr[Boolean] = js.native
  /** use a list of custom command line switches (Chrome only) */
  var commandLine: js.UndefOr[String] = js.native
  /** connectivity profile -- requires location to be specified -- (Cable|DSL|FIOS|Dial|3G|3GFast|Native|custom) [Cable] */
  var connectivity: js.UndefOr[String] = js.native
  /** capture video continuously (unstable/experimental, may cause tests to fail) */
  var continuousVideoCapture: js.UndefOr[Boolean] = js.native
  /** execute arbitrary JavaScript at the end of a test to collect custom metrics */
  var customMetrics: js.UndefOr[String] = js.native
  /** enable data reduction on Chrome 34+ Android (Chrome only) */
  var dataReduction: js.UndefOr[Boolean] = js.native
  /** forces all pages to load in standards mode (IE only) */
  var disableCompatibilityView: js.UndefOr[Boolean] = js.native
  /** disable saving of the http headers (as well as browser status messages and CPU utilization) */
  var disableHTTPHeaders: js.UndefOr[Boolean] = js.native
  /** disable JavaScript (IE, Chrome, Firefox) */
  var disableJavaScript: js.UndefOr[Boolean] = js.native
  /** disable optimization checks (for faster testing) */
  var disableOptimization: js.UndefOr[Boolean] = js.native
  /** disable screen shot capturing */
  var disableScreenshot: js.UndefOr[Boolean] = js.native
  /** DOM element to record for sub-measurement */
  var domElement: js.UndefOr[String] = js.native
  /** (experimental) emulate mobile browser: Chrome mobile user agent, 640x960 screen, 2x scaling and fixed viewport (Chrome only) */
  var emulateMobile: js.UndefOr[Boolean] = js.native
  /** skip the Repeat View test */
  var firstViewOnly: js.UndefOr[Boolean] = js.native
  /** force software rendering, disable GPU acceleration (Chrome only) */
  var forceSoftwareRendering: js.UndefOr[Boolean] = js.native
  /** force SPDY version 3 (Chrome only) */
  var forceSpdy3: js.UndefOr[Boolean] = js.native
  /** save a full-resolution version of the fully loaded screen shot as a PNG */
  var fullResolutionScreenshot: js.UndefOr[Boolean] = js.native
  /** save the content of only the base HTML response */
  var htmlBody: js.UndefOr[Boolean] = js.native
  /** ignore SSL certificate errors, e.g. name mismatch, self-signed certificates, etc */
  var ignoreSSL: js.UndefOr[Boolean] = js.native
  /** jpeg compression level (30-100) for the screen shots and video capture */
  var jpegQuality: js.UndefOr[Double] = js.native
  /** do not add PTST to the original browser User Agent string */
  var keepOriginalUserAgent: js.UndefOr[Boolean] = js.native
  /** label for the test */
  var label: js.UndefOr[String] = js.native
  /** first-hop Round Trip Time in ms (used when specifying a custom connectivity profile) */
  var latency: js.UndefOr[String] = js.native
  /** perform lighthouse test (Chrome only, Linux agent only) */
  var lighthouse: js.UndefOr[Boolean] = js.native
  /** location to test from */
  var location: js.UndefOr[String] = js.native
  /** username for authenticating tests (http authentication) */
  var login: js.UndefOr[String] = js.native
  /** store the video from the median run when capturing video is enabled */
  var medianVideo: js.UndefOr[Boolean] = js.native
  /** minimum test duration in seconds */
  var minimumDuration: js.UndefOr[Double] = js.native
  /** capture Network Log (Chrome only) */
  var netLog: js.UndefOr[Boolean] = js.native
  /** e-mail address to notify with the test results */
  var notifyEmail: js.UndefOr[String] = js.native
  /** packet loss rate - percent of packets to drop (used when specifying a custom connectivity profile) */
  var packetLossRate: js.UndefOr[Double] = js.native
  /** password for authenticating tests (http authentication) */
  var password: js.UndefOr[String] = js.native
  /** URL to ping when the test is complete (the test ID will be passed as an "id" parameter) */
  var pingback: js.UndefOr[String] = js.native
  /** poll for results after test is scheduled at every seconds [5] */
  var pollResults: js.UndefOr[Double] = js.native
  /** change test priority (0-9) [enforced by API key, otherwise 5] */
  var priority: js.UndefOr[Double] = js.native
  /** keep the test hidden from the test log */
  var `private`: js.UndefOr[Boolean] = js.native
  /** number of test runs [1] */
  var runs: js.UndefOr[Double] = js.native
  /** save response bodies for text resources */
  var saveResponseBodies: js.UndefOr[Boolean] = js.native
  /** discard script and http headers in the result */
  var sensitive: js.UndefOr[Boolean] = js.native
  /** space-delimited list of domains to simulate failure by re-routing to blackhole.webpagetest.org to silently drop all requests */
  var spof: js.UndefOr[String] = js.native
  /** stop test at document complete. typically, tests run until all activity stops */
  var stopAtDocumentComplete: js.UndefOr[Boolean] = js.native
  /** capture network packet trace (tcpdump) */
  var tcpDump: js.UndefOr[Boolean] = js.native
  /** run the test on a specific PC (name must match exactly or the test will not run) */
  var tester: js.UndefOr[String] = js.native
  /** capture Developer Tools Timeline (Chrome only) */
  var timeline: js.UndefOr[Boolean] = js.native
  /** set between 1-5 to include the JS call stack. must be used in conjunction with timeline (increases overhead) (Chrome only) */
  var timelineCallStack: js.UndefOr[Boolean] = js.native
  /** timeout for polling and waiting results [no timeout] */
  var timeout: js.UndefOr[Double] = js.native
  /** test name to use when submitting results to tsviewdb (for private instances that have integrated with tsviewdb) */
  var tsView: js.UndefOr[String] = js.native
  /** configs to use when submitting results to tsviewdb (for private instances that have integrated with tsviewdb) */
  var tsViewConfigs: js.UndefOr[String] = js.native
  /** custom user agent string (Chrome only) */
  var userAgent: js.UndefOr[String] = js.native
  /** capture video */
  var video: js.UndefOr[Boolean] = js.native
  /** wait for test results informed by agent once complete listening on : [hostname:first port available above 8000] */
  var waitResults: js.UndefOr[String] = js.native
}

object TestOptions {
  @scala.inline
  def apply(): TestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestOptions]
  }
  @scala.inline
  implicit class TestOptionsOps[Self <: TestOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAffinity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("affinity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAffinity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("affinity")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthenticationType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthenticationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticationType")(js.undefined)
        ret
    }
    @scala.inline
    def withBandwidthDown(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bandwidthDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBandwidthDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bandwidthDown")(js.undefined)
        ret
    }
    @scala.inline
    def withBandwidthUp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bandwidthUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBandwidthUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bandwidthUp")(js.undefined)
        ret
    }
    @scala.inline
    def withBlock(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("block")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("block")(js.undefined)
        ret
    }
    @scala.inline
    def withBlockAds(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockAds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockAds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockAds")(js.undefined)
        ret
    }
    @scala.inline
    def withChromeTrace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chromeTrace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChromeTrace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chromeTrace")(js.undefined)
        ret
    }
    @scala.inline
    def withClearCerts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearCerts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearCerts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearCerts")(js.undefined)
        ret
    }
    @scala.inline
    def withCommandLine(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commandLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommandLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commandLine")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectivity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectivity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectivity")(js.undefined)
        ret
    }
    @scala.inline
    def withContinuousVideoCapture(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continuousVideoCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContinuousVideoCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continuousVideoCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomMetrics(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMetrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMetrics")(js.undefined)
        ret
    }
    @scala.inline
    def withDataReduction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataReduction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataReduction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataReduction")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableCompatibilityView(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableCompatibilityView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableCompatibilityView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableCompatibilityView")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableHTTPHeaders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableHTTPHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableHTTPHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableHTTPHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableJavaScript(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableJavaScript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableJavaScript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableJavaScript")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableOptimization(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableOptimization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableOptimization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableOptimization")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableScreenshot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableScreenshot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableScreenshot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableScreenshot")(js.undefined)
        ret
    }
    @scala.inline
    def withDomElement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domElement")(js.undefined)
        ret
    }
    @scala.inline
    def withEmulateMobile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emulateMobile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmulateMobile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emulateMobile")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstViewOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstViewOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstViewOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstViewOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withForceSoftwareRendering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceSoftwareRendering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceSoftwareRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceSoftwareRendering")(js.undefined)
        ret
    }
    @scala.inline
    def withForceSpdy3(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceSpdy3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceSpdy3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceSpdy3")(js.undefined)
        ret
    }
    @scala.inline
    def withFullResolutionScreenshot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullResolutionScreenshot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullResolutionScreenshot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullResolutionScreenshot")(js.undefined)
        ret
    }
    @scala.inline
    def withHtmlBody(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtmlBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlBody")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreSSL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreSSL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreSSL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreSSL")(js.undefined)
        ret
    }
    @scala.inline
    def withJpegQuality(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jpegQuality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJpegQuality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jpegQuality")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepOriginalUserAgent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepOriginalUserAgent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepOriginalUserAgent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepOriginalUserAgent")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withLatency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latency")(js.undefined)
        ret
    }
    @scala.inline
    def withLighthouse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lighthouse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLighthouse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lighthouse")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withLogin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("login")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("login")(js.undefined)
        ret
    }
    @scala.inline
    def withMedianVideo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("medianVideo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMedianVideo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("medianVideo")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withNetLog(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("netLog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetLog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("netLog")(js.undefined)
        ret
    }
    @scala.inline
    def withNotifyEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotifyEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withPacketLossRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packetLossRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPacketLossRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packetLossRate")(js.undefined)
        ret
    }
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(js.undefined)
        ret
    }
    @scala.inline
    def withPingback(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pingback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPingback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pingback")(js.undefined)
        ret
    }
    @scala.inline
    def withPollResults(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pollResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPollResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pollResults")(js.undefined)
        ret
    }
    @scala.inline
    def withPriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("private")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("private")(js.undefined)
        ret
    }
    @scala.inline
    def withRuns(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runs")(js.undefined)
        ret
    }
    @scala.inline
    def withSaveResponseBodies(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveResponseBodies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaveResponseBodies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveResponseBodies")(js.undefined)
        ret
    }
    @scala.inline
    def withSensitive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sensitive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSensitive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sensitive")(js.undefined)
        ret
    }
    @scala.inline
    def withSpof(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spof")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpof: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spof")(js.undefined)
        ret
    }
    @scala.inline
    def withStopAtDocumentComplete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopAtDocumentComplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopAtDocumentComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopAtDocumentComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withTcpDump(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tcpDump")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTcpDump: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tcpDump")(js.undefined)
        ret
    }
    @scala.inline
    def withTester(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tester")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTester: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tester")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeline")(js.undefined)
        ret
    }
    @scala.inline
    def withTimelineCallStack(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timelineCallStack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimelineCallStack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timelineCallStack")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withTsView(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tsView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTsView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tsView")(js.undefined)
        ret
    }
    @scala.inline
    def withTsViewConfigs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tsViewConfigs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTsViewConfigs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tsViewConfigs")(js.undefined)
        ret
    }
    @scala.inline
    def withUserAgent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAgent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserAgent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAgent")(js.undefined)
        ret
    }
    @scala.inline
    def withVideo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitResults(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitResults")(js.undefined)
        ret
    }
  }
  
}

