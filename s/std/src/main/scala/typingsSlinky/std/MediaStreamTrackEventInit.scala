package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaStreamTrackEventInit extends EventInit {
  var track: org.scalajs.dom.experimental.mediastream.MediaStreamTrack
}

object MediaStreamTrackEventInit {
  @scala.inline
  def apply(
    track: org.scalajs.dom.experimental.mediastream.MediaStreamTrack,
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined
  ): MediaStreamTrackEventInit = {
    val __obj = js.Dynamic.literal(track = track.asInstanceOf[js.Any])
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamTrackEventInit]
  }
}

