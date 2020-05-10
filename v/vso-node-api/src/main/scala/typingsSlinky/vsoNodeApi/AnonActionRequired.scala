package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonActionRequired extends js.Object {
  var actionRequired: Double = js.native
  var actionResolved: Double = js.native
  var disabled: Double = js.native
  var enabled: Double = js.native
  var installed: Double = js.native
  var uninstalled: Double = js.native
  var versionUpdated: Double = js.native
}

object AnonActionRequired {
  @scala.inline
  def apply(
    actionRequired: Double,
    actionResolved: Double,
    disabled: Double,
    enabled: Double,
    installed: Double,
    uninstalled: Double,
    versionUpdated: Double
  ): AnonActionRequired = {
    val __obj = js.Dynamic.literal(actionRequired = actionRequired.asInstanceOf[js.Any], actionResolved = actionResolved.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], installed = installed.asInstanceOf[js.Any], uninstalled = uninstalled.asInstanceOf[js.Any], versionUpdated = versionUpdated.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActionRequired]
  }
  @scala.inline
  implicit class AnonActionRequiredOps[Self <: AnonActionRequired] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionRequired(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActionResolved(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionResolved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabled(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnabled(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstalled(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUninstalled(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uninstalled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersionUpdated(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionUpdated")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

