package typingsSlinky.stripeV3.anon

import typingsSlinky.stripeV3.stripeV3Strings.fraudulent
import typingsSlinky.stripeV3.stripeV3Strings.safe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stripereport extends js.Object {
  /**
    * Assessments from Stripe have the key stripe_report and, if set, the value "fraudulent".
    */
  var stripe_report: js.UndefOr[fraudulent] = js.native
  /**
    * Assessments reported by you have the key user_report and, if set, possible values of "safe" and "fraudulent".
    */
  var user_report: js.UndefOr[fraudulent | safe] = js.native
}

object Stripereport {
  @scala.inline
  def apply(): Stripereport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Stripereport]
  }
  @scala.inline
  implicit class StripereportOps[Self <: Stripereport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStripe_report(value: fraudulent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripe_report")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStripe_report: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripe_report")(js.undefined)
        ret
    }
    @scala.inline
    def withUser_report(value: fraudulent | safe): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_report")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser_report: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_report")(js.undefined)
        ret
    }
  }
  
}

