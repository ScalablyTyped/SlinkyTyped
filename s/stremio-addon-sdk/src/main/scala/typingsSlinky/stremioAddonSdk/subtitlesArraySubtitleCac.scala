package typingsSlinky.stremioAddonSdk

import typingsSlinky.stremioAddonSdk.mod.Subtitle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  subtitles  :std.Array<stremio-addon-sdk.stremio-addon-sdk.Subtitle>} & stremio-addon-sdk.stremio-addon-sdk.Cache */
@js.native
trait subtitlesArraySubtitleCac extends js.Object {
  /**
    * (in seconds) sets the Cache-Control header to max-age=$cacheMaxAge
    * and overwrites the global cache time set in serveHTTP options.
    */
  var cacheMaxAge: js.UndefOr[Double] = js.native
  /**
    * (in seconds) sets the Cache-Control header to stale-if-error=$staleError.
    */
  var staleError: js.UndefOr[Double] = js.native
  /**
    * (in seconds) sets the Cache-Control header to stale-while-revalidate=$staleRevalidate.
    */
  var staleRevalidate: js.UndefOr[Double] = js.native
  var subtitles: js.Array[Subtitle] = js.native
}

object subtitlesArraySubtitleCac {
  @scala.inline
  def apply(subtitles: js.Array[Subtitle]): subtitlesArraySubtitleCac = {
    val __obj = js.Dynamic.literal(subtitles = subtitles.asInstanceOf[js.Any])
    __obj.asInstanceOf[subtitlesArraySubtitleCac]
  }
  @scala.inline
  implicit class subtitlesArraySubtitleCacOps[Self <: subtitlesArraySubtitleCac] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSubtitles(value: js.Array[Subtitle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitles")(value.asInstanceOf[js.Any])
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

