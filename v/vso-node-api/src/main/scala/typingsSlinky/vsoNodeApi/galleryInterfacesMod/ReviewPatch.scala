package typingsSlinky.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReviewPatch extends js.Object {
  /**
    * Denotes the patch operation type
    */
  var operation: ReviewPatchOperation = js.native
  /**
    * Use when patch operation is FlagReview
    */
  var reportedConcern: UserReportedConcern = js.native
  /**
    * Use when patch operation is EditReview
    */
  var reviewItem: Review = js.native
}

object ReviewPatch {
  @scala.inline
  def apply(operation: ReviewPatchOperation, reportedConcern: UserReportedConcern, reviewItem: Review): ReviewPatch = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any], reportedConcern = reportedConcern.asInstanceOf[js.Any], reviewItem = reviewItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReviewPatch]
  }
  @scala.inline
  implicit class ReviewPatchOps[Self <: ReviewPatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOperation(value: ReviewPatchOperation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReportedConcern(value: UserReportedConcern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportedConcern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReviewItem(value: Review): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reviewItem")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

