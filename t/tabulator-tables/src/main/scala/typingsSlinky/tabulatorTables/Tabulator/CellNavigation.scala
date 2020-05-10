package typingsSlinky.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Components-------------------------------------------------------------------
@js.native
trait CellNavigation extends js.Object {
  /** down - move to the same cell in the row below */
  def down(): Unit = js.native
  /** left - next editable cell on the left, return false if none available on row */
  def left(): Boolean = js.native
  /** next - next editable cell on the right, if none available move to left most editable cell on the row below */
  def next(): Boolean = js.native
  /** prev - next editable cell on the left, if none available move to the right most editable cell on the row above */
  def prev(): Boolean = js.native
  /** right - next editable cell on the right, return false if none available on row */
  def right(): Boolean = js.native
  /** up - move to the same cell in the row above */
  def up(): Unit = js.native
}

object CellNavigation {
  @scala.inline
  def apply(
    down: () => Unit,
    left: () => Boolean,
    next: () => Boolean,
    prev: () => Boolean,
    right: () => Boolean,
    up: () => Unit
  ): CellNavigation = {
    val __obj = js.Dynamic.literal(down = js.Any.fromFunction0(down), left = js.Any.fromFunction0(left), next = js.Any.fromFunction0(next), prev = js.Any.fromFunction0(prev), right = js.Any.fromFunction0(right), up = js.Any.fromFunction0(up))
    __obj.asInstanceOf[CellNavigation]
  }
  @scala.inline
  implicit class CellNavigationOps[Self <: CellNavigation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDown(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("down")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLeft(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNext(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPrev(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prev")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRight(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUp(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("up")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

