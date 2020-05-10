package typingsSlinky.slickgrid.Slick

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.slickgrid.Slick.Editors.Editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnValidationErrorEventArgs[T /* <: SlickData */] extends GridEventArgs[T] {
  var cell: Double = js.native
  var cellNode: HTMLElement = js.native
  var column: Column[T] = js.native
  var editor: Editor[T] = js.native
  var row: Double = js.native
  var validationResults: ValidateResults = js.native
}

object OnValidationErrorEventArgs {
  @scala.inline
  def apply[T](
    cell: Double,
    cellNode: HTMLElement,
    column: Column[T],
    editor: Editor[T],
    grid: Grid[T],
    row: Double,
    validationResults: ValidateResults
  ): OnValidationErrorEventArgs[T] = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], cellNode = cellNode.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], validationResults = validationResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnValidationErrorEventArgs[T]]
  }
  @scala.inline
  implicit class OnValidationErrorEventArgsOps[Self[t] <: OnValidationErrorEventArgs[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCell(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellNode(value: HTMLElement): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumn(value: Column[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditor(value: Editor[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRow(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidationResults(value: ValidateResults): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationResults")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

