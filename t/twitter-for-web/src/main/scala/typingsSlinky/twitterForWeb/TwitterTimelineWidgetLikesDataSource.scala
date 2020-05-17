package typingsSlinky.twitterForWeb

import typingsSlinky.twitterForWeb.anon.ScreenNameSourceType
import typingsSlinky.twitterForWeb.anon.UserId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.twitterForWeb.anon.ScreenNameSourceType
  - typingsSlinky.twitterForWeb.anon.UserId
*/
trait TwitterTimelineWidgetLikesDataSource extends TwitterTimelineWidgetDataSource

object TwitterTimelineWidgetLikesDataSource {
  @scala.inline
  implicit def apply(value: ScreenNameSourceType): TwitterTimelineWidgetLikesDataSource = value.asInstanceOf[TwitterTimelineWidgetLikesDataSource]
  @scala.inline
  implicit def apply(value: UserId): TwitterTimelineWidgetLikesDataSource = value.asInstanceOf[TwitterTimelineWidgetLikesDataSource]
}

