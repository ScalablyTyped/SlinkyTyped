package typingsSlinky.stripejs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StripeConfigOptions extends js.Object {
  var stripeAccount: String = js.native
}

object StripeConfigOptions {
  @scala.inline
  def apply(stripeAccount: String): StripeConfigOptions = {
    val __obj = js.Dynamic.literal(stripeAccount = stripeAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripeConfigOptions]
  }
  @scala.inline
  implicit class StripeConfigOptionsOps[Self <: StripeConfigOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStripeAccount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripeAccount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

