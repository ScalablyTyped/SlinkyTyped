package typingsSlinky.superagentProxy

import typingsSlinky.superagent.mod.SuperAgentStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("superagent-proxy", JSImport.Namespace)
  @js.native
  def apply(s: SuperAgentStatic): Unit = js.native
  
  /* augmented module */
  object superagentAugmentingMod {
    
    @js.native
    trait Request extends StObject {
      
      def proxy(url: String): this.type = js.native
    }
    object Request {
      
      @scala.inline
      def apply(proxy: String => Request): Request = {
        val __obj = js.Dynamic.literal(proxy = js.Any.fromFunction1(proxy))
        __obj.asInstanceOf[Request]
      }
      
      @scala.inline
      implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setProxy(value: String => Request): Self = StObject.set(x, "proxy", js.Any.fromFunction1(value))
      }
    }
  }
}
