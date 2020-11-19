package typingsSlinky.winrt.Windows.Devices.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMouseDevice extends js.Object {
  
  var onmousemoved: js.Any = js.native
}
object IMouseDevice {
  
  @scala.inline
  def apply(onmousemoved: js.Any): IMouseDevice = {
    val __obj = js.Dynamic.literal(onmousemoved = onmousemoved.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMouseDevice]
  }
  
  @scala.inline
  implicit class IMouseDeviceOps[Self <: IMouseDevice] (val x: Self) extends AnyVal {
    
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
    def setOnmousemoved(value: js.Any): Self = this.set("onmousemoved", value.asInstanceOf[js.Any])
  }
}
