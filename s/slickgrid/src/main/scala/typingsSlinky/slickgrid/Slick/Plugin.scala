package typingsSlinky.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Plugin[T /* <: SlickData */] extends js.Object {
  def destroy(): Unit = js.native
  def init(grid: Grid[T]): Unit = js.native
}

object Plugin {
  @scala.inline
  def apply[T](destroy: () => Unit, init: Grid[T] => Unit): Plugin[T] = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), init = js.Any.fromFunction1(init))
    __obj.asInstanceOf[Plugin[T]]
  }
  @scala.inline
  implicit class PluginOps[Self[t] <: Plugin[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withDestroy(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInit(value: Grid[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

