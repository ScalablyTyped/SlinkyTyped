package typingsSlinky.tensorflowTfjsNode.mod.backendUtil

import typingsSlinky.tensorflowTfjsCore.convUtilMod.Conv2DInfo
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

@JSImport("@tensorflow/tfjs-node", "backend_util.computePool2DInfo")
@js.native
object computePool2DInfo extends js.Object {
  def apply(
    inShape: js.Tuple4[Double, Double, Double, Double],
    filterSize: (js.Tuple2[Double, Double]) | Double,
    strides: Double | (js.Tuple2[Double, Double]),
    dilations: Double | (js.Tuple2[Double, Double]),
    pad: same | valid | Double,
    roundingMode: js.UndefOr[floor | round | ceil],
    dataFormat: js.UndefOr[channelsFirst | channelsLast]
  ): Conv2DInfo = js.native
}

