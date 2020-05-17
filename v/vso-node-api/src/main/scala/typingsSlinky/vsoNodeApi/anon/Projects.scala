package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Projects extends js.Object {
  var none: scala.Double = js.native
  var projects: scala.Double = js.native
}

object Projects {
  @scala.inline
  def apply(none: scala.Double, projects: scala.Double): Projects = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any], projects = projects.asInstanceOf[js.Any])
    __obj.asInstanceOf[Projects]
  }
  @scala.inline
  implicit class ProjectsOps[Self <: Projects] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNone(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProjects(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projects")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

