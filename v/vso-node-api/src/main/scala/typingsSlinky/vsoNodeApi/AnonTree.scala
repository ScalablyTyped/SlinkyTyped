package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTree extends js.Object {
  var none: Double = js.native
  var tree: Double = js.native
  var workItem: Double = js.native
  var workItemLink: Double = js.native
  var workItemTypeExtension: Double = js.native
}

object AnonTree {
  @scala.inline
  def apply(none: Double, tree: Double, workItem: Double, workItemLink: Double, workItemTypeExtension: Double): AnonTree = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], workItem = workItem.asInstanceOf[js.Any], workItemLink = workItemLink.asInstanceOf[js.Any], workItemTypeExtension = workItemTypeExtension.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTree]
  }
  @scala.inline
  implicit class AnonTreeOps[Self <: AnonTree] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTree(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tree")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkItem(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkItemLink(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workItemLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkItemTypeExtension(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workItemTypeExtension")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

