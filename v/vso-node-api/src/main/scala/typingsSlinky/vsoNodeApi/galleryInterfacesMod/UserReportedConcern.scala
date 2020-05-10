package typingsSlinky.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserReportedConcern extends js.Object {
  /**
    * Category of the concern
    */
  var category: ConcernCategory = js.native
  /**
    * User comment associated with the report
    */
  var concernText: String = js.native
  /**
    * Id of the review which was reported
    */
  var reviewId: Double = js.native
  /**
    * Date the report was submitted
    */
  var submittedDate: js.Date = js.native
  /**
    * Id of the user who reported a review
    */
  var userId: String = js.native
}

object UserReportedConcern {
  @scala.inline
  def apply(
    category: ConcernCategory,
    concernText: String,
    reviewId: Double,
    submittedDate: js.Date,
    userId: String
  ): UserReportedConcern = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], concernText = concernText.asInstanceOf[js.Any], reviewId = reviewId.asInstanceOf[js.Any], submittedDate = submittedDate.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserReportedConcern]
  }
  @scala.inline
  implicit class UserReportedConcernOps[Self <: UserReportedConcern] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategory(value: ConcernCategory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConcernText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concernText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReviewId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reviewId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubmittedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submittedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

