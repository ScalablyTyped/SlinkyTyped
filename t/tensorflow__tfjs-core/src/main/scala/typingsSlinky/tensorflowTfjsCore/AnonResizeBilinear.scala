package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank.R3
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank.R4
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonResizeBilinear extends js.Object {
  def resizeBilinear(images: Tensor[R3 | R4], size: js.Tuple2[Double, Double], alignCorners: Boolean): Tensor[R3] = js.native
  def resizeNearestNeighbor(images: Tensor[R3 | R4], size: js.Tuple2[Double, Double], alignCorners: Boolean): Tensor[R3] = js.native
}

