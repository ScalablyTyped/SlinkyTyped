package typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The results of a successful `GET /v1/feedback` request. */
@js.native
trait FeedbackList extends js.Object {
  /** A list of all feedback for the document. */
  var feedback: js.UndefOr[js.Array[GetFeedback]] = js.native
}

object FeedbackList {
  @scala.inline
  def apply(): FeedbackList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeedbackList]
  }
  @scala.inline
  implicit class FeedbackListOps[Self <: FeedbackList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFeedback(value: js.Array[GetFeedback]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feedback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeedback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feedback")(js.undefined)
        ret
    }
  }
  
}

