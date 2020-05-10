package typingsSlinky.vsoNodeApi.workInterfacesMod

import typingsSlinky.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemTypeReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CategoryConfiguration extends js.Object {
  /**
    * Name
    */
  var name: String = js.native
  /**
    * Category Reference Name
    */
  var referenceName: String = js.native
  /**
    * Work item types for the backlog category
    */
  var workItemTypes: js.Array[WorkItemTypeReference] = js.native
}

object CategoryConfiguration {
  @scala.inline
  def apply(name: String, referenceName: String, workItemTypes: js.Array[WorkItemTypeReference]): CategoryConfiguration = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], referenceName = referenceName.asInstanceOf[js.Any], workItemTypes = workItemTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoryConfiguration]
  }
  @scala.inline
  implicit class CategoryConfigurationOps[Self <: CategoryConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

