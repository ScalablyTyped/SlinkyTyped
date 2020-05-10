package typingsSlinky.themeUi.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.csstype.mod.BorderProperty
import typingsSlinky.csstype.mod.BorderRadiusProperty
import typingsSlinky.csstype.mod.BorderWidthProperty
import typingsSlinky.csstype.mod.BoxShadowProperty
import typingsSlinky.csstype.mod.FontFamilyProperty
import typingsSlinky.csstype.mod.FontSizeProperty
import typingsSlinky.csstype.mod.FontWeightProperty
import typingsSlinky.csstype.mod.HeightProperty
import typingsSlinky.csstype.mod.LetterSpacingProperty
import typingsSlinky.csstype.mod.LineHeightProperty
import typingsSlinky.csstype.mod.MarginProperty
import typingsSlinky.csstype.mod.StandardProperties
import typingsSlinky.csstype.mod.WidthProperty
import typingsSlinky.csstype.mod.ZIndexProperty
import typingsSlinky.styledSystem.mod.TLengthStyledSystem
import typingsSlinky.themeUi.ColorModemodeskstringColo
import typingsSlinky.themeUi.PinStyledTagsSystemStyleO
import typingsSlinky.themeUi.themeUiNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent theme-ui.theme-ui.Omit<styled-system.styled-system.Theme<styled-system.styled-system.TLengthStyledSystem>, 'colors'> */
@js.native
trait Theme extends js.Object {
  var borderStyles: js.UndefOr[
    typingsSlinky.styledSystem.mod.ObjectOrArray[BorderProperty[js.Object], /* keyof any */ String]
  ] = js.native
  var borderWidths: js.UndefOr[
    typingsSlinky.styledSystem.mod.ObjectOrArray[BorderWidthProperty[TLengthStyledSystem], /* keyof any */ String]
  ] = js.native
  var borders: js.UndefOr[
    typingsSlinky.styledSystem.mod.ObjectOrArray[BorderProperty[js.Object], /* keyof any */ String]
  ] = js.native
  var breakpoints: js.UndefOr[
    typingsSlinky.styledSystem.mod.ObjectOrArray[Double | String | js.Symbol, /* keyof any */ String]
  ] = js.native
  var buttons: js.UndefOr[
    typingsSlinky.styledSystem.mod.ObjectOrArray[StandardProperties[String | `0`], /* keyof any */ String]
  ] = js.native
  var colorStyles: js.UndefOr[
    typingsSlinky.styledSystem.mod.ObjectOrArray[StandardProperties[String | `0`], /* keyof any */ String]
  ] = js.native
  /**
    * Define the colors that are available through this theme
    */
  var colors: js.UndefOr[ColorModemodeskstringColo] = js.native
  var fontSizes: js.UndefOr[
    typingsSlinky.styledSystem.mod.ObjectOrArray[FontSizeProperty[Double], /* keyof any */ String]
  ] = js.native
  var fontWeights: js.UndefOr[
    typingsSlinky.styledSystem.mod.ObjectOrArray[FontWeightProperty, /* keyof any */ String]
  ] = js.native
  var fonts: js.UndefOr[
    typingsSlinky.styledSystem.mod.ObjectOrArray[FontFamilyProperty, /* keyof any */ String]
  ] = js.native
  /**
    * Provide a value here to enable color modes
    */
  var initialColorModeName: js.UndefOr[String] = js.native
  var letterSpacings: js.UndefOr[
    typingsSlinky.styledSystem.mod.ObjectOrArray[LetterSpacingProperty[TLengthStyledSystem], /* keyof any */ String]
  ] = js.native
  var lineHeights: js.UndefOr[
    typingsSlinky.styledSystem.mod.ObjectOrArray[LineHeightProperty[TLengthStyledSystem], /* keyof any */ String]
  ] = js.native
  var mediaQueries: js.UndefOr[StringDictionary[String]] = js.native
  var radii: js.UndefOr[
    typingsSlinky.styledSystem.mod.ObjectOrArray[BorderRadiusProperty[TLengthStyledSystem], /* keyof any */ String]
  ] = js.native
  var shadows: js.UndefOr[
    typingsSlinky.styledSystem.mod.ObjectOrArray[BoxShadowProperty, /* keyof any */ String]
  ] = js.native
  var sizes: js.UndefOr[
    typingsSlinky.styledSystem.mod.ObjectOrArray[HeightProperty[js.Object] | WidthProperty[js.Object], /* keyof any */ String]
  ] = js.native
  var space: js.UndefOr[
    typingsSlinky.styledSystem.mod.ObjectOrArray[MarginProperty[Double | String], /* keyof any */ String]
  ] = js.native
  /**
    * Styles for elements rendered in MDX can be added to the theme.styles
    * object. This is the primary, low-level way to control typographic and
    * other styles in markdown content. Styles within this object are processed
    * with @styled-system/css and have access to base theme values like colors,
    * fonts, etc.
    */
  var styles: js.UndefOr[PinStyledTagsSystemStyleO] = js.native
  var textStyles: js.UndefOr[
    typingsSlinky.styledSystem.mod.ObjectOrArray[StandardProperties[String | `0`], /* keyof any */ String]
  ] = js.native
  /**
    * Enable/disable custom CSS properties/variables if lower browser
    * support is required (for eg. IE 11).
    *
    * References: https://theme-ui.com/color-modes/#turn-off-custom-properties
    */
  var useCustomProperties: js.UndefOr[Boolean] = js.native
  var zIndices: js.UndefOr[
    typingsSlinky.styledSystem.mod.ObjectOrArray[ZIndexProperty, /* keyof any */ String]
  ] = js.native
}

object Theme {
  @scala.inline
  def apply(): Theme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Theme]
  }
  @scala.inline
  implicit class ThemeOps[Self <: Theme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorderStyles(
      value: typingsSlinky.styledSystem.mod.ObjectOrArray[BorderProperty[js.Object], /* keyof any */ String]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderWidths(
      value: typingsSlinky.styledSystem.mod.ObjectOrArray[BorderWidthProperty[TLengthStyledSystem], /* keyof any */ String]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderWidths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidths")(js.undefined)
        ret
    }
    @scala.inline
    def withBorders(
      value: typingsSlinky.styledSystem.mod.ObjectOrArray[BorderProperty[js.Object], /* keyof any */ String]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borders")(js.undefined)
        ret
    }
    @scala.inline
    def withBreakpoints(
      value: typingsSlinky.styledSystem.mod.ObjectOrArray[Double | String | js.Symbol, /* keyof any */ String]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBreakpoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakpoints")(js.undefined)
        ret
    }
    @scala.inline
    def withButtons(
      value: typingsSlinky.styledSystem.mod.ObjectOrArray[StandardProperties[String | `0`], /* keyof any */ String]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(js.undefined)
        ret
    }
    @scala.inline
    def withColorStyles(
      value: typingsSlinky.styledSystem.mod.ObjectOrArray[StandardProperties[String | `0`], /* keyof any */ String]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withColors(value: ColorModemodeskstringColo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.undefined)
        ret
    }
    @scala.inline
    def withFontSizes(
      value: typingsSlinky.styledSystem.mod.ObjectOrArray[FontSizeProperty[Double], /* keyof any */ String]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSizes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontSizes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSizes")(js.undefined)
        ret
    }
    @scala.inline
    def withFontWeights(value: typingsSlinky.styledSystem.mod.ObjectOrArray[FontWeightProperty, /* keyof any */ String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontWeights: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeights")(js.undefined)
        ret
    }
    @scala.inline
    def withFonts(value: typingsSlinky.styledSystem.mod.ObjectOrArray[FontFamilyProperty, /* keyof any */ String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fonts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFonts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fonts")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialColorModeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialColorModeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialColorModeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialColorModeName")(js.undefined)
        ret
    }
    @scala.inline
    def withLetterSpacings(
      value: typingsSlinky.styledSystem.mod.ObjectOrArray[LetterSpacingProperty[TLengthStyledSystem], /* keyof any */ String]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("letterSpacings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLetterSpacings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("letterSpacings")(js.undefined)
        ret
    }
    @scala.inline
    def withLineHeights(
      value: typingsSlinky.styledSystem.mod.ObjectOrArray[LineHeightProperty[TLengthStyledSystem], /* keyof any */ String]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineHeights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineHeights: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineHeights")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaQueries(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaQueries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaQueries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaQueries")(js.undefined)
        ret
    }
    @scala.inline
    def withRadii(
      value: typingsSlinky.styledSystem.mod.ObjectOrArray[BorderRadiusProperty[TLengthStyledSystem], /* keyof any */ String]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radii")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadii: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radii")(js.undefined)
        ret
    }
    @scala.inline
    def withShadows(value: typingsSlinky.styledSystem.mod.ObjectOrArray[BoxShadowProperty, /* keyof any */ String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadows")(js.undefined)
        ret
    }
    @scala.inline
    def withSizes(
      value: typingsSlinky.styledSystem.mod.ObjectOrArray[HeightProperty[js.Object] | WidthProperty[js.Object], /* keyof any */ String]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizes")(js.undefined)
        ret
    }
    @scala.inline
    def withSpace(
      value: typingsSlinky.styledSystem.mod.ObjectOrArray[MarginProperty[Double | String], /* keyof any */ String]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space")(js.undefined)
        ret
    }
    @scala.inline
    def withStyles(value: PinStyledTagsSystemStyleO): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
    @scala.inline
    def withTextStyles(
      value: typingsSlinky.styledSystem.mod.ObjectOrArray[StandardProperties[String | `0`], /* keyof any */ String]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withUseCustomProperties(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCustomProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseCustomProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCustomProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withZIndices(value: typingsSlinky.styledSystem.mod.ObjectOrArray[ZIndexProperty, /* keyof any */ String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndices")(js.undefined)
        ret
    }
  }
  
}

