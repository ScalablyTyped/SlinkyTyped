package typingsSlinky.tableResolver.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Method[T] extends js.Object {
  var columns: js.Array[T] = js.native
  def method(args: Column[T]): T = js.native
}

object Method {
  @scala.inline
  def apply[T](columns: js.Array[T], method: Column[T] => T): Method[T] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], method = js.Any.fromFunction1(method))
    __obj.asInstanceOf[Method[T]]
  }
  @scala.inline
  implicit class MethodOps[Self[t] <: Method[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withColumns(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethod(value: Column[T] => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

