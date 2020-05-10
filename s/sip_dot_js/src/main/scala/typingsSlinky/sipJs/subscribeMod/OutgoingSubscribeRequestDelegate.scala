package typingsSlinky.sipJs.subscribeMod

import typingsSlinky.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutgoingSubscribeRequestDelegate extends OutgoingRequestDelegate {
  /**
    * Received the initial subscription creating NOTIFY in response to this request.
    * Called for out of dialog SUBSCRIBE requests only (not called for re-SUBSCRIBE requests).
    * @param request - Incoming NOTIFY request (including a Subscription).
    */
  var onNotify: js.UndefOr[js.Function1[/* request */ IncomingRequestWithSubscription, Unit]] = js.native
  /**
    * Timed out waiting to receive the initial subscription creating NOTIFY in response to this request.
    * Called for out of dialog SUBSCRIBE requests only (not called for re-SUBSCRIBE requests).
    */
  var onNotifyTimeout: js.UndefOr[js.Function0[Unit]] = js.native
}

object OutgoingSubscribeRequestDelegate {
  @scala.inline
  def apply(): OutgoingSubscribeRequestDelegate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutgoingSubscribeRequestDelegate]
  }
  @scala.inline
  implicit class OutgoingSubscribeRequestDelegateOps[Self <: OutgoingSubscribeRequestDelegate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnNotify(value: /* request */ IncomingRequestWithSubscription => Unit): Self = {
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
    def withOnNotifyTimeout(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNotifyTimeout")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnNotifyTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNotifyTimeout")(js.undefined)
        ret
    }
  }
  
}

