package typingsSlinky.tinder.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TinderLikedMessage extends js.Object {
  var is_liked: Boolean = js.native
  var liker_id: String = js.native
  var match_id: String = js.native
  var message_id: String = js.native
  var updated_at: String = js.native
}

object TinderLikedMessage {
  @scala.inline
  def apply(is_liked: Boolean, liker_id: String, match_id: String, message_id: String, updated_at: String): TinderLikedMessage = {
    val __obj = js.Dynamic.literal(is_liked = is_liked.asInstanceOf[js.Any], liker_id = liker_id.asInstanceOf[js.Any], match_id = match_id.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[TinderLikedMessage]
  }
  @scala.inline
  implicit class TinderLikedMessageOps[Self <: TinderLikedMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIs_liked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_liked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLiker_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liker_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatch_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated_at")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

