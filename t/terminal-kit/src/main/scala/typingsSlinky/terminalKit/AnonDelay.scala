package typingsSlinky.terminalKit

import typingsSlinky.terminalKit.terminalMod.CTerminal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDelay extends js.Object {
  var delay: js.UndefOr[Double] = js.native
  var flashDelay: js.UndefOr[Double] = js.native
  var flashStyle: js.UndefOr[CTerminal] = js.native
  var style: js.UndefOr[CTerminal] = js.native
}

object AnonDelay {
  @scala.inline
  def apply(): AnonDelay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDelay]
  }
  @scala.inline
  implicit class AnonDelayOps[Self <: AnonDelay] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withFlashDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flashDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlashDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flashDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withFlashStyle(value: CTerminal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flashStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlashStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flashStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CTerminal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

