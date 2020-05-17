package typingsSlinky.std

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

object PerformanceResourceTiming {
  @scala.inline
  def apply(
    connectEnd: Double,
    connectStart: Double,
    decodedBodySize: Double,
    domainLookupEnd: Double,
    domainLookupStart: Double,
    duration: Double,
    encodedBodySize: Double,
    entryType: java.lang.String,
    fetchStart: Double,
    initiatorType: java.lang.String,
    name: java.lang.String,
    nextHopProtocol: java.lang.String,
    redirectEnd: Double,
    redirectStart: Double,
    requestStart: Double,
    responseEnd: Double,
    responseStart: Double,
    secureConnectionStart: Double,
    startTime: Double,
    toJSON: () => js.Any,
    transferSize: Double,
    workerStart: Double
  ): PerformanceResourceTiming = {
    val __obj = js.Dynamic.literal(connectEnd = connectEnd.asInstanceOf[js.Any], connectStart = connectStart.asInstanceOf[js.Any], decodedBodySize = decodedBodySize.asInstanceOf[js.Any], domainLookupEnd = domainLookupEnd.asInstanceOf[js.Any], domainLookupStart = domainLookupStart.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], encodedBodySize = encodedBodySize.asInstanceOf[js.Any], entryType = entryType.asInstanceOf[js.Any], fetchStart = fetchStart.asInstanceOf[js.Any], initiatorType = initiatorType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nextHopProtocol = nextHopProtocol.asInstanceOf[js.Any], redirectEnd = redirectEnd.asInstanceOf[js.Any], redirectStart = redirectStart.asInstanceOf[js.Any], requestStart = requestStart.asInstanceOf[js.Any], responseEnd = responseEnd.asInstanceOf[js.Any], responseStart = responseStart.asInstanceOf[js.Any], secureConnectionStart = secureConnectionStart.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), transferSize = transferSize.asInstanceOf[js.Any], workerStart = workerStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerformanceResourceTiming]
  }
  @scala.inline
  implicit class PerformanceResourceTimingOps[Self <: org.scalajs.dom.raw.PerformanceResourceTiming] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnectStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecodedBodySize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decodedBodySize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomainLookupEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainLookupEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomainLookupStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainLookupStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncodedBodySize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodedBodySize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFetchStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitiatorType(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initiatorType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextHopProtocol(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextHopProtocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRedirectEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRedirectStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponseEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponseStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecureConnectionStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secureConnectionStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransferSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkerStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerStart")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

