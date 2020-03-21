package typingsSlinky.tensorflowTfjsCore.convUtilMod

import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NHWC
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.channelsFirst
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.channelsLast
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/conv_util", "convertConv2DDataFormat")
@js.native
object convertConv2DDataFormat_NHWC extends js.Object {
  def apply(dataFormat: NHWC): channelsLast | channelsFirst = js.native
}

