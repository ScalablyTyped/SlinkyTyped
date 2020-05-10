package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrackEventInit extends EventInit {
  var track: js.UndefOr[
    VideoTrack | org.scalajs.dom.raw.AudioTrack | org.scalajs.dom.raw.TextTrack | Null
  ] = js.native
}

object TrackEventInit {
  @scala.inline
  def apply(): TrackEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrackEventInit]
  }
  @scala.inline
  implicit class TrackEventInitOps[Self <: TrackEventInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTrackAudioTrack(value: org.scalajs.dom.raw.AudioTrack): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("track")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrackTextTrack(value: org.scalajs.dom.raw.TextTrack): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("track")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrack(value: VideoTrack | org.scalajs.dom.raw.AudioTrack | org.scalajs.dom.raw.TextTrack): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("track")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("track")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("track")(null)
        ret
    }
  }
  
}

