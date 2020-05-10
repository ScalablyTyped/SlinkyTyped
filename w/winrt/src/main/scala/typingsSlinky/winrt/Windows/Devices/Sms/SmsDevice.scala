package typingsSlinky.winrt.Windows.Devices.Sms

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Sms.SmsDevice")
@js.native
class SmsDevice () extends ISmsDevice

/* static members */
@JSGlobal("Windows.Devices.Sms.SmsDevice")
@js.native
object SmsDevice extends js.Object {
  def fromIdAsync(deviceInstanceId: String): IAsyncOperation[SmsDevice] = js.native
  def getDefaultAsync(): IAsyncOperation[SmsDevice] = js.native
  def getDeviceSelector(): String = js.native
}

