package typingsSlinky.twitterForWeb

import typingsSlinky.twitterForWeb.twitterForWebStrings.url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TwitterTimelineWidgetUrlDataSource extends TwitterTimelineWidgetDataSource {
  var sourceType: url = js.native
  var url: String = js.native
}

object TwitterTimelineWidgetUrlDataSource {
  @scala.inline
  def apply(sourceType: url, url: String): TwitterTimelineWidgetUrlDataSource = {
    val __obj = js.Dynamic.literal(sourceType = sourceType.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwitterTimelineWidgetUrlDataSource]
  }
  @scala.inline
  implicit class TwitterTimelineWidgetUrlDataSourceOps[Self <: TwitterTimelineWidgetUrlDataSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSourceType(value: url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

