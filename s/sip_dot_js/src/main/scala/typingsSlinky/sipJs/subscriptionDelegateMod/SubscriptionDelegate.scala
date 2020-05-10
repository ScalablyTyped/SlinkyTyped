package typingsSlinky.sipJs.subscriptionDelegateMod

import typingsSlinky.sipJs.notificationMod.Notification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionDelegate extends js.Object {
  /**
    * Called upon receiving an incoming in dialog NOTIFY request.
    * @param notification - A notification. See {@link Notification} for details.
    */
  def onNotify(notification: Notification): Unit = js.native
}

object SubscriptionDelegate {
  @scala.inline
  def apply(onNotify: Notification => Unit): SubscriptionDelegate = {
    val __obj = js.Dynamic.literal(onNotify = js.Any.fromFunction1(onNotify))
    __obj.asInstanceOf[SubscriptionDelegate]
  }
  @scala.inline
  implicit class SubscriptionDelegateOps[Self <: SubscriptionDelegate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnNotify(value: Notification => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNotify")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

