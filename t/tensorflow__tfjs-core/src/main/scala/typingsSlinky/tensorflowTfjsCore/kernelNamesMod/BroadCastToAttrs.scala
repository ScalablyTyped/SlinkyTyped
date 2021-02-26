package typingsSlinky.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BroadCastToAttrs extends StObject {
  
  var inputShape: js.Array[Double] = js.native
  
  var shape: js.Array[Double] = js.native
}
object BroadCastToAttrs {
  
  @scala.inline
  def apply(inputShape: js.Array[Double], shape: js.Array[Double]): BroadCastToAttrs = {
    val __obj = js.Dynamic.literal(inputShape = inputShape.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[BroadCastToAttrs]
  }
  
  @scala.inline
  implicit class BroadCastToAttrsMutableBuilder[Self <: BroadCastToAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputShape(value: js.Array[Double]): Self = StObject.set(x, "inputShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputShapeVarargs(value: Double*): Self = StObject.set(x, "inputShape", js.Array(value :_*))
    
    @scala.inline
    def setShape(value: js.Array[Double]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeVarargs(value: Double*): Self = StObject.set(x, "shape", js.Array(value :_*))
  }
}
