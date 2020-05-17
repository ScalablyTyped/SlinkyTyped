package typingsSlinky.swaggerStats.anon

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.promClient.anon.FnCall
import typingsSlinky.promClient.mod.CounterConfiguration
import typingsSlinky.promClient.mod.DefaultMetricsCollectorConfiguration
import typingsSlinky.promClient.mod.GaugeConfiguration
import typingsSlinky.promClient.mod.HistogramConfiguration
import typingsSlinky.promClient.mod.Registry
import typingsSlinky.promClient.mod.SummaryConfiguration
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofPromClient extends js.Object {
  var AggregatorRegistry: TypeofAggregatorRegistry = js.native
  var Counter: Instantiable1[/* configuration */ CounterConfiguration, typingsSlinky.promClient.mod.Counter] = js.native
  var Gauge: Instantiable1[/* configuration */ GaugeConfiguration, typingsSlinky.promClient.mod.Gauge] = js.native
  var Histogram: Instantiable1[/* configuration */ HistogramConfiguration, typingsSlinky.promClient.mod.Histogram] = js.native
  var Pushgateway: Instantiable1[/* url */ String, typingsSlinky.promClient.mod.Pushgateway] = js.native
  var Registry: TypeofRegistry = js.native
  var Summary: Instantiable1[/* configuration */ SummaryConfiguration, typingsSlinky.promClient.mod.Summary] = js.native
  val register: Registry = js.native
  def collectDefaultMetrics(): ReturnType[FnCall] = js.native
  def collectDefaultMetrics(config: DefaultMetricsCollectorConfiguration): ReturnType[FnCall] = js.native
  def collectDefaultMetrics(timeout: Double): Double = js.native
  def exponentialBuckets(start: Double, factor: Double, count: Double): js.Array[Double] = js.native
  def linearBuckets(start: Double, width: Double, count: Double): js.Array[Double] = js.native
  def validateMetricName(name: String): Boolean = js.native
}

