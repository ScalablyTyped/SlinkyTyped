package typingsSlinky.tensorflowTfjsCore.kernelNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'a' | 'b'> */
@js.native
trait BatchMatMulInputs extends js.Object {
  
  var a: js.UndefOr[js.Any] = js.native
  
  var b: js.UndefOr[js.Any] = js.native
}
object BatchMatMulInputs {
  
  @scala.inline
  def apply(): BatchMatMulInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchMatMulInputs]
  }
  
  @scala.inline
  implicit class BatchMatMulInputsOps[Self <: BatchMatMulInputs] (val x: Self) extends AnyVal {
    
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
    def setA(value: js.Any): Self = this.set("a", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteA: Self = this.set("a", js.undefined)
    
    @scala.inline
    def setB(value: js.Any): Self = this.set("b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteB: Self = this.set("b", js.undefined)
  }
}
