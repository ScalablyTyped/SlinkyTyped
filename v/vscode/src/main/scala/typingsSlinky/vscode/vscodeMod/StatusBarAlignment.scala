package typingsSlinky.vscode.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StatusBarAlignment extends js.Object

@JSImport("vscode", "StatusBarAlignment")
@js.native
object StatusBarAlignment extends js.Object {
  /**
  		 * Aligned to the left side.
  		 */
  @js.native
  sealed trait Left extends StatusBarAlignment
  
  /**
  		 * Aligned to the right side.
  		 */
  @js.native
  sealed trait Right extends StatusBarAlignment
  
  /* 1 */ val Left: typingsSlinky.vscode.vscodeMod.StatusBarAlignment.Left with Double = js.native
  /* 2 */ val Right: typingsSlinky.vscode.vscodeMod.StatusBarAlignment.Right with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StatusBarAlignment with Double] = js.native
}

