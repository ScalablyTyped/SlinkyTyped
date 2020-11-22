package typingsSlinky.swaggerStats.anon

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.promClient.mod.CounterConfiguration
import typingsSlinky.promClient.mod.DefaultMetricsCollectorConfiguration
import typingsSlinky.promClient.mod.GaugeConfiguration
import typingsSlinky.promClient.mod.HistogramConfiguration
import typingsSlinky.promClient.mod.Registry
import typingsSlinky.promClient.mod.SummaryConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofPromClient extends js.Object {
  
  var AggregatorRegistry: TypeofAggregatorRegistry = js.native
  
  var Counter: Instantiable1[
    /* configuration */ CounterConfiguration[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
    typingsSlinky.promClient.mod.Counter[String]
  ] = js.native
  
  var Gauge: Instantiable1[
    /* configuration */ GaugeConfiguration[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
    typingsSlinky.promClient.mod.Gauge[String]
  ] = js.native
  
  var Histogram: Instantiable1[
    /* configuration */ HistogramConfiguration[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
    typingsSlinky.promClient.mod.Histogram[String]
  ] = js.native
  
  var Pushgateway: Instantiable1[/* url */ String, typingsSlinky.promClient.mod.Pushgateway] = js.native
  
  var Registry: TypeofRegistry = js.native
  
  var Summary: Instantiable1[
    /* configuration */ SummaryConfiguration[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
    typingsSlinky.promClient.mod.Summary[String]
  ] = js.native
  
  def collectDefaultMetrics(): Unit = js.native
  def collectDefaultMetrics(config: DefaultMetricsCollectorConfiguration): Unit = js.native
  
  def exponentialBuckets(start: Double, factor: Double, count: Double): js.Array[Double] = js.native
  
  def linearBuckets(start: Double, width: Double, count: Double): js.Array[Double] = js.native
  
  val register: Registry = js.native
  
  def validateMetricName(name: String): Boolean = js.native
}
