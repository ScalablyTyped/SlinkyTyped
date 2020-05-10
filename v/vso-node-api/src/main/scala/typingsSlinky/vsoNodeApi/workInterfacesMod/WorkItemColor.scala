package typingsSlinky.vsoNodeApi.workInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkItemColor extends js.Object {
  var icon: String = js.native
  var primaryColor: String = js.native
  var workItemTypeName: String = js.native
}

object WorkItemColor {
  @scala.inline
  def apply(icon: String, primaryColor: String, workItemTypeName: String): WorkItemColor = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], primaryColor = primaryColor.asInstanceOf[js.Any], workItemTypeName = workItemTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemColor]
  }
  @scala.inline
  implicit class WorkItemColorOps[Self <: WorkItemColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkItemTypeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workItemTypeName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

