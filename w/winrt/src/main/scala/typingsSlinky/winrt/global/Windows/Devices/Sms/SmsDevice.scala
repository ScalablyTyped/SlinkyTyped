package typingsSlinky.winrt.global.Windows.Devices.Sms

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Sms.SmsDevice")
@js.native
class SmsDevice ()
  extends typingsSlinky.winrt.Windows.Devices.Sms.SmsDevice

/* static members */
@JSGlobal("Windows.Devices.Sms.SmsDevice")
@js.native
object SmsDevice extends js.Object {
  def fromIdAsync(deviceInstanceId: String): IAsyncOperation[typingsSlinky.winrt.Windows.Devices.Sms.SmsDevice] = js.native
  def getDefaultAsync(): IAsyncOperation[typingsSlinky.winrt.Windows.Devices.Sms.SmsDevice] = js.native
  def getDeviceSelector(): String = js.native
}

