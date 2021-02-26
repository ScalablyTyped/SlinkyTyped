package typingsSlinky.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextEditorCursorStyle extends StObject
@JSImport("vscode", "TextEditorCursorStyle")
@js.native
object TextEditorCursorStyle extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextEditorCursorStyle with Double] = js.native
  
  /**
    * Render the cursor as a block filled.
    */
  @js.native
  sealed trait Block extends TextEditorCursorStyle
  /* 2 */ val Block: typingsSlinky.vscode.mod.TextEditorCursorStyle.Block with Double = js.native
  
  /**
    * Render the cursor as a block outlined.
    */
  @js.native
  sealed trait BlockOutline extends TextEditorCursorStyle
  /* 5 */ val BlockOutline: typingsSlinky.vscode.mod.TextEditorCursorStyle.BlockOutline with Double = js.native
  
  /**
    * Render the cursor as a vertical thick line.
    */
  @js.native
  sealed trait Line extends TextEditorCursorStyle
  /* 1 */ val Line: typingsSlinky.vscode.mod.TextEditorCursorStyle.Line with Double = js.native
  
  /**
    * Render the cursor as a vertical thin line.
    */
  @js.native
  sealed trait LineThin extends TextEditorCursorStyle
  /* 4 */ val LineThin: typingsSlinky.vscode.mod.TextEditorCursorStyle.LineThin with Double = js.native
  
  /**
    * Render the cursor as a thick horizontal line.
    */
  @js.native
  sealed trait Underline extends TextEditorCursorStyle
  /* 3 */ val Underline: typingsSlinky.vscode.mod.TextEditorCursorStyle.Underline with Double = js.native
  
  /**
    * Render the cursor as a thin horizontal line.
    */
  @js.native
  sealed trait UnderlineThin extends TextEditorCursorStyle
  /* 6 */ val UnderlineThin: typingsSlinky.vscode.mod.TextEditorCursorStyle.UnderlineThin with Double = js.native
}
