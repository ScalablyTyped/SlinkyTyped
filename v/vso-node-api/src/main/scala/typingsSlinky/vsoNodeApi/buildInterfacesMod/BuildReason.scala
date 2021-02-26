package typingsSlinky.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BuildReason extends StObject
@JSImport("vso-node-api/interfaces/BuildInterfaces", "BuildReason")
@js.native
object BuildReason extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BuildReason with Double] = js.native
  
  /**
    * All reasons.
    */
  @js.native
  sealed trait All extends BuildReason
  /* 495 */ val All: typingsSlinky.vsoNodeApi.buildInterfacesMod.BuildReason.All with Double = js.native
  
  /**
    * The build was started for the trigger TriggerType.BatchedContinuousIntegration.
    */
  @js.native
  sealed trait BatchedCI extends BuildReason
  /* 4 */ val BatchedCI: typingsSlinky.vsoNodeApi.buildInterfacesMod.BuildReason.BatchedCI with Double = js.native
  
  /**
    * The build was started for the trigger ContinuousIntegrationType.Gated.
    */
  @js.native
  sealed trait CheckInShelveset extends BuildReason
  /* 128 */ val CheckInShelveset: typingsSlinky.vsoNodeApi.buildInterfacesMod.BuildReason.CheckInShelveset with Double = js.native
  
  /**
    * The build was started for the trigger TriggerType.ContinuousIntegration.
    */
  @js.native
  sealed trait IndividualCI extends BuildReason
  /* 2 */ val IndividualCI: typingsSlinky.vsoNodeApi.buildInterfacesMod.BuildReason.IndividualCI with Double = js.native
  
  /**
    * The build was started manually.
    */
  @js.native
  sealed trait Manual extends BuildReason
  /* 1 */ val Manual: typingsSlinky.vsoNodeApi.buildInterfacesMod.BuildReason.Manual with Double = js.native
  
  /**
    * No reason. This value should not be used.
    */
  @js.native
  sealed trait None extends BuildReason
  /* 0 */ val None: typingsSlinky.vsoNodeApi.buildInterfacesMod.BuildReason.None with Double = js.native
  
  /**
    * The build was started by a pull request. Added in resource version 3.
    */
  @js.native
  sealed trait PullRequest extends BuildReason
  /* 256 */ val PullRequest: typingsSlinky.vsoNodeApi.buildInterfacesMod.BuildReason.PullRequest with Double = js.native
  
  /**
    * The build was started for the trigger TriggerType.Schedule.
    */
  @js.native
  sealed trait Schedule extends BuildReason
  /* 8 */ val Schedule: typingsSlinky.vsoNodeApi.buildInterfacesMod.BuildReason.Schedule with Double = js.native
  
  /**
    * The build was triggered for retention policy purposes.
    */
  @js.native
  sealed trait Triggered extends BuildReason
  /* 431 */ val Triggered: typingsSlinky.vsoNodeApi.buildInterfacesMod.BuildReason.Triggered with Double = js.native
  
  /**
    * The build was created by a user.
    */
  @js.native
  sealed trait UserCreated extends BuildReason
  /* 32 */ val UserCreated: typingsSlinky.vsoNodeApi.buildInterfacesMod.BuildReason.UserCreated with Double = js.native
  
  /**
    * The build was started manually for private validation.
    */
  @js.native
  sealed trait ValidateShelveset extends BuildReason
  /* 64 */ val ValidateShelveset: typingsSlinky.vsoNodeApi.buildInterfacesMod.BuildReason.ValidateShelveset with Double = js.native
}
