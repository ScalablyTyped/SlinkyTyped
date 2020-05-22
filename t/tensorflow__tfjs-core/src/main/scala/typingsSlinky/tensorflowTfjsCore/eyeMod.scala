package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.distTypesMod.DataType
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/eye", JSImport.Namespace)
@js.native
object eyeMod extends js.Object {
  val eye: js.Function4[
    /* numRows */ Double, 
    /* numColumns */ js.UndefOr[Double], 
    /* batchShape */ js.UndefOr[
      js.Array[Double] | (js.Tuple2[Double, Double]) | (js.Tuple3[Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
    ], 
    /* dtype */ js.UndefOr[DataType], 
    Tensor2D
  ] = js.native
}

