package typingsSlinky.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TaskResult extends StObject
@JSImport("vso-node-api/interfaces/BuildInterfaces", "TaskResult")
@js.native
object TaskResult extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskResult with Double] = js.native
  
  @js.native
  sealed trait Abandoned extends TaskResult
  /* 5 */ val Abandoned: typingsSlinky.vsoNodeApi.buildInterfacesMod.TaskResult.Abandoned with Double = js.native
  
  @js.native
  sealed trait Canceled extends TaskResult
  /* 3 */ val Canceled: typingsSlinky.vsoNodeApi.buildInterfacesMod.TaskResult.Canceled with Double = js.native
  
  @js.native
  sealed trait Failed extends TaskResult
  /* 2 */ val Failed: typingsSlinky.vsoNodeApi.buildInterfacesMod.TaskResult.Failed with Double = js.native
  
  @js.native
  sealed trait Skipped extends TaskResult
  /* 4 */ val Skipped: typingsSlinky.vsoNodeApi.buildInterfacesMod.TaskResult.Skipped with Double = js.native
  
  @js.native
  sealed trait Succeeded extends TaskResult
  /* 0 */ val Succeeded: typingsSlinky.vsoNodeApi.buildInterfacesMod.TaskResult.Succeeded with Double = js.native
  
  @js.native
  sealed trait SucceededWithIssues extends TaskResult
  /* 1 */ val SucceededWithIssues: typingsSlinky.vsoNodeApi.buildInterfacesMod.TaskResult.SucceededWithIssues with Double = js.native
}
