package typingsSlinky.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GitConflictUpdateStatus extends js.Object

@JSImport("vso-node-api/interfaces/GitInterfaces", "GitConflictUpdateStatus")
@js.native
object GitConflictUpdateStatus extends js.Object {
  /**
    * Indicates that the update request did not fit the expected data contract
    */
  @js.native
  sealed trait BadRequest extends GitConflictUpdateStatus
  
  /**
    * Indicates that the requested resolution was not valid
    */
  @js.native
  sealed trait InvalidResolution extends GitConflictUpdateStatus
  
  /**
    * Indicates that the conflict could not be found
    */
  @js.native
  sealed trait NotFound extends GitConflictUpdateStatus
  
  /**
    * Indicates that pull request conflict update request was completed successfully
    */
  @js.native
  sealed trait Succeeded extends GitConflictUpdateStatus
  
  /**
    * Indicates that the conflict in the update request was not a supported conflict type
    */
  @js.native
  sealed trait UnsupportedConflictType extends GitConflictUpdateStatus
  
  /* 1 */ val BadRequest: typingsSlinky.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitConflictUpdateStatus.BadRequest with Double = js.native
  /* 2 */ val InvalidResolution: typingsSlinky.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitConflictUpdateStatus.InvalidResolution with Double = js.native
  /* 4 */ val NotFound: typingsSlinky.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitConflictUpdateStatus.NotFound with Double = js.native
  /* 0 */ val Succeeded: typingsSlinky.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitConflictUpdateStatus.Succeeded with Double = js.native
  /* 3 */ val UnsupportedConflictType: typingsSlinky.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitConflictUpdateStatus.UnsupportedConflictType with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitConflictUpdateStatus with Double] = js.native
}

