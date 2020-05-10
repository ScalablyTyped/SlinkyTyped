package typingsSlinky.uifabricMergeStyles.irawstylebaseMod

import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.auto
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.block
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.fallback
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.optional
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.swap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFontFace extends IRawFontStyle {
  /**
    * Determines how a font face is displayed based on whether and when it is downloaded
    * and ready to use.
    */
  var fontDisplay: js.UndefOr[auto | block | swap | fallback | optional] = js.native
  /**
    * Feature settings for the font.
    */
  var fontFeatureSettings: js.UndefOr[String] = js.native
  /**
    * Specifies the src of the font.
    */
  var src: js.UndefOr[String] = js.native
  /**
    * unicode-range allows you to set a specific range of characters to be downloaded
    * from a font (embedded using \@font-face) and made available for use on the current
    * page.
    */
  var unicodeRange: js.UndefOr[ICSSRule | String] = js.native
}

object IFontFace {
  @scala.inline
  def apply(): IFontFace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFontFace]
  }
  @scala.inline
  implicit class IFontFaceOps[Self <: IFontFace] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFontDisplay(value: auto | block | swap | fallback | optional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontDisplay")(js.undefined)
        ret
    }
    @scala.inline
    def withFontFeatureSettings(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFeatureSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontFeatureSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFeatureSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(js.undefined)
        ret
    }
    @scala.inline
    def withUnicodeRange(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unicodeRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnicodeRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unicodeRange")(js.undefined)
        ret
    }
  }
  
}

