package typingsSlinky.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeViewSelectionChangeEvent[T] extends js.Object {
  /**
  		 * Selected elements.
  		 */
  val selection: js.Array[T] = js.native
}

object TreeViewSelectionChangeEvent {
  @scala.inline
  def apply[T](selection: js.Array[T]): TreeViewSelectionChangeEvent[T] = {
    val __obj = js.Dynamic.literal(selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeViewSelectionChangeEvent[T]]
  }
  @scala.inline
  implicit class TreeViewSelectionChangeEventOps[Self[t] <: TreeViewSelectionChangeEvent[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withSelection(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

