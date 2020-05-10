package typingsSlinky.tsMockito.argCaptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArgCaptor8[T0, T1, T2, T3, T4, T5, T6, T7] extends js.Object {
  def beforeLast(): js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7] = js.native
  def byCallIndex(index: Double): js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7] = js.native
  def first(): js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7] = js.native
  def last(): js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7] = js.native
  def second(): js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7] = js.native
  def third(): js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7] = js.native
}

object ArgCaptor8 {
  @scala.inline
  def apply[T0, T1, T2, T3, T4, T5, T6, T7](
    beforeLast: () => js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7],
    byCallIndex: Double => js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7],
    first: () => js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7],
    last: () => js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7],
    second: () => js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7],
    third: () => js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7]
  ): ArgCaptor8[T0, T1, T2, T3, T4, T5, T6, T7] = {
    val __obj = js.Dynamic.literal(beforeLast = js.Any.fromFunction0(beforeLast), byCallIndex = js.Any.fromFunction1(byCallIndex), first = js.Any.fromFunction0(first), last = js.Any.fromFunction0(last), second = js.Any.fromFunction0(second), third = js.Any.fromFunction0(third))
    __obj.asInstanceOf[ArgCaptor8[T0, T1, T2, T3, T4, T5, T6, T7]]
  }
  @scala.inline
  implicit class ArgCaptor8Ops[Self[t0, t1, t2, t3, t4, t5, t6, t7] <: ArgCaptor8[t0, t1, t2, t3, t4, t5, t6, t7], T0, T1, T2, T3, T4, T5, T6, T7] (val x: Self[T0, T1, T2, T3, T4, T5, T6, T7]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T0, T1, T2, T3, T4, T5, T6, T7] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T0, T1, T2, T3, T4, T5, T6, T7]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T0, T1, T2, T3, T4, T5, T6, T7]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T0, T1, T2, T3, T4, T5, T6, T7]) with Other]
    @scala.inline
    def withBeforeLast(value: () => js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7]): Self[T0, T1, T2, T3, T4, T5, T6, T7] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeLast")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withByCallIndex(value: Double => js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7]): Self[T0, T1, T2, T3, T4, T5, T6, T7] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byCallIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFirst(value: () => js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7]): Self[T0, T1, T2, T3, T4, T5, T6, T7] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLast(value: () => js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7]): Self[T0, T1, T2, T3, T4, T5, T6, T7] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSecond(value: () => js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7]): Self[T0, T1, T2, T3, T4, T5, T6, T7] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("second")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withThird(value: () => js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7]): Self[T0, T1, T2, T3, T4, T5, T6, T7] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("third")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

