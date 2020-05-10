package typingsSlinky.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkItemDeleteUpdate extends js.Object {
  /**
    * Sets a value indicating whether this work item is deleted.
    */
  var isDeleted: Boolean = js.native
}

object WorkItemDeleteUpdate {
  @scala.inline
  def apply(isDeleted: Boolean): WorkItemDeleteUpdate = {
    val __obj = js.Dynamic.literal(isDeleted = isDeleted.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemDeleteUpdate]
  }
  @scala.inline
  implicit class WorkItemDeleteUpdateOps[Self <: WorkItemDeleteUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsDeleted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDeleted")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

