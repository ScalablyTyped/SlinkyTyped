package typingsSlinky.stripeV2.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bankname extends js.Object {
  var bank_name: String = js.native
  var country: String = js.native
  var last4: Double = js.native
  var `object`: String = js.native
  var validated: Boolean = js.native
}

object Bankname {
  @scala.inline
  def apply(bank_name: String, country: String, last4: Double, `object`: String, validated: Boolean): Bankname = {
    val __obj = js.Dynamic.literal(bank_name = bank_name.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any], validated = validated.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bankname]
  }
  @scala.inline
  implicit class BanknameOps[Self <: Bankname] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBank_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bank_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLast4(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validated")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

