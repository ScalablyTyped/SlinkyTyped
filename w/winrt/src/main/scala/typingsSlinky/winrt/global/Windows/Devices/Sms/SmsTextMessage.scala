package typingsSlinky.winrt.global.Windows.Devices.Sms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Devices.Sms.SmsTextMessage")
@js.native
class SmsTextMessage ()
  extends typingsSlinky.winrt.Windows.Devices.Sms.SmsTextMessage
/* static members */
@JSGlobal("Windows.Devices.Sms.SmsTextMessage")
@js.native
object SmsTextMessage extends js.Object {
  
  def fromBinaryData(format: typingsSlinky.winrt.Windows.Devices.Sms.SmsDataFormat, value: js.typedarray.Uint8Array): typingsSlinky.winrt.Windows.Devices.Sms.SmsTextMessage = js.native
  
  def fromBinaryMessage(binaryMessage: typingsSlinky.winrt.Windows.Devices.Sms.SmsBinaryMessage): typingsSlinky.winrt.Windows.Devices.Sms.SmsTextMessage = js.native
}
