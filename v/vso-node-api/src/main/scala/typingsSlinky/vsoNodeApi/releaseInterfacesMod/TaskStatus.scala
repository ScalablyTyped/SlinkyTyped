package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TaskStatus extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TaskStatus")
@js.native
object TaskStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskStatus with Double] = js.native
  
  @js.native
  sealed trait Canceled extends TaskStatus
  /* 5 */ val Canceled: typingsSlinky.vsoNodeApi.releaseInterfacesMod.TaskStatus.Canceled with Double = js.native
  
  @js.native
  sealed trait Failed extends TaskStatus
  /* 8 */ val Failed: typingsSlinky.vsoNodeApi.releaseInterfacesMod.TaskStatus.Failed with Double = js.native
  
  @js.native
  sealed trait Failure extends TaskStatus
  /* 4 */ val Failure: typingsSlinky.vsoNodeApi.releaseInterfacesMod.TaskStatus.Failure with Double = js.native
  
  @js.native
  sealed trait InProgress extends TaskStatus
  /* 2 */ val InProgress: typingsSlinky.vsoNodeApi.releaseInterfacesMod.TaskStatus.InProgress with Double = js.native
  
  @js.native
  sealed trait PartiallySucceeded extends TaskStatus
  /* 9 */ val PartiallySucceeded: typingsSlinky.vsoNodeApi.releaseInterfacesMod.TaskStatus.PartiallySucceeded with Double = js.native
  
  @js.native
  sealed trait Pending extends TaskStatus
  /* 1 */ val Pending: typingsSlinky.vsoNodeApi.releaseInterfacesMod.TaskStatus.Pending with Double = js.native
  
  @js.native
  sealed trait Skipped extends TaskStatus
  /* 6 */ val Skipped: typingsSlinky.vsoNodeApi.releaseInterfacesMod.TaskStatus.Skipped with Double = js.native
  
  @js.native
  sealed trait Succeeded extends TaskStatus
  /* 7 */ val Succeeded: typingsSlinky.vsoNodeApi.releaseInterfacesMod.TaskStatus.Succeeded with Double = js.native
  
  @js.native
  sealed trait Success extends TaskStatus
  /* 3 */ val Success: typingsSlinky.vsoNodeApi.releaseInterfacesMod.TaskStatus.Success with Double = js.native
  
  @js.native
  sealed trait Unknown extends TaskStatus
  /* 0 */ val Unknown: typingsSlinky.vsoNodeApi.releaseInterfacesMod.TaskStatus.Unknown with Double = js.native
}
