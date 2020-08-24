package typingsSlinky.tensorflowTfjs.mod.backendUtil

import typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.NHWC
import typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.channelsFirst
import typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.channelsLast
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "backend_util.convertConv2DDataFormat")
@js.native
object convertConv2DDataFormat_NHWC extends js.Object {
  def apply(dataFormat: NHWC): channelsLast | channelsFirst = js.native
}

