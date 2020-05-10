package typingsSlinky.videoJs.mod.videojs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SliderOptions extends ComponentOptions {
  /**
    * Set property names to bar to match with the child Slider class is looking for
    */
  var barName: js.UndefOr[String] = js.native
  /**
    * Set a horizontal or vertical class on the slider depending on the slider type
    */
  var vertical: js.UndefOr[Boolean] = js.native
}

object SliderOptions {
  @scala.inline
  def apply(): SliderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderOptions]
  }
  @scala.inline
  implicit class SliderOptionsOps[Self <: SliderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBarName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barName")(js.undefined)
        ret
    }
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
  }
  
}

