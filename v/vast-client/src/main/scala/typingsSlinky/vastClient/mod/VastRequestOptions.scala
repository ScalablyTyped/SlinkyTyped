package typingsSlinky.vastClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VastRequestOptions extends StObject {
  
  /**
    * Allows you to parse all the ads contained in the VAST or to parse them ad by ad or adPod by adPod (default true)
    */
  var resolveAll: js.UndefOr[Boolean] = js.native
  
  /**
    * A custom timeout for the requests (default 0)
    */
  var timeout: js.UndefOr[Double] = js.native
  
  /**
    * Custom urlhandler to be used instead of the default ones urlhandlers
    */
  var urlHandler: js.UndefOr[VASTClientUrlHandler] = js.native
  
  /**
    * A boolean to enable the withCredentials options for the XHR and FLASH URLHandlers (default false)
    */
  var withCredentials: js.UndefOr[Boolean] = js.native
  
  /**
    * A number of Wrapper responses that can be received with no InLine response (default 0)
    */
  var wrapperLimit: js.UndefOr[Double] = js.native
}
object VastRequestOptions {
  
  @scala.inline
  def apply(): VastRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VastRequestOptions]
  }
  
  @scala.inline
  implicit class VastRequestOptionsMutableBuilder[Self <: VastRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResolveAll(value: Boolean): Self = StObject.set(x, "resolveAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolveAllUndefined: Self = StObject.set(x, "resolveAll", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setUrlHandler(value: VASTClientUrlHandler): Self = StObject.set(x, "urlHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlHandlerUndefined: Self = StObject.set(x, "urlHandler", js.undefined)
    
    @scala.inline
    def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
    
    @scala.inline
    def setWrapperLimit(value: Double): Self = StObject.set(x, "wrapperLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapperLimitUndefined: Self = StObject.set(x, "wrapperLimit", js.undefined)
  }
}
