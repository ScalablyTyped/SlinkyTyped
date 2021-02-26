package typingsSlinky.xstate

import typingsSlinky.xstate.anon.ContextAny
import typingsSlinky.xstate.mod.StateNode
import typingsSlinky.xstate.typesMod.EventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scxmlMod {
  
  @JSImport("xstate/lib/scxml", "toMachine")
  @js.native
  def toMachine(xml: String, options: ScxmlToMachineOptions): StateNode[_, _, EventObject, ContextAny] = js.native
  
  @js.native
  trait ScxmlToMachineOptions extends StObject {
    
    var delimiter: js.UndefOr[String] = js.native
  }
  object ScxmlToMachineOptions {
    
    @scala.inline
    def apply(): ScxmlToMachineOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScxmlToMachineOptions]
    }
    
    @scala.inline
    implicit class ScxmlToMachineOptionsMutableBuilder[Self <: ScxmlToMachineOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
    }
  }
}
