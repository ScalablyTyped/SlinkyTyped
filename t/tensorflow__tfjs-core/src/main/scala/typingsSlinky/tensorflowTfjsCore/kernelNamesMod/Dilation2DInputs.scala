package typingsSlinky.tensorflowTfjsCore.kernelNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'x' | 'filter'> */
@js.native
trait Dilation2DInputs extends js.Object {
  
  var filter: js.UndefOr[js.Any] = js.native
  
  var x: js.UndefOr[js.Any] = js.native
}
object Dilation2DInputs {
  
  @scala.inline
  def apply(): Dilation2DInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dilation2DInputs]
  }
  
  @scala.inline
  implicit class Dilation2DInputsOps[Self <: Dilation2DInputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFilter(value: js.Any): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setX(value: js.Any): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
  }
}
