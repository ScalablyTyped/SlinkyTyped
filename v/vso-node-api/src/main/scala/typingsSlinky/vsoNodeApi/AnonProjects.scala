package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonProjects extends js.Object {
  var none: Double = js.native
  var projects: Double = js.native
}

object AnonProjects {
  @scala.inline
  def apply(none: Double, projects: Double): AnonProjects = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any], projects = projects.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProjects]
  }
  @scala.inline
  implicit class AnonProjectsOps[Self <: AnonProjects] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProjects(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projects")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

