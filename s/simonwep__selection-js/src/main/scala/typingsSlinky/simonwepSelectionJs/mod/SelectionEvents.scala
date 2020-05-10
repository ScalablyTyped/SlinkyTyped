package typingsSlinky.simonwepSelectionJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectionEvents extends js.Object {
  def beforestart(e: SelectionEvent): Boolean = js.native
  def move(e: SelectionEvent): Unit = js.native
  def start(e: SelectionEvent): Unit = js.native
  def stop(e: SelectionEvent): Unit = js.native
}

object SelectionEvents {
  @scala.inline
  def apply(
    beforestart: SelectionEvent => Boolean,
    move: SelectionEvent => Unit,
    start: SelectionEvent => Unit,
    stop: SelectionEvent => Unit
  ): SelectionEvents = {
    val __obj = js.Dynamic.literal(beforestart = js.Any.fromFunction1(beforestart), move = js.Any.fromFunction1(move), start = js.Any.fromFunction1(start), stop = js.Any.fromFunction1(stop))
    __obj.asInstanceOf[SelectionEvents]
  }
  @scala.inline
  implicit class SelectionEventsOps[Self <: SelectionEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeforestart(value: SelectionEvent => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforestart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMove(value: SelectionEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("move")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStart(value: SelectionEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStop(value: SelectionEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

