package typingsSlinky.sipJs.simpleUserOptionsMod

import org.scalajs.dom.raw.HTMLAudioElement
import org.scalajs.dom.raw.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleUserMediaRemote extends js.Object {
  /** The remote audio media stream is attached to this element. */
  var audio: js.UndefOr[HTMLAudioElement] = js.native
  /** The remote video media stream is attached to this element. */
  var video: js.UndefOr[HTMLVideoElement] = js.native
}

object SimpleUserMediaRemote {
  @scala.inline
  def apply(): SimpleUserMediaRemote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimpleUserMediaRemote]
  }
  @scala.inline
  implicit class SimpleUserMediaRemoteOps[Self <: SimpleUserMediaRemote] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudio(value: HTMLAudioElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audio")(js.undefined)
        ret
    }
    @scala.inline
    def withVideo(value: HTMLVideoElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video")(js.undefined)
        ret
    }
  }
  
}

