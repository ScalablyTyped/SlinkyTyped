package typingsSlinky.winrtUwp.Windows.Devices.Sms

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IMap
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an SMS WAP push message. */
@js.native
trait SmsWapMessage extends js.Object {
  /** Gets the value of the X-Wap-Application-Id header of the SmsWapMessage . */
  var applicationId: String = js.native
  /** Gets the binary body of the blob in the SmsWapMessage . */
  var binaryBody: IBuffer = js.native
  /** Gets the cellular class of the SMS device that received the message. */
  var cellularClass: CellularClass = js.native
  /** Gets the value of the Content-Type header in the SmsWapMessage . Parameters are presents in the Headers property. */
  var contentType: String = js.native
  /** Gets the device information ID of the SmsDevice that receives the SmsWapMessage . */
  var deviceId: String = js.native
  /** Gets the phone number of the sender of the SmsWapMessage . */
  var from: String = js.native
  /** Gets the header name-value pairs of the WAP push message. */
  var headers: IMap[String, String] = js.native
  /** Gets the message class of the SmsWapMessage . */
  var messageClass: SmsMessageClass = js.native
  /** Gets the message type of the SmsWapMessage . */
  var messageType: SmsMessageType = js.native
  /** Gets the ICCID (Integrated Circuit Card Identifier) of the SIM that received the message. */
  var simIccId: String = js.native
  /** Gets the timestamp of the SmsWapMessage . */
  var timestamp: js.Date = js.native
  /** Gets the recipient phone number of this SmsWapMessage . */
  var to: String = js.native
}

object SmsWapMessage {
  @scala.inline
  def apply(
    applicationId: String,
    binaryBody: IBuffer,
    cellularClass: CellularClass,
    contentType: String,
    deviceId: String,
    from: String,
    headers: IMap[String, String],
    messageClass: SmsMessageClass,
    messageType: SmsMessageType,
    simIccId: String,
    timestamp: js.Date,
    to: String
  ): SmsWapMessage = {
    val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any], binaryBody = binaryBody.asInstanceOf[js.Any], cellularClass = cellularClass.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], messageClass = messageClass.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any], simIccId = simIccId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmsWapMessage]
  }
  @scala.inline
  implicit class SmsWapMessageOps[Self <: SmsWapMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBinaryBody(value: IBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binaryBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellularClass(value: CellularClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellularClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaders(value: IMap[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
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
    def withSimIccId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simIccId")(value.asInstanceOf[js.Any])
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

