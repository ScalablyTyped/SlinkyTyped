package typingsSlinky.winrtDashUwp.Windows.Devices.Sms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SmsMessageType extends js.Object

/** This enumerated type defines the format of the SMS message. */
@JSGlobal("Windows.Devices.Sms.SmsMessageType")
@js.native
object SmsMessageType extends js.Object {
  /** An application-directed message (a visual voicemail message on a specific port, for example). */
  @js.native
  sealed trait app extends SmsMessageType
  
  /** The SMS message is in binary format. */
  @js.native
  sealed trait binary extends SmsMessageType
  
  /** A cell broadcast message. */
  @js.native
  sealed trait broadcast extends SmsMessageType
  
  /** A send status message. */
  @js.native
  sealed trait status extends SmsMessageType
  
  /** The SMS message is in text format. */
  @js.native
  sealed trait text extends SmsMessageType
  
  /** A legacy voicemail message waiting indication message. */
  @js.native
  sealed trait voicemail extends SmsMessageType
  
  /** A WAP Push message (an MMS message, for example). */
  @js.native
  sealed trait wap extends SmsMessageType
  
  /* 3 */ val app: typingsSlinky.winrtDashUwp.Windows.Devices.Sms.SmsMessageType.app with Double = js.native
  /* 0 */ val binary: typingsSlinky.winrtDashUwp.Windows.Devices.Sms.SmsMessageType.binary with Double = js.native
  /* 4 */ val broadcast: typingsSlinky.winrtDashUwp.Windows.Devices.Sms.SmsMessageType.broadcast with Double = js.native
  /* 6 */ val status: typingsSlinky.winrtDashUwp.Windows.Devices.Sms.SmsMessageType.status with Double = js.native
  /* 1 */ val text: typingsSlinky.winrtDashUwp.Windows.Devices.Sms.SmsMessageType.text with Double = js.native
  /* 5 */ val voicemail: typingsSlinky.winrtDashUwp.Windows.Devices.Sms.SmsMessageType.voicemail with Double = js.native
  /* 2 */ val wap: typingsSlinky.winrtDashUwp.Windows.Devices.Sms.SmsMessageType.wap with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SmsMessageType with Double] = js.native
}

