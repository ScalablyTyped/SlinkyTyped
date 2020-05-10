package typingsSlinky.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAccountnumber extends js.Object {
  /**
    * Account number to transfer funds to.
    */
  var account_number: String = js.native
  /**
    * Name of the bank associated with the routing number.
    */
  var bank_name: String = js.native
  /**
    * Routing transit number for the bank account to transfer funds to.
    */
  var routing_number: String = js.native
  /**
    * SWIFT code of the bank associated with the routing number.
    */
  var swift_code: String = js.native
}

object AnonAccountnumber {
  @scala.inline
  def apply(account_number: String, bank_name: String, routing_number: String, swift_code: String): AnonAccountnumber = {
    val __obj = js.Dynamic.literal(account_number = account_number.asInstanceOf[js.Any], bank_name = bank_name.asInstanceOf[js.Any], routing_number = routing_number.asInstanceOf[js.Any], swift_code = swift_code.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAccountnumber]
  }
  @scala.inline
  implicit class AnonAccountnumberOps[Self <: AnonAccountnumber] (val x: Self) extends AnyVal {
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
  }
  
}

