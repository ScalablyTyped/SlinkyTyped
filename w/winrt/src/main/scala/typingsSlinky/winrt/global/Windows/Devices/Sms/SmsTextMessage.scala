package typingsSlinky.winrt.global.Windows.Devices.Sms

import typingsSlinky.winrt.Windows.Devices.Sms.ISmsBinaryMessage
import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Sms.SmsTextMessage")
@js.native
class SmsTextMessage ()
  extends typingsSlinky.winrt.Windows.Devices.Sms.SmsTextMessage {
  /* CompleteClass */
  override var body: String = js.native
  /* CompleteClass */
  override var encoding: typingsSlinky.winrt.Windows.Devices.Sms.SmsEncoding = js.native
  /* CompleteClass */
  override var from: String = js.native
  /* CompleteClass */
  override var id: Double = js.native
  /* CompleteClass */
  override var messageClass: typingsSlinky.winrt.Windows.Devices.Sms.SmsMessageClass = js.native
  /* CompleteClass */
  override var partCount: Double = js.native
  /* CompleteClass */
  override var partNumber: Double = js.native
  /* CompleteClass */
  override var partReferenceId: Double = js.native
  /* CompleteClass */
  override var timestamp: js.Date = js.native
  /* CompleteClass */
  override var to: String = js.native
  /* CompleteClass */
  override def toBinaryMessages(format: typingsSlinky.winrt.Windows.Devices.Sms.SmsDataFormat): IVectorView[ISmsBinaryMessage] = js.native
}

/* static members */
@JSGlobal("Windows.Devices.Sms.SmsTextMessage")
@js.native
object SmsTextMessage extends js.Object {
  def fromBinaryData(format: typingsSlinky.winrt.Windows.Devices.Sms.SmsDataFormat, value: js.typedarray.Uint8Array): typingsSlinky.winrt.Windows.Devices.Sms.SmsTextMessage = js.native
  def fromBinaryMessage(binaryMessage: typingsSlinky.winrt.Windows.Devices.Sms.SmsBinaryMessage): typingsSlinky.winrt.Windows.Devices.Sms.SmsTextMessage = js.native
}

