package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.convUtilMod.Conv2DInfo
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank.R3
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank.R4
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor2D
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor3D
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor4D
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor5D
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NCDHW
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NCHW
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NCW
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NDHWC
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NHWC
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NWC
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ceil
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.floor
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.round
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/conv", JSImport.Namespace)
@js.native
object convMod extends js.Object {
  @js.native
  object conv1d extends js.Object {
    def apply[T /* <: Tensor2D | Tensor3D */](x: T | TensorLike, filter: Tensor3D | TensorLike, stride: Double, pad: valid_ | same_ | Double): T = js.native
    def apply[T /* <: Tensor2D | Tensor3D */](
      x: T | TensorLike,
      filter: Tensor3D | TensorLike,
      stride: Double,
      pad: valid_ | same_ | Double,
      dataFormat: NWC | NCW
    ): T = js.native
    def apply[T /* <: Tensor2D | Tensor3D */](
      x: T | TensorLike,
      filter: Tensor3D | TensorLike,
      stride: Double,
      pad: valid_ | same_ | Double,
      dataFormat: NWC | NCW,
      dilation: Double
    ): T = js.native
    def apply[T /* <: Tensor2D | Tensor3D */](
      x: T | TensorLike,
      filter: Tensor3D | TensorLike,
      stride: Double,
      pad: valid_ | same_ | Double,
      dataFormat: NWC | NCW,
      dilation: Double,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
  }
  
  @js.native
  object conv2d extends js.Object {
    def apply[T /* <: Tensor3D | Tensor4D */](
      x: T | TensorLike,
      filter: Tensor4D | TensorLike,
      strides: (js.Tuple2[Double, Double]) | Double,
      pad: valid_ | same_ | Double
    ): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](
      x: T | TensorLike,
      filter: Tensor4D | TensorLike,
      strides: (js.Tuple2[Double, Double]) | Double,
      pad: valid_ | same_ | Double,
      dataFormat: NHWC | NCHW
    ): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](
      x: T | TensorLike,
      filter: Tensor4D | TensorLike,
      strides: (js.Tuple2[Double, Double]) | Double,
      pad: valid_ | same_ | Double,
      dataFormat: NHWC | NCHW,
      dilations: (js.Tuple2[Double, Double]) | Double
    ): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](
      x: T | TensorLike,
      filter: Tensor4D | TensorLike,
      strides: (js.Tuple2[Double, Double]) | Double,
      pad: valid_ | same_ | Double,
      dataFormat: NHWC | NCHW,
      dilations: (js.Tuple2[Double, Double]) | Double,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
  }
  
  @js.native
  object conv2dDerFilter extends js.Object {
    def apply(
      x: Tensor[R3 | R4],
      dy: Tensor[R3 | R4],
      filterShape: js.Tuple4[Double, Double, Double, Double],
      strides: Double | (js.Tuple2[Double, Double]),
      pad: Double | same_ | valid_
    ): Tensor4D = js.native
    def apply(
      x: Tensor[R3 | R4],
      dy: Tensor[R3 | R4],
      filterShape: js.Tuple4[Double, Double, Double, Double],
      strides: Double | (js.Tuple2[Double, Double]),
      pad: Double | same_ | valid_,
      dataFormat: NCHW | NHWC
    ): Tensor4D = js.native
    def apply(
      x: Tensor[R3 | R4],
      dy: Tensor[R3 | R4],
      filterShape: js.Tuple4[Double, Double, Double, Double],
      strides: Double | (js.Tuple2[Double, Double]),
      pad: Double | same_ | valid_,
      dataFormat: NCHW | NHWC,
      dimRoundingMode: ceil | floor | round
    ): Tensor4D = js.native
  }
  
  @js.native
  object conv2dDerInput extends js.Object {
    def apply(
      xShape: (js.Tuple3[Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double]),
      dy: Tensor[R3 | R4],
      filter: Tensor4D,
      strides: Double | (js.Tuple2[Double, Double]),
      pad: Double | same_ | valid_
    ): Tensor[R3] = js.native
    def apply(
      xShape: (js.Tuple3[Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double]),
      dy: Tensor[R3 | R4],
      filter: Tensor4D,
      strides: Double | (js.Tuple2[Double, Double]),
      pad: Double | same_ | valid_,
      dataFormat: NCHW | NHWC
    ): Tensor[R3] = js.native
    def apply(
      xShape: (js.Tuple3[Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double]),
      dy: Tensor[R3 | R4],
      filter: Tensor4D,
      strides: Double | (js.Tuple2[Double, Double]),
      pad: Double | same_ | valid_,
      dataFormat: NCHW | NHWC,
      dimRoundingMode: ceil | floor | round
    ): Tensor[R3] = js.native
  }
  
  @js.native
  object conv2dTranspose extends js.Object {
    def apply[T /* <: Tensor3D | Tensor4D */](
      x: T | TensorLike,
      filter: Tensor4D | TensorLike,
      outputShape: (js.Tuple4[Double, Double, Double, Double]) | (js.Tuple3[Double, Double, Double]),
      strides: (js.Tuple2[Double, Double]) | Double,
      pad: valid_ | same_ | Double
    ): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](
      x: T | TensorLike,
      filter: Tensor4D | TensorLike,
      outputShape: (js.Tuple4[Double, Double, Double, Double]) | (js.Tuple3[Double, Double, Double]),
      strides: (js.Tuple2[Double, Double]) | Double,
      pad: valid_ | same_ | Double,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
  }
  
  @js.native
  object conv3d extends js.Object {
    def apply[T /* <: Tensor4D | Tensor5D */](
      x: T | TensorLike,
      filter: Tensor5D | TensorLike,
      strides: (js.Tuple3[Double, Double, Double]) | Double,
      pad: valid_ | same_
    ): T = js.native
    def apply[T /* <: Tensor4D | Tensor5D */](
      x: T | TensorLike,
      filter: Tensor5D | TensorLike,
      strides: (js.Tuple3[Double, Double, Double]) | Double,
      pad: valid_ | same_,
      dataFormat: NDHWC | NCDHW
    ): T = js.native
    def apply[T /* <: Tensor4D | Tensor5D */](
      x: T | TensorLike,
      filter: Tensor5D | TensorLike,
      strides: (js.Tuple3[Double, Double, Double]) | Double,
      pad: valid_ | same_,
      dataFormat: NDHWC | NCDHW,
      dilations: (js.Tuple3[Double, Double, Double]) | Double
    ): T = js.native
  }
  
  @js.native
  object conv3dTranspose extends js.Object {
    def apply[T /* <: Tensor4D | Tensor5D */](
      x: T | TensorLike,
      filter: Tensor5D | TensorLike,
      outputShape: (js.Tuple5[Double, Double, Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double]),
      strides: (js.Tuple3[Double, Double, Double]) | Double,
      pad: valid_ | same_
    ): T = js.native
  }
  
  @js.native
  object depthwiseConv2d extends js.Object {
    def apply[T /* <: Tensor3D | Tensor4D */](
      x: T | TensorLike,
      filter: Tensor4D | TensorLike,
      strides: (js.Tuple2[Double, Double]) | Double,
      pad: valid_ | same_ | Double
    ): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](
      x: T | TensorLike,
      filter: Tensor4D | TensorLike,
      strides: (js.Tuple2[Double, Double]) | Double,
      pad: valid_ | same_ | Double,
      dataFormat: NHWC | NCHW
    ): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](
      x: T | TensorLike,
      filter: Tensor4D | TensorLike,
      strides: (js.Tuple2[Double, Double]) | Double,
      pad: valid_ | same_ | Double,
      dataFormat: NHWC | NCHW,
      dilations: (js.Tuple2[Double, Double]) | Double
    ): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](
      x: T | TensorLike,
      filter: Tensor4D | TensorLike,
      strides: (js.Tuple2[Double, Double]) | Double,
      pad: valid_ | same_ | Double,
      dataFormat: NHWC | NCHW,
      dilations: (js.Tuple2[Double, Double]) | Double,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
  }
  
  @js.native
  object depthwiseConv2dDerFilter extends js.Object {
    def apply(
      x: Tensor[R3 | R4],
      dy: Tensor[R3 | R4],
      filterShape: js.Tuple4[Double, Double, Double, Double],
      convInfo: Conv2DInfo
    ): Tensor4D = js.native
  }
  
  @js.native
  object depthwiseConv2dDerInput extends js.Object {
    def apply(
      xShape: js.Tuple3[Double, Double, Double],
      dy: Tensor[R3 | R4],
      filter: Tensor4D,
      convInfo: Conv2DInfo
    ): Tensor[R3] = js.native
    def apply(
      xShape: js.Tuple4[Double, Double, Double, Double],
      dy: Tensor[R3 | R4],
      filter: Tensor4D,
      convInfo: Conv2DInfo
    ): Tensor[R3] = js.native
  }
  
  @js.native
  object separableConv2d extends js.Object {
    def apply[T /* <: Tensor3D | Tensor4D */](
      x: T | TensorLike,
      depthwiseFilter: Tensor4D | TensorLike,
      pointwiseFilter: Tensor4D | TensorLike,
      strides: (js.Tuple2[Double, Double]) | Double,
      pad: valid_ | same_
    ): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](
      x: T | TensorLike,
      depthwiseFilter: Tensor4D | TensorLike,
      pointwiseFilter: Tensor4D | TensorLike,
      strides: (js.Tuple2[Double, Double]) | Double,
      pad: valid_ | same_,
      dilation: (js.Tuple2[Double, Double]) | Double
    ): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](
      x: T | TensorLike,
      depthwiseFilter: Tensor4D | TensorLike,
      pointwiseFilter: Tensor4D | TensorLike,
      strides: (js.Tuple2[Double, Double]) | Double,
      pad: valid_ | same_,
      dilation: (js.Tuple2[Double, Double]) | Double,
      dataFormat: NHWC | NCHW
    ): T = js.native
  }
  
}

