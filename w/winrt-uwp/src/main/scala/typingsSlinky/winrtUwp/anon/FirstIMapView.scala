package typingsSlinky.winrtUwp.anon

import typingsSlinky.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceMap
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirstIMapView extends js.Object {
  
  /** One half of the original map. */ var first: IMapView[String, ResourceMap] = js.native
  
  /** The second half of the original map. */ var second: IMapView[String, ResourceMap] = js.native
}
object FirstIMapView {
  
  @scala.inline
  def apply(first: IMapView[String, ResourceMap], second: IMapView[String, ResourceMap]): FirstIMapView = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirstIMapView]
  }
  
  @scala.inline
  implicit class FirstIMapViewOps[Self <: FirstIMapView] (val x: Self) extends AnyVal {
    
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
    def setFirst(value: IMapView[String, ResourceMap]): Self = this.set("first", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecond(value: IMapView[String, ResourceMap]): Self = this.set("second", value.asInstanceOf[js.Any])
  }
}
