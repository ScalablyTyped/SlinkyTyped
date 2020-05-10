package typingsSlinky.tsMockito.argCaptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArgCaptor3[T0, T1, T2] extends js.Object {
  def beforeLast(): js.Tuple3[T0, T1, T2] = js.native
  def byCallIndex(index: Double): js.Tuple3[T0, T1, T2] = js.native
  def first(): js.Tuple3[T0, T1, T2] = js.native
  def last(): js.Tuple3[T0, T1, T2] = js.native
  def second(): js.Tuple3[T0, T1, T2] = js.native
  def third(): js.Tuple3[T0, T1, T2] = js.native
}

object ArgCaptor3 {
  @scala.inline
  def apply[T0, T1, T2](
    beforeLast: () => js.Tuple3[T0, T1, T2],
    byCallIndex: Double => js.Tuple3[T0, T1, T2],
    first: () => js.Tuple3[T0, T1, T2],
    last: () => js.Tuple3[T0, T1, T2],
    second: () => js.Tuple3[T0, T1, T2],
    third: () => js.Tuple3[T0, T1, T2]
  ): ArgCaptor3[T0, T1, T2] = {
    val __obj = js.Dynamic.literal(beforeLast = js.Any.fromFunction0(beforeLast), byCallIndex = js.Any.fromFunction1(byCallIndex), first = js.Any.fromFunction0(first), last = js.Any.fromFunction0(last), second = js.Any.fromFunction0(second), third = js.Any.fromFunction0(third))
    __obj.asInstanceOf[ArgCaptor3[T0, T1, T2]]
  }
  @scala.inline
  implicit class ArgCaptor3Ops[Self[t0, t1, t2] <: ArgCaptor3[t0, t1, t2], T0, T1, T2] (val x: Self[T0, T1, T2]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T0, T1, T2] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T0, T1, T2]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T0, T1, T2]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T0, T1, T2]) with Other]
    @scala.inline
    def withBeforeLast(value: () => js.Tuple3[T0, T1, T2]): Self[T0, T1, T2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeLast")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withByCallIndex(value: Double => js.Tuple3[T0, T1, T2]): Self[T0, T1, T2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byCallIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFirst(value: () => js.Tuple3[T0, T1, T2]): Self[T0, T1, T2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLast(value: () => js.Tuple3[T0, T1, T2]): Self[T0, T1, T2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSecond(value: () => js.Tuple3[T0, T1, T2]): Self[T0, T1, T2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("second")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withThird(value: () => js.Tuple3[T0, T1, T2]): Self[T0, T1, T2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("third")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

