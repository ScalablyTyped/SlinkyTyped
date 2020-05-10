package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables retrieval and analysis of detailed network timing data regarding the loading of an application's resources. An application can use the timing metrics to determine, for example, the length of time it takes to fetch a specific resource, such as an XMLHttpRequest, <SVG>, image, or script. */
@js.native
trait PerformanceResourceTiming extends PerformanceEntry {
  val connectEnd: Double = js.native
  val connectStart: Double = js.native
  val decodedBodySize: Double = js.native
  val domainLookupEnd: Double = js.native
  val domainLookupStart: Double = js.native
  val encodedBodySize: Double = js.native
  val fetchStart: Double = js.native
  val initiatorType: java.lang.String = js.native
  val nextHopProtocol: java.lang.String = js.native
  val redirectEnd: Double = js.native
  val redirectStart: Double = js.native
  val requestStart: Double = js.native
  val responseEnd: Double = js.native
  val responseStart: Double = js.native
  val secureConnectionStart: Double = js.native
  val transferSize: Double = js.native
  val workerStart: Double = js.native
}

@JSGlobal("PerformanceResourceTiming")
@js.native
object PerformanceResourceTiming
  extends Instantiable0[org.scalajs.dom.raw.PerformanceResourceTiming]

