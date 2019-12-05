package typingsSlinky.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ToolbarButtonName extends js.Object

@JSGlobal("tableau.ToolbarButtonName")
@js.native
object ToolbarButtonName extends js.Object {
  /** Specifies the Redo button in the toolbar. */
  @js.native
  sealed trait REDO extends ToolbarButtonName
  
  /** Specifies the Undo button in the toolbar. */
  @js.native
  sealed trait UNDO extends ToolbarButtonName
  
  /* "redo" */ val REDO: typingsSlinky.tableau.tableau.ToolbarButtonName.REDO with String = js.native
  /* "undo" */ val UNDO: typingsSlinky.tableau.tableau.ToolbarButtonName.UNDO with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ToolbarButtonName with String] = js.native
}

