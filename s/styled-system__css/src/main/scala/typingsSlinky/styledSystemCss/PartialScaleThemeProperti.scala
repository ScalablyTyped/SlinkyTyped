package typingsSlinky.styledSystemCss

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
import typingsSlinky.csstype.mod.LineStyle
import typingsSlinky.csstype.mod.MarginProperty
import typingsSlinky.csstype.mod.PaddingProperty
import typingsSlinky.csstype.mod.WidthProperty
import typingsSlinky.csstype.mod.ZIndexProperty
import typingsSlinky.styledSystemCss.mod.ThemeValue
import typingsSlinky.styledSystemCss.mod._Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@styled-system/css.@styled-system/css.ScaleThemeProperties> */
@js.native
trait PartialScaleThemeProperti extends _Theme {
  var borderStyles: js.UndefOr[ThemeValue[LineStyle]] = js.native
  var borderWidths: js.UndefOr[ThemeValue[BorderWidthProperty[js.Object]]] = js.native
  var borders: js.UndefOr[ThemeValue[BorderProperty[js.Object]]] = js.native
  var colors: js.UndefOr[ThemeValue[ColorProperty]] = js.native
  var fontSizes: js.UndefOr[ThemeValue[FontSizeProperty[Double]]] = js.native
  var fontWeights: js.UndefOr[ThemeValue[FontWeightProperty]] = js.native
  var fonts: js.UndefOr[ThemeValue[FontFamilyProperty]] = js.native
  var letterSpacings: js.UndefOr[ThemeValue[LetterSpacingProperty[String | Double]]] = js.native
  var lineHeights: js.UndefOr[ThemeValue[LineHeightProperty[String]]] = js.native
  var radii: js.UndefOr[ThemeValue[BorderRadiusProperty[js.Object]]] = js.native
  var shadows: js.UndefOr[ThemeValue[BoxShadowProperty]] = js.native
  var sizes: js.UndefOr[ThemeValue[HeightProperty[js.Object] | WidthProperty[js.Object]]] = js.native
  var space: js.UndefOr[ThemeValue[MarginProperty[Double] with PaddingProperty[Double]]] = js.native
  var zIndices: js.UndefOr[ThemeValue[ZIndexProperty]] = js.native
}

object PartialScaleThemeProperti {
  @scala.inline
  def apply(): PartialScaleThemeProperti = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialScaleThemeProperti]
  }
  @scala.inline
  implicit class PartialScaleThemePropertiOps[Self <: PartialScaleThemeProperti] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorderStyles(value: ThemeValue[LineStyle]): Self = {
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
    def withBorderWidths(value: ThemeValue[BorderWidthProperty[js.Object]]): Self = {
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
    def withBorders(value: ThemeValue[BorderProperty[js.Object]]): Self = {
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
    def withColors(value: ThemeValue[ColorProperty]): Self = {
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
    def withFontSizes(value: ThemeValue[FontSizeProperty[Double]]): Self = {
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
    def withFontWeights(value: ThemeValue[FontWeightProperty]): Self = {
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
    def withFonts(value: ThemeValue[FontFamilyProperty]): Self = {
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
    def withLetterSpacings(value: ThemeValue[LetterSpacingProperty[String | Double]]): Self = {
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
    def withLineHeights(value: ThemeValue[LineHeightProperty[String]]): Self = {
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
    def withRadii(value: ThemeValue[BorderRadiusProperty[js.Object]]): Self = {
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
    def withShadows(value: ThemeValue[BoxShadowProperty]): Self = {
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
    def withSizes(value: ThemeValue[HeightProperty[js.Object] | WidthProperty[js.Object]]): Self = {
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
    def withSpace(value: ThemeValue[MarginProperty[Double] with PaddingProperty[Double]]): Self = {
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
    def withZIndices(value: ThemeValue[ZIndexProperty]): Self = {
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

