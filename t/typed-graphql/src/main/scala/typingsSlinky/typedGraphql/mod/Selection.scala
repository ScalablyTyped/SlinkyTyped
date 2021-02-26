package typingsSlinky.typedGraphql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typedGraphql.mod.Field
  - typingsSlinky.typedGraphql.mod.FragmentSpread
  - typingsSlinky.typedGraphql.mod.InlineFragment
*/
trait Selection extends StObject
object Selection {
  
  @scala.inline
  def Field(kind: String, name: Name): typingsSlinky.typedGraphql.mod.Field = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedGraphql.mod.Field]
  }
  
  @scala.inline
  def FragmentSpread(kind: String, name: Name): typingsSlinky.typedGraphql.mod.FragmentSpread = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedGraphql.mod.FragmentSpread]
  }
  
  @scala.inline
  def InlineFragment(kind: String, selectionSet: SelectionSet): typingsSlinky.typedGraphql.mod.InlineFragment = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedGraphql.mod.InlineFragment]
  }
}
