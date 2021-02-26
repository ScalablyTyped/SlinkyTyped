package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TaskAgentPoolMaintenanceJobStatus extends StObject
@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TaskAgentPoolMaintenanceJobStatus")
@js.native
object TaskAgentPoolMaintenanceJobStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskAgentPoolMaintenanceJobStatus with Double] = js.native
  
  @js.native
  sealed trait Cancelling extends TaskAgentPoolMaintenanceJobStatus
  /* 4 */ val Cancelling: typingsSlinky.vsoNodeApi.taskAgentInterfacesMod.TaskAgentPoolMaintenanceJobStatus.Cancelling with Double = js.native
  
  @js.native
  sealed trait Completed extends TaskAgentPoolMaintenanceJobStatus
  /* 2 */ val Completed: typingsSlinky.vsoNodeApi.taskAgentInterfacesMod.TaskAgentPoolMaintenanceJobStatus.Completed with Double = js.native
  
  @js.native
  sealed trait InProgress extends TaskAgentPoolMaintenanceJobStatus
  /* 1 */ val InProgress: typingsSlinky.vsoNodeApi.taskAgentInterfacesMod.TaskAgentPoolMaintenanceJobStatus.InProgress with Double = js.native
  
  @js.native
  sealed trait Queued extends TaskAgentPoolMaintenanceJobStatus
  /* 8 */ val Queued: typingsSlinky.vsoNodeApi.taskAgentInterfacesMod.TaskAgentPoolMaintenanceJobStatus.Queued with Double = js.native
}
