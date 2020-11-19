package typingsSlinky.winrt.Windows.Devices.Sms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISmsBinaryMessage extends ISmsMessage {
  
  var format: SmsDataFormat = js.native
  
  def getData(): js.typedarray.Uint8Array = js.native
  
  def setData(value: js.typedarray.Uint8Array): Unit = js.native
}
object ISmsBinaryMessage {
  
  @scala.inline
  def apply(
    format: SmsDataFormat,
    getData: () => js.typedarray.Uint8Array,
    id: Double,
    messageClass: SmsMessageClass,
    setData: js.typedarray.Uint8Array => Unit
  ): ISmsBinaryMessage = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], getData = js.Any.fromFunction0(getData), id = id.asInstanceOf[js.Any], messageClass = messageClass.asInstanceOf[js.Any], setData = js.Any.fromFunction1(setData))
    __obj.asInstanceOf[ISmsBinaryMessage]
  }
  
  @scala.inline
  implicit class ISmsBinaryMessageOps[Self <: ISmsBinaryMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFormat(value: SmsDataFormat): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetData(value: () => js.typedarray.Uint8Array): Self = this.set("getData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetData(value: js.typedarray.Uint8Array => Unit): Self = this.set("setData", js.Any.fromFunction1(value))
  }
}
