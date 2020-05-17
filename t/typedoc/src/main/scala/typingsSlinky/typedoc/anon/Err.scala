package typingsSlinky.typedoc.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Err[T, T2, E, E2] extends js.Object {
  def err(err: E): E2 = js.native
  def ok(data: T): T2 = js.native
}

object Err {
  @scala.inline
  def apply[T, T2, E, E2](err: E => E2, ok: T => T2): Err[T, T2, E, E2] = {
    val __obj = js.Dynamic.literal(err = js.Any.fromFunction1(err), ok = js.Any.fromFunction1(ok))
    __obj.asInstanceOf[Err[T, T2, E, E2]]
  }
  @scala.inline
  implicit class ErrOps[Self[t, t2, e, e2] <: Err[t, t2, e, e2], T, T2, E, E2] (val x: Self[T, T2, E, E2]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, T2, E, E2] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, T2, E, E2]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, T2, E, E2]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, T2, E, E2]) with Other]
    @scala.inline
    def withErr(value: E => E2): Self[T, T2, E, E2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("err")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOk(value: T => T2): Self[T, T2, E, E2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ok")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

