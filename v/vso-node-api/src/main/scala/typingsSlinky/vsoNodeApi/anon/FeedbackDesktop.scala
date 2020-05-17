package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeedbackDesktop extends js.Object {
  var feedbackDesktop: scala.Double = js.native
  var feedbackWeb: scala.Double = js.native
  var sessionInsightsForAll: scala.Double = js.native
  var unknown: scala.Double = js.native
  var xTDesktop: scala.Double = js.native
  var xTDesktop2: scala.Double = js.native
  var xTWeb: scala.Double = js.native
}

object FeedbackDesktop {
  @scala.inline
  def apply(
    feedbackDesktop: scala.Double,
    feedbackWeb: scala.Double,
    sessionInsightsForAll: scala.Double,
    unknown: scala.Double,
    xTDesktop: scala.Double,
    xTDesktop2: scala.Double,
    xTWeb: scala.Double
  ): FeedbackDesktop = {
    val __obj = js.Dynamic.literal(feedbackDesktop = feedbackDesktop.asInstanceOf[js.Any], feedbackWeb = feedbackWeb.asInstanceOf[js.Any], sessionInsightsForAll = sessionInsightsForAll.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any], xTDesktop = xTDesktop.asInstanceOf[js.Any], xTDesktop2 = xTDesktop2.asInstanceOf[js.Any], xTWeb = xTWeb.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeedbackDesktop]
  }
  @scala.inline
  implicit class FeedbackDesktopOps[Self <: FeedbackDesktop] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFeedbackDesktop(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feedbackDesktop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFeedbackWeb(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feedbackWeb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSessionInsightsForAll(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionInsightsForAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnknown(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXTDesktop(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xTDesktop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXTDesktop2(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xTDesktop2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXTWeb(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xTWeb")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

