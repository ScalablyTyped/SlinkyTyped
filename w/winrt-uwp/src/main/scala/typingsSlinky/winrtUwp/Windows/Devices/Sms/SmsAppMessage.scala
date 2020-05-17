package typingsSlinky.winrtUwp.Windows.Devices.Sms

import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The interface for manipulating an SMS Application message. Application messages are those which cannot be characterized as any other message type. */
@js.native
trait SmsAppMessage extends js.Object {
  /** Reads or writes the binary part of the Application message. */
  var binaryBody: IBuffer = js.native
  /** The plain text body of the message. */
  var body: String = js.native
  /** The number to be dialed in reply to a received SMS message. */
  var callbackNumber: String = js.native
  /** The class of the cellular device that received the message. */
  var cellularClass: CellularClass = js.native
  /** The device ID of the device that received the message. */
  var deviceId: String = js.native
  /** The encoding used to send the message. */
  var encoding: SmsEncoding = js.native
  /** The telephone number of the sender of the message. */
  var from: String = js.native
  /** Indicates whether an SMS delivery status report was sent by the SMSC. */
  var isDeliveryNotificationEnabled: Boolean = js.native
  /** The message class of the message. */
  var messageClass: SmsMessageClass = js.native
  /** The message type of the message. */
  var messageType: SmsMessageType = js.native
  /** The port number of the message. */
  var portNumber: Double = js.native
  /** The Protocol identifier for the message. */
  var protocolId: Double = js.native
  /** The retry attempt count for the message. */
  var retryAttemptCount: Double = js.native
  /** Gets the ICCID (Integrated Circuit Card Identifier) of the SIM that received the message. */
  var simIccId: String = js.native
  /** The Teleservice identifier for the message. */
  var teleserviceId: Double = js.native
  /** The timestamp of the message. */
  var timestamp: js.Date = js.native
  /** The telephone number of the recipient of this message. */
  var to: String = js.native
}

object SmsAppMessage {
  @scala.inline
  def apply(
    binaryBody: IBuffer,
    body: String,
    callbackNumber: String,
    cellularClass: CellularClass,
    deviceId: String,
    encoding: SmsEncoding,
    from: String,
    isDeliveryNotificationEnabled: Boolean,
    messageClass: SmsMessageClass,
    messageType: SmsMessageType,
    portNumber: Double,
    protocolId: Double,
    retryAttemptCount: Double,
    simIccId: String,
    teleserviceId: Double,
    timestamp: js.Date,
    to: String
  ): SmsAppMessage = {
    val __obj = js.Dynamic.literal(binaryBody = binaryBody.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], callbackNumber = callbackNumber.asInstanceOf[js.Any], cellularClass = cellularClass.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], isDeliveryNotificationEnabled = isDeliveryNotificationEnabled.asInstanceOf[js.Any], messageClass = messageClass.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any], portNumber = portNumber.asInstanceOf[js.Any], protocolId = protocolId.asInstanceOf[js.Any], retryAttemptCount = retryAttemptCount.asInstanceOf[js.Any], simIccId = simIccId.asInstanceOf[js.Any], teleserviceId = teleserviceId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmsAppMessage]
  }
  @scala.inline
  implicit class SmsAppMessageOps[Self <: SmsAppMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBinaryBody(value: IBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binaryBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCallbackNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellularClass(value: CellularClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellularClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncoding(value: SmsEncoding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDeliveryNotificationEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDeliveryNotificationEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageClass(value: SmsMessageClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageType(value: SmsMessageType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPortNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtocolId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocolId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetryAttemptCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryAttemptCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSimIccId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simIccId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeleserviceId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teleserviceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

