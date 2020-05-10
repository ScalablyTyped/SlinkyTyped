package typingsSlinky.stripeV3.stripe

import typingsSlinky.stripeV3.stripeV3Strings.email
import typingsSlinky.stripeV3.stripeV3Strings.manual
import typingsSlinky.stripeV3.stripeV3Strings.none
import typingsSlinky.stripeV3.stripeV3Strings.one_time
import typingsSlinky.stripeV3.stripeV3Strings.scheduled
import typingsSlinky.stripeV3.stripeV3Strings.variable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceMandate extends js.Object {
  var acceptance: js.UndefOr[SourceMandateAcceptance] = js.native
  var amount: js.UndefOr[Double] = js.native
  var currency: js.UndefOr[String] = js.native
  var interval: js.UndefOr[one_time | scheduled | variable] = js.native
  var notification_method: js.UndefOr[email | manual | none] = js.native
}

object SourceMandate {
  @scala.inline
  def apply(): SourceMandate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceMandate]
  }
  @scala.inline
  implicit class SourceMandateOps[Self <: SourceMandate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceptance(value: SourceMandateAcceptance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceptance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptance")(js.undefined)
        ret
    }
    @scala.inline
    def withAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(js.undefined)
        ret
    }
    @scala.inline
    def withInterval(value: one_time | scheduled | variable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(js.undefined)
        ret
    }
    @scala.inline
    def withNotification_method(value: email | manual | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notification_method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotification_method: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notification_method")(js.undefined)
        ret
    }
  }
  
}

