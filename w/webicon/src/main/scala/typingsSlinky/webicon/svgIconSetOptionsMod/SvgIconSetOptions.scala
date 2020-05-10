package typingsSlinky.webicon.svgIconSetOptionsMod

import typingsSlinky.webicon.iconSetOptionsMod.IconSetOptions
import typingsSlinky.webicon.webiconBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.webicon.iconMod.Icon because Already inherited
- typingsSlinky.webicon.downloadableMod.Downloadable because Already inherited
- typingsSlinky.webicon.storeableMod.Storeable because var conflicts: iconIdParser, uri, url. Inlined preloadable, iconIdResolver */ @js.native
trait SvgIconSetOptions extends IconSetOptions {
  @JSName("cumulative")
  var cumulative_SvgIconSetOptions: js.UndefOr[`false`] = js.native
  /**
    * Resolves the id of the underlying source.
    *
    * @param id
    * The underlying id of the source.
    *
    * @return
    * The resolved id of the source.
    */
  var iconIdResolver: js.UndefOr[js.Function1[/* id */ String, String]] = js.native
  /**
    * A value indicating whether the source is preloadable.
    */
  var preloadable: js.UndefOr[Boolean] = js.native
}

object SvgIconSetOptions {
  @scala.inline
  def apply(): SvgIconSetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SvgIconSetOptions]
  }
  @scala.inline
  implicit class SvgIconSetOptionsOps[Self <: SvgIconSetOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCumulative(value: `false`): Self = {
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
    def withIconIdResolver(value: /* id */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconIdResolver")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIconIdResolver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconIdResolver")(js.undefined)
        ret
    }
    @scala.inline
    def withPreloadable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preloadable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreloadable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preloadable")(js.undefined)
        ret
    }
  }
  
}

