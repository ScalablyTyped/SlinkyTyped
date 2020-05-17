package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdminReply extends js.Object {
  var adminReply: scala.Double = js.native
  var publisherReply: scala.Double = js.native
  var review: scala.Double = js.native
}

object AdminReply {
  @scala.inline
  def apply(adminReply: scala.Double, publisherReply: scala.Double, review: scala.Double): AdminReply = {
    val __obj = js.Dynamic.literal(adminReply = adminReply.asInstanceOf[js.Any], publisherReply = publisherReply.asInstanceOf[js.Any], review = review.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminReply]
  }
  @scala.inline
  implicit class AdminReplyOps[Self <: AdminReply] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdminReply(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adminReply")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublisherReply(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisherReply")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReview(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("review")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

