package typingsSlinky.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkItemTypeCategory extends WorkItemTrackingResource {
  /**
    * Gets or sets the default type of the work item.
    */
  var defaultWorkItemType: WorkItemTypeReference = js.native
  /**
    * The name of the category.
    */
  var name: String = js.native
  /**
    * The reference name of the category.
    */
  var referenceName: String = js.native
  /**
    * The work item types that belond to the category.
    */
  var workItemTypes: js.Array[WorkItemTypeReference] = js.native
}

object WorkItemTypeCategory {
  @scala.inline
  def apply(
    _links: js.Any,
    defaultWorkItemType: WorkItemTypeReference,
    name: String,
    referenceName: String,
    url: String,
    workItemTypes: js.Array[WorkItemTypeReference]
  ): WorkItemTypeCategory = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], defaultWorkItemType = defaultWorkItemType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], referenceName = referenceName.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workItemTypes = workItemTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemTypeCategory]
  }
  @scala.inline
  implicit class WorkItemTypeCategoryOps[Self <: WorkItemTypeCategory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultWorkItemType(value: WorkItemTypeReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultWorkItemType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReferenceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkItemTypes(value: js.Array[WorkItemTypeReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workItemTypes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

