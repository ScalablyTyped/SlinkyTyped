package typingsSlinky.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BuildReason extends js.Object

@JSImport("vso-node-api/interfaces/BuildInterfaces", "BuildReason")
@js.native
object BuildReason extends js.Object {
  /**
    * All reasons.
    */
  @js.native
  sealed trait All extends BuildReason
  
  /**
    * The build was started for the trigger TriggerType.BatchedContinuousIntegration.
    */
  @js.native
  sealed trait BatchedCI extends BuildReason
  
  /**
    * The build was started for the trigger ContinuousIntegrationType.Gated.
    */
  @js.native
  sealed trait CheckInShelveset extends BuildReason
  
  /**
    * The build was started for the trigger TriggerType.ContinuousIntegration.
    */
  @js.native
  sealed trait IndividualCI extends BuildReason
  
  /**
    * The build was started manually.
    */
  @js.native
  sealed trait Manual extends BuildReason
  
  /**
    * No reason. This value should not be used.
    */
  @js.native
  sealed trait None extends BuildReason
  
  /**
    * The build was started by a pull request. Added in resource version 3.
    */
  @js.native
  sealed trait PullRequest extends BuildReason
  
  /**
    * The build was started for the trigger TriggerType.Schedule.
    */
  @js.native
  sealed trait Schedule extends BuildReason
  
  /**
    * The build was triggered for retention policy purposes.
    */
  @js.native
  sealed trait Triggered extends BuildReason
  
  /**
    * The build was created by a user.
    */
  @js.native
  sealed trait UserCreated extends BuildReason
  
  /**
    * The build was started manually for private validation.
    */
  @js.native
  sealed trait ValidateShelveset extends BuildReason
  
  /* 495 */ val All: typingsSlinky.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildReason.All with Double = js.native
  /* 4 */ val BatchedCI: typingsSlinky.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildReason.BatchedCI with Double = js.native
  /* 128 */ val CheckInShelveset: typingsSlinky.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildReason.CheckInShelveset with Double = js.native
  /* 2 */ val IndividualCI: typingsSlinky.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildReason.IndividualCI with Double = js.native
  /* 1 */ val Manual: typingsSlinky.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildReason.Manual with Double = js.native
  /* 0 */ val None: typingsSlinky.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildReason.None with Double = js.native
  /* 256 */ val PullRequest: typingsSlinky.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildReason.PullRequest with Double = js.native
  /* 8 */ val Schedule: typingsSlinky.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildReason.Schedule with Double = js.native
  /* 431 */ val Triggered: typingsSlinky.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildReason.Triggered with Double = js.native
  /* 32 */ val UserCreated: typingsSlinky.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildReason.UserCreated with Double = js.native
  /* 64 */ val ValidateShelveset: typingsSlinky.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildReason.ValidateShelveset with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BuildReason with Double] = js.native
}

