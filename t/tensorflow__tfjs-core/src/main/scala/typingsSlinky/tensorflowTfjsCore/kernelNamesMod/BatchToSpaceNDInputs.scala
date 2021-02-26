package typingsSlinky.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'x'> */
@js.native
trait BatchToSpaceNDInputs extends StObject {
  
  var x: js.UndefOr[js.Any] = js.native
}
object BatchToSpaceNDInputs {
  
  @scala.inline
  def apply(): BatchToSpaceNDInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchToSpaceNDInputs]
  }
  
  @scala.inline
  implicit class BatchToSpaceNDInputsMutableBuilder[Self <: BatchToSpaceNDInputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: js.Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
  }
}
