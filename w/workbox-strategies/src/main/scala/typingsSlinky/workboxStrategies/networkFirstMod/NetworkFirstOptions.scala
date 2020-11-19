package typingsSlinky.workboxStrategies.networkFirstMod

import org.scalajs.dom.experimental.RequestInit
import org.scalajs.dom.experimental.serviceworkers.CacheQueryOptions
import typingsSlinky.workboxCore.workboxPluginMod.WorkboxPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkFirstOptions extends js.Object {
  
  var cacheName: js.UndefOr[String] = js.native
  
  var fetchOptions: js.UndefOr[RequestInit] = js.native
  
  var matchOptions: js.UndefOr[CacheQueryOptions] = js.native
  
  var networkTimeoutSeconds: js.UndefOr[Double] = js.native
  
  var plugins: js.UndefOr[js.Array[WorkboxPlugin]] = js.native
}
object NetworkFirstOptions {
  
  @scala.inline
  def apply(): NetworkFirstOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkFirstOptions]
  }
  
  @scala.inline
  implicit class NetworkFirstOptionsOps[Self <: NetworkFirstOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCacheName(value: String): Self = this.set("cacheName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheName: Self = this.set("cacheName", js.undefined)
    
    @scala.inline
    def setFetchOptions(value: RequestInit): Self = this.set("fetchOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFetchOptions: Self = this.set("fetchOptions", js.undefined)
    
    @scala.inline
    def setMatchOptions(value: CacheQueryOptions): Self = this.set("matchOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchOptions: Self = this.set("matchOptions", js.undefined)
    
    @scala.inline
    def setNetworkTimeoutSeconds(value: Double): Self = this.set("networkTimeoutSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkTimeoutSeconds: Self = this.set("networkTimeoutSeconds", js.undefined)
    
    @scala.inline
    def setPluginsVarargs(value: WorkboxPlugin*): Self = this.set("plugins", js.Array(value :_*))
    
    @scala.inline
    def setPlugins(value: js.Array[WorkboxPlugin]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
  }
}
