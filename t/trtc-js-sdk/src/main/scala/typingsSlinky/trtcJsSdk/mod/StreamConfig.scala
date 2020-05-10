package typingsSlinky.trtcJsSdk.mod

import org.scalajs.dom.experimental.mediastream.MediaStreamTrack
import typingsSlinky.trtcJsSdk.trtcJsSdkStrings.environment
import typingsSlinky.trtcJsSdk.trtcJsSdkStrings.user
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamConfig extends js.Object {
  /** 是否从麦克风采集音频 */
  var audio: Boolean = js.native
  /** 音频源 */
  var audioSource: js.UndefOr[MediaStreamTrack] = js.native
  /** 摄像头设备 deviceId，通过 getCameras() 获取 */
  var cameraId: js.UndefOr[String] = js.native
  /**
    * 在移动设备上，可通过该参数选择使用前置或后置摄像头：
    * - `user`：前置摄像头
    * - `environment`：后置摄像头
    *
    * **注意** 请勿同时使用 cameraId 和 facingMode 参数。
    */
  var facingMode: js.UndefOr[user | environment] = js.native
  /** 麦克风设备 deviceId，通过 getMicrophones() 获取 */
  var microphoneId: js.UndefOr[String] = js.native
  /** 视频显示是否为镜像，默认为 true。建议在使用前置摄像头时开启，使用后置摄像头时关闭。镜像设置不适用于屏幕分享。 */
  var mirror: js.UndefOr[Boolean] = js.native
  /** 是否采集屏幕分享流 */
  var screen: js.UndefOr[Boolean] = js.native
  /** 是否从摄像头采集视频 */
  var video: Boolean = js.native
  /** 视频源 */
  var videoSource: js.UndefOr[MediaStreamTrack] = js.native
}

object StreamConfig {
  @scala.inline
  def apply(audio: Boolean, video: Boolean): StreamConfig = {
    val __obj = js.Dynamic.literal(audio = audio.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamConfig]
  }
  @scala.inline
  implicit class StreamConfigOps[Self <: StreamConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudio(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAudioSource(value: MediaStreamTrack): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioSource")(js.undefined)
        ret
    }
    @scala.inline
    def withCameraId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cameraId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCameraId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cameraId")(js.undefined)
        ret
    }
    @scala.inline
    def withFacingMode(value: user | environment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFacingMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facingMode")(js.undefined)
        ret
    }
    @scala.inline
    def withMicrophoneId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("microphoneId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMicrophoneId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("microphoneId")(js.undefined)
        ret
    }
    @scala.inline
    def withMirror(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mirror")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMirror: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mirror")(js.undefined)
        ret
    }
    @scala.inline
    def withScreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screen")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoSource(value: MediaStreamTrack): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoSource")(js.undefined)
        ret
    }
  }
  
}

