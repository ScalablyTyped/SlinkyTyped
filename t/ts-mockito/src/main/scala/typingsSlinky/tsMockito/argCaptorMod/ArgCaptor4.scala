package typingsSlinky.tsMockito.argCaptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArgCaptor4[T0, T1, T2, T3] extends js.Object {
  def beforeLast(): js.Tuple4[T0, T1, T2, T3] = js.native
  def byCallIndex(index: Double): js.Tuple4[T0, T1, T2, T3] = js.native
  def first(): js.Tuple4[T0, T1, T2, T3] = js.native
  def last(): js.Tuple4[T0, T1, T2, T3] = js.native
  def second(): js.Tuple4[T0, T1, T2, T3] = js.native
  def third(): js.Tuple4[T0, T1, T2, T3] = js.native
}

object ArgCaptor4 {
  @scala.inline
  def apply[T0, T1, T2, T3](
    beforeLast: () => js.Tuple4[T0, T1, T2, T3],
    byCallIndex: Double => js.Tuple4[T0, T1, T2, T3],
    first: () => js.Tuple4[T0, T1, T2, T3],
    last: () => js.Tuple4[T0, T1, T2, T3],
    second: () => js.Tuple4[T0, T1, T2, T3],
    third: () => js.Tuple4[T0, T1, T2, T3]
  ): ArgCaptor4[T0, T1, T2, T3] = {
    val __obj = js.Dynamic.literal(beforeLast = js.Any.fromFunction0(beforeLast), byCallIndex = js.Any.fromFunction1(byCallIndex), first = js.Any.fromFunction0(first), last = js.Any.fromFunction0(last), second = js.Any.fromFunction0(second), third = js.Any.fromFunction0(third))
    __obj.asInstanceOf[ArgCaptor4[T0, T1, T2, T3]]
  }
  @scala.inline
  implicit class ArgCaptor4Ops[Self[t0, t1, t2, t3] <: ArgCaptor4[t0, t1, t2, t3], T0, T1, T2, T3] (val x: Self[T0, T1, T2, T3]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T0, T1, T2, T3] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T0, T1, T2, T3]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T0, T1, T2, T3]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T0, T1, T2, T3]) with Other]
    @scala.inline
    def withBeforeLast(value: () => js.Tuple4[T0, T1, T2, T3]): Self[T0, T1, T2, T3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeLast")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withByCallIndex(value: Double => js.Tuple4[T0, T1, T2, T3]): Self[T0, T1, T2, T3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byCallIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFirst(value: () => js.Tuple4[T0, T1, T2, T3]): Self[T0, T1, T2, T3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLast(value: () => js.Tuple4[T0, T1, T2, T3]): Self[T0, T1, T2, T3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSecond(value: () => js.Tuple4[T0, T1, T2, T3]): Self[T0, T1, T2, T3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("second")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withThird(value: () => js.Tuple4[T0, T1, T2, T3]): Self[T0, T1, T2, T3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("third")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

