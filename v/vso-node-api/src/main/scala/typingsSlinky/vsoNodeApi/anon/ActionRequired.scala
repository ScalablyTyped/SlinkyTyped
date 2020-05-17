package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionRequired extends js.Object {
  var actionRequired: scala.Double = js.native
  var actionResolved: scala.Double = js.native
  var disabled: scala.Double = js.native
  var enabled: scala.Double = js.native
  var installed: scala.Double = js.native
  var uninstalled: scala.Double = js.native
  var versionUpdated: scala.Double = js.native
}

object ActionRequired {
  @scala.inline
  def apply(
    actionRequired: scala.Double,
    actionResolved: scala.Double,
    disabled: scala.Double,
    enabled: scala.Double,
    installed: scala.Double,
    uninstalled: scala.Double,
    versionUpdated: scala.Double
  ): ActionRequired = {
    val __obj = js.Dynamic.literal(actionRequired = actionRequired.asInstanceOf[js.Any], actionResolved = actionResolved.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], installed = installed.asInstanceOf[js.Any], uninstalled = uninstalled.asInstanceOf[js.Any], versionUpdated = versionUpdated.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionRequired]
  }
  @scala.inline
  implicit class ActionRequiredOps[Self <: ActionRequired] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionRequired(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActionResolved(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionResolved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabled(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnabled(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstalled(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUninstalled(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uninstalled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersionUpdated(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionUpdated")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

