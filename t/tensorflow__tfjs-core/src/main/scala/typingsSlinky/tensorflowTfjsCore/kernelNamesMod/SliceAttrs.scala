package typingsSlinky.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SliceAttrs extends StObject {
  
  var begin: Double | js.Array[Double] = js.native
  
  var size: Double | js.Array[Double] = js.native
}
object SliceAttrs {
  
  @scala.inline
  def apply(begin: Double | js.Array[Double], size: Double | js.Array[Double]): SliceAttrs = {
    val __obj = js.Dynamic.literal(begin = begin.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliceAttrs]
  }
  
  @scala.inline
  implicit class SliceAttrsMutableBuilder[Self <: SliceAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBegin(value: Double | js.Array[Double]): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginVarargs(value: Double*): Self = StObject.set(x, "begin", js.Array(value :_*))
    
    @scala.inline
    def setSize(value: Double | js.Array[Double]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeVarargs(value: Double*): Self = StObject.set(x, "size", js.Array(value :_*))
  }
}
