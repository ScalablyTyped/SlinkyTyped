package typingsSlinky.victory.anon

import typingsSlinky.victory.mod.AnimationStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Before extends js.Object {
  var before: js.UndefOr[js.Function1[/* datum */ js.Any, AnimationStyle]] = js.native
  var duration: js.UndefOr[Double] = js.native
}

object Before {
  @scala.inline
  def apply(): Before = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Before]
  }
  @scala.inline
  implicit class BeforeOps[Self <: Before] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBefore(value: /* datum */ js.Any => AnimationStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
  }
  
}

