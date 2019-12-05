package typingsSlinky.winrt.Windows.Devices.Sms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISmsTextMessageStatics extends js.Object {
  def fromBinaryData(format: SmsDataFormat, value: scala.scalajs.js.typedarray.Uint8Array): SmsTextMessage
  def fromBinaryMessage(binaryMessage: SmsBinaryMessage): SmsTextMessage
}

object ISmsTextMessageStatics {
  @scala.inline
  def apply(
    fromBinaryData: (SmsDataFormat, scala.scalajs.js.typedarray.Uint8Array) => SmsTextMessage,
    fromBinaryMessage: SmsBinaryMessage => SmsTextMessage
  ): ISmsTextMessageStatics = {
    val __obj = js.Dynamic.literal(fromBinaryData = js.Any.fromFunction2(fromBinaryData), fromBinaryMessage = js.Any.fromFunction1(fromBinaryMessage))
  
    __obj.asInstanceOf[ISmsTextMessageStatics]
  }
}

