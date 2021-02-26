package typingsSlinky.swPrecache

import typingsSlinky.swPrecache.mod.Method
import typingsSlinky.swToolbox.mod.Options_
import typingsSlinky.swToolbox.mod.Request
import typingsSlinky.swToolbox.mod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Handler extends StObject {
    
    var handler: typingsSlinky.swPrecache.mod.Handler = js.native
    
    var method: js.UndefOr[Method] = js.native
    
    var options: js.UndefOr[Options_] = js.native
    
    var urlPattern: js.RegExp | String = js.native
  }
  object Handler {
    
    @scala.inline
    def apply(handler: typingsSlinky.swPrecache.mod.Handler, urlPattern: js.RegExp | String): Handler = {
      val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], urlPattern = urlPattern.asInstanceOf[js.Any])
      __obj.asInstanceOf[Handler]
    }
    
    @scala.inline
    implicit class HandlerMutableBuilder[Self <: Handler] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHandler(value: typingsSlinky.swPrecache.mod.Handler): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandlerFunction1(value: /* request */ Request => js.Promise[Response]): Self = StObject.set(x, "handler", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMethod(value: Method): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setOptions(value: Options_): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setUrlPattern(value: js.RegExp | String): Self = StObject.set(x, "urlPattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlPatternRegExp(value: js.RegExp): Self = StObject.set(x, "urlPattern", value.asInstanceOf[js.Any])
    }
  }
}
