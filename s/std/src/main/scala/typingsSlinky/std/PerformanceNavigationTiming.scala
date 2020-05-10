package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides methods and properties to store and retrieve metrics regarding the browser's document navigation events. For example, this interface can be used to determine how much time it takes to load or unload a document. */
@js.native
trait PerformanceNavigationTiming extends PerformanceResourceTiming {
  val domComplete: Double = js.native
  val domContentLoadedEventEnd: Double = js.native
  val domContentLoadedEventStart: Double = js.native
  val domInteractive: Double = js.native
  val loadEventEnd: Double = js.native
  val loadEventStart: Double = js.native
  val redirectCount: Double = js.native
  val `type`: NavigationType = js.native
  val unloadEventEnd: Double = js.native
  val unloadEventStart: Double = js.native
}

@JSGlobal("PerformanceNavigationTiming")
@js.native
object PerformanceNavigationTiming extends Instantiable0[PerformanceNavigationTiming]

