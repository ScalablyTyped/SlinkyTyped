package typingsSlinky.stremioAddonSdk

import typingsSlinky.stremioAddonSdk.mod.MetaPreview
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  metas  :std.Array<stremio-addon-sdk.stremio-addon-sdk.MetaPreview>} & stremio-addon-sdk.stremio-addon-sdk.Cache */
@js.native
trait metasArrayMetaPreviewCach extends js.Object {
  /**
    * (in seconds) sets the Cache-Control header to max-age=$cacheMaxAge
    * and overwrites the global cache time set in serveHTTP options.
    */
  var cacheMaxAge: js.UndefOr[Double] = js.native
  var metas: js.Array[MetaPreview] = js.native
  /**
    * (in seconds) sets the Cache-Control header to stale-if-error=$staleError.
    */
  var staleError: js.UndefOr[Double] = js.native
  /**
    * (in seconds) sets the Cache-Control header to stale-while-revalidate=$staleRevalidate.
    */
  var staleRevalidate: js.UndefOr[Double] = js.native
}

object metasArrayMetaPreviewCach {
  @scala.inline
  def apply(metas: js.Array[MetaPreview]): metasArrayMetaPreviewCach = {
    val __obj = js.Dynamic.literal(metas = metas.asInstanceOf[js.Any])
    __obj.asInstanceOf[metasArrayMetaPreviewCach]
  }
  @scala.inline
  implicit class metasArrayMetaPreviewCachOps[Self <: metasArrayMetaPreviewCach] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetas(value: js.Array[MetaPreview]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCacheMaxAge(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheMaxAge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheMaxAge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheMaxAge")(js.undefined)
        ret
    }
    @scala.inline
    def withStaleError(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staleError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaleError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staleError")(js.undefined)
        ret
    }
    @scala.inline
    def withStaleRevalidate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staleRevalidate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaleRevalidate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staleRevalidate")(js.undefined)
        ret
    }
  }
  
}

