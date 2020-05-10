package typingsSlinky.sparkpost.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Webhook extends js.Object {
  /**
    * Reserved for future use
    *
    * @default {true}
    */
  var active: js.UndefOr[Boolean] = js.native
  /** Object containing credentials needed to make authorized POST requests to target */
  var auth_credentials: js.UndefOr[js.Any] = js.native
  /** Object containing details needed to request authorization credentials, as necessary */
  var auth_request_details: js.UndefOr[js.Any] = js.native
  /** Authentication token to present in the X-MessageSystems-Webhook-Token header of POST requests to target */
  var auth_token: js.UndefOr[String] = js.native
  /** Type of authentication to be used during POST requests to target */
  var auth_type: js.UndefOr[String] = js.native
  /** Array of event types this webhook will receive */
  var events: js.Array[String] = js.native
  /** User-friendly name for webhook */
  var name: String = js.native
  /** URL of the target to which to POST event batches */
  var target: String = js.native
}

object Webhook {
  @scala.inline
  def apply(events: js.Array[String], name: String, target: String): Webhook = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Webhook]
  }
  @scala.inline
  implicit class WebhookOps[Self <: Webhook] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvents(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
        ret
    }
    @scala.inline
    def withAuth_credentials(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth_credentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth_credentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth_credentials")(js.undefined)
        ret
    }
    @scala.inline
    def withAuth_request_details(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth_request_details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth_request_details: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth_request_details")(js.undefined)
        ret
    }
    @scala.inline
    def withAuth_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth_token: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth_token")(js.undefined)
        ret
    }
    @scala.inline
    def withAuth_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth_type")(js.undefined)
        ret
    }
  }
  
}

