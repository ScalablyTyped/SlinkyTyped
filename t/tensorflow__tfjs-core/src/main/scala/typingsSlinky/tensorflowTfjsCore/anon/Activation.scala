package typingsSlinky.tensorflowTfjsCore.anon

import typingsSlinky.tensorflowTfjsCore.convUtilMod.ExplicitPadding
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor3D
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor4D
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NCHW
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NHWC
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ceil
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.floor
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.round
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Activation[T /* <: Tensor3D | Tensor4D */] extends js.Object {
  
  var activation: js.UndefOr[typingsSlinky.tensorflowTfjsCore.fusedUtilMod.Activation] = js.native
  
  var bias: js.UndefOr[Tensor[Rank] | TensorLike] = js.native
  
  var dataFormat: js.UndefOr[NHWC | NCHW] = js.native
  
  var dilations: js.UndefOr[(js.Tuple2[Double, Double]) | Double] = js.native
  
  var dimRoundingMode: js.UndefOr[floor | round | ceil] = js.native
  
  var filter: Tensor4D | TensorLike = js.native
  
  var pad: valid_ | same_ | Double | ExplicitPadding = js.native
  
  var preluActivationWeights: js.UndefOr[Tensor[Rank]] = js.native
  
  var strides: (js.Tuple2[Double, Double]) | Double = js.native
  
  var x: T | TensorLike = js.native
}
object Activation {
  
  @scala.inline
  def apply[T /* <: Tensor3D | Tensor4D */](
    filter: Tensor4D | TensorLike,
    pad: valid_ | same_ | Double | ExplicitPadding,
    strides: (js.Tuple2[Double, Double]) | Double,
    x: T | TensorLike
  ): Activation[T] = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], pad = pad.asInstanceOf[js.Any], strides = strides.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
    __obj.asInstanceOf[Activation[T]]
  }
  
  @scala.inline
  implicit class ActivationOps[Self <: Activation[_], T /* <: Tensor3D | Tensor4D */] (val x: Self with Activation[T]) extends AnyVal {
    
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
    def setFilterVarargs(value: js.typedarray.Uint8Array*): Self = this.set("filter", js.Array(value :_*))
    
    @scala.inline
    def setFilterInt32Array(value: js.typedarray.Int32Array): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter(value: Tensor4D | TensorLike): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterFloat32Array(value: js.typedarray.Float32Array): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUint8Array(value: js.typedarray.Uint8Array): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPad(value: valid_ | same_ | Double | ExplicitPadding): Self = this.set("pad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrides(value: (js.Tuple2[Double, Double]) | Double): Self = this.set("strides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXVarargs(value: js.typedarray.Uint8Array*): Self = this.set("x", js.Array(value :_*))
    
    @scala.inline
    def setX(value: T | TensorLike): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUint8Array(value: js.typedarray.Uint8Array): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXInt32Array(value: js.typedarray.Int32Array): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXFloat32Array(value: js.typedarray.Float32Array): Self = this.set("x", value.asInstanceOf[js.Any])
    
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
    def setDataFormat(value: NHWC | NCHW): Self = this.set("dataFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataFormat: Self = this.set("dataFormat", js.undefined)
    
    @scala.inline
    def setDilations(value: (js.Tuple2[Double, Double]) | Double): Self = this.set("dilations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDilations: Self = this.set("dilations", js.undefined)
    
    @scala.inline
    def setDimRoundingMode(value: floor | round | ceil): Self = this.set("dimRoundingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimRoundingMode: Self = this.set("dimRoundingMode", js.undefined)
    
    @scala.inline
    def setPreluActivationWeights(value: Tensor[Rank]): Self = this.set("preluActivationWeights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreluActivationWeights: Self = this.set("preluActivationWeights", js.undefined)
  }
}
