package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaStreamTrackEventMap extends js.Object {
  var ended: org.scalajs.dom.raw.Event = js.native
  var isolationchange: org.scalajs.dom.raw.Event = js.native
  var mute: org.scalajs.dom.raw.Event = js.native
  var unmute: org.scalajs.dom.raw.Event = js.native
}

object MediaStreamTrackEventMap {
  @scala.inline
  def apply(
    ended: org.scalajs.dom.raw.Event,
    isolationchange: org.scalajs.dom.raw.Event,
    mute: org.scalajs.dom.raw.Event,
    unmute: org.scalajs.dom.raw.Event
  ): MediaStreamTrackEventMap = {
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
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEnded(value: org.scalajs.dom.raw.Event): Self = this.set("ended", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsolationchange(value: org.scalajs.dom.raw.Event): Self = this.set("isolationchange", value.asInstanceOf[js.Any])
    @scala.inline
    def setMute(value: org.scalajs.dom.raw.Event): Self = this.set("mute", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnmute(value: org.scalajs.dom.raw.Event): Self = this.set("unmute", value.asInstanceOf[js.Any])
  }
  
}

