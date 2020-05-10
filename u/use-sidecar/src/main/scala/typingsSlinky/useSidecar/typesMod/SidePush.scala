package typingsSlinky.useSidecar.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SidePush[T] extends js.Object {
  var length: js.UndefOr[Double] = js.native
  def filter(cb: js.Function1[/* x */ T, Boolean]): SidePush[T] = js.native
  def push(data: T): Unit = js.native
}

object SidePush {
  @scala.inline
  def apply[T](filter: js.Function1[/* x */ T, Boolean] => SidePush[T], push: T => Unit): SidePush[T] = {
    val __obj = js.Dynamic.literal(filter = js.Any.fromFunction1(filter), push = js.Any.fromFunction1(push))
    __obj.asInstanceOf[SidePush[T]]
  }
  @scala.inline
  implicit class SidePushOps[Self[t] <: SidePush[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withFilter(value: js.Function1[/* x */ T, Boolean] => SidePush[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPush(value: T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLength(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLength: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.undefined)
        ret
    }
  }
  
}

