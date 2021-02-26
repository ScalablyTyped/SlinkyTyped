package typingsSlinky.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GitPathActions extends StObject
@JSImport("vso-node-api/interfaces/GitInterfaces", "GitPathActions")
@js.native
object GitPathActions extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitPathActions with Double] = js.native
  
  @js.native
  sealed trait Add extends GitPathActions
  /* 3 */ val Add: typingsSlinky.vsoNodeApi.gitInterfacesMod.GitPathActions.Add with Double = js.native
  
  @js.native
  sealed trait Delete extends GitPathActions
  /* 2 */ val Delete: typingsSlinky.vsoNodeApi.gitInterfacesMod.GitPathActions.Delete with Double = js.native
  
  @js.native
  sealed trait Edit extends GitPathActions
  /* 1 */ val Edit: typingsSlinky.vsoNodeApi.gitInterfacesMod.GitPathActions.Edit with Double = js.native
  
  @js.native
  sealed trait None extends GitPathActions
  /* 0 */ val None: typingsSlinky.vsoNodeApi.gitInterfacesMod.GitPathActions.None with Double = js.native
  
  @js.native
  sealed trait Rename extends GitPathActions
  /* 4 */ val Rename: typingsSlinky.vsoNodeApi.gitInterfacesMod.GitPathActions.Rename with Double = js.native
}
