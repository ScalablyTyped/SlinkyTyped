package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGeneric extends js.Object {
  var generic: Double = js.native
  var serviceHost: Double = js.native
  var teamProject: Double = js.native
}

object AnonGeneric {
  @scala.inline
  def apply(generic: Double, serviceHost: Double, teamProject: Double): AnonGeneric = {
    val __obj = js.Dynamic.literal(generic = generic.asInstanceOf[js.Any], serviceHost = serviceHost.asInstanceOf[js.Any], teamProject = teamProject.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGeneric]
  }
  @scala.inline
  implicit class AnonGenericOps[Self <: AnonGeneric] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGeneric(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceHost(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceHost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeamProject(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamProject")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

