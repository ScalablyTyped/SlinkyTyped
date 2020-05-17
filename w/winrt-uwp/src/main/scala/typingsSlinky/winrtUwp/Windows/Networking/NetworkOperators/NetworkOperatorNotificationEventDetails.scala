package typingsSlinky.winrtUwp.Windows.Networking.NetworkOperators

import typingsSlinky.winrtUwp.Windows.Devices.Sms.ISmsMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides details for a network operator notification. */
@js.native
trait NetworkOperatorNotificationEventDetails extends js.Object {
  /** Gets the data-coding scheme (DCS) of the received message. */
  var encodingType: Double = js.native
  /** Gets the message for the network operator notification. */
  var message: String = js.native
  /** Gets a unique identifier for the mobile broadband account that received the notification. */
  var networkAccountId: String = js.native
  /** Gets the type of the network notification. */
  var notificationType: NetworkOperatorEventMessageType = js.native
  /** Gets the identifier of the provisioned rule that matched and triggered the notification. */
  var ruleId: String = js.native
  /** Gets an SMS message for the mobile broadband account that received the notification. */
  var smsMessage: ISmsMessage = js.native
  /**
    * Used to indicate if tethering is permitted for a device. If it is not, a reason can be provided.
    * @param allow true if tethering is permitted; otherwise, false.
    * @param entitlementFailureReason The reason tethering is not permitted.
    */
  def authorizeTethering(allow: Boolean, entitlementFailureReason: String): Unit = js.native
}

object NetworkOperatorNotificationEventDetails {
  @scala.inline
  def apply(
    authorizeTethering: (Boolean, String) => Unit,
    encodingType: Double,
    message: String,
    networkAccountId: String,
    notificationType: NetworkOperatorEventMessageType,
    ruleId: String,
    smsMessage: ISmsMessage
  ): NetworkOperatorNotificationEventDetails = {
    val __obj = js.Dynamic.literal(authorizeTethering = js.Any.fromFunction2(authorizeTethering), encodingType = encodingType.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], networkAccountId = networkAccountId.asInstanceOf[js.Any], notificationType = notificationType.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any], smsMessage = smsMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkOperatorNotificationEventDetails]
  }
  @scala.inline
  implicit class NetworkOperatorNotificationEventDetailsOps[Self <: NetworkOperatorNotificationEventDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorizeTethering(value: (Boolean, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizeTethering")(js.Any.fromFunction2(value))
        ret
    }
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

