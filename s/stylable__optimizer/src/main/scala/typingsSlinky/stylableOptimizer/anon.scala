package typingsSlinky.stylableOptimizer

import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Names extends StObject {
    
    var names: Record[String, String] = js.native
  }
  object Names {
    
    @scala.inline
    def apply(names: Record[String, String]): Names = {
      val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any])
      __obj.asInstanceOf[Names]
    }
    
    @scala.inline
    implicit class NamesMutableBuilder[Self <: Names] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNames(value: Record[String, String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    }
  }
}
