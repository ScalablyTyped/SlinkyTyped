package typingsSlinky.viewportMercatorProject.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlyToViewportProps extends TransitionViewport {
  
  var height: Double = js.native
  
  var width: Double = js.native
}
object FlyToViewportProps {
  
  @scala.inline
  def apply(height: Double, latitude: Double, longitude: Double, width: Double, zoom: Double): FlyToViewportProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlyToViewportProps]
  }
  
  @scala.inline
  implicit class FlyToViewportPropsMutableBuilder[Self <: FlyToViewportProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
