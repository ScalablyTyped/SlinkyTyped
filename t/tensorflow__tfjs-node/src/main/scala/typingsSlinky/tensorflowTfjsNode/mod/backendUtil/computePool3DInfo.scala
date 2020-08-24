package typingsSlinky.tensorflowTfjsNode.mod.backendUtil

import typingsSlinky.tensorflowTfjsCore.convUtilMod.Conv3DInfo
import typingsSlinky.tensorflowTfjsNode.tensorflowTfjsNodeStrings.NCDHW
import typingsSlinky.tensorflowTfjsNode.tensorflowTfjsNodeStrings.NDHWC
import typingsSlinky.tensorflowTfjsNode.tensorflowTfjsNodeStrings.ceil
import typingsSlinky.tensorflowTfjsNode.tensorflowTfjsNodeStrings.floor
import typingsSlinky.tensorflowTfjsNode.tensorflowTfjsNodeStrings.round
import typingsSlinky.tensorflowTfjsNode.tensorflowTfjsNodeStrings.same
import typingsSlinky.tensorflowTfjsNode.tensorflowTfjsNodeStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "backend_util.computePool3DInfo")
@js.native
object computePool3DInfo extends js.Object {
  def apply(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterSize: Double | (js.Tuple3[Double, Double, Double]),
    strides: Double | (js.Tuple3[Double, Double, Double]),
    dilations: Double | (js.Tuple3[Double, Double, Double]),
    pad: same | valid | Double,
    roundingMode: js.UndefOr[floor | round | ceil],
    dataFormat: js.UndefOr[NDHWC | NCDHW]
  ): Conv3DInfo = js.native
}

