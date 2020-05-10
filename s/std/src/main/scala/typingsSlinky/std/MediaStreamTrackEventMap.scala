package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaStreamTrackEventMap extends js.Object {
  var ended: Event_ = js.native
  var isolationchange: Event_ = js.native
  var mute: Event_ = js.native
  var unmute: Event_ = js.native
}

object MediaStreamTrackEventMap {
  @scala.inline
  def apply(ended: Event_, isolationchange: Event_, mute: Event_, unmute: Event_): MediaStreamTrackEventMap = {
    val __obj = js.Dynamic.literal(ended = ended.asInstanceOf[js.Any], isolationchange = isolationchange.asInstanceOf[js.Any], mute = mute.asInstanceOf[js.Any], unmute = unmute.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamTrackEventMap]
  }
  @scala.inline
  implicit class MediaStreamTrackEventMapOps[Self <: MediaStreamTrackEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnded(value: Event_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ended")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsolationchange(value: Event_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isolationchange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMute(value: Event_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnmute(value: Event_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmute")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

