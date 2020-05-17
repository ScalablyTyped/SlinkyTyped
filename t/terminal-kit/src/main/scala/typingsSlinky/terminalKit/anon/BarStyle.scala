package typingsSlinky.terminalKit.anon

import typingsSlinky.terminalKit.terminalMod.CTerminal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BarStyle extends js.Object {
  var barStyle: js.UndefOr[CTerminal] = js.native
  var innerSize: js.UndefOr[Double] = js.native
}

object BarStyle {
  @scala.inline
  def apply(): BarStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarStyle]
  }
  @scala.inline
  implicit class BarStyleOps[Self <: BarStyle] (val x: Self) extends AnyVal {
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

