package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextTrackListEventMap extends js.Object {
  var addtrack: org.scalajs.dom.raw.TrackEvent = js.native
  var change: org.scalajs.dom.raw.Event = js.native
  var removetrack: org.scalajs.dom.raw.TrackEvent = js.native
}

object TextTrackListEventMap {
  @scala.inline
  def apply(
    addtrack: org.scalajs.dom.raw.TrackEvent,
    change: org.scalajs.dom.raw.Event,
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
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddtrack(value: org.scalajs.dom.raw.TrackEvent): Self = this.set("addtrack", value.asInstanceOf[js.Any])
    @scala.inline
    def setChange(value: org.scalajs.dom.raw.Event): Self = this.set("change", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemovetrack(value: org.scalajs.dom.raw.TrackEvent): Self = this.set("removetrack", value.asInstanceOf[js.Any])
  }
  
}

