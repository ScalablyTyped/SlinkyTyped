package typingsSlinky.xstream.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Aggregator[T, U]
  extends InternalProducer[U]
     with OutSender[U] {
  var insArr: js.Array[Stream[T]] = js.native
  var `type`: String = js.native
  def _start(out: Stream[U]): Unit = js.native
}

object Aggregator {
  @scala.inline
  def apply[T, U](
    _start: Stream[U] => Unit,
    _stop: () => Unit,
    insArr: js.Array[Stream[T]],
    out: Stream[U],
    `type`: String
  ): Aggregator[T, U] = {
    val __obj = js.Dynamic.literal(_start = js.Any.fromFunction1(_start), _stop = js.Any.fromFunction0(_stop), insArr = insArr.asInstanceOf[js.Any], out = out.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aggregator[T, U]]
  }
  @scala.inline
  implicit class AggregatorOps[Self[t, u] <: Aggregator[t, u], T, U] (val x: Self[T, U]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, U] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, U]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, U]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, U]) with Other]
    @scala.inline
    def with_start(value: Stream[U] => Unit): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_start")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsArr(value: js.Array[Stream[T]]): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insArr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

