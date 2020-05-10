package typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstalledExtensionStateIssue extends js.Object {
  /**
    * The error message
    */
  var message: String = js.native
  /**
    * Source of the installation issue, for example  "Demands"
    */
  var source: String = js.native
  /**
    * Installation issue type (Warning, Error)
    */
  var `type`: InstalledExtensionStateIssueType = js.native
}

object InstalledExtensionStateIssue {
  @scala.inline
  def apply(message: String, source: String, `type`: InstalledExtensionStateIssueType): InstalledExtensionStateIssue = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstalledExtensionStateIssue]
  }
  @scala.inline
  implicit class InstalledExtensionStateIssueOps[Self <: InstalledExtensionStateIssue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: InstalledExtensionStateIssueType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

