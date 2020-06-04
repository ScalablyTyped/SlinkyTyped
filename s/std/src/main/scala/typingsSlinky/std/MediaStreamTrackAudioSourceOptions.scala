package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaStreamTrackAudioSourceOptions extends js.Object {
  var mediaStreamTrack: org.scalajs.dom.experimental.mediastream.MediaStreamTrack
}

object MediaStreamTrackAudioSourceOptions {
  @scala.inline
  def apply(mediaStreamTrack: org.scalajs.dom.experimental.mediastream.MediaStreamTrack): MediaStreamTrackAudioSourceOptions = {
    val __obj = js.Dynamic.literal(mediaStreamTrack = mediaStreamTrack.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamTrackAudioSourceOptions]
  }
  @scala.inline
  implicit class MediaStreamTrackAudioSourceOptionsOps[Self <: MediaStreamTrackAudioSourceOptions] (val x: Self) extends AnyVal {
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
    def setMediaStreamTrack(value: org.scalajs.dom.experimental.mediastream.MediaStreamTrack): Self = this.set("mediaStreamTrack", value.asInstanceOf[js.Any])
  }
  
}

