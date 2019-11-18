package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextTrackEventMap extends js.Object {
  var cuechange: org.scalajs.dom.raw.Event
  var error: org.scalajs.dom.raw.Event
  var load: org.scalajs.dom.raw.Event
}

object TextTrackEventMap {
  @scala.inline
  def apply(
    cuechange: org.scalajs.dom.raw.Event,
    error: org.scalajs.dom.raw.Event,
    load: org.scalajs.dom.raw.Event
  ): TextTrackEventMap = {
    val __obj = js.Dynamic.literal(cuechange = cuechange.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TextTrackEventMap]
  }
}

