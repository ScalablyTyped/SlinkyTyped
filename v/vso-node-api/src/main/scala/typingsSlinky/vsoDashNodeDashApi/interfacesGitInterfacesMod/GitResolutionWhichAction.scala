package typingsSlinky.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GitResolutionWhichAction extends js.Object

@JSImport("vso-node-api/interfaces/GitInterfaces", "GitResolutionWhichAction")
@js.native
object GitResolutionWhichAction extends js.Object {
  @js.native
  sealed trait PickSourceAction extends GitResolutionWhichAction
  
  @js.native
  sealed trait PickTargetAction extends GitResolutionWhichAction
  
  @js.native
  sealed trait Undecided extends GitResolutionWhichAction
  
  /* 1 */ val PickSourceAction: typingsSlinky.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitResolutionWhichAction.PickSourceAction with Double = js.native
  /* 2 */ val PickTargetAction: typingsSlinky.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitResolutionWhichAction.PickTargetAction with Double = js.native
  /* 0 */ val Undecided: typingsSlinky.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitResolutionWhichAction.Undecided with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitResolutionWhichAction with Double] = js.native
}

