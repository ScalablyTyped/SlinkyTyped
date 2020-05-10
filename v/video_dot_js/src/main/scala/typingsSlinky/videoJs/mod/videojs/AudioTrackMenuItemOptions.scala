package typingsSlinky.videoJs.mod.videojs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioTrackMenuItemOptions extends MenuItemOptions {
  var track: js.UndefOr[VideojsAudioTrack] = js.native
}

object AudioTrackMenuItemOptions {
  @scala.inline
  def apply(): AudioTrackMenuItemOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioTrackMenuItemOptions]
  }
  @scala.inline
  implicit class AudioTrackMenuItemOptionsOps[Self <: AudioTrackMenuItemOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTrack(value: VideojsAudioTrack): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("track")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("track")(js.undefined)
        ret
    }
  }
  
}

