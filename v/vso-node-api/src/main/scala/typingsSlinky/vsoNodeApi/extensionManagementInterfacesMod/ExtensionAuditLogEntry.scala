package typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod

import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtensionAuditLogEntry extends js.Object {
  /**
    * Change that was made to extension
    */
  var auditAction: String = js.native
  /**
    * Date at which the change was made
    */
  var auditDate: js.Date = js.native
  /**
    * Extra information about the change
    */
  var comment: String = js.native
  /**
    * Represents the user who made the change
    */
  var updatedBy: IdentityRef = js.native
}

object ExtensionAuditLogEntry {
  @scala.inline
  def apply(auditAction: String, auditDate: js.Date, comment: String, updatedBy: IdentityRef): ExtensionAuditLogEntry = {
    val __obj = js.Dynamic.literal(auditAction = auditAction.asInstanceOf[js.Any], auditDate = auditDate.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], updatedBy = updatedBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionAuditLogEntry]
  }
  @scala.inline
  implicit class ExtensionAuditLogEntryOps[Self <: ExtensionAuditLogEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuditAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auditAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuditDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auditDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdatedBy(value: IdentityRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedBy")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

