package typingsSlinky.winrt.global.Windows.Devices.Sms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Sms.SmsBinaryMessage")
@js.native
class SmsBinaryMessage ()
  extends typingsSlinky.winrt.Windows.Devices.Sms.SmsBinaryMessage {
  /* CompleteClass */
  override var format: typingsSlinky.winrt.Windows.Devices.Sms.SmsDataFormat = js.native
  /* CompleteClass */
  override var id: Double = js.native
  /* CompleteClass */
  override var messageClass: typingsSlinky.winrt.Windows.Devices.Sms.SmsMessageClass = js.native
  /* CompleteClass */
  override def getData(): js.typedarray.Uint8Array = js.native
  /* CompleteClass */
  override def setData(value: js.typedarray.Uint8Array): Unit = js.native
}

