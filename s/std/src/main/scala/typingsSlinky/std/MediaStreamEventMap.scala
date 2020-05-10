package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaStreamEventMap extends js.Object {
  var addtrack: org.scalajs.dom.experimental.mediastream.MediaStreamTrackEvent = js.native
  var removetrack: org.scalajs.dom.experimental.mediastream.MediaStreamTrackEvent = js.native
}

object MediaStreamEventMap {
  @scala.inline
  def apply(
    addtrack: org.scalajs.dom.experimental.mediastream.MediaStreamTrackEvent,
    removetrack: org.scalajs.dom.experimental.mediastream.MediaStreamTrackEvent
  ): MediaStreamEventMap = {
    val __obj = js.Dynamic.literal(addtrack = addtrack.asInstanceOf[js.Any], removetrack = removetrack.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamEventMap]
  }
  @scala.inline
  implicit class MediaStreamEventMapOps[Self <: MediaStreamEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddtrack(value: org.scalajs.dom.experimental.mediastream.MediaStreamTrackEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addtrack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemovetrack(value: org.scalajs.dom.experimental.mediastream.MediaStreamTrackEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removetrack")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

