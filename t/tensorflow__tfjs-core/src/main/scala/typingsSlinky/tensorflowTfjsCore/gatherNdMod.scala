package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/gather_nd", JSImport.Namespace)
@js.native
object gatherNdMod extends js.Object {
  val gatherND: js.Function2[
    /* x */ Tensor[Rank] | TensorLike, 
    /* indices */ Tensor[Rank] | TensorLike, 
    Tensor[Rank]
  ] = js.native
}

