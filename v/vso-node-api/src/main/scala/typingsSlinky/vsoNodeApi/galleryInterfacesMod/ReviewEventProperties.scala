package typingsSlinky.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReviewEventProperties extends js.Object {
  /**
    * Operation performed on Event - Create\Update
    */
  var eventOperation: ReviewEventOperation = js.native
  /**
    * Flag to see if reply is admin reply
    */
  var isAdminReply: Boolean = js.native
  /**
    * Flag to record if the reviwe is ignored
    */
  var isIgnored: Boolean = js.native
  /**
    * Rating at the time of event
    */
  var rating: Double = js.native
  /**
    * Reply update date
    */
  var replyDate: js.Date = js.native
  /**
    * Publisher reply text or admin reply text
    */
  var replyText: String = js.native
  /**
    * User who responded to the review
    */
  var replyUserId: String = js.native
  /**
    * Review Event Type - Review
    */
  var resourceType: ReviewResourceType = js.native
  /**
    * Review update date
    */
  var reviewDate: js.Date = js.native
  /**
    * ReviewId of the review  on which the operation is performed
    */
  var reviewId: Double = js.native
  /**
    * Text in Review Text
    */
  var reviewText: String = js.native
  /**
    * User display name at the time of review
    */
  var userDisplayName: String = js.native
  /**
    * User who gave review
    */
  var userId: String = js.native
}

object ReviewEventProperties {
  @scala.inline
  def apply(
    eventOperation: ReviewEventOperation,
    isAdminReply: Boolean,
    isIgnored: Boolean,
    rating: Double,
    replyDate: js.Date,
    replyText: String,
    replyUserId: String,
    resourceType: ReviewResourceType,
    reviewDate: js.Date,
    reviewId: Double,
    reviewText: String,
    userDisplayName: String,
    userId: String
  ): ReviewEventProperties = {
    val __obj = js.Dynamic.literal(eventOperation = eventOperation.asInstanceOf[js.Any], isAdminReply = isAdminReply.asInstanceOf[js.Any], isIgnored = isIgnored.asInstanceOf[js.Any], rating = rating.asInstanceOf[js.Any], replyDate = replyDate.asInstanceOf[js.Any], replyText = replyText.asInstanceOf[js.Any], replyUserId = replyUserId.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], reviewDate = reviewDate.asInstanceOf[js.Any], reviewId = reviewId.asInstanceOf[js.Any], reviewText = reviewText.asInstanceOf[js.Any], userDisplayName = userDisplayName.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReviewEventProperties]
  }
  @scala.inline
  implicit class ReviewEventPropertiesOps[Self <: ReviewEventProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventOperation(value: ReviewEventOperation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsAdminReply(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAdminReply")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsIgnored(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIgnored")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRating(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplyDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replyDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplyText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replyText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplyUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replyUserId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceType(value: ReviewResourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReviewDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reviewDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReviewId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reviewId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReviewText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reviewText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userDisplayName")(value.asInstanceOf[js.Any])
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

