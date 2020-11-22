package typingsSlinky.tensorflowTfjsCore.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Scalar
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor1D
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor2D
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core", "basicLSTMCell")
@js.native
object basicLSTMCell
  extends TopLevel[
      js.Function6[
        /* forgetBias */ Scalar | TensorLike, 
        /* lstmKernel */ Tensor2D | TensorLike, 
        /* lstmBias */ Tensor1D | TensorLike, 
        /* data */ Tensor2D | TensorLike, 
        /* c */ Tensor2D | TensorLike, 
        /* h */ Tensor2D | TensorLike, 
        js.Tuple2[Tensor2D, Tensor2D]
      ]
    ]
