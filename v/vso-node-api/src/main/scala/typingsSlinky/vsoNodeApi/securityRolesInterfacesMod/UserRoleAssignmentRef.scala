package typingsSlinky.vsoNodeApi.securityRolesInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserRoleAssignmentRef extends js.Object {
  /**
    * The name of the role assigned.
    */
  var roleName: String = js.native
  /**
    * Identifier of the user given the role assignment.
    */
  var uniqueName: String = js.native
  /**
    * Unique id of the user given the role assignment.
    */
  var userId: String = js.native
}

object UserRoleAssignmentRef {
  @scala.inline
  def apply(roleName: String, uniqueName: String, userId: String): UserRoleAssignmentRef = {
    val __obj = js.Dynamic.literal(roleName = roleName.asInstanceOf[js.Any], uniqueName = uniqueName.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserRoleAssignmentRef]
  }
  @scala.inline
  implicit class UserRoleAssignmentRefOps[Self <: UserRoleAssignmentRef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRoleName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUniqueName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

