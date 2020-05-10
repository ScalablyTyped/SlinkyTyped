package typingsSlinky.workboxStrategies.cacheOnlyMod

import org.scalajs.dom.experimental.serviceworkers.CacheQueryOptions
import typingsSlinky.workboxCore.workboxPluginMod.WorkboxPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheOnlyOptions extends js.Object {
  var cacheName: js.UndefOr[String] = js.native
  var matchOptions: js.UndefOr[CacheQueryOptions] = js.native
  var plugins: js.UndefOr[js.Array[WorkboxPlugin]] = js.native
}

object CacheOnlyOptions {
  @scala.inline
  def apply(): CacheOnlyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheOnlyOptions]
  }
  @scala.inline
  implicit class CacheOnlyOptionsOps[Self <: CacheOnlyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheName(value: String): Self = {
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
    @scala.inline
    def withMatchOptions(value: CacheQueryOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: js.Array[WorkboxPlugin]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
  }
  
}

