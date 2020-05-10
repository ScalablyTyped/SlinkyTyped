package typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstalledExtensionState extends js.Object {
  /**
    * States of an installed extension
    */
  var flags: ExtensionStateFlags = js.native
  /**
    * List of installation issues
    */
  var installationIssues: js.Array[InstalledExtensionStateIssue] = js.native
  /**
    * The time at which this installation was last updated
    */
  var lastUpdated: js.Date = js.native
}

object InstalledExtensionState {
  @scala.inline
  def apply(
    flags: ExtensionStateFlags,
    installationIssues: js.Array[InstalledExtensionStateIssue],
    lastUpdated: js.Date
  ): InstalledExtensionState = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], installationIssues = installationIssues.asInstanceOf[js.Any], lastUpdated = lastUpdated.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstalledExtensionState]
  }
  @scala.inline
  implicit class InstalledExtensionStateOps[Self <: InstalledExtensionState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlags(value: ExtensionStateFlags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstallationIssues(value: js.Array[InstalledExtensionStateIssue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installationIssues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastUpdated(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdated")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

