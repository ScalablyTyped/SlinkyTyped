package typingsSlinky.twitterForWeb

import typingsSlinky.twitterForWeb.twitterForWebStrings.profile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.twitterForWeb.anon.ScreenName
  - typingsSlinky.twitterForWeb.anon.SourceType
*/
trait TwitterTimelineWidgetProfileDataSource extends _TwitterTimelineWidgetDataSource
object TwitterTimelineWidgetProfileDataSource {
  
  @scala.inline
  def ScreenName(screenName: String, sourceType: profile): typingsSlinky.twitterForWeb.anon.ScreenName = {
    val __obj = js.Dynamic.literal(screenName = screenName.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.twitterForWeb.anon.ScreenName]
  }
  
  @scala.inline
  def SourceType(sourceType: profile, userId: String): typingsSlinky.twitterForWeb.anon.SourceType = {
    val __obj = js.Dynamic.literal(sourceType = sourceType.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.twitterForWeb.anon.SourceType]
  }
}
