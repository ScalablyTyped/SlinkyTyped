package typingsSlinky.workboxStrategies.networkOnlyMod

import org.scalajs.dom.experimental.RequestInit
import typingsSlinky.workboxCore.workboxPluginMod.WorkboxPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkOnlyOptions extends js.Object {
  var cacheName: js.UndefOr[String] = js.native
  var fetchOptions: js.UndefOr[RequestInit] = js.native
  var plugins: js.UndefOr[js.Array[WorkboxPlugin]] = js.native
}

object NetworkOnlyOptions {
  @scala.inline
  def apply(): NetworkOnlyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkOnlyOptions]
  }
  @scala.inline
  implicit class NetworkOnlyOptionsOps[Self <: NetworkOnlyOptions] (val x: Self) extends AnyVal {
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
    def withFetchOptions(value: RequestInit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetchOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchOptions")(js.undefined)
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

