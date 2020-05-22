package typingsSlinky.webgme.anon

import typingsSlinky.webgme.Core.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Members extends js.Object {
  /** the members of the set of the node in question. */
  var members: js.UndefOr[js.Array[Node]] = js.undefined
  /** the name of the set. */
  var name: typingsSlinky.webgme.GmeCommon.Name
  /** the node in question. */
  var node: Node
}

object Members {
  @scala.inline
  def apply(name: typingsSlinky.webgme.GmeCommon.Name, node: Node, members: js.Array[Node] = null): Members = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    if (members != null) __obj.updateDynamic("members")(members.asInstanceOf[js.Any])
    __obj.asInstanceOf[Members]
  }
}

