package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A legacy interface kept for backwards compatibility and contains properties that offer performance timing information for various events which occur during the loading and use of the current page. You get a PerformanceTiming object describing your page using the window.performance.timing property. */
@js.native
trait PerformanceTiming extends js.Object {
  val connectEnd: Double = js.native
  val connectStart: Double = js.native
  val domComplete: Double = js.native
  val domContentLoadedEventEnd: Double = js.native
  val domContentLoadedEventStart: Double = js.native
  val domInteractive: Double = js.native
  val domLoading: Double = js.native
  val domainLookupEnd: Double = js.native
  val domainLookupStart: Double = js.native
  val fetchStart: Double = js.native
  val loadEventEnd: Double = js.native
  val loadEventStart: Double = js.native
  val navigationStart: Double = js.native
  val redirectEnd: Double = js.native
  val redirectStart: Double = js.native
  val requestStart: Double = js.native
  val responseEnd: Double = js.native
  val responseStart: Double = js.native
  val secureConnectionStart: Double = js.native
  val unloadEventEnd: Double = js.native
  val unloadEventStart: Double = js.native
  def toJSON(): js.Any = js.native
}

@JSGlobal("PerformanceTiming")
@js.native
object PerformanceTiming
  extends Instantiable0[org.scalajs.dom.raw.PerformanceTiming]

