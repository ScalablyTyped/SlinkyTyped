package typingsSlinky.tensorflowTfjsLayers.trainingMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.tensorflowTfjsLayers.distTypesMod.LossOrMetricFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/engine/training", "collectMetrics")
@js.native
object collectMetrics extends js.Object {
  
  def apply(metrics: String, outputNames: js.Array[String]): js.Array[js.Array[String | LossOrMetricFn]] = js.native
  def apply(metrics: js.Array[String | LossOrMetricFn], outputNames: js.Array[String]): js.Array[js.Array[String | LossOrMetricFn]] = js.native
  def apply(metrics: StringDictionary[String | LossOrMetricFn], outputNames: js.Array[String]): js.Array[js.Array[String | LossOrMetricFn]] = js.native
  def apply(metrics: LossOrMetricFn, outputNames: js.Array[String]): js.Array[js.Array[String | LossOrMetricFn]] = js.native
}
