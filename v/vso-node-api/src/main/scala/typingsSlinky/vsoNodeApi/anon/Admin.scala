package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Admin extends js.Object {
  var admin: scala.Double = js.native
  var createPublisher: scala.Double = js.native
  var deleteExtension: scala.Double = js.native
  var deletePublisher: scala.Double = js.native
  var editSettings: scala.Double = js.native
  var managePermissions: scala.Double = js.native
  var privateRead: scala.Double = js.native
  var publishExtension: scala.Double = js.native
  var read: scala.Double = js.native
  var trustedPartner: scala.Double = js.native
  var updateExtension: scala.Double = js.native
  var viewPermissions: scala.Double = js.native
}

object Admin {
  @scala.inline
  def apply(
    admin: scala.Double,
    createPublisher: scala.Double,
    deleteExtension: scala.Double,
    deletePublisher: scala.Double,
    editSettings: scala.Double,
    managePermissions: scala.Double,
    privateRead: scala.Double,
    publishExtension: scala.Double,
    read: scala.Double,
    trustedPartner: scala.Double,
    updateExtension: scala.Double,
    viewPermissions: scala.Double
  ): Admin = {
    val __obj = js.Dynamic.literal(admin = admin.asInstanceOf[js.Any], createPublisher = createPublisher.asInstanceOf[js.Any], deleteExtension = deleteExtension.asInstanceOf[js.Any], deletePublisher = deletePublisher.asInstanceOf[js.Any], editSettings = editSettings.asInstanceOf[js.Any], managePermissions = managePermissions.asInstanceOf[js.Any], privateRead = privateRead.asInstanceOf[js.Any], publishExtension = publishExtension.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], trustedPartner = trustedPartner.asInstanceOf[js.Any], updateExtension = updateExtension.asInstanceOf[js.Any], viewPermissions = viewPermissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Admin]
  }
  @scala.inline
  implicit class AdminOps[Self <: Admin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdmin(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("admin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreatePublisher(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createPublisher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteExtension(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteExtension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeletePublisher(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletePublisher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditSettings(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManagePermissions(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managePermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivateRead(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateRead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublishExtension(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishExtension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRead(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrustedPartner(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trustedPartner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateExtension(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateExtension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewPermissions(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewPermissions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

