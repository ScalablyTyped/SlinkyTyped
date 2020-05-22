package typingsSlinky.winrt.global.Windows.Devices.Sms

import typingsSlinky.winrt.Windows.Devices.Sms.ISmsMessage
import typingsSlinky.winrt.Windows.Devices.Sms.SmsEncodedLength
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Sms.SmsDevice")
@js.native
class SmsDevice ()
  extends typingsSlinky.winrt.Windows.Devices.Sms.SmsDevice {
  /* CompleteClass */
  override var accountPhoneNumber: String = js.native
  /* CompleteClass */
  override var cellularClass: typingsSlinky.winrt.Windows.Devices.Sms.CellularClass = js.native
  /* CompleteClass */
  override var deviceStatus: typingsSlinky.winrt.Windows.Devices.Sms.SmsDeviceStatus = js.native
  /* CompleteClass */
  override var messageStore: typingsSlinky.winrt.Windows.Devices.Sms.SmsDeviceMessageStore = js.native
  /* CompleteClass */
  override var onsmsdevicestatuschanged: js.Any = js.native
  /* CompleteClass */
  override var onsmsmessagereceived: js.Any = js.native
  /* CompleteClass */
  override def calculateLength(message: typingsSlinky.winrt.Windows.Devices.Sms.SmsTextMessage): SmsEncodedLength = js.native
  /* CompleteClass */
  override def sendMessageAsync(message: ISmsMessage): typingsSlinky.winrt.Windows.Devices.Sms.SendSmsMessageOperation = js.native
}

/* static members */
@JSGlobal("Windows.Devices.Sms.SmsDevice")
@js.native
object SmsDevice extends js.Object {
  def fromIdAsync(deviceInstanceId: String): IAsyncOperation[typingsSlinky.winrt.Windows.Devices.Sms.SmsDevice] = js.native
  def getDefaultAsync(): IAsyncOperation[typingsSlinky.winrt.Windows.Devices.Sms.SmsDevice] = js.native
  def getDeviceSelector(): String = js.native
}

