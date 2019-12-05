package typingsSlinky.slateDashReact

import typingsSlinky.slate.slateMod.Node
import typingsSlinky.slateDashReact.slateDashReactMod.SlateType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NodeType extends js.Object {
  var node: Node
  var `type`: SlateType
}

object Anon_NodeType {
  @scala.inline
  def apply(node: Node, `type`: SlateType): Anon_NodeType = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_NodeType]
  }
}

