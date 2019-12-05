package typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Scalar
import typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor1D
import typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor2D
import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

