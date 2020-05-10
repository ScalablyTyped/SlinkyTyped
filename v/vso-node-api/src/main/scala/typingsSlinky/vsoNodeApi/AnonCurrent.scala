package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCurrent extends js.Object {
  var current: Double = js.native
  var future: Double = js.native
  var past: Double = js.native
}

object AnonCurrent {
  @scala.inline
  def apply(current: Double, future: Double, past: Double): AnonCurrent = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], future = future.asInstanceOf[js.Any], past = past.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCurrent]
  }
  @scala.inline
  implicit class AnonCurrentOps[Self <: AnonCurrent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFuture(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("future")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPast(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("past")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

