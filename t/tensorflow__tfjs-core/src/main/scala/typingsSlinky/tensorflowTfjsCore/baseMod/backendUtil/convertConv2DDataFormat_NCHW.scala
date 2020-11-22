package typingsSlinky.tensorflowTfjsCore.baseMod.backendUtil

import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NCHW
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.channelsFirst
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.channelsLast
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.convertConv2DDataFormat")
@js.native
object convertConv2DDataFormat_NCHW extends js.Object {
  
  def apply(dataFormat: NCHW): channelsLast | channelsFirst = js.native
}
