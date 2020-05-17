package typingsSlinky.webdriverio.WebdriverIO

import typingsSlinky.webdriver.WebDriver.DesiredCapabilities
import typingsSlinky.webdriverio.anon.SpecFiltering
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var bail: js.UndefOr[Double] = js.native
  var baseUrl: js.UndefOr[String] = js.native
  var capabilities: js.UndefOr[js.Array[DesiredCapabilities] | MultiRemoteCapabilities] = js.native
  var exclude: js.UndefOr[js.Array[String]] = js.native
  var execArgv: js.UndefOr[js.Array[String]] = js.native
  var featureFlags: js.UndefOr[SpecFiltering] = js.native
  var framework: js.UndefOr[String] = js.native
  var jasmineNodeOpts: js.UndefOr[js.Object] = js.native
  var maxInstances: js.UndefOr[Double] = js.native
  var maxInstancesPerCapability: js.UndefOr[Double] = js.native
  var mochaOpts: js.UndefOr[js.Object] = js.native
  var outputDir: js.UndefOr[String] = js.native
  var reporters: js.UndefOr[js.Array[String | js.Object]] = js.native
  var runner: js.UndefOr[String] = js.native
  var services: js.UndefOr[js.Array[String | js.Object]] = js.native
  var specFileRetries: js.UndefOr[Double] = js.native
  val specFileRetryAttempts: js.UndefOr[Double] = js.native
  var specs: js.UndefOr[js.Array[String]] = js.native
  var suites: js.UndefOr[js.Object] = js.native
  var waitforInterval: js.UndefOr[Double] = js.native
  var waitforTimeout: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def withCapabilities(value: js.Array[DesiredCapabilities] | MultiRemoteCapabilities): Self = {
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

