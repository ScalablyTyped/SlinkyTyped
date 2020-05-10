package typingsSlinky.videoJs.mod.videojs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ControlBarOptions extends ComponentOptions {
  var fullscreenToggle: js.UndefOr[Boolean] = js.native
  var volumePanel: js.UndefOr[VolumePanelOptions] = js.native
}

object ControlBarOptions {
  @scala.inline
  def apply(): ControlBarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ControlBarOptions]
  }
  @scala.inline
  implicit class ControlBarOptionsOps[Self <: ControlBarOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFullscreenToggle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreenToggle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullscreenToggle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreenToggle")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumePanel(value: VolumePanelOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumePanel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumePanel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumePanel")(js.undefined)
        ret
    }
  }
  
}

