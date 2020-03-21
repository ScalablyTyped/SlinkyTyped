package typingsSlinky.styledSystem.mod

import typingsSlinky.csstype.mod.FontFamilyProperty
import typingsSlinky.csstype.mod.FontStyleProperty
import typingsSlinky.csstype.mod.TextAlignProperty
import typingsSlinky.styledSystem.styledSystemStrings.fontSizes
import typingsSlinky.styledSystem.styledSystemStrings.fontWeights
import typingsSlinky.styledSystem.styledSystemStrings.letterSpacings
import typingsSlinky.styledSystem.styledSystemStrings.lineHeights
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypographyProps[ThemeType /* <: Theme[TLengthStyledSystem] */]
  extends FontFamilyProps[ThemeType]
     with FontSizeProps[ThemeType, ThemeValue[fontSizes, ThemeType, js.Any]]
     with FontWeightProps[ThemeType, ThemeValue[fontWeights, ThemeType, js.Any]]
     with LineHeightProps[ThemeType, ThemeValue[lineHeights, ThemeType, js.Any]]
     with LetterSpacingProps[ThemeType, ThemeValue[letterSpacings, ThemeType, js.Any]]
     with FontStyleProps[ThemeType]
     with TextAlignProps[ThemeType]

object TypographyProps {
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](
    fontFamily: ResponsiveValue[FontFamilyProperty, ThemeType] = null,
    fontSize: ResponsiveValue[ThemeValue[fontSizes, ThemeType, js.Any], ThemeType] = null,
    fontStyle: ResponsiveValue[FontStyleProperty, ThemeType] = null,
    fontWeight: ResponsiveValue[ThemeValue[fontWeights, ThemeType, js.Any], ThemeType] = null,
    letterSpacing: ResponsiveValue[ThemeValue[letterSpacings, ThemeType, js.Any], ThemeType] = null,
    lineHeight: ResponsiveValue[ThemeValue[lineHeights, ThemeType, js.Any], ThemeType] = null,
    textAlign: ResponsiveValue[TextAlignProperty, ThemeType] = null
  ): TypographyProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (letterSpacing != null) __obj.updateDynamic("letterSpacing")(letterSpacing.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypographyProps[ThemeType]]
  }
}

