package typingsSlinky.uifabricStyling.ithemeMod

import typingsSlinky.uifabricMergeStyles.istyleMod.IRawStyle
import typingsSlinky.uifabricStyling.PartialIEffects
import typingsSlinky.uifabricStyling.PartialIFontStyles
import typingsSlinky.uifabricStyling.PartialIPalette
import typingsSlinky.uifabricStyling.PartialISemanticColors
import typingsSlinky.uifabricStyling.PartialISpacing
import typingsSlinky.uifabricStyling.PinISchemeNamesIScheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPartialTheme extends js.Object {
  /**
    * Use this property to specify font property defaults.
    */
  var defaultFontStyle: js.UndefOr[IRawStyle] = js.native
  var disableGlobalClassNames: js.UndefOr[Boolean] = js.native
  var effects: js.UndefOr[PartialIEffects] = js.native
  var fonts: js.UndefOr[PartialIFontStyles] = js.native
  var isInverted: js.UndefOr[Boolean] = js.native
  var palette: js.UndefOr[PartialIPalette] = js.native
  var rtl: js.UndefOr[Boolean] = js.native
  var schemes: js.UndefOr[PinISchemeNamesIScheme] = js.native
  var semanticColors: js.UndefOr[PartialISemanticColors] = js.native
  var spacing: js.UndefOr[PartialISpacing] = js.native
}

object IPartialTheme {
  @scala.inline
  def apply(): IPartialTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPartialTheme]
  }
  @scala.inline
  implicit class IPartialThemeOps[Self <: IPartialTheme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultFontStyle(value: IRawStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFontStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultFontStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFontStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableGlobalClassNames(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableGlobalClassNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableGlobalClassNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableGlobalClassNames")(js.undefined)
        ret
    }
    @scala.inline
    def withEffects(value: PartialIEffects): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEffects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effects")(js.undefined)
        ret
    }
    @scala.inline
    def withFonts(value: PartialIFontStyles): Self = {
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
    def withIsInverted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInverted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsInverted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInverted")(js.undefined)
        ret
    }
    @scala.inline
    def withPalette(value: PartialIPalette): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("palette")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPalette: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("palette")(js.undefined)
        ret
    }
    @scala.inline
    def withRtl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRtl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtl")(js.undefined)
        ret
    }
    @scala.inline
    def withSchemes(value: PinISchemeNamesIScheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemes")(js.undefined)
        ret
    }
    @scala.inline
    def withSemanticColors(value: PartialISemanticColors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("semanticColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSemanticColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("semanticColors")(js.undefined)
        ret
    }
    @scala.inline
    def withSpacing(value: PartialISpacing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacing")(js.undefined)
        ret
    }
  }
  
}

