package typingsSlinky.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowSelectionModel[T /* <: SlickData */, E] extends SelectionModel[T, E] {
  def getSelectedRanges(): js.Array[Double] = js.native
  def getSelectedRows(): js.Array[Double] = js.native
  def setSelectedRanges(ranges: js.Array[Double]): Unit = js.native
  def setSelectedRows(rows: js.Array[Double]): Unit = js.native
}

object RowSelectionModel {
  @scala.inline
  def apply[T, E](
    destroy: () => Unit,
    getSelectedRanges: () => js.Array[Double],
    getSelectedRows: () => js.Array[Double],
    init: Grid[T] => Unit,
    onSelectedRangesChanged: Event[E],
    setSelectedRanges: js.Array[Double] => Unit,
    setSelectedRows: js.Array[Double] => Unit
  ): RowSelectionModel[T, E] = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getSelectedRanges = js.Any.fromFunction0(getSelectedRanges), getSelectedRows = js.Any.fromFunction0(getSelectedRows), init = js.Any.fromFunction1(init), onSelectedRangesChanged = onSelectedRangesChanged.asInstanceOf[js.Any], setSelectedRanges = js.Any.fromFunction1(setSelectedRanges), setSelectedRows = js.Any.fromFunction1(setSelectedRows))
    __obj.asInstanceOf[RowSelectionModel[T, E]]
  }
  @scala.inline
  implicit class RowSelectionModelOps[Self[t, e] <: RowSelectionModel[t, e], T, E] (val x: Self[T, E]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, E] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, E]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, E]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, E]) with Other]
    @scala.inline
    def withGetSelectedRanges(value: () => js.Array[Double]): Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelectedRanges")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSelectedRows(value: () => js.Array[Double]): Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelectedRows")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetSelectedRanges(value: js.Array[Double] => Unit): Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSelectedRanges")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSelectedRows(value: js.Array[Double] => Unit): Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSelectedRows")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

