package typingsSlinky.sipJs

import typingsSlinky.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import typingsSlinky.sipJs.outgoingRequestMod.RequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object registererUnregisterOptionsMod {
  
  @js.native
  trait RegistererUnregisterOptions extends StObject {
    
    /**
      * If true, unregister all contacts.
      * @defaultValue false
      */
    var all: js.UndefOr[Boolean] = js.native
    
    /** See `core` API. */
    var requestDelegate: js.UndefOr[OutgoingRequestDelegate] = js.native
    
    /** See `core` API. */
    var requestOptions: js.UndefOr[RequestOptions] = js.native
  }
  object RegistererUnregisterOptions {
    
    @scala.inline
    def apply(): RegistererUnregisterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegistererUnregisterOptions]
    }
    
    @scala.inline
    implicit class RegistererUnregisterOptionsMutableBuilder[Self <: RegistererUnregisterOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
      
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
