package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentAuthorizationInfo extends js.Object {
  var authorizationHeaderFor: AuthorizationHeaderFor = js.native
  var resources: js.Array[String] = js.native
  var tenantId: String = js.native
  var vstsAccessTokenKey: String = js.native
}

object DeploymentAuthorizationInfo {
  @scala.inline
  def apply(
    authorizationHeaderFor: AuthorizationHeaderFor,
    resources: js.Array[String],
    tenantId: String,
    vstsAccessTokenKey: String
  ): DeploymentAuthorizationInfo = {
    val __obj = js.Dynamic.literal(authorizationHeaderFor = authorizationHeaderFor.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], tenantId = tenantId.asInstanceOf[js.Any], vstsAccessTokenKey = vstsAccessTokenKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentAuthorizationInfo]
  }
  @scala.inline
  implicit class DeploymentAuthorizationInfoOps[Self <: DeploymentAuthorizationInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorizationHeaderFor(value: AuthorizationHeaderFor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizationHeaderFor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResources(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTenantId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tenantId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVstsAccessTokenKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vstsAccessTokenKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

