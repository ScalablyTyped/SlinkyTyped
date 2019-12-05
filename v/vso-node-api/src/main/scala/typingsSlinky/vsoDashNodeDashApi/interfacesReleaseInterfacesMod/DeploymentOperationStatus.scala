package typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeploymentOperationStatus extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "DeploymentOperationStatus")
@js.native
object DeploymentOperationStatus extends js.Object {
  /**
    * The deployment operation status is all.
    */
  @js.native
  sealed trait All extends DeploymentOperationStatus
  
  /**
    * The deployment operation status is approved.
    */
  @js.native
  sealed trait Approved extends DeploymentOperationStatus
  
  /**
    * The deployment operation status is canceled.
    */
  @js.native
  sealed trait Canceled extends DeploymentOperationStatus
  
  /**
    * The deployment operation status is cancelling.
    */
  @js.native
  sealed trait Cancelling extends DeploymentOperationStatus
  
  /**
    * The deployment operation status is deferred.
    */
  @js.native
  sealed trait Deferred extends DeploymentOperationStatus
  
  /**
    * The deployment operation status is EvaluatingGates.
    */
  @js.native
  sealed trait EvaluatingGates extends DeploymentOperationStatus
  
  /**
    * The deployment operation status is GateFailed.
    */
  @js.native
  sealed trait GateFailed extends DeploymentOperationStatus
  
  /**
    * The deployment operation status is manualintervention pending.
    */
  @js.native
  sealed trait ManualInterventionPending extends DeploymentOperationStatus
  
  /**
    * The deployment operation status is pending.
    */
  @js.native
  sealed trait Pending extends DeploymentOperationStatus
  
  /**
    * The deployment operation status is phase canceled.
    */
  @js.native
  sealed trait PhaseCanceled extends DeploymentOperationStatus
  
  /**
    * The deployment operation status is phase failed.
    */
  @js.native
  sealed trait PhaseFailed extends DeploymentOperationStatus
  
  /**
    * The deployment operation status is phase inprogress.
    */
  @js.native
  sealed trait PhaseInProgress extends DeploymentOperationStatus
  
  /**
    * The deployment operation status is phase partially succeeded.
    */
  @js.native
  sealed trait PhasePartiallySucceeded extends DeploymentOperationStatus
  
  /**
    * The deployment operation status is phase succeeded.
    */
  @js.native
  sealed trait PhaseSucceeded extends DeploymentOperationStatus
  
  /**
    * The deployment operation status is queued.
    */
  @js.native
  sealed trait Queued extends DeploymentOperationStatus
  
  /**
    * The deployment operation status is queued for agent.
    */
  @js.native
  sealed trait QueuedForAgent extends DeploymentOperationStatus
  
  /**
    * The deployment operation status is queued for pipeline.
    */
  @js.native
  sealed trait QueuedForPipeline extends DeploymentOperationStatus
  
  /**
    * The deployment operation status is rejected.
    */
  @js.native
  sealed trait Rejected extends DeploymentOperationStatus
  
  /**
    * The deployment operation status is scheduled.
    */
  @js.native
  sealed trait Scheduled extends DeploymentOperationStatus
  
  /**
    * The deployment operation status is undefined.
    */
  @js.native
  sealed trait Undefined extends DeploymentOperationStatus
  
  /* 258047 */ val All: typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeploymentOperationStatus.All with Double = js.native
  /* 8 */ val Approved: typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeploymentOperationStatus.Approved with Double = js.native
  /* 2048 */ val Canceled: typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeploymentOperationStatus.Canceled with Double = js.native
  /* 32768 */ val Cancelling: typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeploymentOperationStatus.Cancelling with Double = js.native
  /* 32 */ val Deferred: typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeploymentOperationStatus.Deferred with Double = js.native
  /* 65536 */ val EvaluatingGates: typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeploymentOperationStatus.EvaluatingGates with Double = js.native
  /* 131072 */ val GateFailed: typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeploymentOperationStatus.GateFailed with Double = js.native
  /* 8192 */ val ManualInterventionPending: typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeploymentOperationStatus.ManualInterventionPending with Double = js.native
  /* 4 */ val Pending: typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeploymentOperationStatus.Pending with Double = js.native
  /* 4096 */ val PhaseCanceled: typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeploymentOperationStatus.PhaseCanceled with Double = js.native
  /* 1024 */ val PhaseFailed: typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeploymentOperationStatus.PhaseFailed with Double = js.native
  /* 128 */ val PhaseInProgress: typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeploymentOperationStatus.PhaseInProgress with Double = js.native
  /* 512 */ val PhasePartiallySucceeded: typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeploymentOperationStatus.PhasePartiallySucceeded with Double = js.native
  /* 256 */ val PhaseSucceeded: typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeploymentOperationStatus.PhaseSucceeded with Double = js.native
  /* 1 */ val Queued: typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeploymentOperationStatus.Queued with Double = js.native
  /* 64 */ val QueuedForAgent: typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeploymentOperationStatus.QueuedForAgent with Double = js.native
  /* 16384 */ val QueuedForPipeline: typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeploymentOperationStatus.QueuedForPipeline with Double = js.native
  /* 16 */ val Rejected: typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeploymentOperationStatus.Rejected with Double = js.native
  /* 2 */ val Scheduled: typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeploymentOperationStatus.Scheduled with Double = js.native
  /* 0 */ val Undefined: typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeploymentOperationStatus.Undefined with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeploymentOperationStatus with Double] = js.native
}

