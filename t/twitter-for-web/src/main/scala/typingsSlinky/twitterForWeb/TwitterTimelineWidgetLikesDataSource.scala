package typingsSlinky.twitterForWeb

import typingsSlinky.twitterForWeb.twitterForWebStrings.likes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.twitterForWeb.anon.ScreenNameSourceType
  - typingsSlinky.twitterForWeb.anon.UserId
*/
trait TwitterTimelineWidgetLikesDataSource extends _TwitterTimelineWidgetDataSource
object TwitterTimelineWidgetLikesDataSource {
  
  @scala.inline
  def ScreenNameSourceType(screenName: String, sourceType: likes): typingsSlinky.twitterForWeb.anon.ScreenNameSourceType = {
    val __obj = js.Dynamic.literal(screenName = screenName.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.twitterForWeb.anon.ScreenNameSourceType]
  }
  
  @scala.inline
  def UserId(sourceType: likes, userId: String): typingsSlinky.twitterForWeb.anon.UserId = {
    val __obj = js.Dynamic.literal(sourceType = sourceType.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.twitterForWeb.anon.UserId]
  }
}
