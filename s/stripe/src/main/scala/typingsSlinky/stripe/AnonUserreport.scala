package typingsSlinky.stripe

import typingsSlinky.stripe.stripeStrings.fraudulent
import typingsSlinky.stripe.stripeStrings.safe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonUserreport extends js.Object {
  /**
    * If you believe a charge is fraudulent, include a user_report key with a value of fraudulent. If you believe a
    * charge is safe, include a user_report key with a value of safe. Note that you must refund a charge before setting
    * the user_report to fraudulent. Stripe will use the information you send to improve our fraud detection algorithm
    */
  var user_report: js.UndefOr[fraudulent | safe] = js.native
}

object AnonUserreport {
  @scala.inline
  def apply(): AnonUserreport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonUserreport]
  }
  @scala.inline
  implicit class AnonUserreportOps[Self <: AnonUserreport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

