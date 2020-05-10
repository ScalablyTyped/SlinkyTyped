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

@js.native
trait Theme[TLength] extends js.Object {
  var borderStyles: js.UndefOr[ObjectOrArray[BorderProperty[js.Object], /* keyof any */ String]] = js.native
  var borderWidths: js.UndefOr[ObjectOrArray[BorderWidthProperty[TLength], /* keyof any */ String]] = js.native
  var borders: js.UndefOr[ObjectOrArray[BorderProperty[js.Object], /* keyof any */ String]] = js.native
  var breakpoints: js.UndefOr[ObjectOrArray[Double | String | js.Symbol, /* keyof any */ String]] = js.native
  var buttons: js.UndefOr[ObjectOrArray[StandardProperties[String | `0`], /* keyof any */ String]] = js.native
  var colorStyles: js.UndefOr[ObjectOrArray[StandardProperties[String | `0`], /* keyof any */ String]] = js.native
  var colors: js.UndefOr[ObjectOrArray[ColorProperty, /* keyof any */ String]] = js.native
  var fontSizes: js.UndefOr[ObjectOrArray[FontSizeProperty[Double], /* keyof any */ String]] = js.native
  var fontWeights: js.UndefOr[ObjectOrArray[FontWeightProperty, /* keyof any */ String]] = js.native
  var fonts: js.UndefOr[ObjectOrArray[FontFamilyProperty, /* keyof any */ String]] = js.native
  var letterSpacings: js.UndefOr[ObjectOrArray[LetterSpacingProperty[TLength], /* keyof any */ String]] = js.native
  var lineHeights: js.UndefOr[ObjectOrArray[LineHeightProperty[TLength], /* keyof any */ String]] = js.native
  var mediaQueries: js.UndefOr[StringDictionary[String]] = js.native
  var radii: js.UndefOr[ObjectOrArray[BorderRadiusProperty[TLength], /* keyof any */ String]] = js.native
  var shadows: js.UndefOr[ObjectOrArray[BoxShadowProperty, /* keyof any */ String]] = js.native
  var sizes: js.UndefOr[
    ObjectOrArray[HeightProperty[js.Object] | WidthProperty[js.Object], /* keyof any */ String]
  ] = js.native
  var space: js.UndefOr[ObjectOrArray[MarginProperty[Double | String], /* keyof any */ String]] = js.native
  var textStyles: js.UndefOr[ObjectOrArray[StandardProperties[String | `0`], /* keyof any */ String]] = js.native
  var zIndices: js.UndefOr[ObjectOrArray[ZIndexProperty, /* keyof any */ String]] = js.native
}

object Theme {
  @scala.inline
  def apply[TLength](): Theme[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Theme[TLength]]
  }
  @scala.inline
  implicit class ThemeOps[Self[tlength] <: Theme[tlength], TLength] (val x: Self[TLength]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TLength] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TLength]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TLength] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TLength] with Other]
    @scala.inline
    def withBorderStyles(value: ObjectOrArray[BorderProperty[js.Object], /* keyof any */ String]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderStyles: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderWidths(value: ObjectOrArray[BorderWidthProperty[TLength], /* keyof any */ String]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderWidths: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidths")(js.undefined)
        ret
    }
    @scala.inline
    def withBorders(value: ObjectOrArray[BorderProperty[js.Object], /* keyof any */ String]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorders: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borders")(js.undefined)
        ret
    }
    @scala.inline
    def withBreakpoints(value: ObjectOrArray[Double | String | js.Symbol, /* keyof any */ String]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBreakpoints: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakpoints")(js.undefined)
        ret
    }
    @scala.inline
    def withButtons(value: ObjectOrArray[StandardProperties[String | `0`], /* keyof any */ String]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtons: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(js.undefined)
        ret
    }
    @scala.inline
    def withColorStyles(value: ObjectOrArray[StandardProperties[String | `0`], /* keyof any */ String]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorStyles: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withColors(value: ObjectOrArray[ColorProperty, /* keyof any */ String]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColors: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.undefined)
        ret
    }
    @scala.inline
    def withFontSizes(value: ObjectOrArray[FontSizeProperty[Double], /* keyof any */ String]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSizes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontSizes: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSizes")(js.undefined)
        ret
    }
    @scala.inline
    def withFontWeights(value: ObjectOrArray[FontWeightProperty, /* keyof any */ String]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontWeights: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeights")(js.undefined)
        ret
    }
    @scala.inline
    def withFonts(value: ObjectOrArray[FontFamilyProperty, /* keyof any */ String]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fonts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFonts: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fonts")(js.undefined)
        ret
    }
    @scala.inline
    def withLetterSpacings(value: ObjectOrArray[LetterSpacingProperty[TLength], /* keyof any */ String]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("letterSpacings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLetterSpacings: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("letterSpacings")(js.undefined)
        ret
    }
    @scala.inline
    def withLineHeights(value: ObjectOrArray[LineHeightProperty[TLength], /* keyof any */ String]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineHeights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineHeights: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineHeights")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaQueries(value: StringDictionary[String]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaQueries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaQueries: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaQueries")(js.undefined)
        ret
    }
    @scala.inline
    def withRadii(value: ObjectOrArray[BorderRadiusProperty[TLength], /* keyof any */ String]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radii")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadii: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radii")(js.undefined)
        ret
    }
    @scala.inline
    def withShadows(value: ObjectOrArray[BoxShadowProperty, /* keyof any */ String]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadows: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadows")(js.undefined)
        ret
    }
    @scala.inline
    def withSizes(value: ObjectOrArray[HeightProperty[js.Object] | WidthProperty[js.Object], /* keyof any */ String]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizes: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizes")(js.undefined)
        ret
    }
    @scala.inline
    def withSpace(value: ObjectOrArray[MarginProperty[Double | String], /* keyof any */ String]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpace: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space")(js.undefined)
        ret
    }
    @scala.inline
    def withTextStyles(value: ObjectOrArray[StandardProperties[String | `0`], /* keyof any */ String]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextStyles: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withZIndices(value: ObjectOrArray[ZIndexProperty, /* keyof any */ String]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndices: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndices")(js.undefined)
        ret
    }
  }
  
}

