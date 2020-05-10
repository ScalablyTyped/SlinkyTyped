package typingsSlinky.styledSystem.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.csstype.mod.BorderProperty
import typingsSlinky.csstype.mod.BorderRadiusProperty
import typingsSlinky.csstype.mod.BorderWidthProperty
import typingsSlinky.csstype.mod.BoxShadowProperty
import typingsSlinky.csstype.mod.ColorProperty
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
import typingsSlinky.styledSystem.styledSystemNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<styled-system.styled-system.Theme<styled-system.styled-system.TLengthStyledSystem>> */
@js.native
trait RequiredTheme extends js.Object {
  var borderStyles: ObjectOrArray[BorderProperty[js.Object], /* keyof any */ String] = js.native
  var borderWidths: ObjectOrArray[BorderWidthProperty[TLengthStyledSystem], /* keyof any */ String] = js.native
  var borders: ObjectOrArray[BorderProperty[js.Object], /* keyof any */ String] = js.native
  var breakpoints: ObjectOrArray[Double | String | js.Symbol, /* keyof any */ String] = js.native
  var buttons: ObjectOrArray[StandardProperties[String | `0`], /* keyof any */ String] = js.native
  var colorStyles: ObjectOrArray[StandardProperties[String | `0`], /* keyof any */ String] = js.native
  var colors: ObjectOrArray[ColorProperty, /* keyof any */ String] = js.native
  var fontSizes: ObjectOrArray[FontSizeProperty[Double], /* keyof any */ String] = js.native
  var fontWeights: ObjectOrArray[FontWeightProperty, /* keyof any */ String] = js.native
  var fonts: ObjectOrArray[FontFamilyProperty, /* keyof any */ String] = js.native
  var letterSpacings: ObjectOrArray[LetterSpacingProperty[TLengthStyledSystem], /* keyof any */ String] = js.native
  var lineHeights: ObjectOrArray[LineHeightProperty[TLengthStyledSystem], /* keyof any */ String] = js.native
  var mediaQueries: StringDictionary[String] = js.native
  var radii: ObjectOrArray[BorderRadiusProperty[TLengthStyledSystem], /* keyof any */ String] = js.native
  var shadows: ObjectOrArray[BoxShadowProperty, /* keyof any */ String] = js.native
  var sizes: ObjectOrArray[HeightProperty[js.Object] | WidthProperty[js.Object], /* keyof any */ String] = js.native
  var space: ObjectOrArray[MarginProperty[Double | String], /* keyof any */ String] = js.native
  var textStyles: ObjectOrArray[StandardProperties[String | `0`], /* keyof any */ String] = js.native
  var zIndices: ObjectOrArray[ZIndexProperty, /* keyof any */ String] = js.native
}

object RequiredTheme {
  @scala.inline
  def apply(
    borderStyles: ObjectOrArray[BorderProperty[js.Object], /* keyof any */ String],
    borderWidths: ObjectOrArray[BorderWidthProperty[TLengthStyledSystem], /* keyof any */ String],
    borders: ObjectOrArray[BorderProperty[js.Object], /* keyof any */ String],
    breakpoints: ObjectOrArray[Double | String | js.Symbol, /* keyof any */ String],
    buttons: ObjectOrArray[StandardProperties[String | `0`], /* keyof any */ String],
    colorStyles: ObjectOrArray[StandardProperties[String | `0`], /* keyof any */ String],
    colors: ObjectOrArray[ColorProperty, /* keyof any */ String],
    fontSizes: ObjectOrArray[FontSizeProperty[Double], /* keyof any */ String],
    fontWeights: ObjectOrArray[FontWeightProperty, /* keyof any */ String],
    fonts: ObjectOrArray[FontFamilyProperty, /* keyof any */ String],
    letterSpacings: ObjectOrArray[LetterSpacingProperty[TLengthStyledSystem], /* keyof any */ String],
    lineHeights: ObjectOrArray[LineHeightProperty[TLengthStyledSystem], /* keyof any */ String],
    mediaQueries: StringDictionary[String],
    radii: ObjectOrArray[BorderRadiusProperty[TLengthStyledSystem], /* keyof any */ String],
    shadows: ObjectOrArray[BoxShadowProperty, /* keyof any */ String],
    sizes: ObjectOrArray[HeightProperty[js.Object] | WidthProperty[js.Object], /* keyof any */ String],
    space: ObjectOrArray[MarginProperty[Double | String], /* keyof any */ String],
    textStyles: ObjectOrArray[StandardProperties[String | `0`], /* keyof any */ String],
    zIndices: ObjectOrArray[ZIndexProperty, /* keyof any */ String]
  ): RequiredTheme = {
    val __obj = js.Dynamic.literal(borderStyles = borderStyles.asInstanceOf[js.Any], borderWidths = borderWidths.asInstanceOf[js.Any], borders = borders.asInstanceOf[js.Any], breakpoints = breakpoints.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], colorStyles = colorStyles.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], fontSizes = fontSizes.asInstanceOf[js.Any], fontWeights = fontWeights.asInstanceOf[js.Any], fonts = fonts.asInstanceOf[js.Any], letterSpacings = letterSpacings.asInstanceOf[js.Any], lineHeights = lineHeights.asInstanceOf[js.Any], mediaQueries = mediaQueries.asInstanceOf[js.Any], radii = radii.asInstanceOf[js.Any], shadows = shadows.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any], space = space.asInstanceOf[js.Any], textStyles = textStyles.asInstanceOf[js.Any], zIndices = zIndices.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredTheme]
  }
  @scala.inline
  implicit class RequiredThemeOps[Self <: RequiredTheme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorderStyles(value: ObjectOrArray[BorderProperty[js.Object], /* keyof any */ String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderWidths(value: ObjectOrArray[BorderWidthProperty[TLengthStyledSystem], /* keyof any */ String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorders(value: ObjectOrArray[BorderProperty[js.Object], /* keyof any */ String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBreakpoints(value: ObjectOrArray[Double | String | js.Symbol, /* keyof any */ String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtons(value: ObjectOrArray[StandardProperties[String | `0`], /* keyof any */ String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorStyles(value: ObjectOrArray[StandardProperties[String | `0`], /* keyof any */ String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColors(value: ObjectOrArray[ColorProperty, /* keyof any */ String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontSizes(value: ObjectOrArray[FontSizeProperty[Double], /* keyof any */ String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSizes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontWeights(value: ObjectOrArray[FontWeightProperty, /* keyof any */ String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFonts(value: ObjectOrArray[FontFamilyProperty, /* keyof any */ String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fonts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLetterSpacings(value: ObjectOrArray[LetterSpacingProperty[TLengthStyledSystem], /* keyof any */ String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("letterSpacings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineHeights(value: ObjectOrArray[LineHeightProperty[TLengthStyledSystem], /* keyof any */ String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineHeights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMediaQueries(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaQueries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRadii(value: ObjectOrArray[BorderRadiusProperty[TLengthStyledSystem], /* keyof any */ String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radii")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShadows(value: ObjectOrArray[BoxShadowProperty, /* keyof any */ String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSizes(value: ObjectOrArray[HeightProperty[js.Object] | WidthProperty[js.Object], /* keyof any */ String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpace(value: ObjectOrArray[MarginProperty[Double | String], /* keyof any */ String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextStyles(value: ObjectOrArray[StandardProperties[String | `0`], /* keyof any */ String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZIndices(value: ObjectOrArray[ZIndexProperty, /* keyof any */ String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndices")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

