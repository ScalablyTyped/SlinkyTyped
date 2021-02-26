package typingsSlinky.tern.anon

import typingsSlinky.tern.inferMod.Scope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Node extends StObject {
  
  var node: typingsSlinky.estree.mod.Node = js.native
  
  var state: Scope = js.native
}
object Node {
  
  @scala.inline
  def apply(node: typingsSlinky.estree.mod.Node, state: Scope): Node = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  implicit class NodeMutableBuilder[Self <: Node] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNode(value: typingsSlinky.estree.mod.Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: Scope): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
