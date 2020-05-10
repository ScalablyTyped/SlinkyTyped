package typingsSlinky.stripeV3.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StripeOptions extends js.Object {
  var betas: js.UndefOr[js.Array[String]] = js.native
  var locale: js.UndefOr[String] = js.native
  var stripeAccount: js.UndefOr[String] = js.native
}

object StripeOptions {
  @scala.inline
  def apply(): StripeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StripeOptions]
  }
  @scala.inline
  implicit class StripeOptionsOps[Self <: StripeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBetas(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("betas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBetas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("betas")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withStripeAccount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripeAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStripeAccount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripeAccount")(js.undefined)
        ret
    }
  }
  
}

