package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeployPhaseStatus extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "DeployPhaseStatus")
@js.native
object DeployPhaseStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeployPhaseStatus with Double] = js.native
  
  @js.native
  sealed trait Canceled extends DeployPhaseStatus
  /* 32 */ val Canceled: typingsSlinky.vsoNodeApi.releaseInterfacesMod.DeployPhaseStatus.Canceled with Double = js.native
  
  @js.native
  sealed trait Cancelling extends DeployPhaseStatus
  /* 128 */ val Cancelling: typingsSlinky.vsoNodeApi.releaseInterfacesMod.DeployPhaseStatus.Cancelling with Double = js.native
  
  @js.native
  sealed trait Failed extends DeployPhaseStatus
  /* 16 */ val Failed: typingsSlinky.vsoNodeApi.releaseInterfacesMod.DeployPhaseStatus.Failed with Double = js.native
  
  @js.native
  sealed trait InProgress extends DeployPhaseStatus
  /* 2 */ val InProgress: typingsSlinky.vsoNodeApi.releaseInterfacesMod.DeployPhaseStatus.InProgress with Double = js.native
  
  @js.native
  sealed trait NotStarted extends DeployPhaseStatus
  /* 1 */ val NotStarted: typingsSlinky.vsoNodeApi.releaseInterfacesMod.DeployPhaseStatus.NotStarted with Double = js.native
  
  @js.native
  sealed trait PartiallySucceeded extends DeployPhaseStatus
  /* 4 */ val PartiallySucceeded: typingsSlinky.vsoNodeApi.releaseInterfacesMod.DeployPhaseStatus.PartiallySucceeded with Double = js.native
  
  @js.native
  sealed trait Skipped extends DeployPhaseStatus
  /* 64 */ val Skipped: typingsSlinky.vsoNodeApi.releaseInterfacesMod.DeployPhaseStatus.Skipped with Double = js.native
  
  @js.native
  sealed trait Succeeded extends DeployPhaseStatus
  /* 8 */ val Succeeded: typingsSlinky.vsoNodeApi.releaseInterfacesMod.DeployPhaseStatus.Succeeded with Double = js.native
  
  @js.native
  sealed trait Undefined extends DeployPhaseStatus
  /* 0 */ val Undefined: typingsSlinky.vsoNodeApi.releaseInterfacesMod.DeployPhaseStatus.Undefined with Double = js.native
}
