package typingsSlinky.tensorflowTfjsCore.anon

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait A[T /* <: Tensor[Rank] */] extends js.Object {
  
  var a: T | TensorLike = js.native
  
  var activation: js.UndefOr[typingsSlinky.tensorflowTfjsCore.fusedUtilMod.Activation] = js.native
  
  var b: T | TensorLike = js.native
  
  var bias: js.UndefOr[Tensor[Rank] | TensorLike] = js.native
  
  var preluActivationWeights: js.UndefOr[Tensor[Rank]] = js.native
  
  var transposeA: js.UndefOr[Boolean] = js.native
  
  var transposeB: js.UndefOr[Boolean] = js.native
}
object A {
  
  @scala.inline
  def apply[T /* <: Tensor[Rank] */](a: T | TensorLike, b: T | TensorLike): A[T] = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any])
    __obj.asInstanceOf[A[T]]
  }
  
  @scala.inline
  implicit class AOps[Self <: A[_], T /* <: Tensor[Rank] */] (val x: Self with A[T]) extends AnyVal {
    
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
    def setAVarargs(value: js.typedarray.Uint8Array*): Self = this.set("a", js.Array(value :_*))
    
    @scala.inline
    def setAFloat32Array(value: js.typedarray.Float32Array): Self = this.set("a", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAInt32Array(value: js.typedarray.Int32Array): Self = this.set("a", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setA(value: T | TensorLike): Self = this.set("a", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAUint8Array(value: js.typedarray.Uint8Array): Self = this.set("a", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBVarargs(value: js.typedarray.Uint8Array*): Self = this.set("b", js.Array(value :_*))
    
    @scala.inline
    def setBFloat32Array(value: js.typedarray.Float32Array): Self = this.set("b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBInt32Array(value: js.typedarray.Int32Array): Self = this.set("b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setB(value: T | TensorLike): Self = this.set("b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBUint8Array(value: js.typedarray.Uint8Array): Self = this.set("b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivation(value: typingsSlinky.tensorflowTfjsCore.fusedUtilMod.Activation): Self = this.set("activation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivation: Self = this.set("activation", js.undefined)
    
    @scala.inline
    def setBiasFloat32Array(value: js.typedarray.Float32Array): Self = this.set("bias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBias(value: Tensor[Rank] | TensorLike): Self = this.set("bias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBiasUint8Array(value: js.typedarray.Uint8Array): Self = this.set("bias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBiasInt32Array(value: js.typedarray.Int32Array): Self = this.set("bias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBiasVarargs(value: js.typedarray.Uint8Array*): Self = this.set("bias", js.Array(value :_*))
    
    @scala.inline
    def deleteBias: Self = this.set("bias", js.undefined)
    
    @scala.inline
    def setPreluActivationWeights(value: Tensor[Rank]): Self = this.set("preluActivationWeights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreluActivationWeights: Self = this.set("preluActivationWeights", js.undefined)
    
    @scala.inline
    def setTransposeA(value: Boolean): Self = this.set("transposeA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransposeA: Self = this.set("transposeA", js.undefined)
    
    @scala.inline
    def setTransposeB(value: Boolean): Self = this.set("transposeB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransposeB: Self = this.set("transposeB", js.undefined)
  }
}
