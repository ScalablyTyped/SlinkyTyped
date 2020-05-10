package typingsSlinky.winrt.Windows.Devices.Sms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISmsTextMessageStatics extends js.Object {
  def fromBinaryData(format: SmsDataFormat, value: js.typedarray.Uint8Array): SmsTextMessage = js.native
  def fromBinaryMessage(binaryMessage: SmsBinaryMessage): SmsTextMessage = js.native
}

object ISmsTextMessageStatics {
  @scala.inline
  def apply(
    fromBinaryData: (SmsDataFormat, js.typedarray.Uint8Array) => SmsTextMessage,
    fromBinaryMessage: SmsBinaryMessage => SmsTextMessage
  ): ISmsTextMessageStatics = {
    val __obj = js.Dynamic.literal(fromBinaryData = js.Any.fromFunction2(fromBinaryData), fromBinaryMessage = js.Any.fromFunction1(fromBinaryMessage))
    __obj.asInstanceOf[ISmsTextMessageStatics]
  }
  @scala.inline
  implicit class ISmsTextMessageStaticsOps[Self <: ISmsTextMessageStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFromBinaryData(value: (SmsDataFormat, js.typedarray.Uint8Array) => SmsTextMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromBinaryData")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFromBinaryMessage(value: SmsBinaryMessage => SmsTextMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromBinaryMessage")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

