package typingsSlinky.serialport

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCts extends js.Object {
  var cts: Boolean = js.native
  var dcd: Boolean = js.native
  var dsr: Boolean = js.native
}

object AnonCts {
  @scala.inline
  def apply(cts: Boolean, dcd: Boolean, dsr: Boolean): AnonCts = {
    val __obj = js.Dynamic.literal(cts = cts.asInstanceOf[js.Any], dcd = dcd.asInstanceOf[js.Any], dsr = dsr.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCts]
  }
  @scala.inline
  implicit class AnonCtsOps[Self <: AnonCts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDcd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dcd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDsr(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dsr")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

