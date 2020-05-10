package typingsSlinky.stripeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBank extends js.Object {
  var bank: String = js.native
}

object AnonBank {
  @scala.inline
  def apply(bank: String): AnonBank = {
    val __obj = js.Dynamic.literal(bank = bank.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBank]
  }
  @scala.inline
  implicit class AnonBankOps[Self <: AnonBank] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBank(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bank")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

