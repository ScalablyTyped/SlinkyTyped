package typingsSlinky.tweenJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNone extends js.Object {
  def None(k: Double): Double = js.native
}

object AnonNone {
  @scala.inline
  def apply(None: Double => Double): AnonNone = {
    val __obj = js.Dynamic.literal(None = js.Any.fromFunction1(None))
    __obj.asInstanceOf[AnonNone]
  }
  @scala.inline
  implicit class AnonNoneOps[Self <: AnonNone] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNone(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("None")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

