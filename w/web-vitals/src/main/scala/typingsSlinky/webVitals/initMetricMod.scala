package typingsSlinky.webVitals

import typingsSlinky.webVitals.typesMod.Metric
import typingsSlinky.webVitals.webVitalsStrings.CLS
import typingsSlinky.webVitals.webVitalsStrings.FCP
import typingsSlinky.webVitals.webVitalsStrings.FID
import typingsSlinky.webVitals.webVitalsStrings.LCP
import typingsSlinky.webVitals.webVitalsStrings.TTFB
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web-vitals/dist/lib/initMetric", JSImport.Namespace)
@js.native
object initMetricMod extends js.Object {
  @JSName("initMetric")
  def initMetric_CLS(name: CLS): Metric = js.native
  @JSName("initMetric")
  def initMetric_CLS(name: CLS, value: Double): Metric = js.native
  @JSName("initMetric")
  def initMetric_FCP(name: FCP): Metric = js.native
  @JSName("initMetric")
  def initMetric_FCP(name: FCP, value: Double): Metric = js.native
  @JSName("initMetric")
  def initMetric_FID(name: FID): Metric = js.native
  @JSName("initMetric")
  def initMetric_FID(name: FID, value: Double): Metric = js.native
  @JSName("initMetric")
  def initMetric_LCP(name: LCP): Metric = js.native
  @JSName("initMetric")
  def initMetric_LCP(name: LCP, value: Double): Metric = js.native
  @JSName("initMetric")
  def initMetric_TTFB(name: TTFB): Metric = js.native
  @JSName("initMetric")
  def initMetric_TTFB(name: TTFB, value: Double): Metric = js.native
}

