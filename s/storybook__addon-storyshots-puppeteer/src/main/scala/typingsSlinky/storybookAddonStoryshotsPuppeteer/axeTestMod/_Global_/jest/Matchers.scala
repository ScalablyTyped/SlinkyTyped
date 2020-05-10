package typingsSlinky.storybookAddonStoryshotsPuppeteer.axeTestMod._Global_.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Matchers[R, T] extends js.Object {
  def toPassAxeTests(parameters: js.Any): R = js.native
}

object Matchers {
  @scala.inline
  def apply[R, T](toPassAxeTests: js.Any => R): Matchers[R, T] = {
    val __obj = js.Dynamic.literal(toPassAxeTests = js.Any.fromFunction1(toPassAxeTests))
    __obj.asInstanceOf[Matchers[R, T]]
  }
  @scala.inline
  implicit class MatchersOps[Self[r, t] <: Matchers[r, t], R, T] (val x: Self[R, T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[R, T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[R, T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[R, T]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[R, T]) with Other]
    @scala.inline
    def withToPassAxeTests(value: js.Any => R): Self[R, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toPassAxeTests")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

