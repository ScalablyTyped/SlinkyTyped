package typingsSlinky.workboxCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<workbox-core.workbox-core/setCacheNameDetails.CacheNameDetails> */
@js.native
trait PartialCacheNameDetails extends js.Object {
  var googleAnalytics: js.UndefOr[String] = js.native
  var precache: js.UndefOr[String] = js.native
  var prefix: js.UndefOr[String] = js.native
  var runtime: js.UndefOr[String] = js.native
  var suffix: js.UndefOr[String] = js.native
}

object PartialCacheNameDetails {
  @scala.inline
  def apply(): PartialCacheNameDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCacheNameDetails]
  }
  @scala.inline
  implicit class PartialCacheNameDetailsOps[Self <: PartialCacheNameDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGoogleAnalytics(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleAnalytics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoogleAnalytics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleAnalytics")(js.undefined)
        ret
    }
    @scala.inline
    def withPrecache(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrecache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precache")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withRuntime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuntime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtime")(js.undefined)
        ret
    }
    @scala.inline
    def withSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffix")(js.undefined)
        ret
    }
  }
  
}

