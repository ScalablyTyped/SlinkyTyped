package typingsSlinky.vscode.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextEditorCursorStyle extends js.Object

@JSImport("vscode", "TextEditorCursorStyle")
@js.native
object TextEditorCursorStyle extends js.Object {
  /**
  		 * Render the cursor as a block filled.
  		 */
  @js.native
  sealed trait Block extends TextEditorCursorStyle
  
  /**
  		 * Render the cursor as a block outlined.
  		 */
  @js.native
  sealed trait BlockOutline extends TextEditorCursorStyle
  
  /**
  		 * Render the cursor as a vertical thick line.
  		 */
  @js.native
  sealed trait Line extends TextEditorCursorStyle
  
  /**
  		 * Render the cursor as a vertical thin line.
  		 */
  @js.native
  sealed trait LineThin extends TextEditorCursorStyle
  
  /**
  		 * Render the cursor as a thick horizontal line.
  		 */
  @js.native
  sealed trait Underline extends TextEditorCursorStyle
  
  /**
  		 * Render the cursor as a thin horizontal line.
  		 */
  @js.native
  sealed trait UnderlineThin extends TextEditorCursorStyle
  
  /* 2 */ val Block: typingsSlinky.vscode.vscodeMod.TextEditorCursorStyle.Block with Double = js.native
  /* 5 */ val BlockOutline: typingsSlinky.vscode.vscodeMod.TextEditorCursorStyle.BlockOutline with Double = js.native
  /* 1 */ val Line: typingsSlinky.vscode.vscodeMod.TextEditorCursorStyle.Line with Double = js.native
  /* 4 */ val LineThin: typingsSlinky.vscode.vscodeMod.TextEditorCursorStyle.LineThin with Double = js.native
  /* 3 */ val Underline: typingsSlinky.vscode.vscodeMod.TextEditorCursorStyle.Underline with Double = js.native
  /* 6 */ val UnderlineThin: typingsSlinky.vscode.vscodeMod.TextEditorCursorStyle.UnderlineThin with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextEditorCursorStyle with Double] = js.native
}

