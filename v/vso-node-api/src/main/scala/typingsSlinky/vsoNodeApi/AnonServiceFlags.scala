package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonServiceFlags extends js.Object {
  var disabled: Double = js.native
  var none: Double = js.native
  var serviceFlags: Double = js.native
  var unChanged: Double = js.native
  var verified: Double = js.native
}

object AnonServiceFlags {
  @scala.inline
  def apply(disabled: Double, none: Double, serviceFlags: Double, unChanged: Double, verified: Double): AnonServiceFlags = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], serviceFlags = serviceFlags.asInstanceOf[js.Any], unChanged = unChanged.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonServiceFlags]
  }
  @scala.inline
  implicit class AnonServiceFlagsOps[Self <: AnonServiceFlags] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisabled(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceFlags(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceFlags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnChanged(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerified(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verified")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

