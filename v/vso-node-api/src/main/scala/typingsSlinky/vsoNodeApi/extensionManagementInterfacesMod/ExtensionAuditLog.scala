package typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtensionAuditLog extends js.Object {
  /**
    * Collection of audit log entries
    */
  var entries: js.Array[ExtensionAuditLogEntry] = js.native
  /**
    * Extension that the change was made for
    */
  var extensionName: String = js.native
  /**
    * Publisher that the extension is part of
    */
  var publisherName: String = js.native
}

object ExtensionAuditLog {
  @scala.inline
  def apply(entries: js.Array[ExtensionAuditLogEntry], extensionName: String, publisherName: String): ExtensionAuditLog = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], extensionName = extensionName.asInstanceOf[js.Any], publisherName = publisherName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionAuditLog]
  }
  @scala.inline
  implicit class ExtensionAuditLogOps[Self <: ExtensionAuditLog] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntries(value: js.Array[ExtensionAuditLogEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtensionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublisherName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisherName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

