package typingsSlinky.typedGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typedGraphql.mod.Field
  - typingsSlinky.typedGraphql.mod.FragmentSpread
  - typingsSlinky.typedGraphql.mod.InlineFragment
*/
trait Selection extends js.Object
object Selection {
  
  @scala.inline
  def Field(kind: String, name: Name): Selection = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selection]
  }
  
  @scala.inline
  def FragmentSpread(kind: String, name: Name): Selection = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selection]
  }
  
  @scala.inline
  def InlineFragment(kind: String, selectionSet: SelectionSet): Selection = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selection]
  }
}
