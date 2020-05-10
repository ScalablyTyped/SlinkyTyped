package typingsSlinky.serialport.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetOptions extends js.Object {
  var brk: js.UndefOr[Boolean] = js.native
  var cts: js.UndefOr[Boolean] = js.native
  var dsr: js.UndefOr[Boolean] = js.native
  var dtr: js.UndefOr[Boolean] = js.native
  var rts: js.UndefOr[Boolean] = js.native
}

object SetOptions {
  @scala.inline
  def apply(): SetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetOptions]
  }
  @scala.inline
  implicit class SetOptionsOps[Self <: SetOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrk(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brk")(js.undefined)
        ret
    }
    @scala.inline
    def withCts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cts")(js.undefined)
        ret
    }
    @scala.inline
    def withDsr(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dsr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDsr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dsr")(js.undefined)
        ret
    }
    @scala.inline
    def withDtr(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDtr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtr")(js.undefined)
        ret
    }
    @scala.inline
    def withRts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rts")(js.undefined)
        ret
    }
  }
  
}

