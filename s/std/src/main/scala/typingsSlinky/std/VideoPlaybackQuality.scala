package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Returned by the HTMLVideoElement.getVideoPlaybackQuality() method and contains metrics that can be used to determine the playback quality of a video. */
@js.native
trait VideoPlaybackQuality extends js.Object {
  
  val creationTime: Double = js.native
  
  val droppedVideoFrames: Double = js.native
  
  val totalVideoFrames: Double = js.native
}
object VideoPlaybackQuality {
  
  @scala.inline
  def apply(creationTime: Double, droppedVideoFrames: Double, totalVideoFrames: Double): VideoPlaybackQuality = {
    val __obj = js.Dynamic.literal(creationTime = creationTime.asInstanceOf[js.Any], droppedVideoFrames = droppedVideoFrames.asInstanceOf[js.Any], totalVideoFrames = totalVideoFrames.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoPlaybackQuality]
  }
  
  @scala.inline
  implicit class VideoPlaybackQualityOps[Self <: VideoPlaybackQuality] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreationTime(value: Double): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDroppedVideoFrames(value: Double): Self = this.set("droppedVideoFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalVideoFrames(value: Double): Self = this.set("totalVideoFrames", value.asInstanceOf[js.Any])
  }
}
