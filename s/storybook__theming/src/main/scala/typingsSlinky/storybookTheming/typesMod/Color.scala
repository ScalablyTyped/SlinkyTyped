package typingsSlinky.storybookTheming.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Color extends js.Object {
  var ancillary: String = js.native
  var border: String = js.native
  var critical: String = js.native
  var dark: String = js.native
  var darker: String = js.native
  var darkest: String = js.native
  var defaultText: String = js.native
  var gold: String = js.native
  var green: String = js.native
  var inverseText: String = js.native
  var light: String = js.native
  var lighter: String = js.native
  var lightest: String = js.native
  var medium: String = js.native
  var mediumdark: String = js.native
  var mediumlight: String = js.native
  var negative: String = js.native
  var orange: String = js.native
  var positive: String = js.native
  var primary: String = js.native
  var purple: String = js.native
  var seafoam: String = js.native
  var secondary: String = js.native
  var tertiary: String = js.native
  var ultraviolet: String = js.native
  var warning: String = js.native
}

object Color {
  @scala.inline
  def apply(
    ancillary: String,
    border: String,
    critical: String,
    dark: String,
    darker: String,
    darkest: String,
    defaultText: String,
    gold: String,
    green: String,
    inverseText: String,
    light: String,
    lighter: String,
    lightest: String,
    medium: String,
    mediumdark: String,
    mediumlight: String,
    negative: String,
    orange: String,
    positive: String,
    primary: String,
    purple: String,
    seafoam: String,
    secondary: String,
    tertiary: String,
    ultraviolet: String,
    warning: String
  ): Color = {
    val __obj = js.Dynamic.literal(ancillary = ancillary.asInstanceOf[js.Any], border = border.asInstanceOf[js.Any], critical = critical.asInstanceOf[js.Any], dark = dark.asInstanceOf[js.Any], darker = darker.asInstanceOf[js.Any], darkest = darkest.asInstanceOf[js.Any], defaultText = defaultText.asInstanceOf[js.Any], gold = gold.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], inverseText = inverseText.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any], lighter = lighter.asInstanceOf[js.Any], lightest = lightest.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], mediumdark = mediumdark.asInstanceOf[js.Any], mediumlight = mediumlight.asInstanceOf[js.Any], negative = negative.asInstanceOf[js.Any], orange = orange.asInstanceOf[js.Any], positive = positive.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], purple = purple.asInstanceOf[js.Any], seafoam = seafoam.asInstanceOf[js.Any], secondary = secondary.asInstanceOf[js.Any], tertiary = tertiary.asInstanceOf[js.Any], ultraviolet = ultraviolet.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
  @scala.inline
  implicit class ColorOps[Self <: Color] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAncillary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ancillary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCritical(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("critical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDark(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDarker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("darker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDarkest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("darkest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGold(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGreen(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("green")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInverseText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverseText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("light")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLighter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lighter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLightest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMedium(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("medium")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMediumdark(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediumdark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMediumlight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediumlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNegative(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrange(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPositive(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPurple(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeafoam(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seafoam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecondary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTertiary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tertiary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUltraviolet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ultraviolet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarning(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

