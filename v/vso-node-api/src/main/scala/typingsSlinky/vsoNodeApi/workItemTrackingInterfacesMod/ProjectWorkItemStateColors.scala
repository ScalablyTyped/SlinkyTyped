package typingsSlinky.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectWorkItemStateColors extends js.Object {
  /**
    * Project name
    */
  var projectName: String = js.native
  /**
    * State colors for all work item type in a project
    */
  var workItemTypeStateColors: js.Array[WorkItemTypeStateColors] = js.native
}

object ProjectWorkItemStateColors {
  @scala.inline
  def apply(projectName: String, workItemTypeStateColors: js.Array[WorkItemTypeStateColors]): ProjectWorkItemStateColors = {
    val __obj = js.Dynamic.literal(projectName = projectName.asInstanceOf[js.Any], workItemTypeStateColors = workItemTypeStateColors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectWorkItemStateColors]
  }
  @scala.inline
  implicit class ProjectWorkItemStateColorsOps[Self <: ProjectWorkItemStateColors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProjectName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkItemTypeStateColors(value: js.Array[WorkItemTypeStateColors]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workItemTypeStateColors")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

