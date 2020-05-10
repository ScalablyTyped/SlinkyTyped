package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFeedbackDesktop extends js.Object {
  var feedbackDesktop: Double = js.native
  var feedbackWeb: Double = js.native
  var sessionInsightsForAll: Double = js.native
  var unknown: Double = js.native
  var xTDesktop: Double = js.native
  var xTDesktop2: Double = js.native
  var xTWeb: Double = js.native
}

object AnonFeedbackDesktop {
  @scala.inline
  def apply(
    feedbackDesktop: Double,
    feedbackWeb: Double,
    sessionInsightsForAll: Double,
    unknown: Double,
    xTDesktop: Double,
    xTDesktop2: Double,
    xTWeb: Double
  ): AnonFeedbackDesktop = {
    val __obj = js.Dynamic.literal(feedbackDesktop = feedbackDesktop.asInstanceOf[js.Any], feedbackWeb = feedbackWeb.asInstanceOf[js.Any], sessionInsightsForAll = sessionInsightsForAll.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any], xTDesktop = xTDesktop.asInstanceOf[js.Any], xTDesktop2 = xTDesktop2.asInstanceOf[js.Any], xTWeb = xTWeb.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFeedbackDesktop]
  }
  @scala.inline
  implicit class AnonFeedbackDesktopOps[Self <: AnonFeedbackDesktop] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFeedbackDesktop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feedbackDesktop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFeedbackWeb(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feedbackWeb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSessionInsightsForAll(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionInsightsForAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnknown(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXTDesktop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xTDesktop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXTDesktop2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xTDesktop2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXTWeb(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xTWeb")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

