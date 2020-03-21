package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskOrchestrationQueuedPlan extends js.Object {
  var assignTime: js.Date
  var definition: TaskOrchestrationOwner
  var owner: TaskOrchestrationOwner
  var planGroup: String
  var planId: String
  var poolId: Double
  var queuePosition: Double
  var queueTime: js.Date
  var scopeIdentifier: String
}

object TaskOrchestrationQueuedPlan {
  @scala.inline
  def apply(
    assignTime: js.Date,
    definition: TaskOrchestrationOwner,
    owner: TaskOrchestrationOwner,
    planGroup: String,
    planId: String,
    poolId: Double,
    queuePosition: Double,
    queueTime: js.Date,
    scopeIdentifier: String
  ): TaskOrchestrationQueuedPlan = {
    val __obj = js.Dynamic.literal(assignTime = assignTime.asInstanceOf[js.Any], definition = definition.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], planGroup = planGroup.asInstanceOf[js.Any], planId = planId.asInstanceOf[js.Any], poolId = poolId.asInstanceOf[js.Any], queuePosition = queuePosition.asInstanceOf[js.Any], queueTime = queueTime.asInstanceOf[js.Any], scopeIdentifier = scopeIdentifier.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TaskOrchestrationQueuedPlan]
  }
}

