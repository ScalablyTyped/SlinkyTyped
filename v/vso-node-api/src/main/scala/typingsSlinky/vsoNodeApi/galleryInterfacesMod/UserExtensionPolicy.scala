package typingsSlinky.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserExtensionPolicy extends js.Object {
  /**
    * User display name that this policy refers to
    */
  var displayName: String = js.native
  /**
    * The extension policy applied to the user
    */
  var permissions: ExtensionPolicy = js.native
  /**
    * User id that this policy refers to
    */
  var userId: String = js.native
}

object UserExtensionPolicy {
  @scala.inline
  def apply(displayName: String, permissions: ExtensionPolicy, userId: String): UserExtensionPolicy = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserExtensionPolicy]
  }
  @scala.inline
  implicit class UserExtensionPolicyOps[Self <: UserExtensionPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermissions(value: ExtensionPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(value.asInstanceOf[js.Any])
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

