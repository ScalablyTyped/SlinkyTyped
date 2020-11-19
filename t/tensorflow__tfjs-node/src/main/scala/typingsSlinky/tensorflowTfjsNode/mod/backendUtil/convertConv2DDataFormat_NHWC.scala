package typingsSlinky.tensorflowTfjsNode.mod.backendUtil

import typingsSlinky.tensorflowTfjsNode.tensorflowTfjsNodeStrings.NHWC
import typingsSlinky.tensorflowTfjsNode.tensorflowTfjsNodeStrings.channelsFirst
import typingsSlinky.tensorflowTfjsNode.tensorflowTfjsNodeStrings.channelsLast
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-node", "backend_util.convertConv2DDataFormat")
@js.native
object convertConv2DDataFormat_NHWC extends js.Object {
  
  def apply(dataFormat: NHWC): channelsLast | channelsFirst = js.native
}
