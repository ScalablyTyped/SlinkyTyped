package typingsSlinky.symbolTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFilter[THIS, T /* <: js.Object */] extends js.Object {
  var thisArg: THIS = js.native
  def filter(`object`: T): js.Any = js.native
}

object AnonFilter {
  @scala.inline
  def apply[THIS, T](filter: T => js.Any, thisArg: THIS): AnonFilter[THIS, T] = {
    val __obj = js.Dynamic.literal(filter = js.Any.fromFunction1(filter), thisArg = thisArg.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFilter[THIS, T]]
  }
  @scala.inline
  implicit class AnonFilterOps[Self[`this`, t] <: AnonFilter[`this`, t], THIS, T] (val x: Self[THIS, T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[THIS, T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[THIS, T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[THIS, T]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[THIS, T]) with Other]
    @scala.inline
    def withFilter(value: T => js.Any): Self[THIS, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withThisArg(value: THIS): Self[THIS, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thisArg")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

