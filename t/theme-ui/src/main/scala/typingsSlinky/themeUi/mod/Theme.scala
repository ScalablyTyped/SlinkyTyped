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
import typingsSlinky.themeUi.anon.ColorModemodeskstringColo
import typingsSlinky.themeUi.anon.PinStyledTagsSystemStyleO
import typingsSlinky.themeUi.themeUiNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent theme-ui.theme-ui.Omit<styled-system.styled-system.Theme<styled-system.styled-system.TLengthStyledSystem>, 'colors'> */
trait Theme extends js.Object {
  var borderStyles: js.UndefOr[
    typingsSlinky.styledSystem.mod.ObjectOrArray[BorderProperty[js.Object], /* keyof any */ String]
  ] = js.undefined
  var borderWidths: js.UndefOr[
    typingsSlinky.styledSystem.mod.ObjectOrArray[BorderWidthProperty[TLengthStyledSystem], /* keyof any */ String]
  ] = js.undefined
  var borders: js.UndefOr[
    typingsSlinky.styledSystem.mod.ObjectOrArray[BorderProperty[js.Object], /* keyof any */ String]
  ] = js.undefined
  var breakpoints: js.UndefOr[
    typingsSlinky.styledSystem.mod.ObjectOrArray[Double | String | js.Symbol, /* keyof any */ String]
  ] = js.undefined
  var buttons: js.UndefOr[
    typingsSlinky.styledSystem.mod.ObjectOrArray[StandardProperties[String | `0`], /* keyof any */ String]
  ] = js.undefined
  var colorStyles: js.UndefOr[
    typingsSlinky.styledSystem.mod.ObjectOrArray[StandardProperties[String | `0`], /* keyof any */ String]
  ] = js.undefined
  /**
    * Define the colors that are available through this theme
    */
  var colors: js.UndefOr[ColorModemodeskstringColo] = js.undefined
  var fontSizes: js.UndefOr[
    typingsSlinky.styledSystem.mod.ObjectOrArray[FontSizeProperty[Double], /* keyof any */ String]
  ] = js.undefined
  var fontWeights: js.UndefOr[
    typingsSlinky.styledSystem.mod.ObjectOrArray[FontWeightProperty, /* keyof any */ String]
  ] = js.undefined
  var fonts: js.UndefOr[
    typingsSlinky.styledSystem.mod.ObjectOrArray[FontFamilyProperty, /* keyof any */ String]
  ] = js.undefined
  /**
    * Provide a value here to enable color modes
    */
  var initialColorModeName: js.UndefOr[String] = js.undefined
  var letterSpacings: js.UndefOr[
    typingsSlinky.styledSystem.mod.ObjectOrArray[LetterSpacingProperty[TLengthStyledSystem], /* keyof any */ String]
  ] = js.undefined
  var lineHeights: js.UndefOr[
    typingsSlinky.styledSystem.mod.ObjectOrArray[LineHeightProperty[TLengthStyledSystem], /* keyof any */ String]
  ] = js.undefined
  var mediaQueries: js.UndefOr[StringDictionary[String]] = js.undefined
  var radii: js.UndefOr[
    typingsSlinky.styledSystem.mod.ObjectOrArray[BorderRadiusProperty[TLengthStyledSystem], /* keyof any */ String]
  ] = js.undefined
  var shadows: js.UndefOr[
    typingsSlinky.styledSystem.mod.ObjectOrArray[BoxShadowProperty, /* keyof any */ String]
  ] = js.undefined
  var sizes: js.UndefOr[
    typingsSlinky.styledSystem.mod.ObjectOrArray[HeightProperty[js.Object] | WidthProperty[js.Object], /* keyof any */ String]
  ] = js.undefined
  var space: js.UndefOr[
    typingsSlinky.styledSystem.mod.ObjectOrArray[MarginProperty[Double | String], /* keyof any */ String]
  ] = js.undefined
  /**
    * Styles for elements rendered in MDX can be added to the theme.styles
    * object. This is the primary, low-level way to control typographic and
    * other styles in markdown content. Styles within this object are processed
    * with @styled-system/css and have access to base theme values like colors,
    * fonts, etc.
    */
  var styles: js.UndefOr[PinStyledTagsSystemStyleO] = js.undefined
  var textStyles: js.UndefOr[
    typingsSlinky.styledSystem.mod.ObjectOrArray[StandardProperties[String | `0`], /* keyof any */ String]
  ] = js.undefined
  /**
    * Enable/disable custom CSS properties/variables if lower browser
    * support is required (for eg. IE 11).
    *
    * References: https://theme-ui.com/color-modes/#turn-off-custom-properties
    */
  var useCustomProperties: js.UndefOr[Boolean] = js.undefined
  var zIndices: js.UndefOr[
    typingsSlinky.styledSystem.mod.ObjectOrArray[ZIndexProperty, /* keyof any */ String]
  ] = js.undefined
}

object Theme {
  @scala.inline
  def apply(
    borderStyles: typingsSlinky.styledSystem.mod.ObjectOrArray[BorderProperty[js.Object], /* keyof any */ String] = null,
    borderWidths: typingsSlinky.styledSystem.mod.ObjectOrArray[BorderWidthProperty[TLengthStyledSystem], /* keyof any */ String] = null,
    borders: typingsSlinky.styledSystem.mod.ObjectOrArray[BorderProperty[js.Object], /* keyof any */ String] = null,
    breakpoints: typingsSlinky.styledSystem.mod.ObjectOrArray[Double | String | js.Symbol, /* keyof any */ String] = null,
    buttons: typingsSlinky.styledSystem.mod.ObjectOrArray[StandardProperties[String | `0`], /* keyof any */ String] = null,
    colorStyles: typingsSlinky.styledSystem.mod.ObjectOrArray[StandardProperties[String | `0`], /* keyof any */ String] = null,
    colors: ColorModemodeskstringColo = null,
    fontSizes: typingsSlinky.styledSystem.mod.ObjectOrArray[FontSizeProperty[Double], /* keyof any */ String] = null,
    fontWeights: typingsSlinky.styledSystem.mod.ObjectOrArray[FontWeightProperty, /* keyof any */ String] = null,
    fonts: typingsSlinky.styledSystem.mod.ObjectOrArray[FontFamilyProperty, /* keyof any */ String] = null,
    initialColorModeName: String = null,
    letterSpacings: typingsSlinky.styledSystem.mod.ObjectOrArray[LetterSpacingProperty[TLengthStyledSystem], /* keyof any */ String] = null,
    lineHeights: typingsSlinky.styledSystem.mod.ObjectOrArray[LineHeightProperty[TLengthStyledSystem], /* keyof any */ String] = null,
    mediaQueries: StringDictionary[String] = null,
    radii: typingsSlinky.styledSystem.mod.ObjectOrArray[BorderRadiusProperty[TLengthStyledSystem], /* keyof any */ String] = null,
    shadows: typingsSlinky.styledSystem.mod.ObjectOrArray[BoxShadowProperty, /* keyof any */ String] = null,
    sizes: typingsSlinky.styledSystem.mod.ObjectOrArray[HeightProperty[js.Object] | WidthProperty[js.Object], /* keyof any */ String] = null,
    space: typingsSlinky.styledSystem.mod.ObjectOrArray[MarginProperty[Double | String], /* keyof any */ String] = null,
    styles: PinStyledTagsSystemStyleO = null,
    textStyles: typingsSlinky.styledSystem.mod.ObjectOrArray[StandardProperties[String | `0`], /* keyof any */ String] = null,
    useCustomProperties: js.UndefOr[Boolean] = js.undefined,
    zIndices: typingsSlinky.styledSystem.mod.ObjectOrArray[ZIndexProperty, /* keyof any */ String] = null
  ): Theme = {
    val __obj = js.Dynamic.literal()
    if (borderStyles != null) __obj.updateDynamic("borderStyles")(borderStyles.asInstanceOf[js.Any])
    if (borderWidths != null) __obj.updateDynamic("borderWidths")(borderWidths.asInstanceOf[js.Any])
    if (borders != null) __obj.updateDynamic("borders")(borders.asInstanceOf[js.Any])
    if (breakpoints != null) __obj.updateDynamic("breakpoints")(breakpoints.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (colorStyles != null) __obj.updateDynamic("colorStyles")(colorStyles.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (fontSizes != null) __obj.updateDynamic("fontSizes")(fontSizes.asInstanceOf[js.Any])
    if (fontWeights != null) __obj.updateDynamic("fontWeights")(fontWeights.asInstanceOf[js.Any])
    if (fonts != null) __obj.updateDynamic("fonts")(fonts.asInstanceOf[js.Any])
    if (initialColorModeName != null) __obj.updateDynamic("initialColorModeName")(initialColorModeName.asInstanceOf[js.Any])
    if (letterSpacings != null) __obj.updateDynamic("letterSpacings")(letterSpacings.asInstanceOf[js.Any])
    if (lineHeights != null) __obj.updateDynamic("lineHeights")(lineHeights.asInstanceOf[js.Any])
    if (mediaQueries != null) __obj.updateDynamic("mediaQueries")(mediaQueries.asInstanceOf[js.Any])
    if (radii != null) __obj.updateDynamic("radii")(radii.asInstanceOf[js.Any])
    if (shadows != null) __obj.updateDynamic("shadows")(shadows.asInstanceOf[js.Any])
    if (sizes != null) __obj.updateDynamic("sizes")(sizes.asInstanceOf[js.Any])
    if (space != null) __obj.updateDynamic("space")(space.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (textStyles != null) __obj.updateDynamic("textStyles")(textStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(useCustomProperties)) __obj.updateDynamic("useCustomProperties")(useCustomProperties.get.asInstanceOf[js.Any])
    if (zIndices != null) __obj.updateDynamic("zIndices")(zIndices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Theme]
  }
}

