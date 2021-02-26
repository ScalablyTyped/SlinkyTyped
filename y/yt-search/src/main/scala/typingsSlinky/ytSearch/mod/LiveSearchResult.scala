package typingsSlinky.ytSearch.mod

import typingsSlinky.ytSearch.ytSearchStrings.LIVE
import typingsSlinky.ytSearch.ytSearchStrings.UPCOMING
import typingsSlinky.ytSearch.ytSearchStrings.live_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ytSearch.mod.UpcomingLiveSearchResult
  - typingsSlinky.ytSearch.mod.LiveLiveSearchResult
*/
trait LiveSearchResult extends StObject
object LiveSearchResult {
  
  @scala.inline
  def LiveLiveSearchResult(
    author: Author,
    description: String,
    image: String,
    status: LIVE,
    thumbnail: String,
    title: String,
    `type`: live_,
    url: String,
    videoId: String,
    watching: Double
  ): typingsSlinky.ytSearch.mod.LiveLiveSearchResult = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], videoId = videoId.asInstanceOf[js.Any], watching = watching.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.ytSearch.mod.LiveLiveSearchResult]
  }
  
  @scala.inline
  def UpcomingLiveSearchResult(
    author: Author,
    description: String,
    image: String,
    startDate: String,
    startTime: Double,
    status: UPCOMING,
    thumbnail: String,
    title: String,
    `type`: live_,
    url: String,
    videoId: String,
    watching: Double
  ): typingsSlinky.ytSearch.mod.UpcomingLiveSearchResult = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], videoId = videoId.asInstanceOf[js.Any], watching = watching.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.ytSearch.mod.UpcomingLiveSearchResult]
  }
}
