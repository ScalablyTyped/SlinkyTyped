package typingsSlinky.vscode.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ViewColumn extends js.Object

@JSImport("vscode", "ViewColumn")
@js.native
object ViewColumn extends js.Object {
  /**
  		 * A *symbolic* editor column representing the currently active column. This value
  		 * can be used when opening editors, but the *resolved* [viewColumn](#TextEditor.viewColumn)-value
  		 * of editors will always be `One`, `Two`, `Three`,... or `undefined` but never `Active`.
  		 */
  @js.native
  sealed trait Active extends ViewColumn
  
  /**
  		 * A *symbolic* editor column representing the column to the side of the active one. This value
  		 * can be used when opening editors, but the *resolved* [viewColumn](#TextEditor.viewColumn)-value
  		 * of editors will always be `One`, `Two`, `Three`,... or `undefined` but never `Beside`.
  		 */
  @js.native
  sealed trait Beside extends ViewColumn
  
  /**
  		 * The eighth editor column.
  		 */
  @js.native
  sealed trait Eight extends ViewColumn
  
  /**
  		 * The fifth editor column.
  		 */
  @js.native
  sealed trait Five extends ViewColumn
  
  /**
  		 * The fourth editor column.
  		 */
  @js.native
  sealed trait Four extends ViewColumn
  
  /**
  		 * The ninth editor column.
  		 */
  @js.native
  sealed trait Nine extends ViewColumn
  
  /**
  		 * The first editor column.
  		 */
  @js.native
  sealed trait One extends ViewColumn
  
  /**
  		 * The seventh editor column.
  		 */
  @js.native
  sealed trait Seven extends ViewColumn
  
  /**
  		 * The sixth editor column.
  		 */
  @js.native
  sealed trait Six extends ViewColumn
  
  /**
  		 * The third editor column.
  		 */
  @js.native
  sealed trait Three extends ViewColumn
  
  /**
  		 * The second editor column.
  		 */
  @js.native
  sealed trait Two extends ViewColumn
  
  /* -1 */ val Active: typingsSlinky.vscode.vscodeMod.ViewColumn.Active with Double = js.native
  /* -2 */ val Beside: typingsSlinky.vscode.vscodeMod.ViewColumn.Beside with Double = js.native
  /* 8 */ val Eight: typingsSlinky.vscode.vscodeMod.ViewColumn.Eight with Double = js.native
  /* 5 */ val Five: typingsSlinky.vscode.vscodeMod.ViewColumn.Five with Double = js.native
  /* 4 */ val Four: typingsSlinky.vscode.vscodeMod.ViewColumn.Four with Double = js.native
  /* 9 */ val Nine: typingsSlinky.vscode.vscodeMod.ViewColumn.Nine with Double = js.native
  /* 1 */ val One: typingsSlinky.vscode.vscodeMod.ViewColumn.One with Double = js.native
  /* 7 */ val Seven: typingsSlinky.vscode.vscodeMod.ViewColumn.Seven with Double = js.native
  /* 6 */ val Six: typingsSlinky.vscode.vscodeMod.ViewColumn.Six with Double = js.native
  /* 3 */ val Three: typingsSlinky.vscode.vscodeMod.ViewColumn.Three with Double = js.native
  /* 2 */ val Two: typingsSlinky.vscode.vscodeMod.ViewColumn.Two with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ViewColumn with Double] = js.native
}

