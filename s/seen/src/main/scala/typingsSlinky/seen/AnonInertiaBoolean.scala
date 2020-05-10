package typingsSlinky.seen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonInertiaBoolean extends js.Object {
  var inertia: js.UndefOr[Boolean] = js.native
}

object AnonInertiaBoolean {
  @scala.inline
  def apply(): AnonInertiaBoolean = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonInertiaBoolean]
  }
  @scala.inline
  implicit class AnonInertiaBooleanOps[Self <: AnonInertiaBoolean] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withoutInertia: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inertia")(js.undefined)
        ret
    }
  }
  
}

