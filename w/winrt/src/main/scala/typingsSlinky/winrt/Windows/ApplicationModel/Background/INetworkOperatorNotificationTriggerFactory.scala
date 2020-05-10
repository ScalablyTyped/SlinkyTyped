package typingsSlinky.winrt.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INetworkOperatorNotificationTriggerFactory extends js.Object {
  def create(networkAccountId: String): NetworkOperatorNotificationTrigger = js.native
}

object INetworkOperatorNotificationTriggerFactory {
  @scala.inline
  def apply(create: String => NetworkOperatorNotificationTrigger): INetworkOperatorNotificationTriggerFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[INetworkOperatorNotificationTriggerFactory]
  }
  @scala.inline
  implicit class INetworkOperatorNotificationTriggerFactoryOps[Self <: INetworkOperatorNotificationTriggerFactory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: String => NetworkOperatorNotificationTrigger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

