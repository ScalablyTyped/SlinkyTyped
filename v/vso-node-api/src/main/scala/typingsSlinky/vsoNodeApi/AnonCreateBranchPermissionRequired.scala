package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCreateBranchPermissionRequired extends js.Object {
  var createBranchPermissionRequired: Double = js.native
  var createTagPermissionRequired: Double = js.native
  var forcePushRequired: Double = js.native
  var invalidRefName: Double = js.native
  var locked: Double = js.native
  var manageNotePermissionRequired: Double = js.native
  var refNameConflict: Double = js.native
  var rejectedByPlugin: Double = js.native
  var rejectedByPolicy: Double = js.native
  var staleOldObjectId: Double = js.native
  var succeeded: Double = js.native
  var succeededCorruptRef: Double = js.native
  var succeededNonExistentRef: Double = js.native
  var unprocessed: Double = js.native
  var unresolvableToCommit: Double = js.native
  var writePermissionRequired: Double = js.native
}

object AnonCreateBranchPermissionRequired {
  @scala.inline
  def apply(
    createBranchPermissionRequired: Double,
    createTagPermissionRequired: Double,
    forcePushRequired: Double,
    invalidRefName: Double,
    locked: Double,
    manageNotePermissionRequired: Double,
    refNameConflict: Double,
    rejectedByPlugin: Double,
    rejectedByPolicy: Double,
    staleOldObjectId: Double,
    succeeded: Double,
    succeededCorruptRef: Double,
    succeededNonExistentRef: Double,
    unprocessed: Double,
    unresolvableToCommit: Double,
    writePermissionRequired: Double
  ): AnonCreateBranchPermissionRequired = {
    val __obj = js.Dynamic.literal(createBranchPermissionRequired = createBranchPermissionRequired.asInstanceOf[js.Any], createTagPermissionRequired = createTagPermissionRequired.asInstanceOf[js.Any], forcePushRequired = forcePushRequired.asInstanceOf[js.Any], invalidRefName = invalidRefName.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any], manageNotePermissionRequired = manageNotePermissionRequired.asInstanceOf[js.Any], refNameConflict = refNameConflict.asInstanceOf[js.Any], rejectedByPlugin = rejectedByPlugin.asInstanceOf[js.Any], rejectedByPolicy = rejectedByPolicy.asInstanceOf[js.Any], staleOldObjectId = staleOldObjectId.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any], succeededCorruptRef = succeededCorruptRef.asInstanceOf[js.Any], succeededNonExistentRef = succeededNonExistentRef.asInstanceOf[js.Any], unprocessed = unprocessed.asInstanceOf[js.Any], unresolvableToCommit = unresolvableToCommit.asInstanceOf[js.Any], writePermissionRequired = writePermissionRequired.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCreateBranchPermissionRequired]
  }
  @scala.inline
  implicit class AnonCreateBranchPermissionRequiredOps[Self <: AnonCreateBranchPermissionRequired] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateBranchPermissionRequired(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createBranchPermissionRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateTagPermissionRequired(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTagPermissionRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForcePushRequired(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forcePushRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvalidRefName(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidRefName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocked(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManageNotePermissionRequired(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manageNotePermissionRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefNameConflict(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refNameConflict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRejectedByPlugin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectedByPlugin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRejectedByPolicy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectedByPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStaleOldObjectId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staleOldObjectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSucceeded(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("succeeded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSucceededCorruptRef(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("succeededCorruptRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSucceededNonExistentRef(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("succeededNonExistentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnprocessed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unprocessed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnresolvableToCommit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unresolvableToCommit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWritePermissionRequired(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writePermissionRequired")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

