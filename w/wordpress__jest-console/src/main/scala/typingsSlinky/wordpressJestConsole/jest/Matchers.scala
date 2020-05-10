package typingsSlinky.wordpressJestConsole.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Matchers[R, T] extends js.Object {
  /**
    * Ensure that `console.error` function was called.
    */
  def toHaveErrored(): R = js.native
  /**
    * Ensure that `console.error` function was called with specific arguments.
    */
  def toHaveErroredWith(args: js.Any*): R = js.native
  /**
    * Ensure that `console.info` function was called.
    */
  def toHaveInformed(): R = js.native
  /**
    * Ensure that `console.info` function was called with specific arguments.
    */
  def toHaveInformedWith(args: js.Any*): R = js.native
  /**
    * Ensure that `console.log` function was called.
    */
  def toHaveLogged(): R = js.native
  /**
    * Ensure that `console.log` function was called with specific arguments.
    */
  def toHaveLoggedWith(args: js.Any*): R = js.native
  /**
    * Ensure that `console.warn` function was called.
    */
  def toHaveWarned(): R = js.native
  /**
    * Ensure that `console.warn` function was called with specific arguments.
    */
  def toHaveWarnedWith(args: js.Any*): R = js.native
}

object Matchers {
  @scala.inline
  def apply[R, T](
    toHaveErrored: () => R,
    toHaveErroredWith: /* repeated */ js.Any => R,
    toHaveInformed: () => R,
    toHaveInformedWith: /* repeated */ js.Any => R,
    toHaveLogged: () => R,
    toHaveLoggedWith: /* repeated */ js.Any => R,
    toHaveWarned: () => R,
    toHaveWarnedWith: /* repeated */ js.Any => R
  ): Matchers[R, T] = {
    val __obj = js.Dynamic.literal(toHaveErrored = js.Any.fromFunction0(toHaveErrored), toHaveErroredWith = js.Any.fromFunction1(toHaveErroredWith), toHaveInformed = js.Any.fromFunction0(toHaveInformed), toHaveInformedWith = js.Any.fromFunction1(toHaveInformedWith), toHaveLogged = js.Any.fromFunction0(toHaveLogged), toHaveLoggedWith = js.Any.fromFunction1(toHaveLoggedWith), toHaveWarned = js.Any.fromFunction0(toHaveWarned), toHaveWarnedWith = js.Any.fromFunction1(toHaveWarnedWith))
    __obj.asInstanceOf[Matchers[R, T]]
  }
  @scala.inline
  implicit class MatchersOps[Self[r, t] <: Matchers[r, t], R, T] (val x: Self[R, T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[R, T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[R, T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[R, T]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[R, T]) with Other]
    @scala.inline
    def withToHaveErrored(value: () => R): Self[R, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toHaveErrored")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToHaveErroredWith(value: /* repeated */ js.Any => R): Self[R, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toHaveErroredWith")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToHaveInformed(value: () => R): Self[R, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toHaveInformed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToHaveInformedWith(value: /* repeated */ js.Any => R): Self[R, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toHaveInformedWith")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToHaveLogged(value: () => R): Self[R, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toHaveLogged")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToHaveLoggedWith(value: /* repeated */ js.Any => R): Self[R, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toHaveLoggedWith")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToHaveWarned(value: () => R): Self[R, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toHaveWarned")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToHaveWarnedWith(value: /* repeated */ js.Any => R): Self[R, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toHaveWarnedWith")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

