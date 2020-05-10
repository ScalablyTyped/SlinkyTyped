package typingsSlinky.trtcJsSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoteMutedState extends js.Object {
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
  implicit class RemoteMutedStateOps[Self <: RemoteMutedState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudioMuted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioMuted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasAudio(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAudio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasVideo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasVideo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideoMuted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoMuted")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

