package typingsSlinky.sixRuntime.Six_.plugins.static

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait cacheConf extends js.Object {
  var cache: Boolean = js.native
  var defer: Boolean = js.native
  var extensions: Boolean | js.Array[String] = js.native
  var gzip: Boolean = js.native
  var index: String = js.native
  var maxAge: Double = js.native
}

object cacheConf {
  @scala.inline
  def apply(
    cache: Boolean,
    defer: Boolean,
    extensions: Boolean | js.Array[String],
    gzip: Boolean,
    index: String,
    maxAge: Double
  ): cacheConf = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], defer = defer.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], gzip = gzip.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], maxAge = maxAge.asInstanceOf[js.Any])
    __obj.asInstanceOf[cacheConf]
  }
  @scala.inline
  implicit class cacheConfOps[Self <: cacheConf] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtensions(value: Boolean | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGzip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gzip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxAge(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAge")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

