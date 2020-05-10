package typingsSlinky.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Review extends js.Object {
  /**
    * Admin Reply, if any, for this review
    */
  var adminReply: ReviewReply = js.native
  /**
    * Unique identifier of a review item
    */
  var id: Double = js.native
  /**
    * Flag for soft deletion
    */
  var isDeleted: Boolean = js.native
  var isIgnored: Boolean = js.native
  /**
    * Version of the product for which review was submitted
    */
  var productVersion: String = js.native
  /**
    * Rating procided by the user
    */
  var rating: Double = js.native
  /**
    * Reply, if any, for this review
    */
  var reply: ReviewReply = js.native
  /**
    * Text description of the review
    */
  var text: String = js.native
  /**
    * Title of the review
    */
  var title: String = js.native
  /**
    * Time when the review was edited/updated
    */
  var updatedDate: js.Date = js.native
  /**
    * Name of the user
    */
  var userDisplayName: String = js.native
  /**
    * Id of the user who submitted the review
    */
  var userId: String = js.native
}

object Review {
  @scala.inline
  def apply(
    adminReply: ReviewReply,
    id: Double,
    isDeleted: Boolean,
    isIgnored: Boolean,
    productVersion: String,
    rating: Double,
    reply: ReviewReply,
    text: String,
    title: String,
    updatedDate: js.Date,
    userDisplayName: String,
    userId: String
  ): Review = {
    val __obj = js.Dynamic.literal(adminReply = adminReply.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isDeleted = isDeleted.asInstanceOf[js.Any], isIgnored = isIgnored.asInstanceOf[js.Any], productVersion = productVersion.asInstanceOf[js.Any], rating = rating.asInstanceOf[js.Any], reply = reply.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updatedDate = updatedDate.asInstanceOf[js.Any], userDisplayName = userDisplayName.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Review]
  }
  @scala.inline
  implicit class ReviewOps[Self <: Review] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdminReply(value: ReviewReply): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adminReply")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDeleted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDeleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsIgnored(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIgnored")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProductVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRating(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReply(value: ReviewReply): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reply")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdatedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedDate")(value.asInstanceOf[js.Any])
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

