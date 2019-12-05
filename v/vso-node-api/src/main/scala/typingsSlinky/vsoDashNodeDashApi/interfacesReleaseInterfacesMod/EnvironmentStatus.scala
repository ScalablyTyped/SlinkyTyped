package typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnvironmentStatus extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "EnvironmentStatus")
@js.native
object EnvironmentStatus extends js.Object {
  @js.native
  sealed trait Canceled extends EnvironmentStatus
  
  @js.native
  sealed trait InProgress extends EnvironmentStatus
  
  @js.native
  sealed trait NotStarted extends EnvironmentStatus
  
  @js.native
  sealed trait PartiallySucceeded extends EnvironmentStatus
  
  @js.native
  sealed trait Queued extends EnvironmentStatus
  
  @js.native
  sealed trait Rejected extends EnvironmentStatus
  
  @js.native
  sealed trait Scheduled extends EnvironmentStatus
  
  @js.native
  sealed trait Succeeded extends EnvironmentStatus
  
  @js.native
  sealed trait Undefined extends EnvironmentStatus
  
  /* 8 */ val Canceled: typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.EnvironmentStatus.Canceled with Double = js.native
  /* 2 */ val InProgress: typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.EnvironmentStatus.InProgress with Double = js.native
  /* 1 */ val NotStarted: typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.EnvironmentStatus.NotStarted with Double = js.native
  /* 128 */ val PartiallySucceeded: typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.EnvironmentStatus.PartiallySucceeded with Double = js.native
  /* 32 */ val Queued: typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.EnvironmentStatus.Queued with Double = js.native
  /* 16 */ val Rejected: typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.EnvironmentStatus.Rejected with Double = js.native
  /* 64 */ val Scheduled: typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.EnvironmentStatus.Scheduled with Double = js.native
  /* 4 */ val Succeeded: typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.EnvironmentStatus.Succeeded with Double = js.native
  /* 0 */ val Undefined: typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.EnvironmentStatus.Undefined with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnvironmentStatus with Double] = js.native
}

