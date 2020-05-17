package typingsSlinky.storybookAddonStoryshotsPuppeteer.anon

import typingsSlinky.puppeteer.mod.Browser
import typingsSlinky.puppeteer.mod.DirectNavigationOptions
import typingsSlinky.puppeteer.mod.Page
import typingsSlinky.storybookAddonStoryshotsPuppeteer.configMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@storybook/addon-storyshots-puppeteer.@storybook/addon-storyshots-puppeteer/dist/config.PuppeteerTestConfig> */
@js.native
trait PartialPuppeteerTestConfi extends js.Object {
  var chromeExecutablePath: js.UndefOr[String] = js.native
  var customizePage: js.UndefOr[js.Function1[/* page */ Page, js.Promise[Unit]]] = js.native
  var getCustomBrowser: js.UndefOr[js.Function0[js.Promise[Browser]]] = js.native
  var getGotoOptions: js.UndefOr[js.Function1[/* options */ Options, DirectNavigationOptions]] = js.native
  var setupTimeout: js.UndefOr[Double] = js.native
  var storybookUrl: js.UndefOr[String] = js.native
  var testBody: js.UndefOr[
    (js.Function2[/* page */ Page, /* options */ Options, Unit | js.Promise[Unit]]) with Filter
  ] = js.native
  var testTimeout: js.UndefOr[Double] = js.native
}

object PartialPuppeteerTestConfi {
  @scala.inline
  def apply(): PartialPuppeteerTestConfi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPuppeteerTestConfi]
  }
  @scala.inline
  implicit class PartialPuppeteerTestConfiOps[Self <: PartialPuppeteerTestConfi] (val x: Self) extends AnyVal {
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
    def withoutChromeExecutablePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chromeExecutablePath")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomizePage(value: /* page */ Page => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizePage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCustomizePage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizePage")(js.undefined)
        ret
    }
    @scala.inline
    def withGetCustomBrowser(value: () => js.Promise[Browser]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCustomBrowser")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetCustomBrowser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCustomBrowser")(js.undefined)
        ret
    }
    @scala.inline
    def withGetGotoOptions(value: /* options */ Options => DirectNavigationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGotoOptions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetGotoOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGotoOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withSetupTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setupTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetupTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setupTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withStorybookUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storybookUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorybookUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storybookUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withTestBody(value: (js.Function2[/* page */ Page, /* options */ Options, Unit | js.Promise[Unit]]) with Filter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testBody")(js.undefined)
        ret
    }
    @scala.inline
    def withTestTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testTimeout")(js.undefined)
        ret
    }
  }
  
}

