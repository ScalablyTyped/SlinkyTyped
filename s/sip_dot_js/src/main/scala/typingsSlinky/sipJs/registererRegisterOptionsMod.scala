package typingsSlinky.sipJs

import typingsSlinky.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import typingsSlinky.sipJs.outgoingRequestMod.RequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object registererRegisterOptionsMod {
  
  @js.native
  trait RegistererRegisterOptions extends StObject {
    
    /** See `core` API. */
    var requestDelegate: js.UndefOr[OutgoingRequestDelegate] = js.native
    
    /** See `core` API. */
    var requestOptions: js.UndefOr[RequestOptions] = js.native
  }
  object RegistererRegisterOptions {
    
    @scala.inline
    def apply(): RegistererRegisterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegistererRegisterOptions]
    }
    
    @scala.inline
    implicit class RegistererRegisterOptionsMutableBuilder[Self <: RegistererRegisterOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequestDelegate(value: OutgoingRequestDelegate): Self = StObject.set(x, "requestDelegate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestDelegateUndefined: Self = StObject.set(x, "requestDelegate", js.undefined)
      
      @scala.inline
      def setRequestOptions(value: RequestOptions): Self = StObject.set(x, "requestOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestOptionsUndefined: Self = StObject.set(x, "requestOptions", js.undefined)
    }
  }
}
