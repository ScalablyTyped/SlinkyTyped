package typingsSlinky.sparqljs.mod

import typingsSlinky.sparqljs.sparqljsStrings.clear
import typingsSlinky.sparqljs.sparqljsStrings.drop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClearDropOperation extends ManagementOperation {
  
  var graph: GraphReference = js.native
  
  var silent: Boolean = js.native
  
  var `type`: clear | drop = js.native
}
object ClearDropOperation {
  
  @scala.inline
  def apply(graph: GraphReference, silent: Boolean, `type`: clear | drop): ClearDropOperation = {
    val __obj = js.Dynamic.literal(graph = graph.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearDropOperation]
  }
  
  @scala.inline
  implicit class ClearDropOperationMutableBuilder[Self <: ClearDropOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGraph(value: GraphReference): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: clear | drop): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
