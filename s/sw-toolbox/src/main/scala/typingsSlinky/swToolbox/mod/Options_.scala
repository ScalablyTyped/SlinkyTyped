package typingsSlinky.swToolbox.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options_ extends js.Object {
  var cache: CacheOptions = js.native
  var debug: Boolean = js.native
  var networkTimeoutSeconds: Double = js.native
}

object Options_ {
  @scala.inline
  def apply(cache: CacheOptions, debug: Boolean, networkTimeoutSeconds: Double): Options_ = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], networkTimeoutSeconds = networkTimeoutSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options_]
  }
  @scala.inline
  implicit class Options_Ops[Self <: Options_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCache(value: CacheOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetworkTimeoutSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkTimeoutSeconds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

