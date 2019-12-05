package typingsSlinky.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GitRefSearchType extends js.Object

@JSImport("vso-node-api/interfaces/GitInterfaces", "GitRefSearchType")
@js.native
object GitRefSearchType extends js.Object {
  @js.native
  sealed trait Contains extends GitRefSearchType
  
  @js.native
  sealed trait Exact extends GitRefSearchType
  
  @js.native
  sealed trait StartsWith extends GitRefSearchType
  
  /* 2 */ val Contains: typingsSlinky.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitRefSearchType.Contains with Double = js.native
  /* 0 */ val Exact: typingsSlinky.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitRefSearchType.Exact with Double = js.native
  /* 1 */ val StartsWith: typingsSlinky.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitRefSearchType.StartsWith with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitRefSearchType with Double] = js.native
}

