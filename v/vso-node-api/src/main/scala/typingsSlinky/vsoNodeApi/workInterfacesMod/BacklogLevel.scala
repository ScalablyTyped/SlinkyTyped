package typingsSlinky.vsoNodeApi.workInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BacklogLevel extends js.Object {
  /**
    * Reference name of the corresponding WIT category
    */
  var categoryReferenceName: String = js.native
  /**
    * Plural name for the backlog level
    */
  var pluralName: String = js.native
  /**
    * Collection of work item states that are included in the plan. The server will filter to only these work item types.
    */
  var workItemStates: js.Array[String] = js.native
  /**
    * Collection of valid workitem type names for the given backlog level
    */
  var workItemTypes: js.Array[String] = js.native
}

object BacklogLevel {
  @scala.inline
  def apply(
    categoryReferenceName: String,
    pluralName: String,
    workItemStates: js.Array[String],
    workItemTypes: js.Array[String]
  ): BacklogLevel = {
    val __obj = js.Dynamic.literal(categoryReferenceName = categoryReferenceName.asInstanceOf[js.Any], pluralName = pluralName.asInstanceOf[js.Any], workItemStates = workItemStates.asInstanceOf[js.Any], workItemTypes = workItemTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[BacklogLevel]
  }
  @scala.inline
  implicit class BacklogLevelOps[Self <: BacklogLevel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategoryReferenceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoryReferenceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPluralName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluralName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkItemStates(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workItemStates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkItemTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workItemTypes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

