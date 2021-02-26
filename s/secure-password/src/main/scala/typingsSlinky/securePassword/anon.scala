package typingsSlinky.securePassword

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Memlimit extends StObject {
    
    var memlimit: js.UndefOr[Double] = js.native
    
    var opslimit: js.UndefOr[Double] = js.native
  }
  object Memlimit {
    
    @scala.inline
    def apply(): Memlimit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Memlimit]
    }
    
    @scala.inline
    implicit class MemlimitMutableBuilder[Self <: Memlimit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMemlimit(value: Double): Self = StObject.set(x, "memlimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemlimitUndefined: Self = StObject.set(x, "memlimit", js.undefined)
      
      @scala.inline
      def setOpslimit(value: Double): Self = StObject.set(x, "opslimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpslimitUndefined: Self = StObject.set(x, "opslimit", js.undefined)
    }
  }
}
