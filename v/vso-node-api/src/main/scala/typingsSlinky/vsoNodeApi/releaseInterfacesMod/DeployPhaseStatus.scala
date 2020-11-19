package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeployPhaseStatus extends js.Object
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "DeployPhaseStatus")
@js.native
object DeployPhaseStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeployPhaseStatus with Double] = js.native
  
  @js.native
  sealed trait Canceled extends DeployPhaseStatus
  /* 32 */ @js.native
  object Canceled extends TopLevel[Canceled with Double]
  
  @js.native
  sealed trait Cancelling extends DeployPhaseStatus
  /* 128 */ @js.native
  object Cancelling extends TopLevel[Cancelling with Double]
  
  @js.native
  sealed trait Failed extends DeployPhaseStatus
  /* 16 */ @js.native
  object Failed extends TopLevel[Failed with Double]
  
  @js.native
  sealed trait InProgress extends DeployPhaseStatus
  /* 2 */ @js.native
  object InProgress extends TopLevel[InProgress with Double]
  
  @js.native
  sealed trait NotStarted extends DeployPhaseStatus
  /* 1 */ @js.native
  object NotStarted extends TopLevel[NotStarted with Double]
  
  @js.native
  sealed trait PartiallySucceeded extends DeployPhaseStatus
  /* 4 */ @js.native
  object PartiallySucceeded extends TopLevel[PartiallySucceeded with Double]
  
  @js.native
  sealed trait Skipped extends DeployPhaseStatus
  /* 64 */ @js.native
  object Skipped extends TopLevel[Skipped with Double]
  
  @js.native
  sealed trait Succeeded extends DeployPhaseStatus
  /* 8 */ @js.native
  object Succeeded extends TopLevel[Succeeded with Double]
  
  @js.native
  sealed trait Undefined extends DeployPhaseStatus
  /* 0 */ @js.native
  object Undefined extends TopLevel[Undefined with Double]
}
