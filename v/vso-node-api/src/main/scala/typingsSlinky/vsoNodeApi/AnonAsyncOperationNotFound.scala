package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAsyncOperationNotFound extends js.Object {
  var asyncOperationNotFound: Double = js.native
  var createBranchPermissionRequired: Double = js.native
  var gitObjectTooLarge: Double = js.native
  var invalidRefName: Double = js.native
  var none: Double = js.native
  var operationIndentityNotFound: Double = js.native
  var other: Double = js.native
  var refNameConflict: Double = js.native
  var targetBranchDeleted: Double = js.native
  var writePermissionRequired: Double = js.native
}

object AnonAsyncOperationNotFound {
  @scala.inline
  def apply(
    asyncOperationNotFound: Double,
    createBranchPermissionRequired: Double,
    gitObjectTooLarge: Double,
    invalidRefName: Double,
    none: Double,
    operationIndentityNotFound: Double,
    other: Double,
    refNameConflict: Double,
    targetBranchDeleted: Double,
    writePermissionRequired: Double
  ): AnonAsyncOperationNotFound = {
    val __obj = js.Dynamic.literal(asyncOperationNotFound = asyncOperationNotFound.asInstanceOf[js.Any], createBranchPermissionRequired = createBranchPermissionRequired.asInstanceOf[js.Any], gitObjectTooLarge = gitObjectTooLarge.asInstanceOf[js.Any], invalidRefName = invalidRefName.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], operationIndentityNotFound = operationIndentityNotFound.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], refNameConflict = refNameConflict.asInstanceOf[js.Any], targetBranchDeleted = targetBranchDeleted.asInstanceOf[js.Any], writePermissionRequired = writePermissionRequired.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAsyncOperationNotFound]
  }
  @scala.inline
  implicit class AnonAsyncOperationNotFoundOps[Self <: AnonAsyncOperationNotFound] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsyncOperationNotFound(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncOperationNotFound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateBranchPermissionRequired(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createBranchPermissionRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGitObjectTooLarge(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gitObjectTooLarge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvalidRefName(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidRefName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperationIndentityNotFound(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationIndentityNotFound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOther(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("other")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefNameConflict(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refNameConflict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetBranchDeleted(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetBranchDeleted")(value.asInstanceOf[js.Any])
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

