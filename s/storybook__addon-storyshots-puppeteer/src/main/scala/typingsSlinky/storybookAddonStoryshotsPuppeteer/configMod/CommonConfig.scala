package typingsSlinky.storybookAddonStoryshotsPuppeteer.configMod

import typingsSlinky.puppeteer.mod.Browser
import typingsSlinky.puppeteer.mod.DirectNavigationOptions
import typingsSlinky.puppeteer.mod.Page
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonConfig extends js.Object {
  var chromeExecutablePath: String = js.native
  var setupTimeout: Double = js.native
  var storybookUrl: String = js.native
  var testTimeout: Double = js.native
  def customizePage(page: Page): js.Promise[Unit] = js.native
  def getCustomBrowser(): js.Promise[Browser] = js.native
  def getGotoOptions(options: Options): DirectNavigationOptions = js.native
}

object CommonConfig {
  @scala.inline
  def apply(
    chromeExecutablePath: String,
    customizePage: Page => js.Promise[Unit],
    getCustomBrowser: () => js.Promise[Browser],
    getGotoOptions: Options => DirectNavigationOptions,
    setupTimeout: Double,
    storybookUrl: String,
    testTimeout: Double
  ): CommonConfig = {
    val __obj = js.Dynamic.literal(chromeExecutablePath = chromeExecutablePath.asInstanceOf[js.Any], customizePage = js.Any.fromFunction1(customizePage), getCustomBrowser = js.Any.fromFunction0(getCustomBrowser), getGotoOptions = js.Any.fromFunction1(getGotoOptions), setupTimeout = setupTimeout.asInstanceOf[js.Any], storybookUrl = storybookUrl.asInstanceOf[js.Any], testTimeout = testTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonConfig]
  }
  @scala.inline
  implicit class CommonConfigOps[Self <: CommonConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChromeExecutablePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chromeExecutablePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomizePage(value: Page => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizePage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetCustomBrowser(value: () => js.Promise[Browser]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCustomBrowser")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetGotoOptions(value: Options => DirectNavigationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGotoOptions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetupTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setupTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStorybookUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storybookUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testTimeout")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

