package typingsSlinky.winrtUwp.Windows.Perception.Spatial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpatialLocatorPositionalTrackingDeactivatingEventArgs extends js.Object {
  
  var canceled: js.Any = js.native
}
object SpatialLocatorPositionalTrackingDeactivatingEventArgs {
  
  @scala.inline
  def apply(canceled: js.Any): SpatialLocatorPositionalTrackingDeactivatingEventArgs = {
    val __obj = js.Dynamic.literal(canceled = canceled.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialLocatorPositionalTrackingDeactivatingEventArgs]
  }
  
  @scala.inline
  implicit class SpatialLocatorPositionalTrackingDeactivatingEventArgsOps[Self <: SpatialLocatorPositionalTrackingDeactivatingEventArgs] (val x: Self) extends AnyVal {
    
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
    def setCanceled(value: js.Any): Self = this.set("canceled", value.asInstanceOf[js.Any])
  }
}
