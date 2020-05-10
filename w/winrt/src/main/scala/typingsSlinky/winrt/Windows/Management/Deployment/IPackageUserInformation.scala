package typingsSlinky.winrt.Windows.Management.Deployment

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPackageUserInformation extends js.Object {
  var installState: PackageInstallState = js.native
  var userSecurityId: String = js.native
}

object IPackageUserInformation {
  @scala.inline
  def apply(installState: PackageInstallState, userSecurityId: String): IPackageUserInformation = {
    val __obj = js.Dynamic.literal(installState = installState.asInstanceOf[js.Any], userSecurityId = userSecurityId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPackageUserInformation]
  }
  @scala.inline
  implicit class IPackageUserInformationOps[Self <: IPackageUserInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstallState(value: PackageInstallState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserSecurityId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userSecurityId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

