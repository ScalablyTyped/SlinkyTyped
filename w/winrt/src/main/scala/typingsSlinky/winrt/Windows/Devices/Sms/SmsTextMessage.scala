package typingsSlinky.winrt.Windows.Devices.Sms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Sms.SmsTextMessage")
@js.native
class SmsTextMessage () extends ISmsTextMessage

/* static members */
@JSGlobal("Windows.Devices.Sms.SmsTextMessage")
@js.native
object SmsTextMessage extends js.Object {
  def fromBinaryData(format: SmsDataFormat, value: js.typedarray.Uint8Array): SmsTextMessage = js.native
  def fromBinaryMessage(binaryMessage: SmsBinaryMessage): SmsTextMessage = js.native
}

