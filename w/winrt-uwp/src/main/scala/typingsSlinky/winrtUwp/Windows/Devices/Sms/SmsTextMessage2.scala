package typingsSlinky.winrtUwp.Windows.Devices.Sms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates a decoded SMS text message. Prefer this class to the older SmsTextMessage class. */
@js.native
trait SmsTextMessage2 extends js.Object {
  /** Gets or sets the body of the text message. */
  var body: String = js.native
  /** Gets or sets the callback number for the message. */
  var callbackNumber: String = js.native
  /** Gets the cellular class of the message. */
  var cellularClass: CellularClass = js.native
  /** Gets the device identifier for the device associated with the SMS text message. */
  var deviceId: String = js.native
  /** Gets or sets the encoding scheme used for the message. */
  var encoding: SmsEncoding = js.native
  /** gets the phone number of the sender of the message. */
  var from: String = js.native
  /** Gets or sets whether text message delivery notification is enabled for this message. */
  var isDeliveryNotificationEnabled: Boolean = js.native
  /** Gets the message class of the message. */
  var messageClass: SmsMessageClass = js.native
  /** Gets the message type of the message. */
  var messageType: SmsMessageType = js.native
  /** Gets the protocol identifier for the message. */
  var protocolId: Double = js.native
  /** Gets or sets the number of retry attempts for the message. */
  var retryAttemptCount: Double = js.native
  /** Gets the ICCID (Integrated Circuit Card Identifier) of the SIM that received the message. */
  var simIccId: String = js.native
  /** Gets the teleservice identifier associated with this message. */
  var teleserviceId: Double = js.native
  /** The timestamp of this message. */
  var timestamp: js.Date = js.native
  /** Gets or sets the recipient phone number for the message. */
  var to: String = js.native
}

object SmsTextMessage2 {
  @scala.inline
  def apply(
    body: String,
    callbackNumber: String,
    cellularClass: CellularClass,
    deviceId: String,
    encoding: SmsEncoding,
    from: String,
    isDeliveryNotificationEnabled: Boolean,
    messageClass: SmsMessageClass,
    messageType: SmsMessageType,
    protocolId: Double,
    retryAttemptCount: Double,
    simIccId: String,
    teleserviceId: Double,
    timestamp: js.Date,
    to: String
  ): SmsTextMessage2 = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], callbackNumber = callbackNumber.asInstanceOf[js.Any], cellularClass = cellularClass.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], isDeliveryNotificationEnabled = isDeliveryNotificationEnabled.asInstanceOf[js.Any], messageClass = messageClass.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any], protocolId = protocolId.asInstanceOf[js.Any], retryAttemptCount = retryAttemptCount.asInstanceOf[js.Any], simIccId = simIccId.asInstanceOf[js.Any], teleserviceId = teleserviceId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmsTextMessage2]
  }
  @scala.inline
  implicit class SmsTextMessage2Ops[Self <: SmsTextMessage2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

