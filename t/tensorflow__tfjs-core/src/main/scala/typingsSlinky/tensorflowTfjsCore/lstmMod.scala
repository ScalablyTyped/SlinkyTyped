package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Scalar
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor1D
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/lstm", JSImport.Namespace)
@js.native
object lstmMod extends js.Object {
  
  val basicLSTMCell: js.Function6[
    /* forgetBias */ Scalar | TensorLike, 
    /* lstmKernel */ Tensor2D | TensorLike, 
    /* lstmBias */ Tensor1D | TensorLike, 
    /* data */ Tensor2D | TensorLike, 
    /* c */ Tensor2D | TensorLike, 
    /* h */ Tensor2D | TensorLike, 
    js.Tuple2[Tensor2D, Tensor2D]
  ] = js.native
  
  val multiRNNCell: js.Function4[
    /* lstmCells */ js.Array[LSTMCellFunc], 
    /* data */ Tensor2D | TensorLike, 
    /* c */ js.Array[Tensor2D | TensorLike], 
    /* h */ js.Array[Tensor2D | TensorLike], 
    js.Tuple2[js.Array[Tensor2D], js.Array[Tensor2D]]
  ] = js.native
  
  type LSTMCellFunc = js.Function3[/* data */ Tensor2D, /* c */ Tensor2D, /* h */ Tensor2D, js.Tuple2[Tensor2D, Tensor2D]]
}
