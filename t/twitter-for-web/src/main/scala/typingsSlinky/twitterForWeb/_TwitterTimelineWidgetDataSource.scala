package typingsSlinky.twitterForWeb

import typingsSlinky.twitterForWeb.twitterForWebStrings.collection
import typingsSlinky.twitterForWeb.twitterForWebStrings.likes
import typingsSlinky.twitterForWeb.twitterForWebStrings.list
import typingsSlinky.twitterForWeb.twitterForWebStrings.profile
import typingsSlinky.twitterForWeb.twitterForWebStrings.url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _TwitterTimelineWidgetDataSource extends js.Object
object _TwitterTimelineWidgetDataSource {
  
  @scala.inline
  def TwitterTimelineWidgetUrlDataSource(sourceType: url, url: String): _TwitterTimelineWidgetDataSource = {
    val __obj = js.Dynamic.literal(sourceType = sourceType.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[_TwitterTimelineWidgetDataSource]
  }
  
  @scala.inline
  def ScreenName(screenName: String, sourceType: profile): _TwitterTimelineWidgetDataSource = {
    val __obj = js.Dynamic.literal(screenName = screenName.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[_TwitterTimelineWidgetDataSource]
  }
  
  @scala.inline
  def ScreenNameSourceType(screenName: String, sourceType: likes): _TwitterTimelineWidgetDataSource = {
    val __obj = js.Dynamic.literal(screenName = screenName.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[_TwitterTimelineWidgetDataSource]
  }
  
  @scala.inline
  def OwnerScreenName(ownerScreenName: String, slug: String, sourceType: list): _TwitterTimelineWidgetDataSource = {
    val __obj = js.Dynamic.literal(ownerScreenName = ownerScreenName.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[_TwitterTimelineWidgetDataSource]
  }
  
  @scala.inline
  def Id(id: String, sourceType: list): _TwitterTimelineWidgetDataSource = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[_TwitterTimelineWidgetDataSource]
  }
  
  @scala.inline
  def TwitterTimelineWidgetCollectionDataSource(id: String, sourceType: collection): _TwitterTimelineWidgetDataSource = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[_TwitterTimelineWidgetDataSource]
  }
  
  @scala.inline
  def UserId(sourceType: likes, userId: String): _TwitterTimelineWidgetDataSource = {
    val __obj = js.Dynamic.literal(sourceType = sourceType.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[_TwitterTimelineWidgetDataSource]
  }
  
  @scala.inline
  def SourceType(sourceType: profile, userId: String): _TwitterTimelineWidgetDataSource = {
    val __obj = js.Dynamic.literal(sourceType = sourceType.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[_TwitterTimelineWidgetDataSource]
  }
}
