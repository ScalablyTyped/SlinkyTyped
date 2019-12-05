package typingsSlinky.atTensorflowTfjsDashCore.distOpsConvUnderscoreUtilMod

import typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.NCHW
import typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.channelsFirst
import typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.channelsLast
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/conv_util", "convertConv2DDataFormat")
@js.native
object convertConv2DDataFormat_NCHW extends js.Object {
  def apply(dataFormat: NCHW): channelsLast | channelsFirst = js.native
}

