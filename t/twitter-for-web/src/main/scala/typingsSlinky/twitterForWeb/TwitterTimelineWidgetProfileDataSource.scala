package typingsSlinky.twitterForWeb

import typingsSlinky.twitterForWeb.twitterForWebStrings.profile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.twitterForWeb.AnonScreenName
  - typingsSlinky.twitterForWeb.AnonSourceType
*/
trait TwitterTimelineWidgetProfileDataSource extends _TwitterTimelineWidgetDataSource

object TwitterTimelineWidgetProfileDataSource {
  @scala.inline
  def AnonScreenName(screenName: String, sourceType: profile): TwitterTimelineWidgetProfileDataSource = {
    val __obj = js.Dynamic.literal(screenName = screenName.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwitterTimelineWidgetProfileDataSource]
  }
  @scala.inline
  def AnonSourceType(sourceType: profile, userId: String): TwitterTimelineWidgetProfileDataSource = {
    val __obj = js.Dynamic.literal(sourceType = sourceType.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwitterTimelineWidgetProfileDataSource]
  }
}

