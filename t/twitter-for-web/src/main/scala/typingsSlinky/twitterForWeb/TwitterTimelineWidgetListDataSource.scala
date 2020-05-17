package typingsSlinky.twitterForWeb

import typingsSlinky.twitterForWeb.anon.Id
import typingsSlinky.twitterForWeb.anon.OwnerScreenName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.twitterForWeb.anon.OwnerScreenName
  - typingsSlinky.twitterForWeb.anon.Id
*/
trait TwitterTimelineWidgetListDataSource extends TwitterTimelineWidgetDataSource

object TwitterTimelineWidgetListDataSource {
  @scala.inline
  implicit def apply(value: Id): TwitterTimelineWidgetListDataSource = value.asInstanceOf[TwitterTimelineWidgetListDataSource]
  @scala.inline
  implicit def apply(value: OwnerScreenName): TwitterTimelineWidgetListDataSource = value.asInstanceOf[TwitterTimelineWidgetListDataSource]
}

