package typingsSlinky.sentryTypes

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.sentryTypes.eventprocessorMod.EventProcessor
import typingsSlinky.sentryTypes.hubMod.Hub
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object integrationMod {
  
  @js.native
  trait Integration extends StObject {
    
    /**
      * Returns {@link IntegrationClass.id}
      */
    var name: String = js.native
    
    /**
      * Sets the integration up only once.
      * This takes no options on purpose, options should be passed in the constructor
      */
    def setupOnce(
      addGlobalEventProcessor: js.Function1[/* callback */ EventProcessor, Unit],
      getCurrentHub: js.Function0[Hub]
    ): Unit = js.native
  }
  object Integration {
    
    @scala.inline
    def apply(
      name: String,
      setupOnce: (js.Function1[/* callback */ EventProcessor, Unit], js.Function0[Hub]) => Unit
    ): Integration = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], setupOnce = js.Any.fromFunction2(setupOnce))
      __obj.asInstanceOf[Integration]
    }
    
    @scala.inline
    implicit class IntegrationMutableBuilder[Self <: Integration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetupOnce(value: (js.Function1[/* callback */ EventProcessor, Unit], js.Function0[Hub]) => Unit): Self = StObject.set(x, "setupOnce", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait IntegrationClass[T]
    extends Instantiable1[/* args (repeated) */ js.Any, T] {
    
    /**
      * Property that holds the integration name
      */
    var id: String = js.native
  }
}
