package typingsSlinky.slickgrid.Slick.Controls

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SlickColumnPickerOptions extends js.Object {
  var fadeSpeed: js.UndefOr[Double] = js.native
}

object SlickColumnPickerOptions {
  @scala.inline
  def apply(): SlickColumnPickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlickColumnPickerOptions]
  }
  @scala.inline
  implicit class SlickColumnPickerOptionsOps[Self <: SlickColumnPickerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFadeSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fadeSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFadeSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fadeSpeed")(js.undefined)
        ret
    }
  }
  
}

