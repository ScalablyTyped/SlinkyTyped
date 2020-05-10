package typingsSlinky.webdriverio.WebdriverIO

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Timeouts extends js.Object {
  var `implicit`: js.UndefOr[Double] = js.native
  var pageLoad: js.UndefOr[Double] = js.native
  var script: js.UndefOr[Double] = js.native
}

object Timeouts {
  @scala.inline
  def apply(): Timeouts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Timeouts]
  }
  @scala.inline
  implicit class TimeoutsOps[Self <: Timeouts] (val x: Self) extends AnyVal {
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

