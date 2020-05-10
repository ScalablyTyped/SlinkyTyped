package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDisabledAsDuplicateOfDefault extends js.Object {
  var disabled: Double = js.native
  var disabledAsDuplicateOfDefault: Double = js.native
  var disabledByAdmin: Double = js.native
  var disabledBySystem: Double = js.native
  var disabledInactiveIdentity: Double = js.native
  var disabledInvalidPathClause: Double = js.native
  var disabledInvalidRoleExpression: Double = js.native
  var disabledMessageQueueNotSupported: Double = js.native
  var disabledMissingIdentity: Double = js.native
  var enabled: Double = js.native
  var enabledOnProbation: Double = js.native
  var jailedByNotificationsVolume: Double = js.native
  var pendingDeletion: Double = js.native
}

object AnonDisabledAsDuplicateOfDefault {
  @scala.inline
  def apply(
    disabled: Double,
    disabledAsDuplicateOfDefault: Double,
    disabledByAdmin: Double,
    disabledBySystem: Double,
    disabledInactiveIdentity: Double,
    disabledInvalidPathClause: Double,
    disabledInvalidRoleExpression: Double,
    disabledMessageQueueNotSupported: Double,
    disabledMissingIdentity: Double,
    enabled: Double,
    enabledOnProbation: Double,
    jailedByNotificationsVolume: Double,
    pendingDeletion: Double
  ): AnonDisabledAsDuplicateOfDefault = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], disabledAsDuplicateOfDefault = disabledAsDuplicateOfDefault.asInstanceOf[js.Any], disabledByAdmin = disabledByAdmin.asInstanceOf[js.Any], disabledBySystem = disabledBySystem.asInstanceOf[js.Any], disabledInactiveIdentity = disabledInactiveIdentity.asInstanceOf[js.Any], disabledInvalidPathClause = disabledInvalidPathClause.asInstanceOf[js.Any], disabledInvalidRoleExpression = disabledInvalidRoleExpression.asInstanceOf[js.Any], disabledMessageQueueNotSupported = disabledMessageQueueNotSupported.asInstanceOf[js.Any], disabledMissingIdentity = disabledMissingIdentity.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], enabledOnProbation = enabledOnProbation.asInstanceOf[js.Any], jailedByNotificationsVolume = jailedByNotificationsVolume.asInstanceOf[js.Any], pendingDeletion = pendingDeletion.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDisabledAsDuplicateOfDefault]
  }
  @scala.inline
  implicit class AnonDisabledAsDuplicateOfDefaultOps[Self <: AnonDisabledAsDuplicateOfDefault] (val x: Self) extends AnyVal {
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
    def withDisabledAsDuplicateOfDefault(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledAsDuplicateOfDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabledByAdmin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledByAdmin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabledBySystem(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledBySystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabledInactiveIdentity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledInactiveIdentity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabledInvalidPathClause(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledInvalidPathClause")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabledInvalidRoleExpression(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledInvalidRoleExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabledMessageQueueNotSupported(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledMessageQueueNotSupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabledMissingIdentity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledMissingIdentity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnabled(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnabledOnProbation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledOnProbation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJailedByNotificationsVolume(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jailedByNotificationsVolume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPendingDeletion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingDeletion")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

