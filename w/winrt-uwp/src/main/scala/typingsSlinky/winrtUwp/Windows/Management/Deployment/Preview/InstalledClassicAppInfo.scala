package typingsSlinky.winrtUwp.Windows.Management.Deployment.Preview

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstalledClassicAppInfo extends js.Object {
  var displayName: js.Any = js.native
   /* unmapped type */ var displayVersion: js.Any = js.native
}

object InstalledClassicAppInfo {
  @scala.inline
  def apply(displayName: js.Any, displayVersion: js.Any): InstalledClassicAppInfo = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], displayVersion = displayVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstalledClassicAppInfo]
  }
  @scala.inline
  implicit class InstalledClassicAppInfoOps[Self <: InstalledClassicAppInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayName(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayVersion(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayVersion")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

