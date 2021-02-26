package typingsSlinky.winrtUwp.Windows.Management

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Orchestration {
  
  @js.native
  trait CurrentAppOrchestration extends StObject {
    
    /* unmapped type */
    var startSingleAppMode: js.Any = js.native
  }
  object CurrentAppOrchestration {
    
    @scala.inline
    def apply(startSingleAppMode: js.Any): CurrentAppOrchestration = {
      val __obj = js.Dynamic.literal(startSingleAppMode = startSingleAppMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[CurrentAppOrchestration]
    }
    
    @scala.inline
    implicit class CurrentAppOrchestrationMutableBuilder[Self <: CurrentAppOrchestration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStartSingleAppMode(value: js.Any): Self = StObject.set(x, "startSingleAppMode", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SingleAppModeContext extends StObject {
    
    var close: js.Any = js.native
  }
  object SingleAppModeContext {
    
    @scala.inline
    def apply(close: js.Any): SingleAppModeContext = {
      val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any])
      __obj.asInstanceOf[SingleAppModeContext]
    }
    
    @scala.inline
    implicit class SingleAppModeContextMutableBuilder[Self <: SingleAppModeContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: js.Any): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    }
  }
}
