package typingsSlinky.twilioVideo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogLevels extends js.Object {
  var default: LogLevel = js.native
  var media: LogLevel = js.native
  var signaling: LogLevel = js.native
  var webrtc: LogLevel = js.native
}

object LogLevels {
  @scala.inline
  def apply(default: LogLevel, media: LogLevel, signaling: LogLevel, webrtc: LogLevel): LogLevels = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], signaling = signaling.asInstanceOf[js.Any], webrtc = webrtc.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogLevels]
  }
  @scala.inline
  implicit class LogLevelsOps[Self <: LogLevels] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefault(value: LogLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMedia(value: LogLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignaling(value: LogLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signaling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebrtc(value: LogLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webrtc")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

