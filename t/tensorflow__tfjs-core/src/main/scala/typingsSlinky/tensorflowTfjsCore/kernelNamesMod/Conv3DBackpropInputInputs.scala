package typingsSlinky.tensorflowTfjsCore.kernelNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'dy' | 'filter'> */
@js.native
trait Conv3DBackpropInputInputs extends js.Object {
  
  var dy: js.UndefOr[js.Any] = js.native
  
  var filter: js.UndefOr[js.Any] = js.native
}
object Conv3DBackpropInputInputs {
  
  @scala.inline
  def apply(): Conv3DBackpropInputInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Conv3DBackpropInputInputs]
  }
  
  @scala.inline
  implicit class Conv3DBackpropInputInputsOps[Self <: Conv3DBackpropInputInputs] (val x: Self) extends AnyVal {
    
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
    def setDy(value: js.Any): Self = this.set("dy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDy: Self = this.set("dy", js.undefined)
    
    @scala.inline
    def setFilter(value: js.Any): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
  }
}
