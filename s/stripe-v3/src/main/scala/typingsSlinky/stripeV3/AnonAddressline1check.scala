package typingsSlinky.stripeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAddressline1check extends js.Object {
  var address_line1_check: Boolean | Null = js.native
  var address_postal_code_check: Boolean | Null = js.native
  var cvc_check: Boolean | Null = js.native
}

object AnonAddressline1check {
  @scala.inline
  def apply(): AnonAddressline1check = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAddressline1check]
  }
  @scala.inline
  implicit class AnonAddressline1checkOps[Self <: AnonAddressline1check] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress_line1_check(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address_line1_check")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddress_line1_checkNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address_line1_check")(null)
        ret
    }
    @scala.inline
    def withAddress_postal_code_check(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address_postal_code_check")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddress_postal_code_checkNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address_postal_code_check")(null)
        ret
    }
    @scala.inline
    def withCvc_check(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cvc_check")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCvc_checkNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cvc_check")(null)
        ret
    }
  }
  
}

