package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrackEventInit extends EventInit {
  var track: js.UndefOr[
    VideoTrack | org.scalajs.dom.raw.AudioTrack | org.scalajs.dom.raw.TextTrack | Null
  ] = js.undefined
}

object TrackEventInit {
  @scala.inline
  def apply(
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined,
    track: VideoTrack | org.scalajs.dom.raw.AudioTrack | org.scalajs.dom.raw.TextTrack = null
  ): TrackEventInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.asInstanceOf[js.Any])
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed.asInstanceOf[js.Any])
    if (track != null) __obj.updateDynamic("track")(track.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackEventInit]
  }
}

