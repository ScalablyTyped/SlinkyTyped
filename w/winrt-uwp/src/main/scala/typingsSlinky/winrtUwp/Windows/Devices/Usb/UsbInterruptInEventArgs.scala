package typingsSlinky.winrtUwp.Windows.Devices.Usb

import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the object that is passed as a parameter to the event handler for the DataReceived event. */
@js.native
trait UsbInterruptInEventArgs extends StObject {
  
  /** Gets data from the interrupt IN endpoint. */
  var interruptData: IBuffer = js.native
}
object UsbInterruptInEventArgs {
  
  @scala.inline
  def apply(interruptData: IBuffer): UsbInterruptInEventArgs = {
    val __obj = js.Dynamic.literal(interruptData = interruptData.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsbInterruptInEventArgs]
  }
  
  @scala.inline
  implicit class UsbInterruptInEventArgsMutableBuilder[Self <: UsbInterruptInEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInterruptData(value: IBuffer): Self = StObject.set(x, "interruptData", value.asInstanceOf[js.Any])
  }
}
