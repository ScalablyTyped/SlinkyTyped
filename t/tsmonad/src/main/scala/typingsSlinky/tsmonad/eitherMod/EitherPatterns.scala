package typingsSlinky.tsmonad.eitherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EitherPatterns[L, R, T] extends js.Object {
  def left(l: L): T = js.native
  def right(r: R): T = js.native
}

object EitherPatterns {
  @scala.inline
  def apply[L, R, T](left: L => T, right: R => T): EitherPatterns[L, R, T] = {
    val __obj = js.Dynamic.literal(left = js.Any.fromFunction1(left), right = js.Any.fromFunction1(right))
    __obj.asInstanceOf[EitherPatterns[L, R, T]]
  }
  @scala.inline
  implicit class EitherPatternsOps[Self[l, r, t] <: EitherPatterns[l, r, t], L, R, T] (val x: Self[L, R, T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[L, R, T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[L, R, T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[L, R, T]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[L, R, T]) with Other]
    @scala.inline
    def withLeft(value: L => T): Self[L, R, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRight(value: R => T): Self[L, R, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

