package typingsSlinky.youtube.YT

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
  implicit class VideoByIdSettingsOps[Self <: VideoByIdSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setVideoId(value: String): Self = this.set("videoId", value.asInstanceOf[js.Any])
  }
}
