package typingsSlinky.styledSystemCss.mod

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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScaleThemeProperties extends js.Object {
  /**
    * | Prop        | CSS Property | Theme Field  |
    * | :---------- | :----------- | :----------- |
    * | borderStyle | border-style | borderStyles |
    *
    * @see https://styled-system.com/table#border
    */
  var borderStyles: js.UndefOr[ThemeValue[LineStyle]] = js.native
  /**
    * | Prop        | CSS Property | Theme Field  |
    * | :---------- | :----------- | :----------- |
    * | borderWidth | border-width | borderWidths |
    *
    * @see https://styled-system.com/table#border
    */
  var borderWidths: js.UndefOr[ThemeValue[BorderWidthProperty[js.Object]]] = js.native
  /**
    * | Prop         | CSS Property               | Theme Field |
    * | :----------- | :------------------------- | :---------- |
    * | border       | border                     | borders     |
    * | borderTop    | border-top                 | borders     |
    * | borderRight  | border-right               | borders     |
    * | borderBottom | border-bottom              | borders     |
    * | borderLeft   | border-left                | borders     |
    * | borderX      | border-left & border-right | borders     |
    * | borderY      | border-top & border-bottom | borders     |
    *
    * @see https://styled-system.com/table#border
    */
  var borders: js.UndefOr[ThemeValue[BorderProperty[js.Object]]] = js.native
  /**
    * | Prop                | CSS Property     | Theme Field |
    * | :------------------ | :--------------- | :---------- |
    * | color               | color            | colors      |
    * | bg, backgroundColor | background-color | colors      |
    *
    * @see https://styled-system.com/table#color
    */
  var colors: js.UndefOr[ThemeValue[ColorProperty]] = js.native
  /**
    * | Prop     | CSS Property | Theme Field |
    * | :------- | :----------- | :---------- |
    * | fontSize | font-size    | fontSizes   |
    *
    * @see https://styled-system.com/table#typography
    */
  var fontSizes: js.UndefOr[ThemeValue[FontSizeProperty[Double]]] = js.native
  /**
    * | Prop       | CSS Property | Theme Field |
    * | :--------- | :----------- | :---------- |
    * | fontWeight | font-weight  | fontWeights |
    *
    * @see https://styled-system.com/table#typography
    */
  var fontWeights: js.UndefOr[ThemeValue[FontWeightProperty]] = js.native
  /**
    * | Prop       | CSS Property | Theme Field |
    * | :--------- | :----------- | :---------- |
    * | fontFamily | font-family  | fonts       |
    *
    * @see https://styled-system.com/table#typography
    */
  var fonts: js.UndefOr[ThemeValue[FontFamilyProperty]] = js.native
  /**
    * | Prop          | CSS Property   | Theme Field    |
    * | :------------ | :------------- | :------------- |
    * | letterSpacing | letter-spacing | letterSpacings |
    *
    * @see https://styled-system.com/table#typography
    */
  var letterSpacings: js.UndefOr[ThemeValue[LetterSpacingProperty[String | Double]]] = js.native
  /**
    * | Prop       | CSS Property | Theme Field |
    * | :--------- | :----------- | :---------- |
    * | lineHeight | line-height  | lineHeights |
    *
    * @see https://styled-system.com/table#typography
    */
  var lineHeights: js.UndefOr[ThemeValue[LineHeightProperty[String]]] = js.native
  /**
    * | Prop         | CSS Property  | Theme Field |
    * | :----------- | :------------ | :---------- |
    * | borderRadius | border-radius | radii       |
    *
    * @see https://styled-system.com/table#border
    */
  var radii: js.UndefOr[ThemeValue[BorderRadiusProperty[js.Object]]] = js.native
  /**
    * | Prop       | CSS Property | Theme Field |
    * | :--------- | :----------- | :---------- |
    * | textShadow | text-shadow  | shadows     |
    * | boxShadow  | box-shadow   | shadows     |
    *
    * @see https://styled-system.com/table#shadow
    */
  var shadows: js.UndefOr[ThemeValue[BoxShadowProperty]] = js.native
  /**
    * | Prop      | CSS Property | Theme Field |
    * | :-------- | :----------- | :---------- |
    * | width     | width        | sizes       |
    * | height    | height       | sizes       |
    * | minWidth  | min-width    | sizes       |
    * | maxWidth  | max-width    | sizes       |
    * | minHeight | min-height   | sizes       |
    * | maxHeight | max-height   | sizes       |
    * | size      | width height | sizes       |
    *
    * @see https://styled-system.com/table#layout
    */
  var sizes: js.UndefOr[ThemeValue[HeightProperty[js.Object] | WidthProperty[js.Object]]] = js.native
  /**
    * | Prop              | CSS Property                   | Theme Field |
    * | :---------------- | :----------------------------- | :---------- |
    * | m, margin	       | margin                         | space       |
    * | mt, marginTop     | margin-top                     | space       |
    * | mr, marginRight   | margin-right                   | space       |
    * | mb, marginBottom  | margin-bottom                  | space       |
    * | ml, marginLeft    | margin-left                    | space       |
    * | mx                | margin-left and margin-right   | space       |
    * | my                | margin-top and margin-bottom   | space       |
    * | p, padding        | padding                        | space       |
    * | pt, paddingTop    | padding-top                    | space       |
    * | pr, paddingRight  | padding-right                  | space       |
    * | pb, paddingBottom | padding-bottom                 | space       |
    * | pl, paddingLeft   | padding-left                   | space       |
    * | px                | padding-left and padding-right | space       |
    * | py                | padding-top and padding-bottom | space       |
    *
    * @see https://styled-system.com/table#space
    */
  var space: js.UndefOr[ThemeValue[MarginProperty[Double] with PaddingProperty[Double]]] = js.native
  /**
    * | Prop    | CSS Property | Theme Field |
    * | :------ | :----------- | :---------- |
    * | zIndex  | z-index      | zIndices    |
    *
    * @see https://styled-system.com/table#position
    */
  var zIndices: js.UndefOr[ThemeValue[ZIndexProperty]] = js.native
}

object ScaleThemeProperties {
  @scala.inline
  def apply(): ScaleThemeProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScaleThemeProperties]
  }
  @scala.inline
  implicit class ScaleThemePropertiesOps[Self <: ScaleThemeProperties] (val x: Self) extends AnyVal {
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

