package typingsSlinky.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Direct extends StObject {
  
  var direct: scala.Double = js.native
  
  var expanded: scala.Double = js.native
  
  var expandedDown: scala.Double = js.native
  
  var expandedUp: scala.Double = js.native
  
  var none: scala.Double = js.native
}
object Direct {
  
  @scala.inline
  def apply(
    direct: scala.Double,
    expanded: scala.Double,
    expandedDown: scala.Double,
    expandedUp: scala.Double,
    none: scala.Double
  ): Direct = {
    val __obj = js.Dynamic.literal(direct = direct.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], expandedDown = expandedDown.asInstanceOf[js.Any], expandedUp = expandedUp.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[Direct]
  }
  
  @scala.inline
  implicit class DirectMutableBuilder[Self <: Direct] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirect(value: scala.Double): Self = StObject.set(x, "direct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpanded(value: scala.Double): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedDown(value: scala.Double): Self = StObject.set(x, "expandedDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedUp(value: scala.Double): Self = StObject.set(x, "expandedUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
  }
}
