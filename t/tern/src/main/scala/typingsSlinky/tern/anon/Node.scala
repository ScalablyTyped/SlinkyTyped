package typingsSlinky.tern.anon

import typingsSlinky.tern.inferMod.Scope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  var node: typingsSlinky.estree.mod.Node
  var state: Scope
}

object Node {
  @scala.inline
  def apply(node: typingsSlinky.estree.mod.Node, state: Scope): Node = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}

