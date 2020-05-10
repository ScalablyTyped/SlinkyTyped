package typingsSlinky.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An array of dialog nodes. */
@js.native
trait DialogNodeCollection extends js.Object {
  /** An array of objects describing the dialog nodes defined for the workspace. */
  var dialog_nodes: js.Array[DialogNode] = js.native
  /** The pagination data for the returned objects. */
  var pagination: Pagination = js.native
}

object DialogNodeCollection {
  @scala.inline
  def apply(dialog_nodes: js.Array[DialogNode], pagination: Pagination): DialogNodeCollection = {
    val __obj = js.Dynamic.literal(dialog_nodes = dialog_nodes.asInstanceOf[js.Any], pagination = pagination.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogNodeCollection]
  }
  @scala.inline
  implicit class DialogNodeCollectionOps[Self <: DialogNodeCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialog_nodes(value: js.Array[DialogNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialog_nodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPagination(value: Pagination): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagination")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

