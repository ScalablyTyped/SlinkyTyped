package typingsSlinky.std

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

object PerformanceNavigationTiming {
  @scala.inline
  def apply(
    connectEnd: Double,
    connectStart: Double,
    decodedBodySize: Double,
    domComplete: Double,
    domContentLoadedEventEnd: Double,
    domContentLoadedEventStart: Double,
    domInteractive: Double,
    domainLookupEnd: Double,
    domainLookupStart: Double,
    duration: Double,
    encodedBodySize: Double,
    entryType: java.lang.String,
    fetchStart: Double,
    initiatorType: java.lang.String,
    loadEventEnd: Double,
    loadEventStart: Double,
    name: java.lang.String,
    nextHopProtocol: java.lang.String,
    redirectCount: Double,
    redirectEnd: Double,
    redirectStart: Double,
    requestStart: Double,
    responseEnd: Double,
    responseStart: Double,
    secureConnectionStart: Double,
    startTime: Double,
    toJSON: () => js.Any,
    transferSize: Double,
    `type`: NavigationType,
    unloadEventEnd: Double,
    unloadEventStart: Double,
    workerStart: Double
  ): PerformanceNavigationTiming = {
    val __obj = js.Dynamic.literal(connectEnd = connectEnd.asInstanceOf[js.Any], connectStart = connectStart.asInstanceOf[js.Any], decodedBodySize = decodedBodySize.asInstanceOf[js.Any], domComplete = domComplete.asInstanceOf[js.Any], domContentLoadedEventEnd = domContentLoadedEventEnd.asInstanceOf[js.Any], domContentLoadedEventStart = domContentLoadedEventStart.asInstanceOf[js.Any], domInteractive = domInteractive.asInstanceOf[js.Any], domainLookupEnd = domainLookupEnd.asInstanceOf[js.Any], domainLookupStart = domainLookupStart.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], encodedBodySize = encodedBodySize.asInstanceOf[js.Any], entryType = entryType.asInstanceOf[js.Any], fetchStart = fetchStart.asInstanceOf[js.Any], initiatorType = initiatorType.asInstanceOf[js.Any], loadEventEnd = loadEventEnd.asInstanceOf[js.Any], loadEventStart = loadEventStart.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nextHopProtocol = nextHopProtocol.asInstanceOf[js.Any], redirectCount = redirectCount.asInstanceOf[js.Any], redirectEnd = redirectEnd.asInstanceOf[js.Any], redirectStart = redirectStart.asInstanceOf[js.Any], requestStart = requestStart.asInstanceOf[js.Any], responseEnd = responseEnd.asInstanceOf[js.Any], responseStart = responseStart.asInstanceOf[js.Any], secureConnectionStart = secureConnectionStart.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), transferSize = transferSize.asInstanceOf[js.Any], unloadEventEnd = unloadEventEnd.asInstanceOf[js.Any], unloadEventStart = unloadEventStart.asInstanceOf[js.Any], workerStart = workerStart.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerformanceNavigationTiming]
  }
  @scala.inline
  implicit class PerformanceNavigationTimingOps[Self <: PerformanceNavigationTiming] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomComplete(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domComplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomContentLoadedEventEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domContentLoadedEventEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomContentLoadedEventStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domContentLoadedEventStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomInteractive(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domInteractive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadEventEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadEventEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadEventStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadEventStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRedirectCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: NavigationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnloadEventEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unloadEventEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnloadEventStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unloadEventStart")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

