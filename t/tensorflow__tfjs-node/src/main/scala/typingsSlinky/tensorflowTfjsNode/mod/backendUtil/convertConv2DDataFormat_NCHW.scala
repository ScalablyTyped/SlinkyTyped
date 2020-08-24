package typingsSlinky.tensorflowTfjsNode.mod.backendUtil

import typingsSlinky.tensorflowTfjsNode.tensorflowTfjsNodeStrings.NCHW
import typingsSlinky.tensorflowTfjsNode.tensorflowTfjsNodeStrings.channelsFirst
import typingsSlinky.tensorflowTfjsNode.tensorflowTfjsNodeStrings.channelsLast
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "backend_util.convertConv2DDataFormat")
@js.native
object convertConv2DDataFormat_NCHW extends js.Object {
  def apply(dataFormat: NCHW): channelsLast | channelsFirst = js.native
}

