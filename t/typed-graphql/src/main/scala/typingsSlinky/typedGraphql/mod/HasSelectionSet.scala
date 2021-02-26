package typingsSlinky.typedGraphql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typedGraphql.mod.OperationDefinition
  - typingsSlinky.typedGraphql.mod.FragmentDefinition
*/
trait HasSelectionSet extends StObject
object HasSelectionSet {
  
  @scala.inline
  def FragmentDefinition(kind: String, name: Name, selectionSet: SelectionSet, typeCondition: NamedType): typingsSlinky.typedGraphql.mod.FragmentDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any], typeCondition = typeCondition.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedGraphql.mod.FragmentDefinition]
  }
  
  @scala.inline
  def OperationDefinition(kind: String, operation: String, selectionSet: SelectionSet): typingsSlinky.typedGraphql.mod.OperationDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedGraphql.mod.OperationDefinition]
  }
}
