package typingsSlinky.seen.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait F extends js.Object {
  def f(f: js.Any): js.Any = js.native
  def v(v: js.Any): js.Any = js.native
}

object F {
  @scala.inline
  def apply(f: js.Any => js.Any, v: js.Any => js.Any): F = {
    val __obj = js.Dynamic.literal(f = js.Any.fromFunction1(f), v = js.Any.fromFunction1(v))
    __obj.asInstanceOf[F]
  }
  @scala.inline
  implicit class FOps[Self <: F] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withF(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("f")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withV(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

