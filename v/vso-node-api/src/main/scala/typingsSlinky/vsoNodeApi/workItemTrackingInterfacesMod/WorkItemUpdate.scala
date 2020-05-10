package typingsSlinky.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkItemUpdate extends WorkItemTrackingResource {
  /**
    * List of updates to fields.
    */
  var fields: StringDictionary[WorkItemFieldUpdate] = js.native
  /**
    * ID of update.
    */
  var id: Double = js.native
  /**
    * List of updates to relations.
    */
  var relations: WorkItemRelationUpdates = js.native
  /**
    * The revision number of work item update.
    */
  var rev: Double = js.native
  /**
    * Identity for the work item update.
    */
  var revisedBy: IdentityReference = js.native
  /**
    * The work item updates revision date.
    */
  var revisedDate: js.Date = js.native
  /**
    * The work item ID.
    */
  var workItemId: Double = js.native
}

object WorkItemUpdate {
  @scala.inline
  def apply(
    _links: js.Any,
    fields: StringDictionary[WorkItemFieldUpdate],
    id: Double,
    relations: WorkItemRelationUpdates,
    rev: Double,
    revisedBy: IdentityReference,
    revisedDate: js.Date,
    url: String,
    workItemId: Double
  ): WorkItemUpdate = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], relations = relations.asInstanceOf[js.Any], rev = rev.asInstanceOf[js.Any], revisedBy = revisedBy.asInstanceOf[js.Any], revisedDate = revisedDate.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workItemId = workItemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemUpdate]
  }
  @scala.inline
  implicit class WorkItemUpdateOps[Self <: WorkItemUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFields(value: StringDictionary[WorkItemFieldUpdate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelations(value: WorkItemRelationUpdates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRev(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevisedBy(value: IdentityReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revisedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevisedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revisedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkItemId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workItemId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

