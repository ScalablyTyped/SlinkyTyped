package typingsSlinky.trtcJsSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoteMutedState extends StObject {
  
  /** 是否静音 */
  var audioMuted: Boolean = js.native
  
  /** 是否有视频 */
  var hasAudio: Boolean = js.native
  
  /** 是否有音频 */
  var hasVideo: Boolean = js.native
  
  /** 远端用户ID */
  var userId: String = js.native
  
  /** 是否关闭摄像头 */
  var videoMuted: Boolean = js.native
}
object RemoteMutedState {
  
  @scala.inline
  def apply(audioMuted: Boolean, hasAudio: Boolean, hasVideo: Boolean, userId: String, videoMuted: Boolean): RemoteMutedState = {
    val __obj = js.Dynamic.literal(audioMuted = audioMuted.asInstanceOf[js.Any], hasAudio = hasAudio.asInstanceOf[js.Any], hasVideo = hasVideo.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any], videoMuted = videoMuted.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteMutedState]
  }
  
  @scala.inline
  implicit class RemoteMutedStateMutableBuilder[Self <: RemoteMutedState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudioMuted(value: Boolean): Self = StObject.set(x, "audioMuted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasAudio(value: Boolean): Self = StObject.set(x, "hasAudio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasVideo(value: Boolean): Self = StObject.set(x, "hasVideo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoMuted(value: Boolean): Self = StObject.set(x, "videoMuted", value.asInstanceOf[js.Any])
  }
}
