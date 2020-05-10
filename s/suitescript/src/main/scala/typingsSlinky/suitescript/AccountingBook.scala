package typingsSlinky.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountingBook extends js.Object {
  def getId(): Double = js.native
  def isPrimary(): Boolean = js.native
}

object AccountingBook {
  @scala.inline
  def apply(getId: () => Double, isPrimary: () => Boolean): AccountingBook = {
    val __obj = js.Dynamic.literal(getId = js.Any.fromFunction0(getId), isPrimary = js.Any.fromFunction0(isPrimary))
    __obj.asInstanceOf[AccountingBook]
  }
  @scala.inline
  implicit class AccountingBookOps[Self <: AccountingBook] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetId(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsPrimary(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPrimary")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

