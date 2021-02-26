package typingsSlinky.twitterForWeb

import typingsSlinky.twitterForWeb.twitterForWebStrings.list
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.twitterForWeb.anon.OwnerScreenName
  - typingsSlinky.twitterForWeb.anon.Id
*/
trait TwitterTimelineWidgetListDataSource extends _TwitterTimelineWidgetDataSource
object TwitterTimelineWidgetListDataSource {
  
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
}
