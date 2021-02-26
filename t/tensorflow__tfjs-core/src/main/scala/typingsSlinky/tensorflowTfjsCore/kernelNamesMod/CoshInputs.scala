package typingsSlinky.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_names.UnaryInputs */
@js.native
trait CoshInputs extends StObject {
  
  var x: js.UndefOr[js.Any] = js.native
}
object CoshInputs {
  
  @scala.inline
  def apply(): CoshInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoshInputs]
  }
  
  @scala.inline
  implicit class CoshInputsMutableBuilder[Self <: CoshInputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: js.Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
  }
}
