package typingsSlinky.vsoNodeApi.securityRolesInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityRole extends js.Object {
  /**
    * Permissions the role is allowed.
    */
  var allowPermissions: Double = js.native
  /**
    * Permissions the role is denied.
    */
  var denyPermissions: Double = js.native
  /**
    * Description of user access defined by the role
    */
  var description: String = js.native
  /**
    * User friendly name of the role.
    */
  var displayName: String = js.native
  /**
    * Globally unique identifier for the role.
    */
  var identifier: String = js.native
  /**
    * Unique name of the role in the scope.
    */
  var name: String = js.native
  /**
    * Returns the id of the ParentScope.
    */
  var scope: String = js.native
}

object SecurityRole {
  @scala.inline
  def apply(
    allowPermissions: Double,
    denyPermissions: Double,
    description: String,
    displayName: String,
    identifier: String,
    name: String,
    scope: String
  ): SecurityRole = {
    val __obj = js.Dynamic.literal(allowPermissions = allowPermissions.asInstanceOf[js.Any], denyPermissions = denyPermissions.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityRole]
  }
  @scala.inline
  implicit class SecurityRoleOps[Self <: SecurityRole] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowPermissions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowPermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDenyPermissions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("denyPermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScope(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

