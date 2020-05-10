package typingsSlinky.vsoNodeApi.securityRolesInterfacesMod

import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoleAssignment extends js.Object {
  /**
    * Designates the role as explicitly assigned or inherited.
    */
  var access: RoleAccess = js.native
  /**
    * User friendly description of access assignment.
    */
  var accessDisplayName: String = js.native
  /**
    * The user to whom the role is assigned.
    */
  var identity: IdentityRef = js.native
  /**
    * The role assigned to the user.
    */
  var role: SecurityRole = js.native
}

object RoleAssignment {
  @scala.inline
  def apply(access: RoleAccess, accessDisplayName: String, identity: IdentityRef, role: SecurityRole): RoleAssignment = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], accessDisplayName = accessDisplayName.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoleAssignment]
  }
  @scala.inline
  implicit class RoleAssignmentOps[Self <: RoleAssignment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccess(value: RoleAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccessDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessDisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdentity(value: IdentityRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRole(value: SecurityRole): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

