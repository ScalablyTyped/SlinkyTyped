package typingsSlinky.stripe.mod.paymentMethods

import typingsSlinky.stripe.stripeStrings.failed
import typingsSlinky.stripe.stripeStrings.pass
import typingsSlinky.stripe.stripeStrings.unavailable
import typingsSlinky.stripe.stripeStrings.unchecked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CardChecks extends js.Object {
  /**
    * If a address line1 was provided, results of the check, one of `pass`, `failed`, `unavailable` or `unchecked`.
    */
  var address_line1_check: pass | failed | unavailable | unchecked | Null = js.native
  /**
    * If a address postal code was provided, results of the check, one of `pass`, `failed`, `unavailable` or `unchecked`.
    */
  var address_postal_code_check: pass | failed | unavailable | unchecked | Null = js.native
  /**
    * If a CVC was provided, results of the check, one of `pass`, `failed`, `unavailable` or `unchecked`.
    */
  var cvc_check: pass | failed | unavailable | unchecked | Null = js.native
}

object CardChecks {
  @scala.inline
  def apply(): CardChecks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardChecks]
  }
  @scala.inline
  implicit class CardChecksOps[Self <: CardChecks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress_line1_check(value: pass | failed | unavailable | unchecked): Self = {
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
    def withAddress_postal_code_check(value: pass | failed | unavailable | unchecked): Self = {
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
    def withCvc_check(value: pass | failed | unavailable | unchecked): Self = {
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

