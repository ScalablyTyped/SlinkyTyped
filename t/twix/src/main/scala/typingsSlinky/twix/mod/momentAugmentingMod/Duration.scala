package typingsSlinky.twix.mod.momentAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Duration extends js.Object {
  def afterMoment(date: String): String = js.native
  def beforeMoment(date: String): String = js.native
}

object Duration {
  @scala.inline
  def apply(afterMoment: String => String, beforeMoment: String => String): Duration = {
    val __obj = js.Dynamic.literal(afterMoment = js.Any.fromFunction1(afterMoment), beforeMoment = js.Any.fromFunction1(beforeMoment))
    __obj.asInstanceOf[Duration]
  }
  @scala.inline
  implicit class DurationOps[Self <: Duration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterMoment(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterMoment")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBeforeMoment(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeMoment")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

