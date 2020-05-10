package typingsSlinky.terminalKit

import typingsSlinky.terminalKit.terminalMod.CTerminal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBarStyle extends js.Object {
  var barStyle: js.UndefOr[CTerminal] = js.native
  var innerSize: js.UndefOr[Double] = js.native
}

object AnonBarStyle {
  @scala.inline
  def apply(): AnonBarStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonBarStyle]
  }
  @scala.inline
  implicit class AnonBarStyleOps[Self <: AnonBarStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBarStyle(value: CTerminal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerSize")(js.undefined)
        ret
    }
  }
  
}

