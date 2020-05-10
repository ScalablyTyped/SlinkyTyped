package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasState extends js.Object {
  def restore(): Unit = js.native
  def save(): Unit = js.native
}

object CanvasState {
  @scala.inline
  def apply(restore: () => Unit, save: () => Unit): CanvasState = {
    val __obj = js.Dynamic.literal(restore = js.Any.fromFunction0(restore), save = js.Any.fromFunction0(save))
    __obj.asInstanceOf[CanvasState]
  }
  @scala.inline
  implicit class CanvasStateOps[Self <: CanvasState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRestore(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restore")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSave(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

