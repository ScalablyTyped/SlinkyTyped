package typingsSlinky.webpagetest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WaterfallOptions extends js.Object {
  /** set the chart type: waterfall or connection [waterfall] */
  var chartType: js.UndefOr[String] = js.native
  /** chart image width in px (300-2000) [930] */
  var chartWidth: js.UndefOr[Double] = js.native
  /** set chart coloring by MIME type [false] */
  var colorByMime: js.UndefOr[Boolean] = js.native
  /** set maximum time in seconds [automatic] */
  var maxTime: js.UndefOr[Double] = js.native
  /** hide bandwidth utilization [false] */
  var noBandwidth: js.UndefOr[Boolean] = js.native
  /** hide CPU utilization [false] */
  var noCPU: js.UndefOr[Boolean] = js.native
  /** hide ellipsis (...) for missing items [false] */
  var noEllipsis: js.UndefOr[Boolean] = js.native
  /** hide labels for requests (URL) [false] */
  var noLabels: js.UndefOr[Boolean] = js.native
  /** filter requests (e.g.:1,2,3,4-9,8) [all] */
  var requests: js.UndefOr[String] = js.native
}

object WaterfallOptions {
  @scala.inline
  def apply(): WaterfallOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaterfallOptions]
  }
  @scala.inline
  implicit class WaterfallOptionsOps[Self <: WaterfallOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChartType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChartType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartType")(js.undefined)
        ret
    }
    @scala.inline
    def withChartWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChartWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withColorByMime(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorByMime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorByMime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorByMime")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTime")(js.undefined)
        ret
    }
    @scala.inline
    def withNoBandwidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noBandwidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoBandwidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noBandwidth")(js.undefined)
        ret
    }
    @scala.inline
    def withNoCPU(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noCPU")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoCPU: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noCPU")(js.undefined)
        ret
    }
    @scala.inline
    def withNoEllipsis(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noEllipsis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoEllipsis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noEllipsis")(js.undefined)
        ret
    }
    @scala.inline
    def withNoLabels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withRequests(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requests")(js.undefined)
        ret
    }
  }
  
}

