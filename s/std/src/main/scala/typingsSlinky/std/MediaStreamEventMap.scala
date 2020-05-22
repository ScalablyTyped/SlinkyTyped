package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaStreamEventMap extends js.Object {
  var addtrack: org.scalajs.dom.experimental.mediastream.MediaStreamTrackEvent
  var removetrack: org.scalajs.dom.experimental.mediastream.MediaStreamTrackEvent
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
}

