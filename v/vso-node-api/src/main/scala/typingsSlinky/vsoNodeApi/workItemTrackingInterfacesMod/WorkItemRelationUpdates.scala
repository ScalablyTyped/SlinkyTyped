package typingsSlinky.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkItemRelationUpdates extends js.Object {
  /**
    * List of newly added relations.
    */
  var added: js.Array[WorkItemRelation] = js.native
  /**
    * List of removed relations.
    */
  var removed: js.Array[WorkItemRelation] = js.native
  /**
    * List of updated relations.
    */
  var updated: js.Array[WorkItemRelation] = js.native
}

object WorkItemRelationUpdates {
  @scala.inline
  def apply(
    added: js.Array[WorkItemRelation],
    removed: js.Array[WorkItemRelation],
    updated: js.Array[WorkItemRelation]
  ): WorkItemRelationUpdates = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemRelationUpdates]
  }
  @scala.inline
  implicit class WorkItemRelationUpdatesOps[Self <: WorkItemRelationUpdates] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdded(value: js.Array[WorkItemRelation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("added")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoved(value: js.Array[WorkItemRelation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdated(value: js.Array[WorkItemRelation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

