package typingsSlinky.stripeV3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bankcode extends js.Object {
  var bank_code: String | Null = js.native
  var country: String | Null = js.native
  var fingerprint: String = js.native
  var last4: String = js.native
  var mandate_reference: String = js.native
}

object Bankcode {
  @scala.inline
  def apply(fingerprint: String, last4: String, mandate_reference: String): Bankcode = {
    val __obj = js.Dynamic.literal(fingerprint = fingerprint.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any], mandate_reference = mandate_reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bankcode]
  }
  @scala.inline
  implicit class BankcodeOps[Self <: Bankcode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFingerprint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLast4(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMandate_reference(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mandate_reference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBank_code(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bank_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBank_codeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bank_code")(null)
        ret
    }
    @scala.inline
    def withCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCountryNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(null)
        ret
    }
  }
  
}

