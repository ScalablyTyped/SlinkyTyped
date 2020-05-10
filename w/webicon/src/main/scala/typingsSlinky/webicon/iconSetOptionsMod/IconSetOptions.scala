package typingsSlinky.webicon.iconSetOptionsMod

import typingsSlinky.webicon.svgIconMod.SvgIcon
import typingsSlinky.webicon.urlConfigMod.UrlConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.webicon.iconMod.Icon because Already inherited
- typingsSlinky.webicon.sizeableMod.Sizeable because Already inherited
- typingsSlinky.webicon.downloadableMod.Downloadable because var conflicts: iconIdParser. Inlined url, uri
- typingsSlinky.webicon.sizeableOptionsMod.SizeableOptions because var conflicts: iconSize. Inlined size, svgIconSize */ @js.native
trait IconSetOptions extends SvgIcon {
  /**
    * A value indicating whether the icons are loaded separately.
    */
  var cumulative: js.UndefOr[Boolean] = js.native
  /**
    * An alias of the `iconSize`-property.
    */
  var size: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: this['iconSize'] */ js.Any
  ] = js.native
  /**
    * An alias of the `iconSize`-property.
    */
  var svgIconSize: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: this['iconSize'] */ js.Any
  ] = js.native
  /**
    * An alias of the `url`-property.
    */
  var uri: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: this['url'] */ js.Any
  ] = js.native
  /**
    * The url to load the source from.
    */
  var url: js.UndefOr[UrlConfig[scala.Nothing]] = js.native
}

object IconSetOptions {
  @scala.inline
  def apply(): IconSetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IconSetOptions]
  }
  @scala.inline
  implicit class IconSetOptionsOps[Self <: IconSetOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCumulative(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cumulative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCumulative: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cumulative")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(
      value: /* import warning: importer.ImportType#apply Failed type conversion: this['iconSize'] */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withSvgIconSize(
      value: /* import warning: importer.ImportType#apply Failed type conversion: this['iconSize'] */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgIconSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSvgIconSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgIconSize")(js.undefined)
        ret
    }
    @scala.inline
    def withUri(value: /* import warning: importer.ImportType#apply Failed type conversion: this['url'] */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: UrlConfig[scala.Nothing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

