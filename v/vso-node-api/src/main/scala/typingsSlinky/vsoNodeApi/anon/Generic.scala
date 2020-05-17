package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Generic extends js.Object {
  var generic: scala.Double = js.native
  var serviceHost: scala.Double = js.native
  var teamProject: scala.Double = js.native
}

object Generic {
  @scala.inline
  def apply(generic: scala.Double, serviceHost: scala.Double, teamProject: scala.Double): Generic = {
    val __obj = js.Dynamic.literal(generic = generic.asInstanceOf[js.Any], serviceHost = serviceHost.asInstanceOf[js.Any], teamProject = teamProject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Generic]
  }
  @scala.inline
  implicit class GenericOps[Self <: Generic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGeneric(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceHost(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceHost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeamProject(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamProject")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

