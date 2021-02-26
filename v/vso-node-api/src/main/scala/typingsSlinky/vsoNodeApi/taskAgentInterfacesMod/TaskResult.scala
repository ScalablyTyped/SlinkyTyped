package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TaskResult extends StObject
@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TaskResult")
@js.native
object TaskResult extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskResult with Double] = js.native
  
  @js.native
  sealed trait Abandoned extends TaskResult
  /* 5 */ val Abandoned: typingsSlinky.vsoNodeApi.taskAgentInterfacesMod.TaskResult.Abandoned with Double = js.native
  
  @js.native
  sealed trait Canceled extends TaskResult
  /* 3 */ val Canceled: typingsSlinky.vsoNodeApi.taskAgentInterfacesMod.TaskResult.Canceled with Double = js.native
  
  @js.native
  sealed trait Failed extends TaskResult
  /* 2 */ val Failed: typingsSlinky.vsoNodeApi.taskAgentInterfacesMod.TaskResult.Failed with Double = js.native
  
  @js.native
  sealed trait Skipped extends TaskResult
  /* 4 */ val Skipped: typingsSlinky.vsoNodeApi.taskAgentInterfacesMod.TaskResult.Skipped with Double = js.native
  
  @js.native
  sealed trait Succeeded extends TaskResult
  /* 0 */ val Succeeded: typingsSlinky.vsoNodeApi.taskAgentInterfacesMod.TaskResult.Succeeded with Double = js.native
  
  @js.native
  sealed trait SucceededWithIssues extends TaskResult
  /* 1 */ val SucceededWithIssues: typingsSlinky.vsoNodeApi.taskAgentInterfacesMod.TaskResult.SucceededWithIssues with Double = js.native
}
