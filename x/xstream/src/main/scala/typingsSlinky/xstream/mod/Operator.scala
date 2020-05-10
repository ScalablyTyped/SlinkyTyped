package typingsSlinky.xstream.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Operator[T, R]
  extends InternalProducer[R]
     with InternalListener[T]
     with OutSender[R] {
  var ins: Stream[T] = js.native
  var `type`: String = js.native
  def _start(out: Stream[R]): Unit = js.native
}

object Operator {
  @scala.inline
  def apply[T, R](
    _c: () => Unit,
    _e: js.Any => Unit,
    _n: T => Unit,
    _start: Stream[R] => Unit,
    _stop: () => Unit,
    ins: Stream[T],
    out: Stream[R],
    `type`: String
  ): Operator[T, R] = {
    val __obj = js.Dynamic.literal(_c = js.Any.fromFunction0(_c), _e = js.Any.fromFunction1(_e), _n = js.Any.fromFunction1(_n), _start = js.Any.fromFunction1(_start), _stop = js.Any.fromFunction0(_stop), ins = ins.asInstanceOf[js.Any], out = out.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operator[T, R]]
  }
  @scala.inline
  implicit class OperatorOps[Self[t, r] <: Operator[t, r], T, R] (val x: Self[T, R]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, R] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, R]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, R]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, R]) with Other]
    @scala.inline
    def with_start(value: Stream[R] => Unit): Self[T, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_start")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIns(value: Stream[T]): Self[T, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self[T, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

