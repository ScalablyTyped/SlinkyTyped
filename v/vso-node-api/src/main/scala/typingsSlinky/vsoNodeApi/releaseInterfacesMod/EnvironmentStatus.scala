package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnvironmentStatus extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "EnvironmentStatus")
@js.native
object EnvironmentStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnvironmentStatus with Double] = js.native
  
  @js.native
  sealed trait Canceled extends EnvironmentStatus
  /* 8 */ val Canceled: typingsSlinky.vsoNodeApi.releaseInterfacesMod.EnvironmentStatus.Canceled with Double = js.native
  
  @js.native
  sealed trait InProgress extends EnvironmentStatus
  /* 2 */ val InProgress: typingsSlinky.vsoNodeApi.releaseInterfacesMod.EnvironmentStatus.InProgress with Double = js.native
  
  @js.native
  sealed trait NotStarted extends EnvironmentStatus
  /* 1 */ val NotStarted: typingsSlinky.vsoNodeApi.releaseInterfacesMod.EnvironmentStatus.NotStarted with Double = js.native
  
  @js.native
  sealed trait PartiallySucceeded extends EnvironmentStatus
  /* 128 */ val PartiallySucceeded: typingsSlinky.vsoNodeApi.releaseInterfacesMod.EnvironmentStatus.PartiallySucceeded with Double = js.native
  
  @js.native
  sealed trait Queued extends EnvironmentStatus
  /* 32 */ val Queued: typingsSlinky.vsoNodeApi.releaseInterfacesMod.EnvironmentStatus.Queued with Double = js.native
  
  @js.native
  sealed trait Rejected extends EnvironmentStatus
  /* 16 */ val Rejected: typingsSlinky.vsoNodeApi.releaseInterfacesMod.EnvironmentStatus.Rejected with Double = js.native
  
  @js.native
  sealed trait Scheduled extends EnvironmentStatus
  /* 64 */ val Scheduled: typingsSlinky.vsoNodeApi.releaseInterfacesMod.EnvironmentStatus.Scheduled with Double = js.native
  
  @js.native
  sealed trait Succeeded extends EnvironmentStatus
  /* 4 */ val Succeeded: typingsSlinky.vsoNodeApi.releaseInterfacesMod.EnvironmentStatus.Succeeded with Double = js.native
  
  @js.native
  sealed trait Undefined extends EnvironmentStatus
  /* 0 */ val Undefined: typingsSlinky.vsoNodeApi.releaseInterfacesMod.EnvironmentStatus.Undefined with Double = js.native
}
