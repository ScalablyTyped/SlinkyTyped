package typingsSlinky.twitterForWeb

import typingsSlinky.twitterForWeb.twitterForWebStrings.collection
import typingsSlinky.twitterForWeb.twitterForWebStrings.likes
import typingsSlinky.twitterForWeb.twitterForWebStrings.list
import typingsSlinky.twitterForWeb.twitterForWebStrings.profile
import typingsSlinky.twitterForWeb.twitterForWebStrings.url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _TwitterTimelineWidgetDataSource extends StObject
object _TwitterTimelineWidgetDataSource {
  
  @scala.inline
  def Id(id: String, sourceType: list): typingsSlinky.twitterForWeb.anon.Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.twitterForWeb.anon.Id]
  }
  
  @scala.inline
  def OwnerScreenName(ownerScreenName: String, slug: String, sourceType: list): typingsSlinky.twitterForWeb.anon.OwnerScreenName = {
    val __obj = js.Dynamic.literal(ownerScreenName = ownerScreenName.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.twitterForWeb.anon.OwnerScreenName]
  }
  
  @scala.inline
  def ScreenName(screenName: String, sourceType: profile): typingsSlinky.twitterForWeb.anon.ScreenName = {
    val __obj = js.Dynamic.literal(screenName = screenName.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.twitterForWeb.anon.ScreenName]
  }
  
  @scala.inline
  def ScreenNameSourceType(screenName: String, sourceType: likes): typingsSlinky.twitterForWeb.anon.ScreenNameSourceType = {
    val __obj = js.Dynamic.literal(screenName = screenName.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.twitterForWeb.anon.ScreenNameSourceType]
  }
  
  @scala.inline
  def SourceType(sourceType: profile, userId: String): typingsSlinky.twitterForWeb.anon.SourceType = {
    val __obj = js.Dynamic.literal(sourceType = sourceType.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.twitterForWeb.anon.SourceType]
  }
  
  @scala.inline
  def TwitterTimelineWidgetCollectionDataSource(id: String, sourceType: collection): typingsSlinky.twitterForWeb.TwitterTimelineWidgetCollectionDataSource = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.twitterForWeb.TwitterTimelineWidgetCollectionDataSource]
  }
  
  @scala.inline
  def TwitterTimelineWidgetUrlDataSource(sourceType: url, url: String): typingsSlinky.twitterForWeb.TwitterTimelineWidgetUrlDataSource = {
    val __obj = js.Dynamic.literal(sourceType = sourceType.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.twitterForWeb.TwitterTimelineWidgetUrlDataSource]
  }
  
  @scala.inline
  def UserId(sourceType: likes, userId: String): typingsSlinky.twitterForWeb.anon.UserId = {
    val __obj = js.Dynamic.literal(sourceType = sourceType.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.twitterForWeb.anon.UserId]
  }
}
