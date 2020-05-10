package typingsSlinky.tableResolver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMethod[T] extends js.Object {
  var columns: js.Array[T] = js.native
  def method(args: AnonColumn[T]): T = js.native
}

object AnonMethod {
  @scala.inline
  def apply[T](columns: js.Array[T], method: AnonColumn[T] => T): AnonMethod[T] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], method = js.Any.fromFunction1(method))
    __obj.asInstanceOf[AnonMethod[T]]
  }
  @scala.inline
  implicit class AnonMethodOps[Self[t] <: AnonMethod[t], T] (val x: Self[T]) extends AnyVal {
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
    def withMethod(value: AnonColumn[T] => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

