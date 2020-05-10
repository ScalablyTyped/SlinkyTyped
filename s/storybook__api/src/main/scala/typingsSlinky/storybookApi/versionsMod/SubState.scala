package typingsSlinky.storybookApi.versionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubState extends js.Object {
  var dismissedVersionNotification: js.UndefOr[String] = js.native
  var lastVersionCheck: Double = js.native
  var versions: Versions with UnknownEntries = js.native
}

object SubState {
  @scala.inline
  def apply(lastVersionCheck: Double, versions: Versions with UnknownEntries): SubState = {
    val __obj = js.Dynamic.literal(lastVersionCheck = lastVersionCheck.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubState]
  }
  @scala.inline
  implicit class SubStateOps[Self <: SubState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLastVersionCheck(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastVersionCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersions(value: Versions with UnknownEntries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDismissedVersionNotification(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismissedVersionNotification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDismissedVersionNotification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismissedVersionNotification")(js.undefined)
        ret
    }
  }
  
}

