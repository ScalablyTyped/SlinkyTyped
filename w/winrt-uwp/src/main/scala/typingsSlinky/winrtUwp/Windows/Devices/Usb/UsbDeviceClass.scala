package typingsSlinky.winrtUwp.Windows.Devices.Usb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides a way for the app to get an Advanced Query Syntax (AQS) string by specifying the class code, subclass code, and the protocol code defined by the device. The properties in this class are passed in the call to GetDeviceClassSelector . */
@js.native
trait UsbDeviceClass extends js.Object {
  
  /** Gets or sets the class code of the device. */
  var classCode: Double = js.native
  
  /** Gets or sets the protocol code of the device. */
  var protocolCode: Double = js.native
  
  /** Gets or sets the subclass code of the device. */
  var subclassCode: Double = js.native
}
object UsbDeviceClass {
  
  @scala.inline
  def apply(classCode: Double, protocolCode: Double, subclassCode: Double): UsbDeviceClass = {
    val __obj = js.Dynamic.literal(classCode = classCode.asInstanceOf[js.Any], protocolCode = protocolCode.asInstanceOf[js.Any], subclassCode = subclassCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsbDeviceClass]
  }
  
  @scala.inline
  implicit class UsbDeviceClassOps[Self <: UsbDeviceClass] (val x: Self) extends AnyVal {
    
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
    def setClassCode(value: Double): Self = this.set("classCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolCode(value: Double): Self = this.set("protocolCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubclassCode(value: Double): Self = this.set("subclassCode", value.asInstanceOf[js.Any])
  }
}
