package typingsSlinky.web3CoreHelpers.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpProviderOptions extends StObject {
  
  var agent: js.UndefOr[HttpAgent] = js.native
  
  var headers: js.UndefOr[js.Array[HttpHeader]] = js.native
  
  var keepAlive: js.UndefOr[Boolean] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  var withCredentials: js.UndefOr[Boolean] = js.native
}
object HttpProviderOptions {
  
  @scala.inline
  def apply(): HttpProviderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpProviderOptions]
  }
  
  @scala.inline
  implicit class HttpProviderOptionsMutableBuilder[Self <: HttpProviderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgent(value: HttpAgent): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Array[HttpHeader]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setHeadersVarargs(value: HttpHeader*): Self = StObject.set(x, "headers", js.Array(value :_*))
    
    @scala.inline
    def setKeepAlive(value: Boolean): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
  }
}
