package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBranchPermissionRequired extends js.Object {
  var createBranchPermissionRequired: scala.Double = js.native
  var createTagPermissionRequired: scala.Double = js.native
  var forcePushRequired: scala.Double = js.native
  var invalidRefName: scala.Double = js.native
  var locked: scala.Double = js.native
  var manageNotePermissionRequired: scala.Double = js.native
  var refNameConflict: scala.Double = js.native
  var rejectedByPlugin: scala.Double = js.native
  var rejectedByPolicy: scala.Double = js.native
  var staleOldObjectId: scala.Double = js.native
  var succeeded: scala.Double = js.native
  var succeededCorruptRef: scala.Double = js.native
  var succeededNonExistentRef: scala.Double = js.native
  var unprocessed: scala.Double = js.native
  var unresolvableToCommit: scala.Double = js.native
  var writePermissionRequired: scala.Double = js.native
}

object CreateBranchPermissionRequired {
  @scala.inline
  def apply(
    createBranchPermissionRequired: scala.Double,
    createTagPermissionRequired: scala.Double,
    forcePushRequired: scala.Double,
    invalidRefName: scala.Double,
    locked: scala.Double,
    manageNotePermissionRequired: scala.Double,
    refNameConflict: scala.Double,
    rejectedByPlugin: scala.Double,
    rejectedByPolicy: scala.Double,
    staleOldObjectId: scala.Double,
    succeeded: scala.Double,
    succeededCorruptRef: scala.Double,
    succeededNonExistentRef: scala.Double,
    unprocessed: scala.Double,
    unresolvableToCommit: scala.Double,
    writePermissionRequired: scala.Double
  ): CreateBranchPermissionRequired = {
    val __obj = js.Dynamic.literal(createBranchPermissionRequired = createBranchPermissionRequired.asInstanceOf[js.Any], createTagPermissionRequired = createTagPermissionRequired.asInstanceOf[js.Any], forcePushRequired = forcePushRequired.asInstanceOf[js.Any], invalidRefName = invalidRefName.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any], manageNotePermissionRequired = manageNotePermissionRequired.asInstanceOf[js.Any], refNameConflict = refNameConflict.asInstanceOf[js.Any], rejectedByPlugin = rejectedByPlugin.asInstanceOf[js.Any], rejectedByPolicy = rejectedByPolicy.asInstanceOf[js.Any], staleOldObjectId = staleOldObjectId.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any], succeededCorruptRef = succeededCorruptRef.asInstanceOf[js.Any], succeededNonExistentRef = succeededNonExistentRef.asInstanceOf[js.Any], unprocessed = unprocessed.asInstanceOf[js.Any], unresolvableToCommit = unresolvableToCommit.asInstanceOf[js.Any], writePermissionRequired = writePermissionRequired.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBranchPermissionRequired]
  }
  @scala.inline
  implicit class CreateBranchPermissionRequiredOps[Self <: CreateBranchPermissionRequired] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateBranchPermissionRequired(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createBranchPermissionRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateTagPermissionRequired(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTagPermissionRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForcePushRequired(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forcePushRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvalidRefName(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidRefName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocked(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManageNotePermissionRequired(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manageNotePermissionRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefNameConflict(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refNameConflict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRejectedByPlugin(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectedByPlugin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRejectedByPolicy(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectedByPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStaleOldObjectId(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staleOldObjectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSucceeded(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("succeeded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSucceededCorruptRef(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("succeededCorruptRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSucceededNonExistentRef(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("succeededNonExistentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnprocessed(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unprocessed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnresolvableToCommit(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unresolvableToCommit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWritePermissionRequired(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writePermissionRequired")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

