package typingsSlinky.slickgrid.Slick

import typingsSlinky.slickgrid.Slick.Editors.Editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnBeforeCellEditorDestroyEventArgs[T /* <: SlickData */] extends GridEventArgs[T] {
  var editor: Editor[T] = js.native
}

object OnBeforeCellEditorDestroyEventArgs {
  @scala.inline
  def apply[T](editor: Editor[T], grid: Grid[T]): OnBeforeCellEditorDestroyEventArgs[T] = {
    val __obj = js.Dynamic.literal(editor = editor.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBeforeCellEditorDestroyEventArgs[T]]
  }
  @scala.inline
  implicit class OnBeforeCellEditorDestroyEventArgsOps[Self[t] <: OnBeforeCellEditorDestroyEventArgs[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withEditor(value: Editor[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

