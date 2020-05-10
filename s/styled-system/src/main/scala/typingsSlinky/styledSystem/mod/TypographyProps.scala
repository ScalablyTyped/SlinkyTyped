package typingsSlinky.styledSystem.mod

import typingsSlinky.styledSystem.styledSystemStrings.fontSizes
import typingsSlinky.styledSystem.styledSystemStrings.fontWeights
import typingsSlinky.styledSystem.styledSystemStrings.letterSpacings
import typingsSlinky.styledSystem.styledSystemStrings.lineHeights
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  def apply[ThemeType](): TypographyProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypographyProps[ThemeType]]
  }
}

