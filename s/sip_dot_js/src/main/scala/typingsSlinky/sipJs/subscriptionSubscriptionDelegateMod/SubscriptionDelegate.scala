package typingsSlinky.sipJs.subscriptionSubscriptionDelegateMod

import typingsSlinky.sipJs.notifyMod.IncomingNotifyRequest
import typingsSlinky.sipJs.subscribeMod.OutgoingSubscribeRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionDelegate extends js.Object {
  /**
    * Receive NOTIFY request. This includes in dialog NOTIFY requests only.
    * Thus the first NOTIFY (the subscription creating NOTIFY) will not be provided.
    * https://tools.ietf.org/html/rfc6665#section-4.1.3
    * @param request - Incoming NOTIFY request.
    */
  var onNotify: js.UndefOr[js.Function1[/* request */ IncomingNotifyRequest, Unit]] = js.native
  /**
    * Sent a SUBSCRIBE request. This includes "auto refresh" in dialog SUBSCRIBE requests only.
    * Thus SUBSCRIBE requests triggered by calls to `refresh()` or `subscribe()` will not be provided.
    * Thus the first SUBSCRIBE (the subscription creating SUBSCRIBE) will not be provided.
    * @param request - Outgoing SUBSCRIBE request.
    */
  var onRefresh: js.UndefOr[js.Function1[/* request */ OutgoingSubscribeRequest, Unit]] = js.native
  /**
    * Subscription termination. This includes non-NOTIFY termination causes only.
    * Thus this will not be called if a NOTIFY is the cause of termination.
    * https://tools.ietf.org/html/rfc6665#section-4.4.1
    */
  var onTerminated: js.UndefOr[js.Function0[Unit]] = js.native
}

object SubscriptionDelegate {
  @scala.inline
  def apply(): SubscriptionDelegate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscriptionDelegate]
  }
  @scala.inline
  implicit class SubscriptionDelegateOps[Self <: SubscriptionDelegate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnNotify(value: /* request */ IncomingNotifyRequest => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNotify")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnNotify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNotify")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRefresh(value: /* request */ OutgoingSubscribeRequest => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRefresh")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRefresh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRefresh")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTerminated(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTerminated")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnTerminated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTerminated")(js.undefined)
        ret
    }
  }
  
}

