package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkItem extends js.Object {
  var workItem: scala.Double = js.native
  var workItemLink: scala.Double = js.native
}

object WorkItem {
  @scala.inline
  def apply(workItem: scala.Double, workItemLink: scala.Double): WorkItem = {
    val __obj = js.Dynamic.literal(workItem = workItem.asInstanceOf[js.Any], workItemLink = workItemLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItem]
  }
  @scala.inline
  implicit class WorkItemOps[Self <: WorkItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWorkItem(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkItemLink(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workItemLink")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

