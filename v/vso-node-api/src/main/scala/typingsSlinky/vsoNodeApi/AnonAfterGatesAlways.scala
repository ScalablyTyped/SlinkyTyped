package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAfterGatesAlways extends js.Object {
  var afterGatesAlways: Double = js.native
  var afterSuccessfulGates: Double = js.native
  var beforeGates: Double = js.native
}

object AnonAfterGatesAlways {
  @scala.inline
  def apply(afterGatesAlways: Double, afterSuccessfulGates: Double, beforeGates: Double): AnonAfterGatesAlways = {
    val __obj = js.Dynamic.literal(afterGatesAlways = afterGatesAlways.asInstanceOf[js.Any], afterSuccessfulGates = afterSuccessfulGates.asInstanceOf[js.Any], beforeGates = beforeGates.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAfterGatesAlways]
  }
  @scala.inline
  implicit class AnonAfterGatesAlwaysOps[Self <: AnonAfterGatesAlways] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterGatesAlways(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterGatesAlways")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterSuccessfulGates(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSuccessfulGates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeGates(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeGates")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

