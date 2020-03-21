package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.FontFamilyProperty
import typingsSlinky.csstype.mod.FontSizeProperty
import typingsSlinky.csstype.mod.FontWeightProperty
import typingsSlinky.csstype.mod.LetterSpacingProperty
import typingsSlinky.csstype.mod.LineHeightProperty
import typingsSlinky.csstype.mod.TextAlignProperty
import typingsSlinky.csstype.mod.TextTransformProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypographyProps
  extends FontFamilyProps
     with FontSizeProps[StyledSystemLength]
     with LineHeightProps[StyledSystemLength]
     with FontWeightProps
     with TextAlignProps
     with LetterSpacingProps[StyledSystemLength]
     with ColorProps
     with TextTransformProps

object TypographyProps {
  @scala.inline
  def apply(
    color: js.Any = null,
    fontFamily: ResponsiveValue[FontFamilyProperty | Double] = null,
    fontSize: ResponsiveValue[FontSizeProperty[StyledSystemLength]] = null,
    fontWeight: ResponsiveValue[FontWeightProperty | AliasKey] = null,
    letterSpacing: ResponsiveValue[LetterSpacingProperty[StyledSystemLength]] = null,
    lineHeight: ResponsiveValue[LineHeightProperty[StyledSystemLength]] = null,
    textAlign: ResponsiveValue[TextAlignProperty] = null,
    textTransform: ResponsiveValue[TextTransformProperty] = null
  ): TypographyProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (letterSpacing != null) __obj.updateDynamic("letterSpacing")(letterSpacing.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (textTransform != null) __obj.updateDynamic("textTransform")(textTransform.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypographyProps]
  }
}

