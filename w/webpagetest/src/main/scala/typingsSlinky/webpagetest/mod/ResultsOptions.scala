package typingsSlinky.webpagetest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultsOptions extends js.Object {
  /** include the breakdown of requests and bytes by mime type */
  var breakDown: js.UndefOr[Boolean] = js.native
  /** include the breakdown of requests and bytes by domain */
  var domains: js.UndefOr[Boolean] = js.native
  /** set the metric used to calculate median for multiple runs tests (default: loadTime) */
  var medianMetric: js.UndefOr[String] = js.native
  /** include the PageSpeed score in the response (may be slower) */
  var pageSpeed: js.UndefOr[Boolean] = js.native
  /** set performance test suite reporter output: [dot]|spec|tap|xunit|list|progress|min|nyan|landing|json|doc|markdown|teamcity */
  var reporter: js.UndefOr[String] = js.native
  /** include the request data in the response (slower and results in much larger responses) */
  var requests: js.UndefOr[Boolean] = js.native
  /** set the specs for performance test suite */
  var specs: js.UndefOr[String] = js.native
}

object ResultsOptions {
  @scala.inline
  def apply(): ResultsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultsOptions]
  }
  @scala.inline
  implicit class ResultsOptionsOps[Self <: ResultsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBreakDown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBreakDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakDown")(js.undefined)
        ret
    }
    @scala.inline
    def withDomains(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domains")(js.undefined)
        ret
    }
    @scala.inline
    def withMedianMetric(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("medianMetric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMedianMetric: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("medianMetric")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSpeed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withReporter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reporter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReporter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reporter")(js.undefined)
        ret
    }
    @scala.inline
    def withRequests(value: Boolean): Self = {
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
    @scala.inline
    def withSpecs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpecs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specs")(js.undefined)
        ret
    }
  }
  
}

