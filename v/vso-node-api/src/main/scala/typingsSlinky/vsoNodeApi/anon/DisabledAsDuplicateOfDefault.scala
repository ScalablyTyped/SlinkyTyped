package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisabledAsDuplicateOfDefault extends js.Object {
  var disabled: scala.Double = js.native
  var disabledAsDuplicateOfDefault: scala.Double = js.native
  var disabledByAdmin: scala.Double = js.native
  var disabledBySystem: scala.Double = js.native
  var disabledInactiveIdentity: scala.Double = js.native
  var disabledInvalidPathClause: scala.Double = js.native
  var disabledInvalidRoleExpression: scala.Double = js.native
  var disabledMessageQueueNotSupported: scala.Double = js.native
  var disabledMissingIdentity: scala.Double = js.native
  var enabled: scala.Double = js.native
  var enabledOnProbation: scala.Double = js.native
  var jailedByNotificationsVolume: scala.Double = js.native
  var pendingDeletion: scala.Double = js.native
}

object DisabledAsDuplicateOfDefault {
  @scala.inline
  def apply(
    disabled: scala.Double,
    disabledAsDuplicateOfDefault: scala.Double,
    disabledByAdmin: scala.Double,
    disabledBySystem: scala.Double,
    disabledInactiveIdentity: scala.Double,
    disabledInvalidPathClause: scala.Double,
    disabledInvalidRoleExpression: scala.Double,
    disabledMessageQueueNotSupported: scala.Double,
    disabledMissingIdentity: scala.Double,
    enabled: scala.Double,
    enabledOnProbation: scala.Double,
    jailedByNotificationsVolume: scala.Double,
    pendingDeletion: scala.Double
  ): DisabledAsDuplicateOfDefault = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], disabledAsDuplicateOfDefault = disabledAsDuplicateOfDefault.asInstanceOf[js.Any], disabledByAdmin = disabledByAdmin.asInstanceOf[js.Any], disabledBySystem = disabledBySystem.asInstanceOf[js.Any], disabledInactiveIdentity = disabledInactiveIdentity.asInstanceOf[js.Any], disabledInvalidPathClause = disabledInvalidPathClause.asInstanceOf[js.Any], disabledInvalidRoleExpression = disabledInvalidRoleExpression.asInstanceOf[js.Any], disabledMessageQueueNotSupported = disabledMessageQueueNotSupported.asInstanceOf[js.Any], disabledMissingIdentity = disabledMissingIdentity.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], enabledOnProbation = enabledOnProbation.asInstanceOf[js.Any], jailedByNotificationsVolume = jailedByNotificationsVolume.asInstanceOf[js.Any], pendingDeletion = pendingDeletion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisabledAsDuplicateOfDefault]
  }
  @scala.inline
  implicit class DisabledAsDuplicateOfDefaultOps[Self <: DisabledAsDuplicateOfDefault] (val x: Self) extends AnyVal {
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
    def withDisabledAsDuplicateOfDefault(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledAsDuplicateOfDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabledByAdmin(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledByAdmin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabledBySystem(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledBySystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabledInactiveIdentity(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledInactiveIdentity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabledInvalidPathClause(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledInvalidPathClause")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabledInvalidRoleExpression(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledInvalidRoleExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabledMessageQueueNotSupported(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledMessageQueueNotSupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabledMissingIdentity(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledMissingIdentity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnabled(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnabledOnProbation(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledOnProbation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJailedByNotificationsVolume(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jailedByNotificationsVolume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPendingDeletion(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingDeletion")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

