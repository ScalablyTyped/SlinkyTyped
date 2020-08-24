package typingsSlinky.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestSessionExploredWorkItemReference extends TestSessionWorkItemReference {
  /**
    * Workitem references of workitems filed as a part of the current workitem exploration.
    */
  var associatedWorkItems: js.Array[TestSessionWorkItemReference] = js.native
  /**
    * Time when exploration of workitem ended.
    */
  var endTime: js.Date = js.native
  /**
    * Time when explore of workitem was started.
    */
  var startTime: js.Date = js.native
}

object TestSessionExploredWorkItemReference {
  @scala.inline
  def apply(
    associatedWorkItems: js.Array[TestSessionWorkItemReference],
    endTime: js.Date,
    id: Double,
    startTime: js.Date,
    `type`: String
  ): TestSessionExploredWorkItemReference = {
    val __obj = js.Dynamic.literal(associatedWorkItems = associatedWorkItems.asInstanceOf[js.Any], endTime = endTime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestSessionExploredWorkItemReference]
  }
  @scala.inline
  implicit class TestSessionExploredWorkItemReferenceOps[Self <: TestSessionExploredWorkItemReference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAssociatedWorkItemsVarargs(value: TestSessionWorkItemReference*): Self = this.set("associatedWorkItems", js.Array(value :_*))
    @scala.inline
    def setAssociatedWorkItems(value: js.Array[TestSessionWorkItemReference]): Self = this.set("associatedWorkItems", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndTime(value: js.Date): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartTime(value: js.Date): Self = this.set("startTime", value.asInstanceOf[js.Any])
  }
  
}

