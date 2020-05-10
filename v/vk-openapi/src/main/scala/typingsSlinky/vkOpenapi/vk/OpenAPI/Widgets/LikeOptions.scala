package typingsSlinky.vkOpenapi.vk.OpenAPI.Widgets

import typingsSlinky.vkOpenapi.vk.OpenAPI.NumericBoolean
import typingsSlinky.vkOpenapi.vkOpenapiNumbers.`18`
import typingsSlinky.vkOpenapi.vkOpenapiNumbers.`20`
import typingsSlinky.vkOpenapi.vkOpenapiNumbers.`22`
import typingsSlinky.vkOpenapi.vkOpenapiNumbers.`24`
import typingsSlinky.vkOpenapi.vkOpenapiNumbers.`30`
import typingsSlinky.vkOpenapi.vkOpenapiStrings.button
import typingsSlinky.vkOpenapi.vkOpenapiStrings.full
import typingsSlinky.vkOpenapi.vkOpenapiStrings.mini
import typingsSlinky.vkOpenapi.vkOpenapiStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LikeOptions extends js.Object {
  var height: js.UndefOr[`18` | `20` | `22` | `24` | `30`] = js.native
  var pageImage: js.UndefOr[String] = js.native
  var pageTitle: js.UndefOr[String] = js.native
  var pageUrl: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[button | mini | vertical | full] = js.native
  var verb: js.UndefOr[NumericBoolean] = js.native
  var width: js.UndefOr[Double] = js.native
}

object LikeOptions {
  @scala.inline
  def apply(): LikeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LikeOptions]
  }
  @scala.inline
  implicit class LikeOptionsOps[Self <: LikeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: `18` | `20` | `22` | `24` | `30`): Self = {
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
    def withPageImage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageImage")(js.undefined)
        ret
    }
    @scala.inline
    def withPageTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withPageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: button | mini | vertical | full): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withVerb(value: NumericBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verb")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
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

