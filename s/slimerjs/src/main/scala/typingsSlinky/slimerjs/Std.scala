package typingsSlinky.slimerjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Std extends js.Object {
  def read(): js.Any = js.native
  def write(arg: js.Any): Unit = js.native
}

object Std {
  @scala.inline
  def apply(read: () => js.Any, write: js.Any => Unit): Std = {
    val __obj = js.Dynamic.literal(read = js.Any.fromFunction0(read), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[Std]
  }
  @scala.inline
  implicit class StdOps[Self <: Std] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRead(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWrite(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

