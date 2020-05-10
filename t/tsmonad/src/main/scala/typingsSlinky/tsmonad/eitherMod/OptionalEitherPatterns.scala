package typingsSlinky.tsmonad.eitherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<tsmonad.tsmonad/lib/src/either.EitherPatterns<L, R, T>> */
@js.native
trait OptionalEitherPatterns[L, R, T] extends js.Object {
  var left: js.UndefOr[js.Function1[/* l */ L, T]] = js.native
  var right: js.UndefOr[js.Function1[/* r */ R, T]] = js.native
}

object OptionalEitherPatterns {
  @scala.inline
  def apply[L, R, T](): OptionalEitherPatterns[L, R, T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionalEitherPatterns[L, R, T]]
  }
  @scala.inline
  implicit class OptionalEitherPatternsOps[Self[l, r, t] <: OptionalEitherPatterns[l, r, t], L, R, T] (val x: Self[L, R, T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[L, R, T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[L, R, T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[L, R, T]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[L, R, T]) with Other]
    @scala.inline
    def withLeft(value: /* l */ L => T): Self[L, R, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLeft: Self[L, R, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(js.undefined)
        ret
    }
    @scala.inline
    def withRight(value: /* r */ R => T): Self[L, R, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRight: Self[L, R, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(js.undefined)
        ret
    }
  }
  
}

