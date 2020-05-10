package typingsSlinky.tensorflowTfjsLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMaskValue extends js.Object {
  var maskValue: Double = js.native
}

object AnonMaskValue {
  @scala.inline
  def apply(maskValue: Double): AnonMaskValue = {
    val __obj = js.Dynamic.literal(maskValue = maskValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMaskValue]
  }
  @scala.inline
  implicit class AnonMaskValueOps[Self <: AnonMaskValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaskValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

