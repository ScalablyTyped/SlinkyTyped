package typingsSlinky.videoJs.mod.videojs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VolumePanelOptions extends ComponentOptions {
  var `inline`: js.UndefOr[Boolean] = js.native
  var volumeControl: js.UndefOr[VolumeControlOptions] = js.native
}

object VolumePanelOptions {
  @scala.inline
  def apply(): VolumePanelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumePanelOptions]
  }
  @scala.inline
  implicit class VolumePanelOptionsOps[Self <: VolumePanelOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumeControl(value: VolumeControlOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeControl")(js.undefined)
        ret
    }
  }
  
}

