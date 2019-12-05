package typingsSlinky.winrt.Windows.Devices.Sms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SmsMessageFilter extends js.Object

@JSGlobal("Windows.Devices.Sms.SmsMessageFilter")
@js.native
object SmsMessageFilter extends js.Object {
  @js.native
  sealed trait all extends SmsMessageFilter
  
  @js.native
  sealed trait draft extends SmsMessageFilter
  
  @js.native
  sealed trait read extends SmsMessageFilter
  
  @js.native
  sealed trait sent extends SmsMessageFilter
  
  @js.native
  sealed trait unread extends SmsMessageFilter
  
  /* 0 */ val all: typingsSlinky.winrt.Windows.Devices.Sms.SmsMessageFilter.all with Double = js.native
  /* 4 */ val draft: typingsSlinky.winrt.Windows.Devices.Sms.SmsMessageFilter.draft with Double = js.native
  /* 2 */ val read: typingsSlinky.winrt.Windows.Devices.Sms.SmsMessageFilter.read with Double = js.native
  /* 3 */ val sent: typingsSlinky.winrt.Windows.Devices.Sms.SmsMessageFilter.sent with Double = js.native
  /* 1 */ val unread: typingsSlinky.winrt.Windows.Devices.Sms.SmsMessageFilter.unread with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SmsMessageFilter with Double] = js.native
}

