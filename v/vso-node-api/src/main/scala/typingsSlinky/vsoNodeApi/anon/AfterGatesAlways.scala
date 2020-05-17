package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AfterGatesAlways extends js.Object {
  var afterGatesAlways: scala.Double = js.native
  var afterSuccessfulGates: scala.Double = js.native
  var beforeGates: scala.Double = js.native
}

object AfterGatesAlways {
  @scala.inline
  def apply(afterGatesAlways: scala.Double, afterSuccessfulGates: scala.Double, beforeGates: scala.Double): AfterGatesAlways = {
    val __obj = js.Dynamic.literal(afterGatesAlways = afterGatesAlways.asInstanceOf[js.Any], afterSuccessfulGates = afterSuccessfulGates.asInstanceOf[js.Any], beforeGates = beforeGates.asInstanceOf[js.Any])
    __obj.asInstanceOf[AfterGatesAlways]
  }
  @scala.inline
  implicit class AfterGatesAlwaysOps[Self <: AfterGatesAlways] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterGatesAlways(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterGatesAlways")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterSuccessfulGates(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSuccessfulGates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeGates(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeGates")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

