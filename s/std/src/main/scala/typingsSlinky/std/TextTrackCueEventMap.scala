package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextTrackCueEventMap extends js.Object {
  var enter: org.scalajs.dom.raw.Event = js.native
  var exit: org.scalajs.dom.raw.Event = js.native
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
    def withEnter(value: org.scalajs.dom.raw.Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExit(value: org.scalajs.dom.raw.Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exit")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

