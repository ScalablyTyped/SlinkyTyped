package typingsSlinky.seleniumWebdriver

import typingsSlinky.seleniumWebdriver.capabilitiesMod.Capabilities
import typingsSlinky.seleniumWebdriver.mod.CreateSessionCapabilities
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDesired extends CreateSessionCapabilities {
  var desired: js.UndefOr[Capabilities] = js.native
  var required: js.UndefOr[Capabilities] = js.native
}

object AnonDesired {
  @scala.inline
  def apply(): AnonDesired = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDesired]
  }
  @scala.inline
  implicit class AnonDesiredOps[Self <: AnonDesired] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDesired(value: Capabilities): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desired")(js.undefined)
        ret
    }
    @scala.inline
    def withRequired(value: Capabilities): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(js.undefined)
        ret
    }
  }
  
}

