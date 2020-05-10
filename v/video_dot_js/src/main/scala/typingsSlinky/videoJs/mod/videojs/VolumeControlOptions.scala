package typingsSlinky.videoJs.mod.videojs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VolumeControlOptions extends ComponentOptions {
  var vertical: js.UndefOr[Boolean] = js.native
  var volumeBar: js.UndefOr[VolumeBar] = js.native
}

object VolumeControlOptions {
  @scala.inline
  def apply(): VolumeControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeControlOptions]
  }
  @scala.inline
  implicit class VolumeControlOptionsOps[Self <: VolumeControlOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVertical(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumeBar(value: VolumeBar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeBar")(js.undefined)
        ret
    }
  }
  
}

