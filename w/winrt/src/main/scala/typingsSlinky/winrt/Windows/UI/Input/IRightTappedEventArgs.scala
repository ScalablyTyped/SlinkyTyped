package typingsSlinky.winrt.Windows.UI.Input

import typingsSlinky.winrt.Windows.Devices.Input.PointerDeviceType
import typingsSlinky.winrt.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRightTappedEventArgs extends js.Object {
  
  var pointerDeviceType: PointerDeviceType = js.native
  
  var position: Point = js.native
}
object IRightTappedEventArgs {
  
  @scala.inline
  def apply(pointerDeviceType: PointerDeviceType, position: Point): IRightTappedEventArgs = {
    val __obj = js.Dynamic.literal(pointerDeviceType = pointerDeviceType.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRightTappedEventArgs]
  }
  
  @scala.inline
  implicit class IRightTappedEventArgsOps[Self <: IRightTappedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setPointerDeviceType(value: PointerDeviceType): Self = this.set("pointerDeviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Point): Self = this.set("position", value.asInstanceOf[js.Any])
  }
}
