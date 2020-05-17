package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Inactive extends js.Object {
  var active: scala.Double = js.native
  var inactive: scala.Double = js.native
}

object Inactive {
  @scala.inline
  def apply(active: scala.Double, inactive: scala.Double): Inactive = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], inactive = inactive.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inactive]
  }
  @scala.inline
  implicit class InactiveOps[Self <: Inactive] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInactive(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactive")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

