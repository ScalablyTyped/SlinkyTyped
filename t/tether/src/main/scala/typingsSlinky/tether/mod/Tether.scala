package typingsSlinky.tether.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// global Tether constructor
@js.native
trait Tether extends js.Object {
  def destroy(): Unit = js.native
  def disable(): Unit = js.native
  def enable(): Unit = js.native
  def position(): Unit = js.native
  def setOptions(options: ITetherOptions): Unit = js.native
}

object Tether {
  @scala.inline
  def apply(
    destroy: () => Unit,
    disable: () => Unit,
    enable: () => Unit,
    position: () => Unit,
    setOptions: ITetherOptions => Unit
  ): Tether = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), position = js.Any.fromFunction0(position), setOptions = js.Any.fromFunction1(setOptions))
    __obj.asInstanceOf[Tether]
  }
  @scala.inline
  implicit class TetherOps[Self <: Tether] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDisable(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEnable(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPosition(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetOptions(value: ITetherOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOptions")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

