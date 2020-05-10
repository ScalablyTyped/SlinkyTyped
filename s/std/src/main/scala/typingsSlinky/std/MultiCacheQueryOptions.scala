package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiCacheQueryOptions extends CacheQueryOptions {
  var cacheName: js.UndefOr[java.lang.String] = js.native
}

object MultiCacheQueryOptions {
  @scala.inline
  def apply(): MultiCacheQueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiCacheQueryOptions]
  }
  @scala.inline
  implicit class MultiCacheQueryOptionsOps[Self <: MultiCacheQueryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheName(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheName")(js.undefined)
        ret
    }
  }
  
}

