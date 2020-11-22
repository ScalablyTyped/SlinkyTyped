package typingsSlinky.tensorflowTfjs.indexWithPolyfillsMod.backendUtil

import typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.NHWC
import typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.same
import typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.valid
import typingsSlinky.tensorflowTfjsCore.convUtilMod.Conv2DInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "backend_util.computeDilation2DInfo")
@js.native
object computeDilation2DInfo extends js.Object {
  
  def apply(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: same,
    dataFormat: NHWC,
    dilations: js.Tuple2[Double, Double]
  ): Conv2DInfo = js.native
  def apply(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: same,
    dataFormat: NHWC,
    dilations: Double
  ): Conv2DInfo = js.native
  def apply(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: valid,
    dataFormat: NHWC,
    dilations: js.Tuple2[Double, Double]
  ): Conv2DInfo = js.native
  def apply(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: valid,
    dataFormat: NHWC,
    dilations: Double
  ): Conv2DInfo = js.native
  def apply(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: Double,
    pad: same,
    dataFormat: NHWC,
    dilations: js.Tuple2[Double, Double]
  ): Conv2DInfo = js.native
  def apply(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: Double,
    pad: same,
    dataFormat: NHWC,
    dilations: Double
  ): Conv2DInfo = js.native
  def apply(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: Double,
    pad: valid,
    dataFormat: NHWC,
    dilations: js.Tuple2[Double, Double]
  ): Conv2DInfo = js.native
  def apply(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: Double,
    pad: valid,
    dataFormat: NHWC,
    dilations: Double
  ): Conv2DInfo = js.native
}
