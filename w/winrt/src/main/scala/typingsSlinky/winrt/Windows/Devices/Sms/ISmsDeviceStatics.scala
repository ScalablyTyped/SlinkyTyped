package typingsSlinky.winrt.Windows.Devices.Sms

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISmsDeviceStatics extends js.Object {
  def fromIdAsync(deviceInstanceId: String): IAsyncOperation[SmsDevice] = js.native
  def getDefaultAsync(): IAsyncOperation[SmsDevice] = js.native
  def getDeviceSelector(): String = js.native
}

object ISmsDeviceStatics {
  @scala.inline
  def apply(
    fromIdAsync: String => IAsyncOperation[SmsDevice],
    getDefaultAsync: () => IAsyncOperation[SmsDevice],
    getDeviceSelector: () => String
  ): ISmsDeviceStatics = {
    val __obj = js.Dynamic.literal(fromIdAsync = js.Any.fromFunction1(fromIdAsync), getDefaultAsync = js.Any.fromFunction0(getDefaultAsync), getDeviceSelector = js.Any.fromFunction0(getDeviceSelector))
    __obj.asInstanceOf[ISmsDeviceStatics]
  }
  @scala.inline
  implicit class ISmsDeviceStaticsOps[Self <: ISmsDeviceStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFromIdAsync(value: String => IAsyncOperation[SmsDevice]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromIdAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetDefaultAsync(value: () => IAsyncOperation[SmsDevice]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaultAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDeviceSelector(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDeviceSelector")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

