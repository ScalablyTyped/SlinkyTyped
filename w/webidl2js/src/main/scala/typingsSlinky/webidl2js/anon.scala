package typingsSlinky.webidl2js

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Get extends StObject {
    
    var get: String = js.native
    
    var set: String = js.native
  }
  object Get {
    
    @scala.inline
    def apply(get: String, set: String): Get = {
      val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any])
      __obj.asInstanceOf[Get]
    }
    
    @scala.inline
    implicit class GetMutableBuilder[Self <: Get] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGet(value: String): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSet(value: String): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
    }
  }
}
