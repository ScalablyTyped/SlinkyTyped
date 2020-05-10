package typingsSlinky.tsmonad.maybeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<tsmonad.tsmonad/lib/src/maybe.MaybePatterns<T, U>> */
@js.native
trait OptionalMaybePatterns[T, U] extends js.Object {
  var just: js.UndefOr[js.Function1[/* t */ T, U]] = js.native
  var nothing: js.UndefOr[js.Function0[U]] = js.native
}

object OptionalMaybePatterns {
  @scala.inline
  def apply[T, U](): OptionalMaybePatterns[T, U] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionalMaybePatterns[T, U]]
  }
  @scala.inline
  implicit class OptionalMaybePatternsOps[Self[t, u] <: OptionalMaybePatterns[t, u], T, U] (val x: Self[T, U]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, U] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, U]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, U]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, U]) with Other]
    @scala.inline
    def withJust(value: /* t */ T => U): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("just")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutJust: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("just")(js.undefined)
        ret
    }
    @scala.inline
    def withNothing(value: () => U): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nothing")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutNothing: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nothing")(js.undefined)
        ret
    }
  }
  
}

