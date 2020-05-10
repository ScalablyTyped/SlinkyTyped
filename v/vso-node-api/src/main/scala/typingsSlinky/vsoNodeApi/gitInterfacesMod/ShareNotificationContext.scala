package typingsSlinky.vsoNodeApi.gitInterfacesMod

import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShareNotificationContext extends js.Object {
  /**
    * Optional user note or message.
    */
  var message: String = js.native
  /**
    * Identities of users who will receive a share notification.
    */
  var receivers: js.Array[IdentityRef] = js.native
}

object ShareNotificationContext {
  @scala.inline
  def apply(message: String, receivers: js.Array[IdentityRef]): ShareNotificationContext = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], receivers = receivers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareNotificationContext]
  }
  @scala.inline
  implicit class ShareNotificationContextOps[Self <: ShareNotificationContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReceivers(value: js.Array[IdentityRef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receivers")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

