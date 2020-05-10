package typingsSlinky.winrt.Windows.Networking.NetworkOperators

import typingsSlinky.winrt.Windows.Devices.Sms.ISmsMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INetworkOperatorNotificationEventDetails extends js.Object {
  var encodingType: Double = js.native
  var message: String = js.native
  var networkAccountId: String = js.native
  var notificationType: NetworkOperatorEventMessageType = js.native
  var ruleId: String = js.native
  var smsMessage: ISmsMessage = js.native
}

object INetworkOperatorNotificationEventDetails {
  @scala.inline
  def apply(
    encodingType: Double,
    message: String,
    networkAccountId: String,
    notificationType: NetworkOperatorEventMessageType,
    ruleId: String,
    smsMessage: ISmsMessage
  ): INetworkOperatorNotificationEventDetails = {
    val __obj = js.Dynamic.literal(encodingType = encodingType.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], networkAccountId = networkAccountId.asInstanceOf[js.Any], notificationType = notificationType.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any], smsMessage = smsMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[INetworkOperatorNotificationEventDetails]
  }
  @scala.inline
  implicit class INetworkOperatorNotificationEventDetailsOps[Self <: INetworkOperatorNotificationEventDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncodingType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodingType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetworkAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotificationType(value: NetworkOperatorEventMessageType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSmsMessage(value: ISmsMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smsMessage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

