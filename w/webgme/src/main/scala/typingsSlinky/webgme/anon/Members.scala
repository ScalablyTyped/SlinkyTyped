package typingsSlinky.webgme.anon

import typingsSlinky.webgme.Core.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Members extends js.Object {
  /** the members of the set of the node in question. */
  var members: js.UndefOr[js.Array[Node]] = js.native
  /** the name of the set. */
  var name: typingsSlinky.webgme.GmeCommon.Name = js.native
  /** the node in question. */
  var node: Node = js.native
}

object Members {
  @scala.inline
  def apply(name: typingsSlinky.webgme.GmeCommon.Name, node: Node): Members = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[Members]
  }
  @scala.inline
  implicit class MembersOps[Self <: Members] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: typingsSlinky.webgme.GmeCommon.Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode(value: Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMembers(value: js.Array[Node]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("members")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMembers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("members")(js.undefined)
        ret
    }
  }
  
}

