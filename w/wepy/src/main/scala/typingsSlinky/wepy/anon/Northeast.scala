package typingsSlinky.wepy.anon

import typingsSlinky.wepy.wxEnhancedMod.LagLng
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Northeast extends StObject {
  
  var northeast: LagLng = js.native
  
  var southwest: LagLng = js.native
}
object Northeast {
  
  @scala.inline
  def apply(northeast: LagLng, southwest: LagLng): Northeast = {
    val __obj = js.Dynamic.literal(northeast = northeast.asInstanceOf[js.Any], southwest = southwest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Northeast]
  }
  
  @scala.inline
  implicit class NortheastMutableBuilder[Self <: Northeast] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNortheast(value: LagLng): Self = StObject.set(x, "northeast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSouthwest(value: LagLng): Self = StObject.set(x, "southwest", value.asInstanceOf[js.Any])
  }
}
