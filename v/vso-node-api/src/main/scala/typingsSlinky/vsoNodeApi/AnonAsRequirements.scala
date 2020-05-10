package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAsRequirements extends js.Object {
  var asRequirements: Double = js.native
  var asTasks: Double = js.native
  var off: Double = js.native
}

object AnonAsRequirements {
  @scala.inline
  def apply(asRequirements: Double, asTasks: Double, off: Double): AnonAsRequirements = {
    val __obj = js.Dynamic.literal(asRequirements = asRequirements.asInstanceOf[js.Any], asTasks = asTasks.asInstanceOf[js.Any], off = off.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAsRequirements]
  }
  @scala.inline
  implicit class AnonAsRequirementsOps[Self <: AnonAsRequirements] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsRequirements(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asRequirements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAsTasks(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asTasks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOff(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("off")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

