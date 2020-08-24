package typingsSlinky.tensorflowTfjsNode.mod.backendUtil

import typingsSlinky.tensorflowTfjsCore.convUtilMod.Conv3DInfo
import typingsSlinky.tensorflowTfjsNode.tensorflowTfjsNodeStrings.ceil
import typingsSlinky.tensorflowTfjsNode.tensorflowTfjsNodeStrings.channelsFirst
import typingsSlinky.tensorflowTfjsNode.tensorflowTfjsNodeStrings.channelsLast
import typingsSlinky.tensorflowTfjsNode.tensorflowTfjsNodeStrings.floor
import typingsSlinky.tensorflowTfjsNode.tensorflowTfjsNodeStrings.round
import typingsSlinky.tensorflowTfjsNode.tensorflowTfjsNodeStrings.same
import typingsSlinky.tensorflowTfjsNode.tensorflowTfjsNodeStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "backend_util.computeConv3DInfo")
@js.native
object computeConv3DInfo extends js.Object {
  def apply(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: Double | (js.Tuple3[Double, Double, Double]),
    dilations: Double | (js.Tuple3[Double, Double, Double]),
    pad: same | valid | Double,
    depthwise: js.UndefOr[Boolean],
    dataFormat: js.UndefOr[channelsFirst | channelsLast],
    roundingMode: js.UndefOr[floor | round | ceil]
  ): Conv3DInfo = js.native
}

