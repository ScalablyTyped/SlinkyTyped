package typingsSlinky.tensorflowTfjs.indexWithPolyfillsMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor2D
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.multiRnnCellMod.LSTMCellFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "multiRNNCell")
@js.native
object multiRNNCell
  extends TopLevel[
      js.Function4[
        /* lstmCells */ js.Array[LSTMCellFunc], 
        /* data */ Tensor2D | TensorLike, 
        /* c */ js.Array[Tensor2D | TensorLike], 
        /* h */ js.Array[Tensor2D | TensorLike], 
        js.Tuple2[js.Array[Tensor2D], js.Array[Tensor2D]]
      ]
    ]
