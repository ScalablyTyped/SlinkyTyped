package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaStreamConstraints extends js.Object {
  var audio: js.UndefOr[scala.Boolean | org.scalajs.dom.experimental.mediastream.MediaTrackConstraints] = js.native
  var peerIdentity: js.UndefOr[java.lang.String] = js.native
  var video: js.UndefOr[scala.Boolean | org.scalajs.dom.experimental.mediastream.MediaTrackConstraints] = js.native
}

object MediaStreamConstraints {
  @scala.inline
  def apply(): MediaStreamConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaStreamConstraints]
  }
  @scala.inline
  implicit class MediaStreamConstraintsOps[Self <: org.scalajs.dom.experimental.mediastream.MediaStreamConstraints] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudioMediaTrackConstraints(value: org.scalajs.dom.experimental.mediastream.MediaTrackConstraints): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAudio(value: scala.Boolean | org.scalajs.dom.experimental.mediastream.MediaTrackConstraints): Self = {
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
    def withPeerIdentity(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerIdentity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeerIdentity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerIdentity")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoMediaTrackConstraints(value: org.scalajs.dom.experimental.mediastream.MediaTrackConstraints): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideo(value: scala.Boolean | org.scalajs.dom.experimental.mediastream.MediaTrackConstraints): Self = {
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

