package typingsSlinky.sipJs.simpleUserDelegateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleUserDelegate extends js.Object {
  /**
    * Called when a call is answered.
    * @remarks
    * Callback for handling establishment of a new Session.
    */
  var onCallAnswered: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Called when a call is created.
    * @remarks
    * Callback for handling the creation of a new Session.
    */
  var onCallCreated: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Called when a call is hungup.
    * @remarks
    * Callback for handling termination of a Session.
    */
  var onCallHangup: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Called when a call is put on hold or taken off hold.
    * @remarks
    * Callback for handling re-INVITE responses.
    */
  var onCallHold: js.UndefOr[js.Function1[/* held */ Boolean, Unit]] = js.native
  /**
    * Called when a call is received.
    * @remarks
    * Callback for handling incoming INVITE requests.
    * The callback must either accept or reject the incoming call by calling `answer()` or `decline()` respectively.
    */
  var onCallReceived: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Called upon receiving a message.
    * @remarks
    * Callback for handling incoming MESSAGE requests.
    * @param message - The message received.
    */
  var onMessageReceived: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.native
  /**
    * Called when user is registered to received calls.
    */
  var onRegistered: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Called when user is connected to server.
    * @remarks
    * Callback for handling user becomes connected.
    */
  var onServerConnect: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Called when user is no longer connected.
    * @remarks
    * Callback for handling user becomes disconnected.
    *
    * @param error - An Error if server caused the disconnect. Otherwise undefined.
    */
  var onServerDisconnect: js.UndefOr[js.Function1[/* error */ js.UndefOr[js.Error], Unit]] = js.native
  /**
    * Called when user is no longer registered to received calls.
    */
  var onUnregistered: js.UndefOr[js.Function0[Unit]] = js.native
}

object SimpleUserDelegate {
  @scala.inline
  def apply(): SimpleUserDelegate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimpleUserDelegate]
  }
  @scala.inline
  implicit class SimpleUserDelegateOps[Self <: SimpleUserDelegate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnCallAnswered(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCallAnswered")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnCallAnswered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCallAnswered")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCallCreated(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCallCreated")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnCallCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCallCreated")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCallHangup(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCallHangup")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnCallHangup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCallHangup")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCallHold(value: /* held */ Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCallHold")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCallHold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCallHold")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCallReceived(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCallReceived")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnCallReceived: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCallReceived")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMessageReceived(value: /* message */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMessageReceived")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMessageReceived: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMessageReceived")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRegistered(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRegistered")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnRegistered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRegistered")(js.undefined)
        ret
    }
    @scala.inline
    def withOnServerConnect(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onServerConnect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnServerConnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onServerConnect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnServerDisconnect(value: /* error */ js.UndefOr[js.Error] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onServerDisconnect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnServerDisconnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onServerDisconnect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUnregistered(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnregistered")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnUnregistered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnregistered")(js.undefined)
        ret
    }
  }
  
}

