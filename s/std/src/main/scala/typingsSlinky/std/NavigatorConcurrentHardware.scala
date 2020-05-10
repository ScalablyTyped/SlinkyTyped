package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigatorConcurrentHardware extends js.Object {
  val hardwareConcurrency: Double = js.native
}

object NavigatorConcurrentHardware {
  @scala.inline
  def apply(hardwareConcurrency: Double): NavigatorConcurrentHardware = {
    val __obj = js.Dynamic.literal(hardwareConcurrency = hardwareConcurrency.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorConcurrentHardware]
  }
  @scala.inline
  implicit class NavigatorConcurrentHardwareOps[Self <: NavigatorConcurrentHardware] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHardwareConcurrency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hardwareConcurrency")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

