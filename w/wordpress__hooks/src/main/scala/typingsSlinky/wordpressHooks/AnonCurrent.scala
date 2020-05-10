package typingsSlinky.wordpressHooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCurrent[T /* <: js.Function1[/* repeated */ js.Any, _] */] extends js.Object {
  var __current: js.Array[T] = js.native
}

object AnonCurrent {
  @scala.inline
  def apply[T](__current: js.Array[T]): AnonCurrent[T] = {
    val __obj = js.Dynamic.literal(__current = __current.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCurrent[T]]
  }
  @scala.inline
  implicit class AnonCurrentOps[Self[t] <: AnonCurrent[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def with__current(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__current")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

