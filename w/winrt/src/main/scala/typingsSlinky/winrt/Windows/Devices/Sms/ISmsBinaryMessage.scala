package typingsSlinky.winrt.Windows.Devices.Sms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISmsBinaryMessage extends ISmsMessage {
  var format: SmsDataFormat
  def getData(): scala.scalajs.js.typedarray.Uint8Array
  def setData(value: scala.scalajs.js.typedarray.Uint8Array): Unit
}

object ISmsBinaryMessage {
  @scala.inline
  def apply(
    format: SmsDataFormat,
    getData: () => scala.scalajs.js.typedarray.Uint8Array,
    id: Double,
    messageClass: SmsMessageClass,
    setData: scala.scalajs.js.typedarray.Uint8Array => Unit
  ): ISmsBinaryMessage = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], getData = js.Any.fromFunction0(getData), id = id.asInstanceOf[js.Any], messageClass = messageClass.asInstanceOf[js.Any], setData = js.Any.fromFunction1(setData))
  
    __obj.asInstanceOf[ISmsBinaryMessage]
  }
}

