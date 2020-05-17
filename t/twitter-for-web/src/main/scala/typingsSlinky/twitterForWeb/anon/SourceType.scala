package typingsSlinky.twitterForWeb.anon

import typingsSlinky.twitterForWeb.TwitterTimelineWidgetProfileDataSource
import typingsSlinky.twitterForWeb.twitterForWebStrings.profile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceType extends TwitterTimelineWidgetProfileDataSource {
  var sourceType: profile = js.native
  var userId: String = js.native
}

object SourceType {
  @scala.inline
  def apply(sourceType: profile, userId: String): SourceType = {
    val __obj = js.Dynamic.literal(sourceType = sourceType.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceType]
  }
  @scala.inline
  implicit class SourceTypeOps[Self <: SourceType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSourceType(value: profile): Self = {
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

