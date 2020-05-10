package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArtifactInstanceData extends js.Object {
  var accountName: String = js.native
  var authenticationToken: String = js.native
  var tfsUrl: String = js.native
  var version: String = js.native
}

object ArtifactInstanceData {
  @scala.inline
  def apply(accountName: String, authenticationToken: String, tfsUrl: String, version: String): ArtifactInstanceData = {
    val __obj = js.Dynamic.literal(accountName = accountName.asInstanceOf[js.Any], authenticationToken = authenticationToken.asInstanceOf[js.Any], tfsUrl = tfsUrl.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactInstanceData]
  }
  @scala.inline
  implicit class ArtifactInstanceDataOps[Self <: ArtifactInstanceData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthenticationToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticationToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTfsUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tfsUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

