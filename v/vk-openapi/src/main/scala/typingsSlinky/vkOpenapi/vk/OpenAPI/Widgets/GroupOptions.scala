package typingsSlinky.vkOpenapi.vk.OpenAPI.Widgets

import typingsSlinky.vkOpenapi.vk.OpenAPI.NumericBoolean
import typingsSlinky.vkOpenapi.vkOpenapiNumbers.`1`
import typingsSlinky.vkOpenapi.vkOpenapiNumbers.`3`
import typingsSlinky.vkOpenapi.vkOpenapiNumbers.`4`
import typingsSlinky.vkOpenapi.vkOpenapiStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupOptions extends js.Object {
  var color1: js.UndefOr[String] = js.native
  var color2: js.UndefOr[String] = js.native
  var color3: js.UndefOr[String] = js.native
  var height: js.UndefOr[Double] = js.native
  var mode: js.UndefOr[`1` | `3` | `4`] = js.native
  var no_cover: js.UndefOr[NumericBoolean] = js.native
  var wide: js.UndefOr[NumericBoolean] = js.native
  var width: js.UndefOr[Double | auto] = js.native
}

object GroupOptions {
  @scala.inline
  def apply(): GroupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupOptions]
  }
  @scala.inline
  implicit class GroupOptionsOps[Self <: GroupOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color1")(js.undefined)
        ret
    }
    @scala.inline
    def withColor2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color2")(js.undefined)
        ret
    }
    @scala.inline
    def withColor3(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color3")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: `1` | `3` | `4`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withNo_cover(value: NumericBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no_cover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNo_cover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no_cover")(js.undefined)
        ret
    }
    @scala.inline
    def withWide(value: NumericBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wide")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

