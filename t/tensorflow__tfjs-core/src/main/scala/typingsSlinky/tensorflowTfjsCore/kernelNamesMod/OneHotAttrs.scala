package typingsSlinky.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OneHotAttrs extends StObject {
  
  var depth: Double = js.native
  
  var offValue: Double = js.native
  
  var onValue: Double = js.native
}
object OneHotAttrs {
  
  @scala.inline
  def apply(depth: Double, offValue: Double, onValue: Double): OneHotAttrs = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], offValue = offValue.asInstanceOf[js.Any], onValue = onValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[OneHotAttrs]
  }
  
  @scala.inline
  implicit class OneHotAttrsMutableBuilder[Self <: OneHotAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffValue(value: Double): Self = StObject.set(x, "offValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnValue(value: Double): Self = StObject.set(x, "onValue", value.asInstanceOf[js.Any])
  }
}
