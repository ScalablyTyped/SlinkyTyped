package typingsSlinky.winrt.Windows.Media

import typingsSlinky.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMediaControl extends js.Object {
  var albumArt: Uri = js.native
  var artistName: String = js.native
  var isPlaying: Boolean = js.native
  var onchanneldownpressed: js.Any = js.native
  var onchanneluppressed: js.Any = js.native
  var onfastforwardpressed: js.Any = js.native
  var onnexttrackpressed: js.Any = js.native
  var onpausepressed: js.Any = js.native
  var onplaypausetogglepressed: js.Any = js.native
  var onplaypressed: js.Any = js.native
  var onprevioustrackpressed: js.Any = js.native
  var onrecordpressed: js.Any = js.native
  var onrewindpressed: js.Any = js.native
  var onsoundlevelchanged: js.Any = js.native
  var onstoppressed: js.Any = js.native
  var soundLevel: SoundLevel = js.native
  var trackName: String = js.native
}

object IMediaControl {
  @scala.inline
  def apply(
    albumArt: Uri,
    artistName: String,
    isPlaying: Boolean,
    onchanneldownpressed: js.Any,
    onchanneluppressed: js.Any,
    onfastforwardpressed: js.Any,
    onnexttrackpressed: js.Any,
    onpausepressed: js.Any,
    onplaypausetogglepressed: js.Any,
    onplaypressed: js.Any,
    onprevioustrackpressed: js.Any,
    onrecordpressed: js.Any,
    onrewindpressed: js.Any,
    onsoundlevelchanged: js.Any,
    onstoppressed: js.Any,
    soundLevel: SoundLevel,
    trackName: String
  ): IMediaControl = {
    val __obj = js.Dynamic.literal(albumArt = albumArt.asInstanceOf[js.Any], artistName = artistName.asInstanceOf[js.Any], isPlaying = isPlaying.asInstanceOf[js.Any], onchanneldownpressed = onchanneldownpressed.asInstanceOf[js.Any], onchanneluppressed = onchanneluppressed.asInstanceOf[js.Any], onfastforwardpressed = onfastforwardpressed.asInstanceOf[js.Any], onnexttrackpressed = onnexttrackpressed.asInstanceOf[js.Any], onpausepressed = onpausepressed.asInstanceOf[js.Any], onplaypausetogglepressed = onplaypausetogglepressed.asInstanceOf[js.Any], onplaypressed = onplaypressed.asInstanceOf[js.Any], onprevioustrackpressed = onprevioustrackpressed.asInstanceOf[js.Any], onrecordpressed = onrecordpressed.asInstanceOf[js.Any], onrewindpressed = onrewindpressed.asInstanceOf[js.Any], onsoundlevelchanged = onsoundlevelchanged.asInstanceOf[js.Any], onstoppressed = onstoppressed.asInstanceOf[js.Any], soundLevel = soundLevel.asInstanceOf[js.Any], trackName = trackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMediaControl]
  }
  @scala.inline
  implicit class IMediaControlOps[Self <: IMediaControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlbumArt(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("albumArt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArtistName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artistName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsPlaying(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPlaying")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnchanneldownpressed(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onchanneldownpressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnchanneluppressed(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onchanneluppressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnfastforwardpressed(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onfastforwardpressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnnexttrackpressed(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onnexttrackpressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnpausepressed(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpausepressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnplaypausetogglepressed(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onplaypausetogglepressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnplaypressed(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onplaypressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnprevioustrackpressed(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onprevioustrackpressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnrecordpressed(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onrecordpressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnrewindpressed(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onrewindpressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnsoundlevelchanged(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onsoundlevelchanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnstoppressed(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onstoppressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSoundLevel(value: SoundLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("soundLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrackName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

