package typingsSlinky.stripejs.sourceMod

import typingsSlinky.stripejs.stripejsStrings.email
import typingsSlinky.stripejs.stripejsStrings.manual
import typingsSlinky.stripejs.stripejsStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mandate extends js.Object {
  var acceptance: js.UndefOr[Acceptance] = js.native
  /**
    * The method Stripe should use to notify the customer
    * - email: an email is sent directly to the customer
    * - manual: a source.mandate_notification event is sent to your webhooks endpoint and you should handle the notification
    * - none: the underlying debit network does not require any notification
    */
  var notification_method: js.UndefOr[email | manual | none] = js.native
}

object Mandate {
  @scala.inline
  def apply(): Mandate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mandate]
  }
  @scala.inline
  implicit class MandateOps[Self <: Mandate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceptance(value: Acceptance): Self = {
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

