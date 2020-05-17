package typingsSlinky.twitterForWeb.anon

import typingsSlinky.twitterForWeb.TwitterTimelineWidgetListDataSource
import typingsSlinky.twitterForWeb.twitterForWebStrings.list
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OwnerScreenName extends TwitterTimelineWidgetListDataSource {
  var ownerScreenName: String = js.native
  var slug: String = js.native
  var sourceType: list = js.native
}

object OwnerScreenName {
  @scala.inline
  def apply(ownerScreenName: String, slug: String, sourceType: list): OwnerScreenName = {
    val __obj = js.Dynamic.literal(ownerScreenName = ownerScreenName.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[OwnerScreenName]
  }
  @scala.inline
  implicit class OwnerScreenNameOps[Self <: OwnerScreenName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOwnerScreenName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerScreenName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlug(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceType(value: list): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

