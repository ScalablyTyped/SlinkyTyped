package typingsSlinky.sipJs.referrerDelegateMod

import typingsSlinky.sipJs.notificationMod.Notification
import typingsSlinky.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReferrerDelegate extends OutgoingRequestDelegate {
  def onNotify(notification: Notification): Unit = js.native
}

object ReferrerDelegate {
  @scala.inline
  def apply(onNotify: Notification => Unit): ReferrerDelegate = {
    val __obj = js.Dynamic.literal(onNotify = js.Any.fromFunction1(onNotify))
    __obj.asInstanceOf[ReferrerDelegate]
  }
  @scala.inline
  implicit class ReferrerDelegateOps[Self <: ReferrerDelegate] (val x: Self) extends AnyVal {
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

