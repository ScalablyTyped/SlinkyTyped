package typingsSlinky.soap.typesMod

import typingsSlinky.soap.anon.Subcode
import typingsSlinky.soap.anon.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISoapFault12 extends ISoapFault {
  var Code: Subcode = js.native
  var Reason: Text = js.native
  var statusCode: js.UndefOr[Double] = js.native
}

object ISoapFault12 {
  @scala.inline
  def apply(Code: Subcode, Reason: Text): ISoapFault12 = {
    val __obj = js.Dynamic.literal(Code = Code.asInstanceOf[js.Any], Reason = Reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISoapFault12]
  }
  @scala.inline
  implicit class ISoapFault12Ops[Self <: ISoapFault12] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: Subcode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReason(value: Text): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(js.undefined)
        ret
    }
  }
  
}

