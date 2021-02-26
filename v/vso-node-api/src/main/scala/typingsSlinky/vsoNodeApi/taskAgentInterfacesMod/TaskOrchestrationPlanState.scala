package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TaskOrchestrationPlanState extends StObject
@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TaskOrchestrationPlanState")
@js.native
object TaskOrchestrationPlanState extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskOrchestrationPlanState with Double] = js.native
  
  @js.native
  sealed trait Completed extends TaskOrchestrationPlanState
  /* 4 */ val Completed: typingsSlinky.vsoNodeApi.taskAgentInterfacesMod.TaskOrchestrationPlanState.Completed with Double = js.native
  
  @js.native
  sealed trait InProgress extends TaskOrchestrationPlanState
  /* 1 */ val InProgress: typingsSlinky.vsoNodeApi.taskAgentInterfacesMod.TaskOrchestrationPlanState.InProgress with Double = js.native
  
  @js.native
  sealed trait Queued extends TaskOrchestrationPlanState
  /* 2 */ val Queued: typingsSlinky.vsoNodeApi.taskAgentInterfacesMod.TaskOrchestrationPlanState.Queued with Double = js.native
}
