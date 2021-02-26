package typingsSlinky.valdr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Invalid extends StObject {
    
    var invalid: String = js.native
    
    var valid: String = js.native
  }
  object Invalid {
    
    @scala.inline
    def apply(invalid: String, valid: String): Invalid = {
      val __obj = js.Dynamic.literal(invalid = invalid.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Invalid]
    }
    
    @scala.inline
    implicit class InvalidMutableBuilder[Self <: Invalid] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInvalid(value: String): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValid(value: String): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    }
  }
}
