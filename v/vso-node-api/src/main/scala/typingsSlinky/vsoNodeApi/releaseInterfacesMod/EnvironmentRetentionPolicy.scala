package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnvironmentRetentionPolicy extends js.Object {
  var daysToKeep: Double = js.native
  var releasesToKeep: Double = js.native
  var retainBuild: Boolean = js.native
}

object EnvironmentRetentionPolicy {
  @scala.inline
  def apply(daysToKeep: Double, releasesToKeep: Double, retainBuild: Boolean): EnvironmentRetentionPolicy = {
    val __obj = js.Dynamic.literal(daysToKeep = daysToKeep.asInstanceOf[js.Any], releasesToKeep = releasesToKeep.asInstanceOf[js.Any], retainBuild = retainBuild.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentRetentionPolicy]
  }
  @scala.inline
  implicit class EnvironmentRetentionPolicyOps[Self <: EnvironmentRetentionPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDaysToKeep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daysToKeep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReleasesToKeep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releasesToKeep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetainBuild(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retainBuild")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

