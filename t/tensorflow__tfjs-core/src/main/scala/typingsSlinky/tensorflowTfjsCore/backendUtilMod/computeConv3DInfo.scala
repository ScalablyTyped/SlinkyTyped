package typingsSlinky.tensorflowTfjsCore.backendUtilMod

import typingsSlinky.tensorflowTfjsCore.convUtilMod.Conv3DInfo
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ceil
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.channelsFirst
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.channelsLast
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.floor
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.round
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/backends/backend_util", "computeConv3DInfo")
@js.native
object computeConv3DInfo extends js.Object {
  
  def apply(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: Double | (js.Tuple3[Double, Double, Double]),
    dilations: Double | (js.Tuple3[Double, Double, Double]),
    pad: same_ | valid_ | Double,
    depthwise: js.UndefOr[Boolean],
    dataFormat: js.UndefOr[channelsFirst | channelsLast],
    roundingMode: js.UndefOr[floor | round | ceil]
  ): Conv3DInfo = js.native
}
