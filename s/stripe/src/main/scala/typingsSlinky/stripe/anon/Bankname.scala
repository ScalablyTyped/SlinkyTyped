package typingsSlinky.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bankname extends js.Object {
  var account_number: String = js.native
  var bank_name: String = js.native
  var fingerprint: String = js.native
  var refund_account_holder_name: js.UndefOr[String | Null] = js.native
  var refund_account_holder_type: js.UndefOr[String | Null] = js.native
  var refund_routing_number: js.UndefOr[String | Null] = js.native
  var routing_number: String = js.native
  var swift_code: String = js.native
}

object Bankname {
  @scala.inline
  def apply(
    account_number: String,
    bank_name: String,
    fingerprint: String,
    routing_number: String,
    swift_code: String
  ): Bankname = {
    val __obj = js.Dynamic.literal(account_number = account_number.asInstanceOf[js.Any], bank_name = bank_name.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], routing_number = routing_number.asInstanceOf[js.Any], swift_code = swift_code.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bankname]
  }
  @scala.inline
  implicit class BanknameOps[Self <: Bankname] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccount_number(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBank_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bank_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFingerprint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRouting_number(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routing_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwift_code(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swift_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefund_account_holder_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refund_account_holder_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefund_account_holder_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refund_account_holder_name")(js.undefined)
        ret
    }
    @scala.inline
    def withRefund_account_holder_nameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refund_account_holder_name")(null)
        ret
    }
    @scala.inline
    def withRefund_account_holder_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refund_account_holder_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefund_account_holder_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refund_account_holder_type")(js.undefined)
        ret
    }
    @scala.inline
    def withRefund_account_holder_typeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refund_account_holder_type")(null)
        ret
    }
    @scala.inline
    def withRefund_routing_number(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refund_routing_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefund_routing_number: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refund_routing_number")(js.undefined)
        ret
    }
    @scala.inline
    def withRefund_routing_numberNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refund_routing_number")(null)
        ret
    }
  }
  
}

