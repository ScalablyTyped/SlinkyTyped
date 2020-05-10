package typingsSlinky.wordpressHooks.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hook[T /* <: js.Function1[/* repeated */ js.Any, _] */] extends js.Object {
  var handlers: js.Array[T] = js.native
  var runs: Double = js.native
}

object Hook {
  @scala.inline
  def apply[T](handlers: js.Array[T], runs: Double): Hook[T] = {
    val __obj = js.Dynamic.literal(handlers = handlers.asInstanceOf[js.Any], runs = runs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hook[T]]
  }
  @scala.inline
  implicit class HookOps[Self[t] <: Hook[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withHandlers(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuns(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

