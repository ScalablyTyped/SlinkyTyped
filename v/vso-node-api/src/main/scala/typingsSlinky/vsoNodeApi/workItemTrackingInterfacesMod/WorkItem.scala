package typingsSlinky.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkItem extends WorkItemTrackingResource {
  /**
    * Map of field and values for the work item.
    */
  var fields: StringDictionary[js.Any] = js.native
  /**
    * The work item ID.
    */
  var id: Double = js.native
  /**
    * Relations of the work item.
    */
  var relations: js.Array[WorkItemRelation] = js.native
  /**
    * Revision number of the work item.
    */
  var rev: Double = js.native
}

object WorkItem {
  @scala.inline
  def apply(
    _links: js.Any,
    fields: StringDictionary[js.Any],
    id: Double,
    relations: js.Array[WorkItemRelation],
    rev: Double,
    url: String
  ): WorkItem = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], relations = relations.asInstanceOf[js.Any], rev = rev.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItem]
  }
  @scala.inline
  implicit class WorkItemOps[Self <: WorkItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFields(value: StringDictionary[js.Any]): Self = {
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
    def withRelations(value: js.Array[WorkItemRelation]): Self = {
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
  }
  
}

