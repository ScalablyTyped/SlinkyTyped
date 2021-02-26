package typingsSlinky.stylableUniDriver

import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait ElementRemoteApi extends StObject {
    
    def attr(name: String): js.Promise[String | Null] = js.native
    
    def hasClass(s: String): js.Promise[Boolean] = js.native
  }
  object ElementRemoteApi {
    
    @scala.inline
    def apply(attr: String => js.Promise[String | Null], hasClass: String => js.Promise[Boolean]): ElementRemoteApi = {
      val __obj = js.Dynamic.literal(attr = js.Any.fromFunction1(attr), hasClass = js.Any.fromFunction1(hasClass))
      __obj.asInstanceOf[ElementRemoteApi]
    }
    
    @scala.inline
    implicit class ElementRemoteApiMutableBuilder[Self <: ElementRemoteApi] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttr(value: String => js.Promise[String | Null]): Self = StObject.set(x, "attr", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHasClass(value: String => js.Promise[Boolean]): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait MinimalStylesheet extends StObject {
    
    def cssStates(states: Record[String, StateValue]): String = js.native
  }
  object MinimalStylesheet {
    
    @scala.inline
    def apply(cssStates: Record[String, StateValue] => String): MinimalStylesheet = {
      val __obj = js.Dynamic.literal(cssStates = js.Any.fromFunction1(cssStates))
      __obj.asInstanceOf[MinimalStylesheet]
    }
    
    @scala.inline
    implicit class MinimalStylesheetMutableBuilder[Self <: MinimalStylesheet] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCssStates(value: Record[String, StateValue] => String): Self = StObject.set(x, "cssStates", js.Any.fromFunction1(value))
    }
  }
  
  type StateValue = Boolean | Double | String
}
