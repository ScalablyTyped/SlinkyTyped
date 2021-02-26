package typingsSlinky.workboxStrategies

import org.scalajs.dom.experimental.Request
import org.scalajs.dom.experimental.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object makeRequestCallbackMod {
  
  type MakeRequestCallback = js.Function1[/* options */ MakeRequestCallbackOptions, js.Promise[Response]]
  
  @js.native
  trait MakeRequestCallbackOptions extends StObject {
    
    var event: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEvent */ js.Any
      ] = js.native
    
    var request: String | Request = js.native
  }
  object MakeRequestCallbackOptions {
    
    @scala.inline
    def apply(request: String | Request): MakeRequestCallbackOptions = {
      val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[MakeRequestCallbackOptions]
    }
    
    @scala.inline
    implicit class MakeRequestCallbackOptionsMutableBuilder[Self <: MakeRequestCallbackOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvent(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEvent */ js.Any
      ): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setRequest(value: String | Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestRequest(value: Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
}
