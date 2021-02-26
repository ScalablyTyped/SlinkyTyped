package typingsSlinky.winrtUwp.anon

import typingsSlinky.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceMap
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IMapView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirstIMapView extends StObject {
  
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
  implicit class FirstIMapViewMutableBuilder[Self <: FirstIMapView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirst(value: IMapView[String, ResourceMap]): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecond(value: IMapView[String, ResourceMap]): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
  }
}
