package typingsSlinky.stripeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIban extends js.Object {
  /*
    * An IBAN account number.
    */
  var iban: String = js.native
}

object AnonIban {
  @scala.inline
  def apply(iban: String): AnonIban = {
    val __obj = js.Dynamic.literal(iban = iban.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIban]
  }
  @scala.inline
  implicit class AnonIbanOps[Self <: AnonIban] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIban(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iban")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

