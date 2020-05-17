package typingsSlinky.stripe.mod.events

import typingsSlinky.stripe.anon.Id
import typingsSlinky.stripe.anon.Previousattributes
import typingsSlinky.stripe.mod.IResourceObject
import typingsSlinky.stripe.stripeStrings.event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEvent extends IResourceObject {
  /**
    * The connected account that originated the event.
    * CONNECT ONLY
    */
  var account: js.UndefOr[String] = js.native
  /**
    * The Stripe API version used to render data.
    * Note: this property is populated for events on or after October 31, 2014.
    */
  var api_version: String = js.native
  var created: Double = js.native
  /**
    * Hash containing data associated with the event.
    */
  var data: Previousattributes = js.native
  var livemode: Boolean = js.native
  /**
    * Value is "event"
    */
  @JSName("object")
  var object_IEvent: event = js.native
  /**
    * Number of webhooks yet to be delivered successfully (return a 20x response) to the URLs you’ve specified.
    *
    * positive integer or zero
    */
  var pending_webhooks: Double = js.native
  /**
    * Information on the API request that instigated the event.
    */
  var request: Id = js.native
  /**
    * Description of the event: e.g. invoice.created, charge.refunded, etc.
    */
  var `type`: String = js.native
}

object IEvent {
  @scala.inline
  def apply(
    api_version: String,
    created: Double,
    data: Previousattributes,
    id: String,
    livemode: Boolean,
    `object`: event,
    pending_webhooks: Double,
    request: Id,
    `type`: String
  ): IEvent = {
    val __obj = js.Dynamic.literal(api_version = api_version.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], pending_webhooks = pending_webhooks.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEvent]
  }
  @scala.inline
  implicit class IEventOps[Self <: IEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApi_version(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api_version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreated(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: Previousattributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLivemode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("livemode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObject(value: event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPending_webhooks(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pending_webhooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequest(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account")(js.undefined)
        ret
    }
  }
  
}

