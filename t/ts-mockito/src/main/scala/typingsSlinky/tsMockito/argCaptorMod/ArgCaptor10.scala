package typingsSlinky.tsMockito.argCaptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArgCaptor10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9] extends js.Object {
  def beforeLast(): js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9] = js.native
  def byCallIndex(index: Double): js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9] = js.native
  def first(): js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9] = js.native
  def last(): js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9] = js.native
  def second(): js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9] = js.native
  def third(): js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9] = js.native
}

object ArgCaptor10 {
  @scala.inline
  def apply[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9](
    beforeLast: () => js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9],
    byCallIndex: Double => js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9],
    first: () => js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9],
    last: () => js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9],
    second: () => js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9],
    third: () => js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]
  ): ArgCaptor10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9] = {
    val __obj = js.Dynamic.literal(beforeLast = js.Any.fromFunction0(beforeLast), byCallIndex = js.Any.fromFunction1(byCallIndex), first = js.Any.fromFunction0(first), last = js.Any.fromFunction0(last), second = js.Any.fromFunction0(second), third = js.Any.fromFunction0(third))
    __obj.asInstanceOf[ArgCaptor10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]]
  }
  @scala.inline
  implicit class ArgCaptor10Ops[Self[t0, t1, t2, t3, t4, t5, t6, t7, t8, t9] <: ArgCaptor10[t0, t1, t2, t3, t4, t5, t6, t7, t8, t9], T0, T1, T2, T3, T4, T5, T6, T7, T8, T9] (val x: Self[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]) with Other]
    @scala.inline
    def withBeforeLast(value: () => js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]): Self[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeLast")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withByCallIndex(value: Double => js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]): Self[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byCallIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFirst(value: () => js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]): Self[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLast(value: () => js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]): Self[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSecond(value: () => js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]): Self[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("second")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withThird(value: () => js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]): Self[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("third")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

