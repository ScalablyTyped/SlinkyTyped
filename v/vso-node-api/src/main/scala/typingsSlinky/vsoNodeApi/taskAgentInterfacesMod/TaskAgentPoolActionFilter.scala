package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TaskAgentPoolActionFilter extends StObject
@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TaskAgentPoolActionFilter")
@js.native
object TaskAgentPoolActionFilter extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskAgentPoolActionFilter with Double] = js.native
  
  @js.native
  sealed trait Manage extends TaskAgentPoolActionFilter
  /* 2 */ val Manage: typingsSlinky.vsoNodeApi.taskAgentInterfacesMod.TaskAgentPoolActionFilter.Manage with Double = js.native
  
  @js.native
  sealed trait None extends TaskAgentPoolActionFilter
  /* 0 */ val None: typingsSlinky.vsoNodeApi.taskAgentInterfacesMod.TaskAgentPoolActionFilter.None with Double = js.native
  
  @js.native
  sealed trait Use extends TaskAgentPoolActionFilter
  /* 16 */ val Use: typingsSlinky.vsoNodeApi.taskAgentInterfacesMod.TaskAgentPoolActionFilter.Use with Double = js.native
}
