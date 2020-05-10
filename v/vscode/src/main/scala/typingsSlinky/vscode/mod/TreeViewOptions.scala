package typingsSlinky.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeViewOptions[T] extends js.Object {
  /**
  		 * Whether the tree supports multi-select. When the tree supports multi-select and a command is executed from the tree,
  		 * the first argument to the command is the tree item that the command was executed on and the second argument is an
  		 * array containing all selected tree items.
  		 */
  var canSelectMany: js.UndefOr[Boolean] = js.native
  /**
  		 * Whether to show collapse all action or not.
  		 */
  var showCollapseAll: js.UndefOr[Boolean] = js.native
  /**
  		 * A data provider that provides tree data.
  		 */
  var treeDataProvider: TreeDataProvider[T] = js.native
}

object TreeViewOptions {
  @scala.inline
  def apply[T](treeDataProvider: TreeDataProvider[T]): TreeViewOptions[T] = {
    val __obj = js.Dynamic.literal(treeDataProvider = treeDataProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeViewOptions[T]]
  }
  @scala.inline
  implicit class TreeViewOptionsOps[Self[t] <: TreeViewOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withTreeDataProvider(value: TreeDataProvider[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeDataProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanSelectMany(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canSelectMany")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanSelectMany: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canSelectMany")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCollapseAll(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCollapseAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCollapseAll: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCollapseAll")(js.undefined)
        ret
    }
  }
  
}

