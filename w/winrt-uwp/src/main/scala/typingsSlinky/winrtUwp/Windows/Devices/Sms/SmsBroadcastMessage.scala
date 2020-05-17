package typingsSlinky.winrtUwp.Windows.Devices.Sms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a broadcast SMS message. */
@js.native
trait SmsBroadcastMessage extends js.Object {
  /** Gets the body of the broadcast SMS message. */
  var body: String = js.native
  /** Gets the type of this broadcast SMS message. */
  var broadcastType: SmsBroadcastType = js.native
  /** Gets the cellular class of this broadcast message. */
  var cellularClass: CellularClass = js.native
  /** Gets the channel associated with the broadcast SMS message. */
  var channel: Double = js.native
  /** Gets the device ID of the device that received the broadcast SMS message. */
  var deviceId: String = js.native
  /** Gets the geographical scope associated with this broadcast SMS message. */
  var geographicalScope: SmsGeographicalScope = js.native
  /** True when the broadcast SMS message is an emergency alert. */
  var isEmergencyAlert: Boolean = js.native
  /** True when a user popup is requested by this broadcast SMS message. */
  var isUserPopupRequested: Boolean = js.native
  /** Gets the message class associated with this broadcast SMS message. */
  var messageClass: SmsMessageClass = js.native
  /** Gets a code value associated with this broadcast SMS message. */
  var messageCode: Double = js.native
  /** Gets the message type of the broadcast SMS message. */
  var messageType: SmsMessageType = js.native
  /** Gets the ICCID (Integrated Circuit Card Identifier) of the SIM that received the message. */
  var simIccId: String = js.native
  /** Gets the timestamp of the broadcast SMS message. */
  var timestamp: js.Date = js.native
  /** Gets the recipient phone number of the broadcast SMS message. */
  var to: String = js.native
  /** Gets the update number associated with this broadcast SMS message. */
  var updateNumber: Double = js.native
}

object SmsBroadcastMessage {
  @scala.inline
  def apply(
    body: String,
    broadcastType: SmsBroadcastType,
    cellularClass: CellularClass,
    channel: Double,
    deviceId: String,
    geographicalScope: SmsGeographicalScope,
    isEmergencyAlert: Boolean,
    isUserPopupRequested: Boolean,
    messageClass: SmsMessageClass,
    messageCode: Double,
    messageType: SmsMessageType,
    simIccId: String,
    timestamp: js.Date,
    to: String,
    updateNumber: Double
  ): SmsBroadcastMessage = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], broadcastType = broadcastType.asInstanceOf[js.Any], cellularClass = cellularClass.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], geographicalScope = geographicalScope.asInstanceOf[js.Any], isEmergencyAlert = isEmergencyAlert.asInstanceOf[js.Any], isUserPopupRequested = isUserPopupRequested.asInstanceOf[js.Any], messageClass = messageClass.asInstanceOf[js.Any], messageCode = messageCode.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any], simIccId = simIccId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], updateNumber = updateNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmsBroadcastMessage]
  }
  @scala.inline
  implicit class SmsBroadcastMessageOps[Self <: SmsBroadcastMessage] (val x: Self) extends AnyVal {
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
    def withBroadcastType(value: SmsBroadcastType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("broadcastType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellularClass(value: CellularClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellularClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGeographicalScope(value: SmsGeographicalScope): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geographicalScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsEmergencyAlert(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEmergencyAlert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsUserPopupRequested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUserPopupRequested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageClass(value: SmsMessageClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageCode")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withUpdateNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateNumber")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

