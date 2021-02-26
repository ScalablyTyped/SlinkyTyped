package typingsSlinky.winrt.anon

import typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.ResourceMap
import typingsSlinky.winrt.Windows.Foundation.Collections.IMapView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirstIMapView extends StObject {
  
  var first: IMapView[String, ResourceMap] = js.native
  
  var second: IMapView[String, ResourceMap] = js.native
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
