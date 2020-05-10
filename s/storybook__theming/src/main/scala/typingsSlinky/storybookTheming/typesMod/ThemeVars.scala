package typingsSlinky.storybookTheming.typesMod

import typingsSlinky.storybookTheming.storybookThemingStrings.dark
import typingsSlinky.storybookTheming.storybookThemingStrings.light
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemeVars extends js.Object {
  var appBg: js.UndefOr[String] = js.native
  var appBorderColor: js.UndefOr[String] = js.native
  var appBorderRadius: js.UndefOr[Double] = js.native
  var appContentBg: js.UndefOr[String] = js.native
  var barBg: js.UndefOr[String] = js.native
  var barSelectedColor: js.UndefOr[String] = js.native
  var barTextColor: js.UndefOr[String] = js.native
  var base: light | dark = js.native
  var brandImage: js.UndefOr[String] = js.native
  var brandTitle: js.UndefOr[String] = js.native
  var brandUrl: js.UndefOr[String] = js.native
  var colorPrimary: js.UndefOr[String] = js.native
  var colorSecondary: js.UndefOr[String] = js.native
  var fontBase: js.UndefOr[String] = js.native
  var fontCode: js.UndefOr[String] = js.native
  var gridCellSize: js.UndefOr[Double] = js.native
  var inputBg: js.UndefOr[String] = js.native
  var inputBorder: js.UndefOr[String] = js.native
  var inputBorderRadius: js.UndefOr[Double] = js.native
  var inputTextColor: js.UndefOr[String] = js.native
  var textColor: js.UndefOr[String] = js.native
  var textInverseColor: js.UndefOr[String] = js.native
}

object ThemeVars {
  @scala.inline
  def apply(base: light | dark): ThemeVars = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeVars]
  }
  @scala.inline
  implicit class ThemeVarsOps[Self <: ThemeVars] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBase(value: light | dark): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppBg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appBg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppBg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appBg")(js.undefined)
        ret
    }
    @scala.inline
    def withAppBorderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appBorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appBorderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withAppBorderRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appBorderRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppBorderRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appBorderRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withAppContentBg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appContentBg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppContentBg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appContentBg")(js.undefined)
        ret
    }
    @scala.inline
    def withBarBg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barBg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarBg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barBg")(js.undefined)
        ret
    }
    @scala.inline
    def withBarSelectedColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barSelectedColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarSelectedColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barSelectedColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBarTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barTextColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBrandImage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brandImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrandImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brandImage")(js.undefined)
        ret
    }
    @scala.inline
    def withBrandTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brandTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrandTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brandTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withBrandUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brandUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrandUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brandUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withColorPrimary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorPrimary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorPrimary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorPrimary")(js.undefined)
        ret
    }
    @scala.inline
    def withColorSecondary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorSecondary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorSecondary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorSecondary")(js.undefined)
        ret
    }
    @scala.inline
    def withFontBase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontBase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontBase")(js.undefined)
        ret
    }
    @scala.inline
    def withFontCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontCode")(js.undefined)
        ret
    }
    @scala.inline
    def withGridCellSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridCellSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridCellSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridCellSize")(js.undefined)
        ret
    }
    @scala.inline
    def withInputBg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputBg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputBg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputBg")(js.undefined)
        ret
    }
    @scala.inline
    def withInputBorder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputBorder")(js.undefined)
        ret
    }
    @scala.inline
    def withInputBorderRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputBorderRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputBorderRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputBorderRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withInputTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputTextColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTextInverseColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textInverseColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextInverseColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textInverseColor")(js.undefined)
        ret
    }
  }
  
}

