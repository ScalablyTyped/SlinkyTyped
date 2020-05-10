package typingsSlinky.vsoNodeApi.coreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectMessage extends js.Object {
  var project: ProjectInfo = js.native
  var projectChangeType: ProjectChangeType = js.native
  var shouldInvalidateSystemStore: Boolean = js.native
}

object ProjectMessage {
  @scala.inline
  def apply(project: ProjectInfo, projectChangeType: ProjectChangeType, shouldInvalidateSystemStore: Boolean): ProjectMessage = {
    val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any], projectChangeType = projectChangeType.asInstanceOf[js.Any], shouldInvalidateSystemStore = shouldInvalidateSystemStore.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectMessage]
  }
  @scala.inline
  implicit class ProjectMessageOps[Self <: ProjectMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProject(value: ProjectInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProjectChangeType(value: ProjectChangeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectChangeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShouldInvalidateSystemStore(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldInvalidateSystemStore")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

