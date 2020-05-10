package typingsSlinky.stripe.mod.webhookEndpoints

import typingsSlinky.stripe.mod.events.EventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWebhookCreateOptions extends js.Object {
  /**
    * Events sent to this endpoint will be generated with this Stripe Version instead of your
    * account’s default Stripe Version.
    */
  var api_version: js.UndefOr[String] = js.native
  /**
    * If true, this endpoint will receive events from connected accounts instead of just your account.
    */
  var connect: js.UndefOr[Boolean] = js.native
  /**
    * The list of enabled events for this webhook endpoint.
    * Use '*' to enable all events, except those that require explicit selection.
    */
  var enabled_events: js.Array[EventType] = js.native
  /**
    * The URL of the webhook endpoint
    */
  var url: String = js.native
}

object IWebhookCreateOptions {
  @scala.inline
  def apply(enabled_events: js.Array[EventType], url: String): IWebhookCreateOptions = {
    val __obj = js.Dynamic.literal(enabled_events = enabled_events.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebhookCreateOptions]
  }
  @scala.inline
  implicit class IWebhookCreateOptionsOps[Self <: IWebhookCreateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled_events(value: js.Array[EventType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled_events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApi_version(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api_version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApi_version: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api_version")(js.undefined)
        ret
    }
    @scala.inline
    def withConnect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connect")(js.undefined)
        ret
    }
  }
  
}

