package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonProject extends js.Object {
  var project: Double = js.native
  var projectCollection: Double = js.native
}

object AnonProject {
  @scala.inline
  def apply(project: Double, projectCollection: Double): AnonProject = {
    val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any], projectCollection = projectCollection.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProject]
  }
  @scala.inline
  implicit class AnonProjectOps[Self <: AnonProject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProject(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProjectCollection(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectCollection")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

