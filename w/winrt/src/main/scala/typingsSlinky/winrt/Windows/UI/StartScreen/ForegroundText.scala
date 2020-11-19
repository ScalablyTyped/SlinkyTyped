package typingsSlinky.winrt.Windows.UI.StartScreen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ForegroundText extends js.Object
@JSGlobal("Windows.UI.StartScreen.ForegroundText")
@js.native
object ForegroundText extends js.Object {
  
  @js.native
  sealed trait dark extends ForegroundText
  
  @js.native
  sealed trait light extends ForegroundText
}
