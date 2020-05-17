package typingsSlinky.twitterForWeb

import typingsSlinky.twitterForWeb.anon.ScreenName
import typingsSlinky.twitterForWeb.anon.SourceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.twitterForWeb.anon.ScreenName
  - typingsSlinky.twitterForWeb.anon.SourceType
*/
trait TwitterTimelineWidgetProfileDataSource extends TwitterTimelineWidgetDataSource

object TwitterTimelineWidgetProfileDataSource {
  @scala.inline
  implicit def apply(value: ScreenName): TwitterTimelineWidgetProfileDataSource = value.asInstanceOf[TwitterTimelineWidgetProfileDataSource]
  @scala.inline
  implicit def apply(value: SourceType): TwitterTimelineWidgetProfileDataSource = value.asInstanceOf[TwitterTimelineWidgetProfileDataSource]
}

