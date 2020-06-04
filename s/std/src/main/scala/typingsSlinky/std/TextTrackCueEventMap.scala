package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextTrackCueEventMap extends js.Object {
  var enter: org.scalajs.dom.raw.Event
  var exit: org.scalajs.dom.raw.Event
}

object TextTrackCueEventMap {
  @scala.inline
  def apply(enter: org.scalajs.dom.raw.Event, exit: org.scalajs.dom.raw.Event): TextTrackCueEventMap = {
    val __obj = js.Dynamic.literal(enter = enter.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextTrackCueEventMap]
  }
  @scala.inline
  implicit class TextTrackCueEventMapOps[Self <: TextTrackCueEventMap] (val x: Self) extends AnyVal {
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
    def setEnter(value: org.scalajs.dom.raw.Event): Self = this.set("enter", value.asInstanceOf[js.Any])
    @scala.inline
    def setExit(value: org.scalajs.dom.raw.Event): Self = this.set("exit", value.asInstanceOf[js.Any])
  }
  
}

