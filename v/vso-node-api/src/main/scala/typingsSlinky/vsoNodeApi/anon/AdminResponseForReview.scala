package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdminResponseForReview extends js.Object {
  var adminResponseForReview: scala.Double = js.native
  var deleteAdminReply: scala.Double = js.native
  var deletePublisherReply: scala.Double = js.native
  var flagReview: scala.Double = js.native
  var replyToReview: scala.Double = js.native
  var updateReview: scala.Double = js.native
}

object AdminResponseForReview {
  @scala.inline
  def apply(
    adminResponseForReview: scala.Double,
    deleteAdminReply: scala.Double,
    deletePublisherReply: scala.Double,
    flagReview: scala.Double,
    replyToReview: scala.Double,
    updateReview: scala.Double
  ): AdminResponseForReview = {
    val __obj = js.Dynamic.literal(adminResponseForReview = adminResponseForReview.asInstanceOf[js.Any], deleteAdminReply = deleteAdminReply.asInstanceOf[js.Any], deletePublisherReply = deletePublisherReply.asInstanceOf[js.Any], flagReview = flagReview.asInstanceOf[js.Any], replyToReview = replyToReview.asInstanceOf[js.Any], updateReview = updateReview.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminResponseForReview]
  }
  @scala.inline
  implicit class AdminResponseForReviewOps[Self <: AdminResponseForReview] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdminResponseForReview(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adminResponseForReview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteAdminReply(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteAdminReply")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeletePublisherReply(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletePublisherReply")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlagReview(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flagReview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplyToReview(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replyToReview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateReview(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateReview")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

