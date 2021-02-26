package typingsSlinky.youtube.YT

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoByIdSettings extends VideoOrPlaylistSettings {
  
  /**
    * Video ID.
    */
  var videoId: String = js.native
}
object VideoByIdSettings {
  
  @scala.inline
  def apply(videoId: String): VideoByIdSettings = {
    val __obj = js.Dynamic.literal(videoId = videoId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoByIdSettings]
  }
  
  @scala.inline
  implicit class VideoByIdSettingsMutableBuilder[Self <: VideoByIdSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
  }
}
