package typingsSlinky.stripe.mod.bankAccounts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBankAccountVerifyOptions extends js.Object {
  /**
    * Two positive integers, in cents, equal to the values of the microdeposits sent to the bank account.
    */
  var amounts: js.Tuple2[Double, Double] = js.native
}

object IBankAccountVerifyOptions {
  @scala.inline
  def apply(amounts: js.Tuple2[Double, Double]): IBankAccountVerifyOptions = {
    val __obj = js.Dynamic.literal(amounts = amounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBankAccountVerifyOptions]
  }
  @scala.inline
  implicit class IBankAccountVerifyOptionsOps[Self <: IBankAccountVerifyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmounts(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amounts")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

