package typingsSlinky.webVitals.typesMod

import org.scalajs.dom.raw.PerformanceEntry
import typingsSlinky.webVitals.webVitalsStrings.CLS
import typingsSlinky.webVitals.webVitalsStrings.FCP
import typingsSlinky.webVitals.webVitalsStrings.FID
import typingsSlinky.webVitals.webVitalsStrings.LCP
import typingsSlinky.webVitals.webVitalsStrings.TTFB
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metric extends js.Object {
  var delta: Double
  var entries: js.Array[PerformanceEntry]
  var id: String
  var isFinal: Boolean
  var name: CLS | FCP | FID | LCP | TTFB
  var value: Double
}

object Metric {
  @scala.inline
  def apply(
    delta: Double,
    entries: js.Array[PerformanceEntry],
    id: String,
    isFinal: Boolean,
    name: CLS | FCP | FID | LCP | TTFB,
    value: Double
  ): Metric = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], entries = entries.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isFinal = isFinal.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metric]
  }
}

