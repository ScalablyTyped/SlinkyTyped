package typingsSlinky.uifabricMergeStyles.irawstylebaseMod

import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.`extra-condensed`
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.`extra-expanded`
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.`semi-condensed`
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.`semi-expanded`
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.`ultra-condensed`
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.`ultra-expanded`
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.`x-large`
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.`x-small`
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.`xx-large`
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.`xx-small`
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.auto
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.block
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.condensed
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.expanded
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.fallback
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.italic
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.large
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.larger
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.medium
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.none
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.normal
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.oblique
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.optional
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.small
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.smaller
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.swap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFontFace extends IRawFontStyle {
  /**
    * Determines how a font face is displayed based on whether and when it is downloaded
    * and ready to use.
    */
  var fontDisplay: js.UndefOr[auto | block | swap | fallback | optional] = js.undefined
  /**
    * Feature settings for the font.
    */
  var fontFeatureSettings: js.UndefOr[String] = js.undefined
  /**
    * Specifies the src of the font.
    */
  var src: js.UndefOr[String] = js.undefined
  /**
    * unicode-range allows you to set a specific range of characters to be downloaded
    * from a font (embedded using \@font-face) and made available for use on the current
    * page.
    */
  var unicodeRange: js.UndefOr[ICSSRule | String] = js.undefined
}

object IFontFace {
  @scala.inline
  def apply(
    font: ICSSRule | String = null,
    fontDisplay: auto | block | swap | fallback | optional = null,
    fontFamily: ICSSRule | String = null,
    fontFeatureSettings: String = null,
    fontKerning: ICSSRule | String = null,
    fontSize: ICSSRule | `xx-small` | `x-small` | small | medium | large | `x-large` | `xx-large` | larger | smaller | ICSSPixelUnitRule | ICSSPercentageRule = null,
    fontSizeAdjust: ICSSRule | none | Double = null,
    fontStretch: ICSSRule | normal | `ultra-condensed` | `extra-condensed` | condensed | `semi-condensed` | `semi-expanded` | expanded | `extra-expanded` | `ultra-expanded` = null,
    fontStyle: ICSSRule | normal | italic | oblique = null,
    fontSynthesis: ICSSRule | String = null,
    fontVariant: ICSSRule | String = null,
    fontVariantAlternates: ICSSRule | String = null,
    fontWeight: IFontWeight = null,
    src: String = null,
    unicodeRange: ICSSRule | String = null
  ): IFontFace = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (fontDisplay != null) __obj.updateDynamic("fontDisplay")(fontDisplay.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontFeatureSettings != null) __obj.updateDynamic("fontFeatureSettings")(fontFeatureSettings.asInstanceOf[js.Any])
    if (fontKerning != null) __obj.updateDynamic("fontKerning")(fontKerning.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontSizeAdjust != null) __obj.updateDynamic("fontSizeAdjust")(fontSizeAdjust.asInstanceOf[js.Any])
    if (fontStretch != null) __obj.updateDynamic("fontStretch")(fontStretch.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontSynthesis != null) __obj.updateDynamic("fontSynthesis")(fontSynthesis.asInstanceOf[js.Any])
    if (fontVariant != null) __obj.updateDynamic("fontVariant")(fontVariant.asInstanceOf[js.Any])
    if (fontVariantAlternates != null) __obj.updateDynamic("fontVariantAlternates")(fontVariantAlternates.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (unicodeRange != null) __obj.updateDynamic("unicodeRange")(unicodeRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFontFace]
  }
}

