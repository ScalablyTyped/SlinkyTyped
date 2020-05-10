package typingsSlinky.vueSplitpane.mod

import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SplitpaneMethods extends js.Object {
  def onClick(): Unit = js.native
  def onMouseDown(): Unit = js.native
  def onMouseMove(e: Event_): Unit = js.native
  def onMouseUp(): Unit = js.native
}

object SplitpaneMethods {
  @scala.inline
  def apply(onClick: () => Unit, onMouseDown: () => Unit, onMouseMove: Event_ => Unit, onMouseUp: () => Unit): SplitpaneMethods = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction0(onClick), onMouseDown = js.Any.fromFunction0(onMouseDown), onMouseMove = js.Any.fromFunction1(onMouseMove), onMouseUp = js.Any.fromFunction0(onMouseUp))
    __obj.asInstanceOf[SplitpaneMethods]
  }
  @scala.inline
  implicit class SplitpaneMethodsOps[Self <: SplitpaneMethods] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnClick(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnMouseDown(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseDown")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnMouseMove(value: Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnMouseUp(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseUp")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

