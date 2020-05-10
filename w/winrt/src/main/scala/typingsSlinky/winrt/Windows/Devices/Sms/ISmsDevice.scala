package typingsSlinky.winrt.Windows.Devices.Sms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISmsDevice extends js.Object {
  var accountPhoneNumber: String = js.native
  var cellularClass: CellularClass = js.native
  var deviceStatus: SmsDeviceStatus = js.native
  var messageStore: SmsDeviceMessageStore = js.native
  var onsmsdevicestatuschanged: js.Any = js.native
  var onsmsmessagereceived: js.Any = js.native
  def calculateLength(message: SmsTextMessage): SmsEncodedLength = js.native
  def sendMessageAsync(message: ISmsMessage): SendSmsMessageOperation = js.native
}

object ISmsDevice {
  @scala.inline
  def apply(
    accountPhoneNumber: String,
    calculateLength: SmsTextMessage => SmsEncodedLength,
    cellularClass: CellularClass,
    deviceStatus: SmsDeviceStatus,
    messageStore: SmsDeviceMessageStore,
    onsmsdevicestatuschanged: js.Any,
    onsmsmessagereceived: js.Any,
    sendMessageAsync: ISmsMessage => SendSmsMessageOperation
  ): ISmsDevice = {
    val __obj = js.Dynamic.literal(accountPhoneNumber = accountPhoneNumber.asInstanceOf[js.Any], calculateLength = js.Any.fromFunction1(calculateLength), cellularClass = cellularClass.asInstanceOf[js.Any], deviceStatus = deviceStatus.asInstanceOf[js.Any], messageStore = messageStore.asInstanceOf[js.Any], onsmsdevicestatuschanged = onsmsdevicestatuschanged.asInstanceOf[js.Any], onsmsmessagereceived = onsmsmessagereceived.asInstanceOf[js.Any], sendMessageAsync = js.Any.fromFunction1(sendMessageAsync))
    __obj.asInstanceOf[ISmsDevice]
  }
  @scala.inline
  implicit class ISmsDeviceOps[Self <: ISmsDevice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountPhoneNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountPhoneNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCalculateLength(value: SmsTextMessage => SmsEncodedLength): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateLength")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCellularClass(value: CellularClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellularClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceStatus(value: SmsDeviceStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageStore(value: SmsDeviceMessageStore): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageStore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnsmsdevicestatuschanged(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onsmsdevicestatuschanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnsmsmessagereceived(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onsmsmessagereceived")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSendMessageAsync(value: ISmsMessage => SendSmsMessageOperation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendMessageAsync")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

