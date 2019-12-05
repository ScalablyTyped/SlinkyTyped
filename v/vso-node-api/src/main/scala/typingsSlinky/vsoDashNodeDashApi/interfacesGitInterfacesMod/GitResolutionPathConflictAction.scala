package typingsSlinky.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GitResolutionPathConflictAction extends js.Object

@JSImport("vso-node-api/interfaces/GitInterfaces", "GitResolutionPathConflictAction")
@js.native
object GitResolutionPathConflictAction extends js.Object {
  @js.native
  sealed trait KeepSourceDeleteTarget extends GitResolutionPathConflictAction
  
  @js.native
  sealed trait KeepSourceRenameTarget extends GitResolutionPathConflictAction
  
  @js.native
  sealed trait KeepTargetDeleteSource extends GitResolutionPathConflictAction
  
  @js.native
  sealed trait KeepTargetRenameSource extends GitResolutionPathConflictAction
  
  @js.native
  sealed trait Undecided extends GitResolutionPathConflictAction
  
  /* 2 */ val KeepSourceDeleteTarget: typingsSlinky.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitResolutionPathConflictAction.KeepSourceDeleteTarget with Double = js.native
  /* 1 */ val KeepSourceRenameTarget: typingsSlinky.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitResolutionPathConflictAction.KeepSourceRenameTarget with Double = js.native
  /* 4 */ val KeepTargetDeleteSource: typingsSlinky.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitResolutionPathConflictAction.KeepTargetDeleteSource with Double = js.native
  /* 3 */ val KeepTargetRenameSource: typingsSlinky.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitResolutionPathConflictAction.KeepTargetRenameSource with Double = js.native
  /* 0 */ val Undecided: typingsSlinky.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitResolutionPathConflictAction.Undecided with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitResolutionPathConflictAction with Double] = js.native
}

