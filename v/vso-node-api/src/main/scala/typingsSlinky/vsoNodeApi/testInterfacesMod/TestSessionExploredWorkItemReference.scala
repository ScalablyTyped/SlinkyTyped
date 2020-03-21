package typingsSlinky.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestSessionExploredWorkItemReference extends TestSessionWorkItemReference {
  /**
    * Workitem references of workitems filed as a part of the current workitem exploration.
    */
  var associatedWorkItems: js.Array[TestSessionWorkItemReference]
  /**
    * Time when exploration of workitem ended.
    */
  var endTime: js.Date
  /**
    * Time when explore of workitem was started.
    */
  var startTime: js.Date
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
}

