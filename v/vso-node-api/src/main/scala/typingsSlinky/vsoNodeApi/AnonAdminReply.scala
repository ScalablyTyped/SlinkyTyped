package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAdminReply extends js.Object {
  var adminReply: Double = js.native
  var publisherReply: Double = js.native
  var review: Double = js.native
}

object AnonAdminReply {
  @scala.inline
  def apply(adminReply: Double, publisherReply: Double, review: Double): AnonAdminReply = {
    val __obj = js.Dynamic.literal(adminReply = adminReply.asInstanceOf[js.Any], publisherReply = publisherReply.asInstanceOf[js.Any], review = review.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAdminReply]
  }
  @scala.inline
  implicit class AnonAdminReplyOps[Self <: AnonAdminReply] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdminReply(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adminReply")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublisherReply(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisherReply")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReview(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("review")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

