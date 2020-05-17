package typingsSlinky.uifabricStyling.ithemeMod

import typingsSlinky.uifabricStyling.anon.PinISchemeNamesIScheme
import typingsSlinky.uifabricStyling.ieffectsMod.IEffects
import typingsSlinky.uifabricStyling.ifontstylesMod.IFontStyles
import typingsSlinky.uifabricStyling.ipaletteMod.IPalette
import typingsSlinky.uifabricStyling.isemanticcolorsMod.ISemanticColors
import typingsSlinky.uifabricStyling.ispacingMod.ISpacing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITheme extends IScheme {
  /**
    * @internal
    * The schemes property is still in an experimental phase. The intent is to have it work
    * in conjunction with new 'schemes' prop that any component making use of Foundation can use.
    * Alternative themes that can be referred to by name.
    */
  var schemes: js.UndefOr[PinISchemeNamesIScheme] = js.native
}

object ITheme {
  @scala.inline
  def apply(
    disableGlobalClassNames: Boolean,
    effects: IEffects,
    fonts: IFontStyles,
    isInverted: Boolean,
    palette: IPalette,
    semanticColors: ISemanticColors,
    spacing: ISpacing
  ): ITheme = {
    val __obj = js.Dynamic.literal(disableGlobalClassNames = disableGlobalClassNames.asInstanceOf[js.Any], effects = effects.asInstanceOf[js.Any], fonts = fonts.asInstanceOf[js.Any], isInverted = isInverted.asInstanceOf[js.Any], palette = palette.asInstanceOf[js.Any], semanticColors = semanticColors.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITheme]
  }
  @scala.inline
  implicit class IThemeOps[Self <: ITheme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

