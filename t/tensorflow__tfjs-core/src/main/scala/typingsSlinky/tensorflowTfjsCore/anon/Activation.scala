package typingsSlinky.tensorflowTfjsCore.anon

import typingsSlinky.tensorflowTfjsCore.convUtilMod.ExplicitPadding
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor3D
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor4D
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NCHW
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NHWC
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ceil
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.floor
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.round
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Activation[T /* <: Tensor3D | Tensor4D */] extends StObject {
  
  var activation: js.UndefOr[typingsSlinky.tensorflowTfjsCore.fusedTypesMod.Activation] = js.native
  
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
  implicit class ActivationMutableBuilder[Self <: Activation[_], T /* <: Tensor3D | Tensor4D */] (val x: Self with Activation[T]) extends AnyVal {
    
    @scala.inline
    def setActivation(value: typingsSlinky.tensorflowTfjsCore.fusedTypesMod.Activation): Self = StObject.set(x, "activation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivationUndefined: Self = StObject.set(x, "activation", js.undefined)
    
    @scala.inline
    def setBias(value: Tensor[Rank] | TensorLike): Self = StObject.set(x, "bias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBiasFloat32Array(value: js.typedarray.Float32Array): Self = StObject.set(x, "bias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBiasInt32Array(value: js.typedarray.Int32Array): Self = StObject.set(x, "bias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBiasUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "bias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBiasUndefined: Self = StObject.set(x, "bias", js.undefined)
    
    @scala.inline
    def setBiasVarargs(value: js.typedarray.Uint8Array*): Self = StObject.set(x, "bias", js.Array(value :_*))
    
    @scala.inline
    def setDataFormat(value: NHWC | NCHW): Self = StObject.set(x, "dataFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataFormatUndefined: Self = StObject.set(x, "dataFormat", js.undefined)
    
    @scala.inline
    def setDilations(value: (js.Tuple2[Double, Double]) | Double): Self = StObject.set(x, "dilations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDilationsUndefined: Self = StObject.set(x, "dilations", js.undefined)
    
    @scala.inline
    def setDimRoundingMode(value: floor | round | ceil): Self = StObject.set(x, "dimRoundingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimRoundingModeUndefined: Self = StObject.set(x, "dimRoundingMode", js.undefined)
    
    @scala.inline
    def setFilter(value: Tensor4D | TensorLike): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterFloat32Array(value: js.typedarray.Float32Array): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterInt32Array(value: js.typedarray.Int32Array): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterVarargs(value: js.typedarray.Uint8Array*): Self = StObject.set(x, "filter", js.Array(value :_*))
    
    @scala.inline
    def setPad(value: valid_ | same_ | Double | ExplicitPadding): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreluActivationWeights(value: Tensor[Rank]): Self = StObject.set(x, "preluActivationWeights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreluActivationWeightsUndefined: Self = StObject.set(x, "preluActivationWeights", js.undefined)
    
    @scala.inline
    def setStrides(value: (js.Tuple2[Double, Double]) | Double): Self = StObject.set(x, "strides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: T | TensorLike): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXFloat32Array(value: js.typedarray.Float32Array): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXInt32Array(value: js.typedarray.Int32Array): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXVarargs(value: js.typedarray.Uint8Array*): Self = StObject.set(x, "x", js.Array(value :_*))
  }
}
