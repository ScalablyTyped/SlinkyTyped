package typingsSlinky.seleniumWebdriver.capabilitiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITimeouts extends js.Object {
  /**
    * The maximum amount of time, in milliseconds, to spend attempting to
    * {@linkplain ./webdriver.IWebDriver#findElement locate} an element on the
    * current page.
    */
  var `implicit`: js.UndefOr[Double] = js.native
  /**
    * The timeout, in milliseconds, to apply to navigation events along with the
    * {@link PageLoadStrategy}.
    */
  var pageLoad: js.UndefOr[Double] = js.native
  /**
    * Defines when, in milliseconds, to interrupt a script that is being
    * {@linkplain ./webdriver.IWebDriver#executeScript evaluated}.
    */
  var script: js.UndefOr[Double] = js.native
}

object ITimeouts {
  @scala.inline
  def apply(): ITimeouts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITimeouts]
  }
  @scala.inline
  implicit class ITimeoutsOps[Self <: ITimeouts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImplicit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implicit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImplicit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implicit")(js.undefined)
        ret
    }
    @scala.inline
    def withPageLoad(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withScript(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("script")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("script")(js.undefined)
        ret
    }
  }
  
}

