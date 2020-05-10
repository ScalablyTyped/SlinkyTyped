package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAdmin extends js.Object {
  var admin: Double = js.native
  var createPublisher: Double = js.native
  var deleteExtension: Double = js.native
  var deletePublisher: Double = js.native
  var editSettings: Double = js.native
  var managePermissions: Double = js.native
  var privateRead: Double = js.native
  var publishExtension: Double = js.native
  var read: Double = js.native
  var trustedPartner: Double = js.native
  var updateExtension: Double = js.native
  var viewPermissions: Double = js.native
}

object AnonAdmin {
  @scala.inline
  def apply(
    admin: Double,
    createPublisher: Double,
    deleteExtension: Double,
    deletePublisher: Double,
    editSettings: Double,
    managePermissions: Double,
    privateRead: Double,
    publishExtension: Double,
    read: Double,
    trustedPartner: Double,
    updateExtension: Double,
    viewPermissions: Double
  ): AnonAdmin = {
    val __obj = js.Dynamic.literal(admin = admin.asInstanceOf[js.Any], createPublisher = createPublisher.asInstanceOf[js.Any], deleteExtension = deleteExtension.asInstanceOf[js.Any], deletePublisher = deletePublisher.asInstanceOf[js.Any], editSettings = editSettings.asInstanceOf[js.Any], managePermissions = managePermissions.asInstanceOf[js.Any], privateRead = privateRead.asInstanceOf[js.Any], publishExtension = publishExtension.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], trustedPartner = trustedPartner.asInstanceOf[js.Any], updateExtension = updateExtension.asInstanceOf[js.Any], viewPermissions = viewPermissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAdmin]
  }
  @scala.inline
  implicit class AnonAdminOps[Self <: AnonAdmin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdmin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("admin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreatePublisher(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createPublisher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteExtension(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteExtension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeletePublisher(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletePublisher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditSettings(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManagePermissions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managePermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivateRead(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateRead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublishExtension(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishExtension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRead(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrustedPartner(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trustedPartner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateExtension(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateExtension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewPermissions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewPermissions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

