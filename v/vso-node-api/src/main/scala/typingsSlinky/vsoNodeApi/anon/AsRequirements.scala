package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsRequirements extends js.Object {
  var asRequirements: scala.Double = js.native
  var asTasks: scala.Double = js.native
  var off: scala.Double = js.native
}

object AsRequirements {
  @scala.inline
  def apply(asRequirements: scala.Double, asTasks: scala.Double, off: scala.Double): AsRequirements = {
    val __obj = js.Dynamic.literal(asRequirements = asRequirements.asInstanceOf[js.Any], asTasks = asTasks.asInstanceOf[js.Any], off = off.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsRequirements]
  }
  @scala.inline
  implicit class AsRequirementsOps[Self <: AsRequirements] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsRequirements(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asRequirements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAsTasks(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asTasks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOff(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("off")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

