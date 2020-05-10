package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextTrackListEventMap extends js.Object {
  var addtrack: org.scalajs.dom.raw.TrackEvent = js.native
  var change: Event_ = js.native
  var removetrack: org.scalajs.dom.raw.TrackEvent = js.native
}

object TextTrackListEventMap {
  @scala.inline
  def apply(
    addtrack: org.scalajs.dom.raw.TrackEvent,
    change: Event_,
    removetrack: org.scalajs.dom.raw.TrackEvent
  ): TextTrackListEventMap = {
    val __obj = js.Dynamic.literal(addtrack = addtrack.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], removetrack = removetrack.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextTrackListEventMap]
  }
  @scala.inline
  implicit class TextTrackListEventMapOps[Self <: TextTrackListEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddtrack(value: org.scalajs.dom.raw.TrackEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addtrack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChange(value: Event_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemovetrack(value: org.scalajs.dom.raw.TrackEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removetrack")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

