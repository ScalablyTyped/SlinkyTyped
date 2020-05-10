package typingsSlinky.uifabricStyling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@uifabric/styling.@uifabric/styling/lib/interfaces/IPalette.IPalette> */
@js.native
trait PartialIPalette extends js.Object {
  var accent: js.UndefOr[String] = js.native
  var black: js.UndefOr[String] = js.native
  var blackTranslucent40: js.UndefOr[String] = js.native
  var blue: js.UndefOr[String] = js.native
  var blueDark: js.UndefOr[String] = js.native
  var blueLight: js.UndefOr[String] = js.native
  var blueMid: js.UndefOr[String] = js.native
  var green: js.UndefOr[String] = js.native
  var greenDark: js.UndefOr[String] = js.native
  var greenLight: js.UndefOr[String] = js.native
  var magenta: js.UndefOr[String] = js.native
  var magentaDark: js.UndefOr[String] = js.native
  var magentaLight: js.UndefOr[String] = js.native
  var neutralDark: js.UndefOr[String] = js.native
  var neutralLight: js.UndefOr[String] = js.native
  var neutralLighter: js.UndefOr[String] = js.native
  var neutralLighterAlt: js.UndefOr[String] = js.native
  var neutralPrimary: js.UndefOr[String] = js.native
  var neutralPrimaryAlt: js.UndefOr[String] = js.native
  var neutralQuaternary: js.UndefOr[String] = js.native
  var neutralQuaternaryAlt: js.UndefOr[String] = js.native
  var neutralSecondary: js.UndefOr[String] = js.native
  var neutralSecondaryAlt: js.UndefOr[String] = js.native
  var neutralTertiary: js.UndefOr[String] = js.native
  var neutralTertiaryAlt: js.UndefOr[String] = js.native
  var orange: js.UndefOr[String] = js.native
  var orangeLight: js.UndefOr[String] = js.native
  var orangeLighter: js.UndefOr[String] = js.native
  var purple: js.UndefOr[String] = js.native
  var purpleDark: js.UndefOr[String] = js.native
  var purpleLight: js.UndefOr[String] = js.native
  var red: js.UndefOr[String] = js.native
  var redDark: js.UndefOr[String] = js.native
  var teal: js.UndefOr[String] = js.native
  var tealDark: js.UndefOr[String] = js.native
  var tealLight: js.UndefOr[String] = js.native
  var themeDark: js.UndefOr[String] = js.native
  var themeDarkAlt: js.UndefOr[String] = js.native
  var themeDarker: js.UndefOr[String] = js.native
  var themeLight: js.UndefOr[String] = js.native
  var themeLighter: js.UndefOr[String] = js.native
  var themeLighterAlt: js.UndefOr[String] = js.native
  var themePrimary: js.UndefOr[String] = js.native
  var themeSecondary: js.UndefOr[String] = js.native
  var themeTertiary: js.UndefOr[String] = js.native
  var white: js.UndefOr[String] = js.native
  var whiteTranslucent40: js.UndefOr[String] = js.native
  var yellow: js.UndefOr[String] = js.native
  var yellowDark: js.UndefOr[String] = js.native
  var yellowLight: js.UndefOr[String] = js.native
}

object PartialIPalette {
  @scala.inline
  def apply(): PartialIPalette = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIPalette]
  }
  @scala.inline
  implicit class PartialIPaletteOps[Self <: PartialIPalette] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accent")(js.undefined)
        ret
    }
    @scala.inline
    def withBlack(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("black")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("black")(js.undefined)
        ret
    }
    @scala.inline
    def withBlackTranslucent40(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blackTranslucent40")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlackTranslucent40: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blackTranslucent40")(js.undefined)
        ret
    }
    @scala.inline
    def withBlue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blue")(js.undefined)
        ret
    }
    @scala.inline
    def withBlueDark(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blueDark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlueDark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blueDark")(js.undefined)
        ret
    }
    @scala.inline
    def withBlueLight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blueLight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlueLight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blueLight")(js.undefined)
        ret
    }
    @scala.inline
    def withBlueMid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blueMid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlueMid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blueMid")(js.undefined)
        ret
    }
    @scala.inline
    def withGreen(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("green")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("green")(js.undefined)
        ret
    }
    @scala.inline
    def withGreenDark(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greenDark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGreenDark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greenDark")(js.undefined)
        ret
    }
    @scala.inline
    def withGreenLight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greenLight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGreenLight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greenLight")(js.undefined)
        ret
    }
    @scala.inline
    def withMagenta(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magenta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMagenta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magenta")(js.undefined)
        ret
    }
    @scala.inline
    def withMagentaDark(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magentaDark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMagentaDark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magentaDark")(js.undefined)
        ret
    }
    @scala.inline
    def withMagentaLight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magentaLight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMagentaLight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magentaLight")(js.undefined)
        ret
    }
    @scala.inline
    def withNeutralDark(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neutralDark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeutralDark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neutralDark")(js.undefined)
        ret
    }
    @scala.inline
    def withNeutralLight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neutralLight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeutralLight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neutralLight")(js.undefined)
        ret
    }
    @scala.inline
    def withNeutralLighter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neutralLighter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeutralLighter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neutralLighter")(js.undefined)
        ret
    }
    @scala.inline
    def withNeutralLighterAlt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neutralLighterAlt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeutralLighterAlt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neutralLighterAlt")(js.undefined)
        ret
    }
    @scala.inline
    def withNeutralPrimary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neutralPrimary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeutralPrimary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neutralPrimary")(js.undefined)
        ret
    }
    @scala.inline
    def withNeutralPrimaryAlt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neutralPrimaryAlt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeutralPrimaryAlt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neutralPrimaryAlt")(js.undefined)
        ret
    }
    @scala.inline
    def withNeutralQuaternary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neutralQuaternary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeutralQuaternary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neutralQuaternary")(js.undefined)
        ret
    }
    @scala.inline
    def withNeutralQuaternaryAlt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neutralQuaternaryAlt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeutralQuaternaryAlt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neutralQuaternaryAlt")(js.undefined)
        ret
    }
    @scala.inline
    def withNeutralSecondary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neutralSecondary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeutralSecondary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neutralSecondary")(js.undefined)
        ret
    }
    @scala.inline
    def withNeutralSecondaryAlt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neutralSecondaryAlt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeutralSecondaryAlt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neutralSecondaryAlt")(js.undefined)
        ret
    }
    @scala.inline
    def withNeutralTertiary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neutralTertiary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeutralTertiary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neutralTertiary")(js.undefined)
        ret
    }
    @scala.inline
    def withNeutralTertiaryAlt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neutralTertiaryAlt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeutralTertiaryAlt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neutralTertiaryAlt")(js.undefined)
        ret
    }
    @scala.inline
    def withOrange(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orange")(js.undefined)
        ret
    }
    @scala.inline
    def withOrangeLight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orangeLight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrangeLight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orangeLight")(js.undefined)
        ret
    }
    @scala.inline
    def withOrangeLighter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orangeLighter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrangeLighter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orangeLighter")(js.undefined)
        ret
    }
    @scala.inline
    def withPurple(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPurple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purple")(js.undefined)
        ret
    }
    @scala.inline
    def withPurpleDark(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purpleDark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPurpleDark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purpleDark")(js.undefined)
        ret
    }
    @scala.inline
    def withPurpleLight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purpleLight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPurpleLight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purpleLight")(js.undefined)
        ret
    }
    @scala.inline
    def withRed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("red")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("red")(js.undefined)
        ret
    }
    @scala.inline
    def withRedDark(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redDark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedDark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redDark")(js.undefined)
        ret
    }
    @scala.inline
    def withTeal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTeal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teal")(js.undefined)
        ret
    }
    @scala.inline
    def withTealDark(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tealDark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTealDark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tealDark")(js.undefined)
        ret
    }
    @scala.inline
    def withTealLight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tealLight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTealLight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tealLight")(js.undefined)
        ret
    }
    @scala.inline
    def withThemeDark(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themeDark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThemeDark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themeDark")(js.undefined)
        ret
    }
    @scala.inline
    def withThemeDarkAlt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themeDarkAlt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThemeDarkAlt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themeDarkAlt")(js.undefined)
        ret
    }
    @scala.inline
    def withThemeDarker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themeDarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThemeDarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themeDarker")(js.undefined)
        ret
    }
    @scala.inline
    def withThemeLight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themeLight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThemeLight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themeLight")(js.undefined)
        ret
    }
    @scala.inline
    def withThemeLighter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themeLighter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThemeLighter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themeLighter")(js.undefined)
        ret
    }
    @scala.inline
    def withThemeLighterAlt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themeLighterAlt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThemeLighterAlt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themeLighterAlt")(js.undefined)
        ret
    }
    @scala.inline
    def withThemePrimary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themePrimary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThemePrimary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themePrimary")(js.undefined)
        ret
    }
    @scala.inline
    def withThemeSecondary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themeSecondary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThemeSecondary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themeSecondary")(js.undefined)
        ret
    }
    @scala.inline
    def withThemeTertiary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themeTertiary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThemeTertiary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themeTertiary")(js.undefined)
        ret
    }
    @scala.inline
    def withWhite(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("white")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("white")(js.undefined)
        ret
    }
    @scala.inline
    def withWhiteTranslucent40(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whiteTranslucent40")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhiteTranslucent40: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whiteTranslucent40")(js.undefined)
        ret
    }
    @scala.inline
    def withYellow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yellow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYellow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yellow")(js.undefined)
        ret
    }
    @scala.inline
    def withYellowDark(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yellowDark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYellowDark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yellowDark")(js.undefined)
        ret
    }
    @scala.inline
    def withYellowLight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yellowLight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYellowLight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yellowLight")(js.undefined)
        ret
    }
  }
  
}

