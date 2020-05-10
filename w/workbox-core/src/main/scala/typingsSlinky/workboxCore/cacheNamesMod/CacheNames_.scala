package typingsSlinky.workboxCore.cacheNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheNames_ extends js.Object {
  val googleAnalytics: String = js.native
  val precache: String = js.native
  val prefix: String = js.native
  val runtime: String = js.native
  val suffix: String = js.native
}

object CacheNames_ {
  @scala.inline
  def apply(googleAnalytics: String, precache: String, prefix: String, runtime: String, suffix: String): CacheNames_ = {
    val __obj = js.Dynamic.literal(googleAnalytics = googleAnalytics.asInstanceOf[js.Any], precache = precache.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheNames_]
  }
  @scala.inline
  implicit class CacheNames_Ops[Self <: CacheNames_] (val x: Self) extends AnyVal {
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
    def withPrecache(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuntime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffix")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

