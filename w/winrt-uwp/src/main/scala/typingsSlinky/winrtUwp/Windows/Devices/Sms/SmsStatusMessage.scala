package typingsSlinky.winrtUwp.Windows.Devices.Sms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates an SMS status message. */
@js.native
trait SmsStatusMessage extends js.Object {
  /** Gets the body of the status message. */
  var body: String = js.native
  /** Gets the cellular class of the message. */
  var cellularClass: CellularClass = js.native
  /** Gets the device identifier associated with the status message. */
  var deviceId: String = js.native
  /** The discharge time of the status message. */
  var dischargeTime: js.Date = js.native
  /** Gets the phone number that sent the status message. */
  var from: String = js.native
  /** Gets the message class of the status message. */
  var messageClass: SmsMessageClass = js.native
  /** Gets the reference number of the status message. */
  var messageReferenceNumber: Double = js.native
  /** Gets the message type of the status message. */
  var messageType: SmsMessageType = js.native
  /** Gets the service center timestamp of the status message. */
  var serviceCenterTimestamp: js.Date = js.native
  /** Gets the ICCID (Integrated Circuit Card Identifier) of the SIM that received the message. */
  var simIccId: String = js.native
  /** The status code associated with this message. */
  var status: Double = js.native
  /** Gets the phone number the status message was sent to. */
  var to: String = js.native
}

object SmsStatusMessage {
  @scala.inline
  def apply(
    body: String,
    cellularClass: CellularClass,
    deviceId: String,
    dischargeTime: js.Date,
    from: String,
    messageClass: SmsMessageClass,
    messageReferenceNumber: Double,
    messageType: SmsMessageType,
    serviceCenterTimestamp: js.Date,
    simIccId: String,
    status: Double,
    to: String
  ): SmsStatusMessage = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], cellularClass = cellularClass.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], dischargeTime = dischargeTime.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], messageClass = messageClass.asInstanceOf[js.Any], messageReferenceNumber = messageReferenceNumber.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any], serviceCenterTimestamp = serviceCenterTimestamp.asInstanceOf[js.Any], simIccId = simIccId.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmsStatusMessage]
  }
  @scala.inline
  implicit class SmsStatusMessageOps[Self <: SmsStatusMessage] (val x: Self) extends AnyVal {
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
    def withDischargeTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dischargeTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageClass(value: SmsMessageClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageReferenceNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageReferenceNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageType(value: SmsMessageType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceCenterTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceCenterTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSimIccId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simIccId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
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

