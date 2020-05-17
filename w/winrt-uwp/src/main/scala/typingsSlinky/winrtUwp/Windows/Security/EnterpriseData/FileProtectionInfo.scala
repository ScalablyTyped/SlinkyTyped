package typingsSlinky.winrtUwp.Windows.Security.EnterpriseData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about an enterprise protected file. */
@js.native
trait FileProtectionInfo extends js.Object {
  /** The enterprise identity of the enterprise protected file. */
  var identity: String = js.native
  /** Specifies if the protection of the enterprise protected file can be roamed to other devices. */
  var isRoamable: Boolean = js.native
  /** The protection status of the enterprise protected file. */
  var status: FileProtectionStatus = js.native
}

object FileProtectionInfo {
  @scala.inline
  def apply(identity: String, isRoamable: Boolean, status: FileProtectionStatus): FileProtectionInfo = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], isRoamable = isRoamable.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileProtectionInfo]
  }
  @scala.inline
  implicit class FileProtectionInfoOps[Self <: FileProtectionInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdentity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsRoamable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRoamable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: FileProtectionStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

