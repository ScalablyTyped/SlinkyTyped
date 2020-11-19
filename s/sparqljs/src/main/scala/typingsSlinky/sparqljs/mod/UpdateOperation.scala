package typingsSlinky.sparqljs.mod

import typingsSlinky.sparqljs.sparqljsBooleans.`false`
import typingsSlinky.sparqljs.sparqljsStrings.add
import typingsSlinky.sparqljs.sparqljsStrings.clear
import typingsSlinky.sparqljs.sparqljsStrings.copy
import typingsSlinky.sparqljs.sparqljsStrings.create
import typingsSlinky.sparqljs.sparqljsStrings.delete
import typingsSlinky.sparqljs.sparqljsStrings.deletewhere
import typingsSlinky.sparqljs.sparqljsStrings.drop
import typingsSlinky.sparqljs.sparqljsStrings.insert
import typingsSlinky.sparqljs.sparqljsStrings.insertdelete
import typingsSlinky.sparqljs.sparqljsStrings.load
import typingsSlinky.sparqljs.sparqljsStrings.move
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.sparqljs.mod.InsertDeleteOperation
  - typingsSlinky.sparqljs.mod.ManagementOperation
*/
trait UpdateOperation extends js.Object
object UpdateOperation {
  
  @scala.inline
  def ClearDropOperation(graph: GraphReference, silent: Boolean, `type`: clear | drop): UpdateOperation = {
    val __obj = js.Dynamic.literal(graph = graph.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateOperation]
  }
  
  @scala.inline
  def InsertDeleteOperation(updateType: insert | delete | deletewhere | insertdelete): UpdateOperation = {
    val __obj = js.Dynamic.literal(updateType = updateType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateOperation]
  }
  
  @scala.inline
  def CopyMoveAddOperation(destination: GraphOrDefault, silent: Boolean, source: GraphOrDefault, `type`: copy | move | add): UpdateOperation = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateOperation]
  }
  
  @scala.inline
  def CreateOperation(graph: IriTerm, silent: Boolean, `type`: create): UpdateOperation = {
    val __obj = js.Dynamic.literal(graph = graph.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateOperation]
  }
  
  @scala.inline
  def LoadOperation(destination: IriTerm | `false`, silent: Boolean, source: IriTerm, `type`: load): UpdateOperation = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateOperation]
  }
}
