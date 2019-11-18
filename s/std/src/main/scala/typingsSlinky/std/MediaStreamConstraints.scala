package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaStreamConstraints extends js.Object {
  var audio: js.UndefOr[scala.Boolean | org.scalajs.dom.experimental.mediastream.MediaTrackConstraints] = js.undefined
  var peerIdentity: js.UndefOr[java.lang.String] = js.undefined
  var video: js.UndefOr[scala.Boolean | org.scalajs.dom.experimental.mediastream.MediaTrackConstraints] = js.undefined
}

object MediaStreamConstraints {
  @scala.inline
  def apply(
    audio: scala.Boolean | org.scalajs.dom.experimental.mediastream.MediaTrackConstraints = null,
    peerIdentity: java.lang.String = null,
    video: scala.Boolean | org.scalajs.dom.experimental.mediastream.MediaTrackConstraints = null
  ): MediaStreamConstraints = {
    val __obj = js.Dynamic.literal()
    if (audio != null) __obj.updateDynamic("audio")(audio.asInstanceOf[js.Any])
    if (peerIdentity != null) __obj.updateDynamic("peerIdentity")(peerIdentity.asInstanceOf[js.Any])
    if (video != null) __obj.updateDynamic("video")(video.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamConstraints]
  }
}

