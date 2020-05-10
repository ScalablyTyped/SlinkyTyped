package typingsSlinky.segmentAnalytics.SegmentAnalytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricsOptions extends js.Object {
  var flushTimer: js.UndefOr[Double] = js.native
  var host: js.UndefOr[String] = js.native
  var maxQueueSize: js.UndefOr[Double] = js.native
  var sampleRate: js.UndefOr[Double] = js.native
}

object MetricsOptions {
  @scala.inline
  def apply(): MetricsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricsOptions]
  }
  @scala.inline
  implicit class MetricsOptionsOps[Self <: MetricsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlushTimer(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flushTimer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlushTimer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flushTimer")(js.undefined)
        ret
    }
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxQueueSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxQueueSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxQueueSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxQueueSize")(js.undefined)
        ret
    }
    @scala.inline
    def withSampleRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSampleRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleRate")(js.undefined)
        ret
    }
  }
  
}

