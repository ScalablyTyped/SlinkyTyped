package typingsSlinky.tern.anon

import typingsSlinky.tern.inferMod.Scope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var node: typingsSlinky.estree.mod.Node
  var state: Scope | Null
}

object State {
  @scala.inline
  def apply(node: typingsSlinky.estree.mod.Node, state: Scope = null): State = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
}

