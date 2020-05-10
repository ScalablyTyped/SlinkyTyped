package typingsSlinky.webdriver.WebDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Capabilities extends js.Object {
  var acceptInsecureCerts: js.UndefOr[Boolean] = js.native
  var browserName: js.UndefOr[String] = js.native
  var browserVersion: js.UndefOr[String] = js.native
  var pageLoadStrategy: js.UndefOr[PageLoadingStrategy] = js.native
  var platformName: js.UndefOr[String] = js.native
  var proxy: js.UndefOr[ProxyObject] = js.native
  var setWindowRect: js.UndefOr[Boolean] = js.native
  var timeouts: js.UndefOr[Timeouts] = js.native
  var unhandledPromptBehavior: js.UndefOr[String] = js.native
}

object Capabilities {
  @scala.inline
  def apply(): Capabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Capabilities]
  }
  @scala.inline
  implicit class CapabilitiesOps[Self <: Capabilities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceptInsecureCerts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptInsecureCerts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceptInsecureCerts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptInsecureCerts")(js.undefined)
        ret
    }
    @scala.inline
    def withBrowserName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowserName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserName")(js.undefined)
        ret
    }
    @scala.inline
    def withBrowserVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowserVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withPageLoadStrategy(value: PageLoadingStrategy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageLoadStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageLoadStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageLoadStrategy")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatformName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platformName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatformName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platformName")(js.undefined)
        ret
    }
    @scala.inline
    def withProxy(value: ProxyObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(js.undefined)
        ret
    }
    @scala.inline
    def withSetWindowRect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWindowRect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetWindowRect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWindowRect")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeouts(value: Timeouts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeouts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeouts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeouts")(js.undefined)
        ret
    }
    @scala.inline
    def withUnhandledPromptBehavior(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unhandledPromptBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnhandledPromptBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unhandledPromptBehavior")(js.undefined)
        ret
    }
  }
  
}

