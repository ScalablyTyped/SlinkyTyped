package typingsSlinky.ytSearch.mod

import typingsSlinky.ytSearch.ytSearchStrings.live_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiveSearchResultBase extends StObject {
  
  var author: Author = js.native
  
  var description: String = js.native
  
  var image: String = js.native
  
  var thumbnail: String = js.native
  
  var title: String = js.native
  
  var `type`: live_ = js.native
  
  var url: String = js.native
  
  var videoId: String = js.native
  
  var watching: Double = js.native
}
object LiveSearchResultBase {
  
  @scala.inline
  def apply(
    author: Author,
    description: String,
    image: String,
    thumbnail: String,
    title: String,
    `type`: live_,
    url: String,
    videoId: String,
    watching: Double
  ): LiveSearchResultBase = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], videoId = videoId.asInstanceOf[js.Any], watching = watching.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveSearchResultBase]
  }
  
  @scala.inline
  implicit class LiveSearchResultBaseMutableBuilder[Self <: LiveSearchResultBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthor(value: Author): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: live_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWatching(value: Double): Self = StObject.set(x, "watching", value.asInstanceOf[js.Any])
  }
}
