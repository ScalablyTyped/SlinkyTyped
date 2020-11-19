package typingsSlinky.storybookUi.keyCodesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait KeyMod extends js.Object
@JSImport("@storybook/ui/dist/keyboard/keyCodes", "KeyMod")
@js.native
object KeyMod extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[KeyMod with Double] = js.native
  
  @js.native
  sealed trait Alt extends KeyMod
  /* 512 */ @js.native
  object Alt extends TopLevel[Alt with Double]
  
  @js.native
  sealed trait CtrlCmd extends KeyMod
  /* 2048 */ @js.native
  object CtrlCmd extends TopLevel[CtrlCmd with Double]
  
  @js.native
  sealed trait Shift extends KeyMod
  /* 1024 */ @js.native
  object Shift extends TopLevel[Shift with Double]
  
  @js.native
  sealed trait WinCtrl extends KeyMod
  /* 256 */ @js.native
  object WinCtrl extends TopLevel[WinCtrl with Double]
}
