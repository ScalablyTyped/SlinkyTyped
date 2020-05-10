package typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Information about the document and the submitted feedback. */
@js.native
trait FeedbackReturn extends js.Object {
  /** An optional comment from the person submitting the feedback. */
  var comment: js.UndefOr[String] = js.native
  /** Timestamp listing the creation time of the feedback submission. */
  var created: js.UndefOr[String] = js.native
  /** Information returned from the `POST /v1/feedback` method. */
  var feedback_data: js.UndefOr[FeedbackDataOutput] = js.native
  /** The unique ID of the feedback object. */
  var feedback_id: js.UndefOr[String] = js.native
  /** An optional string identifying the person submitting feedback. */
  var user_id: js.UndefOr[String] = js.native
}

object FeedbackReturn {
  @scala.inline
  def apply(): FeedbackReturn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeedbackReturn]
  }
  @scala.inline
  implicit class FeedbackReturnOps[Self <: FeedbackReturn] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withUser_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_id")(js.undefined)
        ret
    }
  }
  
}

