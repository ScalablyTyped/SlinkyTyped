package typingsSlinky.twitterForWeb

import typingsSlinky.twitterForWeb.twitterForWebStrings.list
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.twitterForWeb.anon.OwnerScreenName
  - typingsSlinky.twitterForWeb.anon.Id
*/
trait TwitterTimelineWidgetListDataSource extends _TwitterTimelineWidgetDataSource

object TwitterTimelineWidgetListDataSource {
  @scala.inline
  def OwnerScreenName(ownerScreenName: String, slug: String, sourceType: list): TwitterTimelineWidgetListDataSource = {
    val __obj = js.Dynamic.literal(ownerScreenName = ownerScreenName.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwitterTimelineWidgetListDataSource]
  }
  @scala.inline
  def Id(id: String, sourceType: list): TwitterTimelineWidgetListDataSource = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwitterTimelineWidgetListDataSource]
  }
}

