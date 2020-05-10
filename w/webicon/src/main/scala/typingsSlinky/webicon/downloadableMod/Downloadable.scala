package typingsSlinky.webicon.downloadableMod

import typingsSlinky.webicon.iconMod.Icon
import typingsSlinky.webicon.urlConfigMod.UrlConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Downloadable[TUriParam] extends Icon {
  /**
    * An alias of the `url`-property.
    */
  var uri: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: this['url'] */ js.Any
  ] = js.native
  /**
    * The url to load the source from.
    */
  var url: js.UndefOr[UrlConfig[TUriParam]] = js.native
}

object Downloadable {
  @scala.inline
  def apply[TUriParam](): Downloadable[TUriParam] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Downloadable[TUriParam]]
  }
  @scala.inline
  implicit class DownloadableOps[Self[turiparam] <: Downloadable[turiparam], TUriParam] (val x: Self[TUriParam]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TUriParam] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TUriParam]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TUriParam] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TUriParam] with Other]
    @scala.inline
    def withUri(value: /* import warning: importer.ImportType#apply Failed type conversion: this['url'] */ js.Any): Self[TUriParam] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUri: Self[TUriParam] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: UrlConfig[TUriParam]): Self[TUriParam] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self[TUriParam] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

