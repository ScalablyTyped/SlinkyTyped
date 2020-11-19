package typingsSlinky.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TfvcVersionOption extends js.Object
@JSImport("vso-node-api/interfaces/GitInterfaces", "TfvcVersionOption")
@js.native
object TfvcVersionOption extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TfvcVersionOption with Double] = js.native
  
  @js.native
  sealed trait None extends TfvcVersionOption
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  @js.native
  sealed trait Previous extends TfvcVersionOption
  /* 1 */ @js.native
  object Previous extends TopLevel[Previous with Double]
  
  @js.native
  sealed trait UseRename extends TfvcVersionOption
  /* 2 */ @js.native
  object UseRename extends TopLevel[UseRename with Double]
}
