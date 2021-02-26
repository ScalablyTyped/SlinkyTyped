package typingsSlinky.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cloak extends StObject {
  
  var cloak: scala.Double = js.native
  
  var map: scala.Double = js.native
}
object Cloak {
  
  @scala.inline
  def apply(cloak: scala.Double, map: scala.Double): Cloak = {
    val __obj = js.Dynamic.literal(cloak = cloak.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cloak]
  }
  
  @scala.inline
  implicit class CloakMutableBuilder[Self <: Cloak] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloak(value: scala.Double): Self = StObject.set(x, "cloak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMap(value: scala.Double): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
  }
}
