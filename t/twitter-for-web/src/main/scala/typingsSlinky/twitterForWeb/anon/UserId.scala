package typingsSlinky.twitterForWeb.anon

import typingsSlinky.twitterForWeb.TwitterTimelineWidgetLikesDataSource
import typingsSlinky.twitterForWeb.twitterForWebStrings.likes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserId extends TwitterTimelineWidgetLikesDataSource {
  var sourceType: likes = js.native
  var userId: String = js.native
}

object UserId {
  @scala.inline
  def apply(sourceType: likes, userId: String): UserId = {
    val __obj = js.Dynamic.literal(sourceType = sourceType.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserId]
  }
  @scala.inline
  implicit class UserIdOps[Self <: UserId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSourceType(value: likes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceType")(value.asInstanceOf[js.Any])
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

