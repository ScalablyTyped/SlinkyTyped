package typingsSlinky.workboxRouting

import org.scalajs.dom.experimental.Request
import org.scalajs.dom.experimental.Response
import org.scalajs.dom.experimental.URL
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routeHandlerMod {
  
  type RouteHandler = RouteHandlerCallback | RouteHandlerObject
  
  type RouteHandlerCallback = js.Function1[/* context */ RouteHandlerCallbackContext, js.Promise[Response]]
  
  @js.native
  trait RouteHandlerCallbackContext extends StObject {
    
    var event: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FetchEvent */ js.Any
      ] = js.native
    
    var params: js.UndefOr[js.Array[String] | (Record[String, String])] = js.native
    
    var request: js.UndefOr[Request] = js.native
    
    var url: URL = js.native
  }
  object RouteHandlerCallbackContext {
    
    @scala.inline
    def apply(url: URL): RouteHandlerCallbackContext = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteHandlerCallbackContext]
    }
    
    @scala.inline
    implicit class RouteHandlerCallbackContextMutableBuilder[Self <: RouteHandlerCallbackContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvent(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FetchEvent */ js.Any
      ): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setParams(value: js.Array[String] | (Record[String, String])): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setParamsVarargs(value: String*): Self = StObject.set(x, "params", js.Array(value :_*))
      
      @scala.inline
      def setRequest(value: Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      @scala.inline
      def setUrl(value: URL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RouteHandlerObject extends StObject {
    
    def handle(context: RouteHandlerCallbackContext): js.Promise[Response] = js.native
    @JSName("handle")
    var handle_Original: RouteHandlerCallback = js.native
  }
}
