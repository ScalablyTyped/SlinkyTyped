package typingsSlinky.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'images'> */
@js.native
trait ResizeNearestNeighborGradInputs extends StObject {
  
  var images: js.UndefOr[js.Any] = js.native
}
object ResizeNearestNeighborGradInputs {
  
  @scala.inline
  def apply(): ResizeNearestNeighborGradInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResizeNearestNeighborGradInputs]
  }
  
  @scala.inline
  implicit class ResizeNearestNeighborGradInputsMutableBuilder[Self <: ResizeNearestNeighborGradInputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImages(value: js.Any): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
  }
}
