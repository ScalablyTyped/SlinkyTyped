package typingsSlinky.atTensorflowTfjsDashCore.distOpsConvUnderscoreUtilMod

import typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.ceil
import typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.channelsFirst
import typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.channelsLast
import typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.floor
import typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.round
import typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.same_
import typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.valid_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/conv_util", "computePool2DInfo")
@js.native
object computePool2DInfo extends js.Object {
  def apply(
    inShape: js.Tuple4[Double, Double, Double, Double],
    filterSize: (js.Tuple2[Double, Double]) | Double,
    strides: Double | (js.Tuple2[Double, Double]),
    dilations: Double | (js.Tuple2[Double, Double]),
    pad: same_ | valid_ | Double
  ): Conv2DInfo = js.native
  def apply(
    inShape: js.Tuple4[Double, Double, Double, Double],
    filterSize: (js.Tuple2[Double, Double]) | Double,
    strides: Double | (js.Tuple2[Double, Double]),
    dilations: Double | (js.Tuple2[Double, Double]),
    pad: same_ | valid_ | Double,
    roundingMode: floor | round | ceil
  ): Conv2DInfo = js.native
  def apply(
    inShape: js.Tuple4[Double, Double, Double, Double],
    filterSize: (js.Tuple2[Double, Double]) | Double,
    strides: Double | (js.Tuple2[Double, Double]),
    dilations: Double | (js.Tuple2[Double, Double]),
    pad: same_ | valid_ | Double,
    roundingMode: floor | round | ceil,
    dataFormat: channelsFirst | channelsLast
  ): Conv2DInfo = js.native
}

