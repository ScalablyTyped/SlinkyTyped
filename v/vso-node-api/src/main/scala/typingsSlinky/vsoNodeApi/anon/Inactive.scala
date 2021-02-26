package typingsSlinky.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Inactive extends StObject {
  
  var active: scala.Double = js.native
  
  var inactive: scala.Double = js.native
}
object Inactive {
  
  @scala.inline
  def apply(active: scala.Double, inactive: scala.Double): Inactive = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], inactive = inactive.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inactive]
  }
  
  @scala.inline
  implicit class InactiveMutableBuilder[Self <: Inactive] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: scala.Double): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInactive(value: scala.Double): Self = StObject.set(x, "inactive", value.asInstanceOf[js.Any])
  }
}
