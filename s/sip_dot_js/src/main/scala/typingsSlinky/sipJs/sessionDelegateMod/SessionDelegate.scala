package typingsSlinky.sipJs.sessionDelegateMod

import typingsSlinky.sipJs.coreMod.IncomingRequestMessage
import typingsSlinky.sipJs.infoMod.Info
import typingsSlinky.sipJs.notificationMod.Notification
import typingsSlinky.sipJs.referralMod.Referral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionDelegate extends js.Object {
  /**
    * Called upon receiving an incoming in dialog INFO request.
    * @param info - The info.
    */
  var onInfo: js.UndefOr[js.Function1[/* info */ Info, Unit]] = js.native
  /**
    * Called upon receiving an incoming in dialog INVITE request.
    * @param invite - The invite.
    */
  var onInvite: js.UndefOr[
    js.Function3[
      /* request */ IncomingRequestMessage, 
      /* response */ String, 
      /* statusCode */ Double, 
      Unit
    ]
  ] = js.native
  /**
    * Called upon receiving an incoming in dialog NOTIFY request.
    *
    * @remarks
    * If a refer is in progress notifications are delivered to the referrers delegate.
    *
    * @param notification - The notification.
    */
  var onNotify: js.UndefOr[js.Function1[/* notification */ Notification, Unit]] = js.native
  /**
    * Called upon receiving an incoming in dialog REFER request.
    * @param referral - The referral.
    */
  var onRefer: js.UndefOr[js.Function1[/* referral */ Referral, Unit]] = js.native
}

object SessionDelegate {
  @scala.inline
  def apply(): SessionDelegate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionDelegate]
  }
  @scala.inline
  implicit class SessionDelegateOps[Self <: SessionDelegate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnInfo(value: /* info */ Info => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInfo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInvite(
      value: (/* request */ IncomingRequestMessage, /* response */ String, /* statusCode */ Double) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInvite")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnInvite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInvite")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNotify(value: /* notification */ Notification => Unit): Self = {
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
    def withOnRefer(value: /* referral */ Referral => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRefer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRefer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRefer")(js.undefined)
        ret
    }
  }
  
}

