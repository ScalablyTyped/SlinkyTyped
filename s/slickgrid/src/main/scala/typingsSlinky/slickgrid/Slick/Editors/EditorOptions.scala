package typingsSlinky.slickgrid.Slick.Editors

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.slickgrid.Slick.CellPosition
import typingsSlinky.slickgrid.Slick.Column
import typingsSlinky.slickgrid.Slick.Grid
import typingsSlinky.slickgrid.Slick.SlickData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditorOptions[T /* <: SlickData */] extends js.Object {
  var cancelChanges: js.UndefOr[js.Function0[Unit]] = js.native
  var column: Column[T] = js.native
  var commitChanges: js.UndefOr[js.Function0[Unit]] = js.native
  var container: HTMLElement = js.native
  var grid: Grid[T] = js.native
  var gridPosition: js.UndefOr[CellPosition] = js.native
  var item: js.UndefOr[T] = js.native
  var position: js.UndefOr[CellPosition] = js.native
}

object EditorOptions {
  @scala.inline
  def apply[T](column: Column[T], container: HTMLElement, grid: Grid[T]): EditorOptions[T] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorOptions[T]]
  }
  @scala.inline
  implicit class EditorOptionsOps[Self[t] <: EditorOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withColumn(value: Column[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainer(value: HTMLElement): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGrid(value: Grid[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCancelChanges(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelChanges")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCancelChanges: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelChanges")(js.undefined)
        ret
    }
    @scala.inline
    def withCommitChanges(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitChanges")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCommitChanges: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitChanges")(js.undefined)
        ret
    }
    @scala.inline
    def withGridPosition(value: CellPosition): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridPosition: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withItem(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItem: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: CellPosition): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
  }
  
}

