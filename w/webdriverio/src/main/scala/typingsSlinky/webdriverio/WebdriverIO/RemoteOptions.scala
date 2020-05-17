package typingsSlinky.webdriverio.WebdriverIO

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.NodeJS.WritableStream
import typingsSlinky.webdriver.HTTPRequestOptions
import typingsSlinky.webdriver.HTTPResponse
import typingsSlinky.webdriver.WebDriver.DesiredCapabilities
import typingsSlinky.webdriver.WebDriver.WebDriverLogTypes
import typingsSlinky.webdriverio.anon.SpecFiltering
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent webdriver.WebDriver.Options */
/* Inlined parent std.Omit<webdriverio.WebdriverIO.Options, 'capabilities'> */
@js.native
trait RemoteOptions extends js.Object {
  var bail: js.UndefOr[Double] = js.native
  var baseUrl: js.UndefOr[String] = js.native
  var capabilities: js.UndefOr[DesiredCapabilities] = js.native
  var connectionRetryCount: js.UndefOr[Double] = js.native
  var connectionRetryTimeout: js.UndefOr[Double] = js.native
  var exclude: js.UndefOr[js.Array[String]] = js.native
  var execArgv: js.UndefOr[js.Array[String]] = js.native
  var featureFlags: js.UndefOr[SpecFiltering] = js.native
  var framework: js.UndefOr[String] = js.native
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  var hostname: js.UndefOr[String] = js.native
  var jasmineNodeOpts: js.UndefOr[js.Object] = js.native
  var key: js.UndefOr[String] = js.native
  var logLevel: js.UndefOr[WebDriverLogTypes] = js.native
  var logOutput: js.UndefOr[String | WritableStream] = js.native
  var maxInstances: js.UndefOr[Double] = js.native
  var maxInstancesPerCapability: js.UndefOr[Double] = js.native
  var mochaOpts: js.UndefOr[js.Object] = js.native
  var outputDir: js.UndefOr[String] = js.native
  var path: js.UndefOr[String] = js.native
  var port: js.UndefOr[Double] = js.native
  var protocol: js.UndefOr[String] = js.native
  var queryParams: js.UndefOr[StringDictionary[String]] = js.native
  var reporters: js.UndefOr[js.Array[String | js.Object]] = js.native
  var runner: js.UndefOr[String] = js.native
  var services: js.UndefOr[js.Array[String | js.Object]] = js.native
  var specFileRetries: js.UndefOr[Double] = js.native
  var specFileRetryAttempts: js.UndefOr[Double] = js.native
  var specs: js.UndefOr[js.Array[String]] = js.native
  var suites: js.UndefOr[js.Object] = js.native
  var transformRequest: js.UndefOr[js.Function1[/* requestOptions */ HTTPRequestOptions, HTTPRequestOptions]] = js.native
  var transformResponse: js.UndefOr[
    js.Function2[/* response */ HTTPResponse, /* requestOptions */ HTTPRequestOptions, HTTPResponse]
  ] = js.native
  var user: js.UndefOr[String] = js.native
  var waitforInterval: js.UndefOr[Double] = js.native
  var waitforTimeout: js.UndefOr[Double] = js.native
}

object RemoteOptions {
  @scala.inline
  def apply(): RemoteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoteOptions]
  }
  @scala.inline
  implicit class RemoteOptionsOps[Self <: RemoteOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBail(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bail")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withCapabilities(value: DesiredCapabilities): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capabilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapabilities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capabilities")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionRetryCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionRetryCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionRetryCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionRetryCount")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionRetryTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionRetryTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionRetryTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionRetryTimeout")(js.undefined)
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
    def withExecArgv(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execArgv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecArgv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execArgv")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatureFlags(value: SpecFiltering): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureFlags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatureFlags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureFlags")(js.undefined)
        ret
    }
    @scala.inline
    def withFramework(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("framework")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFramework: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("framework")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withHostname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(js.undefined)
        ret
    }
    @scala.inline
    def withJasmineNodeOpts(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jasmineNodeOpts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJasmineNodeOpts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jasmineNodeOpts")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withLogLevel(value: WebDriverLogTypes): Self = {
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
    def withLogOutput(value: String | WritableStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logOutput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logOutput")(js.undefined)
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
    def withMaxInstancesPerCapability(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxInstancesPerCapability")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxInstancesPerCapability: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxInstancesPerCapability")(js.undefined)
        ret
    }
    @scala.inline
    def withMochaOpts(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mochaOpts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMochaOpts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mochaOpts")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputDir")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryParams(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryParams")(js.undefined)
        ret
    }
    @scala.inline
    def withReporters(value: js.Array[String | js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reporters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReporters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reporters")(js.undefined)
        ret
    }
    @scala.inline
    def withRunner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRunner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runner")(js.undefined)
        ret
    }
    @scala.inline
    def withServices(value: js.Array[String | js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("services")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("services")(js.undefined)
        ret
    }
    @scala.inline
    def withSpecFileRetries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specFileRetries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpecFileRetries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specFileRetries")(js.undefined)
        ret
    }
    @scala.inline
    def withSpecFileRetryAttempts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specFileRetryAttempts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpecFileRetryAttempts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specFileRetryAttempts")(js.undefined)
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
    def withSuites(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suites")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuites: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suites")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformRequest(value: /* requestOptions */ HTTPRequestOptions => HTTPRequestOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformRequest")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTransformRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformResponse(value: (/* response */ HTTPResponse, /* requestOptions */ HTTPRequestOptions) => HTTPResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformResponse")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutTransformResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withUser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitforInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitforInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitforInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitforInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitforTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitforTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitforTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitforTimeout")(js.undefined)
        ret
    }
  }
  
}

