package typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The results of a single feedback query. */
@js.native
trait GetFeedback extends js.Object {
  /** A string containing the user's comment about the feedback entry. */
  var comment: js.UndefOr[String] = js.native
  /** A timestamp identifying the creation time of the feedback entry. */
  var created: js.UndefOr[String] = js.native
  /** Information returned from the `POST /v1/feedback` method. */
  var feedback_data: js.UndefOr[FeedbackDataOutput] = js.native
  /** A string uniquely identifying the feedback entry. */
  var feedback_id: js.UndefOr[String] = js.native
}

object GetFeedback {
  @scala.inline
  def apply(): GetFeedback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFeedback]
  }
  @scala.inline
  implicit class GetFeedbackOps[Self <: GetFeedback] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(js.undefined)
        ret
    }
    @scala.inline
    def withCreated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(js.undefined)
        ret
    }
    @scala.inline
    def withFeedback_data(value: FeedbackDataOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feedback_data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeedback_data: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feedback_data")(js.undefined)
        ret
    }
    @scala.inline
    def withFeedback_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feedback_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeedback_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feedback_id")(js.undefined)
        ret
    }
  }
  
}

