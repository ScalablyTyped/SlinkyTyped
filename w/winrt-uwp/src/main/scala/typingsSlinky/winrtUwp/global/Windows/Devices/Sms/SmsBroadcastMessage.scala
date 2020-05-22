package typingsSlinky.winrtUwp.global.Windows.Devices.Sms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a broadcast SMS message. */
@JSGlobal("Windows.Devices.Sms.SmsBroadcastMessage")
@js.native
abstract class SmsBroadcastMessage ()
  extends typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsBroadcastMessage {
  /** Gets the body of the broadcast SMS message. */
  /* CompleteClass */
  override var body: String = js.native
  /** Gets the type of this broadcast SMS message. */
  /* CompleteClass */
  override var broadcastType: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsBroadcastType = js.native
  /** Gets the cellular class of this broadcast message. */
  /* CompleteClass */
  override var cellularClass: typingsSlinky.winrtUwp.Windows.Devices.Sms.CellularClass = js.native
  /** Gets the channel associated with the broadcast SMS message. */
  /* CompleteClass */
  override var channel: Double = js.native
  /** Gets the device ID of the device that received the broadcast SMS message. */
  /* CompleteClass */
  override var deviceId: String = js.native
  /** Gets the geographical scope associated with this broadcast SMS message. */
  /* CompleteClass */
  override var geographicalScope: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsGeographicalScope = js.native
  /** True when the broadcast SMS message is an emergency alert. */
  /* CompleteClass */
  override var isEmergencyAlert: Boolean = js.native
  /** True when a user popup is requested by this broadcast SMS message. */
  /* CompleteClass */
  override var isUserPopupRequested: Boolean = js.native
  /** Gets the message class associated with this broadcast SMS message. */
  /* CompleteClass */
  override var messageClass: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsMessageClass = js.native
  /** Gets a code value associated with this broadcast SMS message. */
  /* CompleteClass */
  override var messageCode: Double = js.native
  /** Gets the message type of the broadcast SMS message. */
  /* CompleteClass */
  override var messageType: typingsSlinky.winrtUwp.Windows.Devices.Sms.SmsMessageType = js.native
  /** Gets the ICCID (Integrated Circuit Card Identifier) of the SIM that received the message. */
  /* CompleteClass */
  override var simIccId: String = js.native
  /** Gets the timestamp of the broadcast SMS message. */
  /* CompleteClass */
  override var timestamp: js.Date = js.native
  /** Gets the recipient phone number of the broadcast SMS message. */
  /* CompleteClass */
  override var to: String = js.native
  /** Gets the update number associated with this broadcast SMS message. */
  /* CompleteClass */
  override var updateNumber: Double = js.native
}

