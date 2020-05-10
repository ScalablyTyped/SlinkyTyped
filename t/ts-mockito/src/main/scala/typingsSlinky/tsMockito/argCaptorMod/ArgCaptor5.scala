package typingsSlinky.tsMockito.argCaptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArgCaptor5[T0, T1, T2, T3, T4] extends js.Object {
  def beforeLast(): js.Tuple5[T0, T1, T2, T3, T4] = js.native
  def byCallIndex(index: Double): js.Tuple5[T0, T1, T2, T3, T4] = js.native
  def first(): js.Tuple5[T0, T1, T2, T3, T4] = js.native
  def last(): js.Tuple5[T0, T1, T2, T3, T4] = js.native
  def second(): js.Tuple5[T0, T1, T2, T3, T4] = js.native
  def third(): js.Tuple5[T0, T1, T2, T3, T4] = js.native
}

object ArgCaptor5 {
  @scala.inline
  def apply[T0, T1, T2, T3, T4](
    beforeLast: () => js.Tuple5[T0, T1, T2, T3, T4],
    byCallIndex: Double => js.Tuple5[T0, T1, T2, T3, T4],
    first: () => js.Tuple5[T0, T1, T2, T3, T4],
    last: () => js.Tuple5[T0, T1, T2, T3, T4],
    second: () => js.Tuple5[T0, T1, T2, T3, T4],
    third: () => js.Tuple5[T0, T1, T2, T3, T4]
  ): ArgCaptor5[T0, T1, T2, T3, T4] = {
    val __obj = js.Dynamic.literal(beforeLast = js.Any.fromFunction0(beforeLast), byCallIndex = js.Any.fromFunction1(byCallIndex), first = js.Any.fromFunction0(first), last = js.Any.fromFunction0(last), second = js.Any.fromFunction0(second), third = js.Any.fromFunction0(third))
    __obj.asInstanceOf[ArgCaptor5[T0, T1, T2, T3, T4]]
  }
  @scala.inline
  implicit class ArgCaptor5Ops[Self[t0, t1, t2, t3, t4] <: ArgCaptor5[t0, t1, t2, t3, t4], T0, T1, T2, T3, T4] (val x: Self[T0, T1, T2, T3, T4]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T0, T1, T2, T3, T4] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T0, T1, T2, T3, T4]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T0, T1, T2, T3, T4]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T0, T1, T2, T3, T4]) with Other]
    @scala.inline
    def withBeforeLast(value: () => js.Tuple5[T0, T1, T2, T3, T4]): Self[T0, T1, T2, T3, T4] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeLast")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withByCallIndex(value: Double => js.Tuple5[T0, T1, T2, T3, T4]): Self[T0, T1, T2, T3, T4] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byCallIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFirst(value: () => js.Tuple5[T0, T1, T2, T3, T4]): Self[T0, T1, T2, T3, T4] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLast(value: () => js.Tuple5[T0, T1, T2, T3, T4]): Self[T0, T1, T2, T3, T4] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSecond(value: () => js.Tuple5[T0, T1, T2, T3, T4]): Self[T0, T1, T2, T3, T4] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("second")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withThird(value: () => js.Tuple5[T0, T1, T2, T3, T4]): Self[T0, T1, T2, T3, T4] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("third")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

