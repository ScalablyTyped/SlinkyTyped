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
}

