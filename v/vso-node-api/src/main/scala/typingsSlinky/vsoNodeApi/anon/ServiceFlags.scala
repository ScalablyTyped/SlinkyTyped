package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceFlags extends js.Object {
  var disabled: scala.Double = js.native
  var none: scala.Double = js.native
  var serviceFlags: scala.Double = js.native
  var unChanged: scala.Double = js.native
  var verified: scala.Double = js.native
}

object ServiceFlags {
  @scala.inline
  def apply(
    disabled: scala.Double,
    none: scala.Double,
    serviceFlags: scala.Double,
    unChanged: scala.Double,
    verified: scala.Double
  ): ServiceFlags = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], serviceFlags = serviceFlags.asInstanceOf[js.Any], unChanged = unChanged.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceFlags]
  }
  @scala.inline
  implicit class ServiceFlagsOps[Self <: ServiceFlags] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisabled(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceFlags(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceFlags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnChanged(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerified(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verified")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

