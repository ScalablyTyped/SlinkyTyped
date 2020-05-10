package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAdminResponseForReview extends js.Object {
  var adminResponseForReview: Double = js.native
  var deleteAdminReply: Double = js.native
  var deletePublisherReply: Double = js.native
  var flagReview: Double = js.native
  var replyToReview: Double = js.native
  var updateReview: Double = js.native
}

object AnonAdminResponseForReview {
  @scala.inline
  def apply(
    adminResponseForReview: Double,
    deleteAdminReply: Double,
    deletePublisherReply: Double,
    flagReview: Double,
    replyToReview: Double,
    updateReview: Double
  ): AnonAdminResponseForReview = {
    val __obj = js.Dynamic.literal(adminResponseForReview = adminResponseForReview.asInstanceOf[js.Any], deleteAdminReply = deleteAdminReply.asInstanceOf[js.Any], deletePublisherReply = deletePublisherReply.asInstanceOf[js.Any], flagReview = flagReview.asInstanceOf[js.Any], replyToReview = replyToReview.asInstanceOf[js.Any], updateReview = updateReview.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAdminResponseForReview]
  }
  @scala.inline
  implicit class AnonAdminResponseForReviewOps[Self <: AnonAdminResponseForReview] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdminResponseForReview(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adminResponseForReview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteAdminReply(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteAdminReply")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeletePublisherReply(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletePublisherReply")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlagReview(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flagReview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplyToReview(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replyToReview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateReview(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateReview")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

