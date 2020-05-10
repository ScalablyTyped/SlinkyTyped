package typingsSlinky.soap.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISoapFault11 extends ISoapFault {
  var detail: js.UndefOr[String] = js.native
  var faultcode: Double | String = js.native
  var faultstring: String = js.native
  var statusCode: js.UndefOr[Double] = js.native
}

object ISoapFault11 {
  @scala.inline
  def apply(faultcode: Double | String, faultstring: String): ISoapFault11 = {
    val __obj = js.Dynamic.literal(faultcode = faultcode.asInstanceOf[js.Any], faultstring = faultstring.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISoapFault11]
  }
  @scala.inline
  implicit class ISoapFault11Ops[Self <: ISoapFault11] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFaultcode(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faultcode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFaultstring(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faultstring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detail")(js.undefined)
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

