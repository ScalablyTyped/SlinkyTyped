package typingsSlinky.winrtUwp.Windows.Devices.Sms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains event details for the event raised when an SMS message is received. */
@js.native
trait SmsMessageReceivedTriggerDetails extends js.Object {
  /** When MessageType is App, the message details for the message. */
  var appMessage: SmsAppMessage = js.native
  /** When MessageType is Broadcast, the message details for the message. */
  var broadcastMessage: SmsBroadcastMessage = js.native
  /** The SmsMessageType of the received message. */
  var messageType: SmsMessageType = js.native
  /** When MessageType is Status, the message details for the message. */
  var statusMessage: SmsStatusMessage = js.native
  /** When MessageType is Text, the message details for the message. */
  var textMessage: SmsTextMessage2 = js.native
  /** When MessageType is Voicemail, the message details for the message. */
  var voicemailMessage: SmsVoicemailMessage = js.native
  /** When MessageType is Wap, the message details for the message. */
  var wapMessage: SmsWapMessage = js.native
  /** Delivers the filtered message to the messaging app. */
  def accept(): Unit = js.native
  /** Drops the filtered message, so that it is not passed on to the messaging app. */
  def drop(): Unit = js.native
}

object SmsMessageReceivedTriggerDetails {
  @scala.inline
  def apply(
    accept: () => Unit,
    appMessage: SmsAppMessage,
    broadcastMessage: SmsBroadcastMessage,
    drop: () => Unit,
    messageType: SmsMessageType,
    statusMessage: SmsStatusMessage,
    textMessage: SmsTextMessage2,
    voicemailMessage: SmsVoicemailMessage,
    wapMessage: SmsWapMessage
  ): SmsMessageReceivedTriggerDetails = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction0(accept), appMessage = appMessage.asInstanceOf[js.Any], broadcastMessage = broadcastMessage.asInstanceOf[js.Any], drop = js.Any.fromFunction0(drop), messageType = messageType.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any], textMessage = textMessage.asInstanceOf[js.Any], voicemailMessage = voicemailMessage.asInstanceOf[js.Any], wapMessage = wapMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmsMessageReceivedTriggerDetails]
  }
  @scala.inline
  implicit class SmsMessageReceivedTriggerDetailsOps[Self <: SmsMessageReceivedTriggerDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccept(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAppMessage(value: SmsAppMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBroadcastMessage(value: SmsBroadcastMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("broadcastMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDrop(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMessageType(value: SmsMessageType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusMessage(value: SmsStatusMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextMessage(value: SmsTextMessage2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVoicemailMessage(value: SmsVoicemailMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voicemailMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWapMessage(value: SmsWapMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wapMessage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

