package typingsSlinky.typescriptCollections.multiRootTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlatTreeNode extends js.Object {
  var childrenCount: Double = js.native
  var hasParent: Boolean = js.native
  var id: String = js.native
  var level: Double = js.native
}

object FlatTreeNode {
  @scala.inline
  def apply(childrenCount: Double, hasParent: Boolean, id: String, level: Double): FlatTreeNode = {
    val __obj = js.Dynamic.literal(childrenCount = childrenCount.asInstanceOf[js.Any], hasParent = hasParent.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlatTreeNode]
  }
  @scala.inline
  implicit class FlatTreeNodeOps[Self <: FlatTreeNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildrenCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childrenCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasParent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

