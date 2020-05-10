package typingsSlinky.webicon.configMod

import typingsSlinky.webicon.aliasOptionsMod.AliasOptions
import typingsSlinky.webicon.cssClassConfigMod.CssClassConfig
import typingsSlinky.webicon.cssIconSetOptionsMod.CssIconSetOptions
import typingsSlinky.webicon.identifiableMod.Identifiable
import typingsSlinky.webicon.identityMapMod.IdentityMap
import typingsSlinky.webicon.imageIconOptionsMod.ImageIconOptions
import typingsSlinky.webicon.sizeableOptionsMod.SizeableOptions
import typingsSlinky.webicon.svgCumulativeIconSetOptionsMod.SvgCumulativeIconSetOptions
import typingsSlinky.webicon.svgIconOptionsMod.SvgIconOptions
import typingsSlinky.webicon.svgIconSetOptionsMod.SvgIconSetOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  /**
    * A set of alias-names for icon-sets.
    */
  var alias: js.UndefOr[IdentityMap[String, AliasOptions]] = js.native
  /**
    * An alias of the `defaultSource`-property.
    */
  var default: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: this['defaultSource'] */ js.Any
  ] = js.native
  /**
    * The default icon-set to provide.
    */
  var defaultIconSetUrl: js.UndefOr[String | SvgIconSetOptions | SvgCumulativeIconSetOptions] = js.native
  /**
    * The default icon-set to use.
    */
  var defaultSource: js.UndefOr[String | Identifiable] = js.native
  /**
    * An alias of the `defaultIconSetUrl`-property.
    */
  var defaultSvgIconSetUrl: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: this['defaultIconSetUrl'] */ js.Any
  ] = js.native
  /**
    * The default size for svg-icons.
    */
  var defaultSvgIconSize: js.UndefOr[Double | SizeableOptions] = js.native
  /**
    * An alias of the `defaultIconSetUrl`-property.
    */
  var defaultSvgSetUrl: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: this['defaultIconSetUrl'] */ js.Any
  ] = js.native
  /**
    * An alias of the `fonts`-property.
    */
  var font: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: this['fonts'] */ js.Any
  ] = js.native
  /**
    * A set of icon-fonts to provide.
    */
  var fonts: js.UndefOr[IdentityMap[CssClassConfig, CssIconSetOptions]] = js.native
  /**
    * An alias of the `icons`-property.
    */
  var icon: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: this['icons'] */ js.Any
  ] = js.native
  /**
    * An alias of the `svgSets`-property.
    */
  var iconSet: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: this['svgSets'] */ js.Any
  ] = js.native
  /**
    * An alias of the `svgSets`-property.
    */
  var iconSets: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: this['svgSets'] */ js.Any
  ] = js.native
  /**
    * The icons to provide.
    */
  var icons: js.UndefOr[IdentityMap[String, ImageIconOptions | SvgIconOptions]] = js.native
  /**
    * An alias of the `alias`-property.
    */
  var sourceAlias: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: this['alias'] */ js.Any
  ] = js.native
  /**
    * An alias of the `sprites`-property.
    */
  var sprite: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: this['sprites'] */ js.Any
  ] = js.native
  /**
    * A set of sprite-icons to provide.
    */
  var sprites: js.UndefOr[IdentityMap[CssClassConfig, CssIconSetOptions]] = js.native
  /**
    * An alias of the `svgSets`-property.
    */
  var svgSet: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: this['svgSets'] */ js.Any
  ] = js.native
  /**
    * The svg-sets to provide.
    */
  var svgSets: js.UndefOr[IdentityMap[String, SvgIconSetOptions | SvgCumulativeIconSetOptions]] = js.native
}

object Config {
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlias(value: IdentityMap[String, AliasOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alias")(js.undefined)
        ret
    }
    @scala.inline
    def withDefault(
      value: /* import warning: importer.ImportType#apply Failed type conversion: this['defaultSource'] */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultIconSetUrl(value: String | SvgIconSetOptions | SvgCumulativeIconSetOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultIconSetUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultIconSetUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultIconSetUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultSource(value: String | Identifiable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSource")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultSvgIconSetUrl(
      value: /* import warning: importer.ImportType#apply Failed type conversion: this['defaultIconSetUrl'] */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSvgIconSetUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSvgIconSetUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSvgIconSetUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultSvgIconSize(value: Double | SizeableOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSvgIconSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSvgIconSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSvgIconSize")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultSvgSetUrl(
      value: /* import warning: importer.ImportType#apply Failed type conversion: this['defaultIconSetUrl'] */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSvgSetUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSvgSetUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSvgSetUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withFont(
      value: /* import warning: importer.ImportType#apply Failed type conversion: this['fonts'] */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(js.undefined)
        ret
    }
    @scala.inline
    def withFonts(value: IdentityMap[CssClassConfig, CssIconSetOptions]): Self = {
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
    def withIcon(
      value: /* import warning: importer.ImportType#apply Failed type conversion: this['icons'] */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withIconSet(
      value: /* import warning: importer.ImportType#apply Failed type conversion: this['svgSets'] */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconSet")(js.undefined)
        ret
    }
    @scala.inline
    def withIconSets(
      value: /* import warning: importer.ImportType#apply Failed type conversion: this['svgSets'] */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconSets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconSets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconSets")(js.undefined)
        ret
    }
    @scala.inline
    def withIcons(value: IdentityMap[String, ImageIconOptions | SvgIconOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icons")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceAlias(
      value: /* import warning: importer.ImportType#apply Failed type conversion: this['alias'] */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceAlias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceAlias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceAlias")(js.undefined)
        ret
    }
    @scala.inline
    def withSprite(
      value: /* import warning: importer.ImportType#apply Failed type conversion: this['sprites'] */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sprite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSprite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sprite")(js.undefined)
        ret
    }
    @scala.inline
    def withSprites(value: IdentityMap[CssClassConfig, CssIconSetOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sprites")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSprites: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sprites")(js.undefined)
        ret
    }
    @scala.inline
    def withSvgSet(
      value: /* import warning: importer.ImportType#apply Failed type conversion: this['svgSets'] */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSvgSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgSet")(js.undefined)
        ret
    }
    @scala.inline
    def withSvgSets(value: IdentityMap[String, SvgIconSetOptions | SvgCumulativeIconSetOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgSets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSvgSets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgSets")(js.undefined)
        ret
    }
  }
  
}

