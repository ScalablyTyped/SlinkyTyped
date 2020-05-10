package typingsSlinky.titanium.Titanium.Media

import typingsSlinky.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioPlayerEventMap extends ProxyEventMap {
  var change: AudioPlayerChangeEvent = js.native
  var complete: AudioPlayerCompleteEvent = js.native
  var error: AudioPlayerErrorEvent = js.native
  var metadata: AudioPlayerMetadataEvent = js.native
  var progress: AudioPlayerProgressEvent = js.native
  var seek: AudioPlayerSeekEvent = js.native
}

object AudioPlayerEventMap {
  @scala.inline
  def apply(
    change: AudioPlayerChangeEvent,
    complete: AudioPlayerCompleteEvent,
    error: AudioPlayerErrorEvent,
    metadata: AudioPlayerMetadataEvent,
    progress: AudioPlayerProgressEvent,
    seek: AudioPlayerSeekEvent
  ): AudioPlayerEventMap = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], seek = seek.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioPlayerEventMap]
  }
  @scala.inline
  implicit class AudioPlayerEventMapOps[Self <: AudioPlayerEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChange(value: AudioPlayerChangeEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComplete(value: AudioPlayerCompleteEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: AudioPlayerErrorEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: AudioPlayerMetadataEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgress(value: AudioPlayerProgressEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeek(value: AudioPlayerSeekEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seek")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

