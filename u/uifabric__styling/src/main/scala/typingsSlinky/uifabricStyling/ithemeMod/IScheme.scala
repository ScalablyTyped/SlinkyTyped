package typingsSlinky.uifabricStyling.ithemeMod

import typingsSlinky.uifabricStyling.ieffectsMod.IEffects
import typingsSlinky.uifabricStyling.ifontstylesMod.IFontStyles
import typingsSlinky.uifabricStyling.ipaletteMod.IPalette
import typingsSlinky.uifabricStyling.isemanticcolorsMod.ISemanticColors
import typingsSlinky.uifabricStyling.ispacingMod.ISpacing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IScheme extends js.Object {
  /**
    * This setting is for a very narrow use case and you probably don't need to worry about,
    * unless you share a environment with others that also use fabric.
    * It is used for disabling global styles on fabric components. This will prevent global
    * overrides that might have been set by other fabric users from applying to your components.
    * When you set this setting to `true` on your theme the components in the subtree of your
    * Customizer will not get the global styles applied to them.
    */
  var disableGlobalClassNames: Boolean = js.native
  var effects: IEffects = js.native
  var fonts: IFontStyles = js.native
  var isInverted: Boolean = js.native
  var palette: IPalette = js.native
  var rtl: js.UndefOr[Boolean] = js.native
  var semanticColors: ISemanticColors = js.native
  /**
    * @internal
    * The spacing property is still in an experimental phase. The intent is to have it
    * be used for padding and margin sizes in a future release, but it is still undergoing review.
    * Avoid using it until it is finalized.
    */
  var spacing: ISpacing = js.native
}

object IScheme {
  @scala.inline
  def apply(
    disableGlobalClassNames: Boolean,
    effects: IEffects,
    fonts: IFontStyles,
    isInverted: Boolean,
    palette: IPalette,
    semanticColors: ISemanticColors,
    spacing: ISpacing
  ): IScheme = {
    val __obj = js.Dynamic.literal(disableGlobalClassNames = disableGlobalClassNames.asInstanceOf[js.Any], effects = effects.asInstanceOf[js.Any], fonts = fonts.asInstanceOf[js.Any], isInverted = isInverted.asInstanceOf[js.Any], palette = palette.asInstanceOf[js.Any], semanticColors = semanticColors.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScheme]
  }
  @scala.inline
  implicit class ISchemeOps[Self <: IScheme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisableGlobalClassNames(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableGlobalClassNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEffects(value: IEffects): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFonts(value: IFontStyles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fonts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsInverted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInverted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPalette(value: IPalette): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("palette")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSemanticColors(value: ISemanticColors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("semanticColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpacing(value: ISpacing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacing")(value.asInstanceOf[js.Any])
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
  }
  
}

