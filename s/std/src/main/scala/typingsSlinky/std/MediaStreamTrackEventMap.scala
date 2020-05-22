package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaStreamTrackEventMap extends js.Object {
  var ended: org.scalajs.dom.raw.Event
  var isolationchange: org.scalajs.dom.raw.Event
  var mute: org.scalajs.dom.raw.Event
  var unmute: org.scalajs.dom.raw.Event
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
}

