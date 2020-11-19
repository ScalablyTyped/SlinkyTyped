package typingsSlinky.urqlCore.typesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.experimental.RequestInit
import typingsSlinky.urqlCore.anon.FnCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperationContext
  extends /* key */ StringDictionary[js.Any] {
  
  var additionalTypenames: js.UndefOr[js.Array[String]] = js.native
  
  var fetch: js.UndefOr[FnCall] = js.native
  
  var fetchOptions: js.UndefOr[RequestInit | js.Function0[RequestInit]] = js.native
  
  var meta: js.UndefOr[OperationDebugMeta] = js.native
  
  var pollInterval: js.UndefOr[Double] = js.native
  
  var preferGetMethod: js.UndefOr[Boolean] = js.native
  
  var requestPolicy: RequestPolicy = js.native
  
  var suspense: js.UndefOr[Boolean] = js.native
  
  var url: String = js.native
}
object OperationContext {
  
  @scala.inline
  def apply(requestPolicy: RequestPolicy, url: String): OperationContext = {
    val __obj = js.Dynamic.literal(requestPolicy = requestPolicy.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationContext]
  }
  
  @scala.inline
  implicit class OperationContextOps[Self <: OperationContext] (val x: Self) extends AnyVal {
    
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
    def setRequestPolicy(value: RequestPolicy): Self = this.set("requestPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalTypenamesVarargs(value: String*): Self = this.set("additionalTypenames", js.Array(value :_*))
    
    @scala.inline
    def setAdditionalTypenames(value: js.Array[String]): Self = this.set("additionalTypenames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalTypenames: Self = this.set("additionalTypenames", js.undefined)
    
    @scala.inline
    def setFetch(value: FnCall): Self = this.set("fetch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFetch: Self = this.set("fetch", js.undefined)
    
    @scala.inline
    def setFetchOptionsRequestInit(value: RequestInit): Self = this.set("fetchOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchOptionsFunction0(value: () => RequestInit): Self = this.set("fetchOptions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFetchOptions(value: RequestInit | js.Function0[RequestInit]): Self = this.set("fetchOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFetchOptions: Self = this.set("fetchOptions", js.undefined)
    
    @scala.inline
    def setMeta(value: OperationDebugMeta): Self = this.set("meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeta: Self = this.set("meta", js.undefined)
    
    @scala.inline
    def setPollInterval(value: Double): Self = this.set("pollInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePollInterval: Self = this.set("pollInterval", js.undefined)
    
    @scala.inline
    def setPreferGetMethod(value: Boolean): Self = this.set("preferGetMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferGetMethod: Self = this.set("preferGetMethod", js.undefined)
    
    @scala.inline
    def setSuspense(value: Boolean): Self = this.set("suspense", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuspense: Self = this.set("suspense", js.undefined)
  }
}
