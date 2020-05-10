package typingsSlinky.tsMockito.argCaptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArgCaptor2[T0, T1] extends js.Object {
  def beforeLast(): js.Tuple2[T0, T1] = js.native
  def byCallIndex(index: Double): js.Tuple2[T0, T1] = js.native
  def first(): js.Tuple2[T0, T1] = js.native
  def last(): js.Tuple2[T0, T1] = js.native
  def second(): js.Tuple2[T0, T1] = js.native
  def third(): js.Tuple2[T0, T1] = js.native
}

object ArgCaptor2 {
  @scala.inline
  def apply[T0, T1](
    beforeLast: () => js.Tuple2[T0, T1],
    byCallIndex: Double => js.Tuple2[T0, T1],
    first: () => js.Tuple2[T0, T1],
    last: () => js.Tuple2[T0, T1],
    second: () => js.Tuple2[T0, T1],
    third: () => js.Tuple2[T0, T1]
  ): ArgCaptor2[T0, T1] = {
    val __obj = js.Dynamic.literal(beforeLast = js.Any.fromFunction0(beforeLast), byCallIndex = js.Any.fromFunction1(byCallIndex), first = js.Any.fromFunction0(first), last = js.Any.fromFunction0(last), second = js.Any.fromFunction0(second), third = js.Any.fromFunction0(third))
    __obj.asInstanceOf[ArgCaptor2[T0, T1]]
  }
  @scala.inline
  implicit class ArgCaptor2Ops[Self[t0, t1] <: ArgCaptor2[t0, t1], T0, T1] (val x: Self[T0, T1]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T0, T1] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T0, T1]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T0, T1]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T0, T1]) with Other]
    @scala.inline
    def withBeforeLast(value: () => js.Tuple2[T0, T1]): Self[T0, T1] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeLast")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withByCallIndex(value: Double => js.Tuple2[T0, T1]): Self[T0, T1] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byCallIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFirst(value: () => js.Tuple2[T0, T1]): Self[T0, T1] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLast(value: () => js.Tuple2[T0, T1]): Self[T0, T1] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSecond(value: () => js.Tuple2[T0, T1]): Self[T0, T1] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("second")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withThird(value: () => js.Tuple2[T0, T1]): Self[T0, T1] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("third")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

