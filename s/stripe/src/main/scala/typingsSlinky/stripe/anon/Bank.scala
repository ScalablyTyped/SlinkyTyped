package typingsSlinky.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bank extends js.Object {
  var bank: js.UndefOr[String] = js.native
}

object Bank {
  @scala.inline
  def apply(): Bank = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bank]
  }
  @scala.inline
  implicit class BankOps[Self <: Bank] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withoutBank: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bank")(js.undefined)
        ret
    }
  }
  
}

