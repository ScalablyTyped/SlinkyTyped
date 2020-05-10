package typingsSlinky.tweenJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIn extends js.Object {
  def In(k: Double): Double = js.native
  def InOut(k: Double): Double = js.native
  def Out(k: Double): Double = js.native
}

object AnonIn {
  @scala.inline
  def apply(In: Double => Double, InOut: Double => Double, Out: Double => Double): AnonIn = {
    val __obj = js.Dynamic.literal(In = js.Any.fromFunction1(In), InOut = js.Any.fromFunction1(InOut), Out = js.Any.fromFunction1(Out))
    __obj.asInstanceOf[AnonIn]
  }
  @scala.inline
  implicit class AnonInOps[Self <: AnonIn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIn(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("In")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInOut(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InOut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOut(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Out")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

