package typingsSlinky.storybookTheming.typesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.storybookTheming.AnonBorder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Theme
  extends /* key */ StringDictionary[js.Any] {
  var animation: Animation = js.native
  var appBorderColor: String = js.native
  var appBorderRadius: Double = js.native
  var background: Background = js.native
  var barBg: String = js.native
  var barSelectedColor: String = js.native
  var barTextColor: String = js.native
  var brand: Brand = js.native
  var code: StringDictionary[String | js.Object] = js.native
  var color: Color = js.native
  var easing: Easing = js.native
  var input: AnonBorder = js.native
  var layoutMargin: Double = js.native
  var typography: Typography = js.native
}

object Theme {
  @scala.inline
  def apply(
    animation: Animation,
    appBorderColor: String,
    appBorderRadius: Double,
    background: Background,
    barBg: String,
    barSelectedColor: String,
    barTextColor: String,
    brand: Brand,
    code: StringDictionary[String | js.Object],
    color: Color,
    easing: Easing,
    input: AnonBorder,
    layoutMargin: Double,
    typography: Typography
  ): Theme = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], appBorderColor = appBorderColor.asInstanceOf[js.Any], appBorderRadius = appBorderRadius.asInstanceOf[js.Any], background = background.asInstanceOf[js.Any], barBg = barBg.asInstanceOf[js.Any], barSelectedColor = barSelectedColor.asInstanceOf[js.Any], barTextColor = barTextColor.asInstanceOf[js.Any], brand = brand.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], layoutMargin = layoutMargin.asInstanceOf[js.Any], typography = typography.asInstanceOf[js.Any])
    __obj.asInstanceOf[Theme]
  }
  @scala.inline
  implicit class ThemeOps[Self <: Theme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimation(value: Animation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppBorderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appBorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppBorderRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appBorderRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackground(value: Background): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBarBg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barBg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBarSelectedColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barSelectedColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBarTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBrand(value: Brand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCode(value: StringDictionary[String | js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEasing(value: Easing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInput(value: AnonBorder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayoutMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypography(value: Typography): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typography")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

