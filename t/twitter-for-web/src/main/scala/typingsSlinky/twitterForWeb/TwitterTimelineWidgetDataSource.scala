package typingsSlinky.twitterForWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.twitterForWeb.TwitterTimelineWidgetProfileDataSource
  - typingsSlinky.twitterForWeb.TwitterTimelineWidgetLikesDataSource
  - typingsSlinky.twitterForWeb.TwitterTimelineWidgetListDataSource
  - typingsSlinky.twitterForWeb.TwitterTimelineWidgetCollectionDataSource
  - typingsSlinky.twitterForWeb.TwitterTimelineWidgetUrlDataSource
  - java.lang.String
*/
trait TwitterTimelineWidgetDataSource extends js.Object

object TwitterTimelineWidgetDataSource {
  @scala.inline
  implicit def apply(value: String): TwitterTimelineWidgetDataSource = value.asInstanceOf[TwitterTimelineWidgetDataSource]
  @scala.inline
  implicit def apply(value: TwitterTimelineWidgetCollectionDataSource): TwitterTimelineWidgetDataSource = value.asInstanceOf[TwitterTimelineWidgetDataSource]
  @scala.inline
  implicit def apply(value: TwitterTimelineWidgetLikesDataSource): TwitterTimelineWidgetDataSource = value.asInstanceOf[TwitterTimelineWidgetDataSource]
  @scala.inline
  implicit def apply(value: TwitterTimelineWidgetListDataSource): TwitterTimelineWidgetDataSource = value.asInstanceOf[TwitterTimelineWidgetDataSource]
  @scala.inline
  implicit def apply(value: TwitterTimelineWidgetProfileDataSource): TwitterTimelineWidgetDataSource = value.asInstanceOf[TwitterTimelineWidgetDataSource]
  @scala.inline
  implicit def apply(value: TwitterTimelineWidgetUrlDataSource): TwitterTimelineWidgetDataSource = value.asInstanceOf[TwitterTimelineWidgetDataSource]
}

