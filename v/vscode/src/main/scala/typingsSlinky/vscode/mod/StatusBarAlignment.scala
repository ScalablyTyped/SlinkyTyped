package typingsSlinky.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StatusBarAlignment extends StObject
@JSImport("vscode", "StatusBarAlignment")
@js.native
object StatusBarAlignment extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StatusBarAlignment with Double] = js.native
  
  /**
    * Aligned to the left side.
    */
  @js.native
  sealed trait Left extends StatusBarAlignment
  /* 1 */ val Left: typingsSlinky.vscode.mod.StatusBarAlignment.Left with Double = js.native
  
  /**
    * Aligned to the right side.
    */
  @js.native
  sealed trait Right extends StatusBarAlignment
  /* 2 */ val Right: typingsSlinky.vscode.mod.StatusBarAlignment.Right with Double = js.native
}
