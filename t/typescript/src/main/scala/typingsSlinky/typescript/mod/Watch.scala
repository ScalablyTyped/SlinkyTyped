package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Watch[T] extends js.Object {
  /** Closes the watch */
  def close(): Unit = js.native
  /** Synchronize with host and get updated program */
  def getProgram(): T = js.native
}

object Watch {
  @scala.inline
  def apply[T](close: () => Unit, getProgram: () => T): Watch[T] = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), getProgram = js.Any.fromFunction0(getProgram))
    __obj.asInstanceOf[Watch[T]]
  }
  @scala.inline
  implicit class WatchOps[Self[t] <: Watch[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withClose(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetProgram(value: () => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProgram")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

