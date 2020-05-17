package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Project extends js.Object {
  var project: scala.Double = js.native
  var projectCollection: scala.Double = js.native
}

object Project {
  @scala.inline
  def apply(project: scala.Double, projectCollection: scala.Double): Project = {
    val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any], projectCollection = projectCollection.asInstanceOf[js.Any])
    __obj.asInstanceOf[Project]
  }
  @scala.inline
  implicit class ProjectOps[Self <: Project] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProject(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProjectCollection(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectCollection")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

