package typingsSlinky.seen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonInertia extends js.Object {
  var inertia: Boolean = js.native
}

object AnonInertia {
  @scala.inline
  def apply(inertia: Boolean): AnonInertia = {
    val __obj = js.Dynamic.literal(inertia = inertia.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInertia]
  }
  @scala.inline
  implicit class AnonInertiaOps[Self <: AnonInertia] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInertia(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inertia")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

