package typingsSlinky.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GitResolutionPathConflictAction extends StObject
@JSImport("vso-node-api/interfaces/GitInterfaces", "GitResolutionPathConflictAction")
@js.native
object GitResolutionPathConflictAction extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitResolutionPathConflictAction with Double] = js.native
  
  @js.native
  sealed trait KeepSourceDeleteTarget extends GitResolutionPathConflictAction
  /* 2 */ val KeepSourceDeleteTarget: typingsSlinky.vsoNodeApi.gitInterfacesMod.GitResolutionPathConflictAction.KeepSourceDeleteTarget with Double = js.native
  
  @js.native
  sealed trait KeepSourceRenameTarget extends GitResolutionPathConflictAction
  /* 1 */ val KeepSourceRenameTarget: typingsSlinky.vsoNodeApi.gitInterfacesMod.GitResolutionPathConflictAction.KeepSourceRenameTarget with Double = js.native
  
  @js.native
  sealed trait KeepTargetDeleteSource extends GitResolutionPathConflictAction
  /* 4 */ val KeepTargetDeleteSource: typingsSlinky.vsoNodeApi.gitInterfacesMod.GitResolutionPathConflictAction.KeepTargetDeleteSource with Double = js.native
  
  @js.native
  sealed trait KeepTargetRenameSource extends GitResolutionPathConflictAction
  /* 3 */ val KeepTargetRenameSource: typingsSlinky.vsoNodeApi.gitInterfacesMod.GitResolutionPathConflictAction.KeepTargetRenameSource with Double = js.native
  
  @js.native
  sealed trait Undecided extends GitResolutionPathConflictAction
  /* 0 */ val Undecided: typingsSlinky.vsoNodeApi.gitInterfacesMod.GitResolutionPathConflictAction.Undecided with Double = js.native
}
