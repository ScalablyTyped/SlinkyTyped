package typingsSlinky.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstallationTarget extends js.Object {
  var target: String = js.native
  var targetVersion: String = js.native
}

object InstallationTarget {
  @scala.inline
  def apply(target: String, targetVersion: String): InstallationTarget = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any], targetVersion = targetVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallationTarget]
  }
  @scala.inline
  implicit class InstallationTargetOps[Self <: InstallationTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetVersion")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

