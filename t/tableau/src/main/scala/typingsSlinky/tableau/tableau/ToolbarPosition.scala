package typingsSlinky.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ToolbarPosition extends js.Object
@JSGlobal("tableau.ToolbarPosition")
@js.native
object ToolbarPosition extends js.Object {
  
  /** Positions the toolbar along the bottom of the visualization. */
  @js.native
  sealed trait BOTTOM extends ToolbarPosition
  
  /** Positions the toolbar along the top of the visualization. */
  @js.native
  sealed trait TOP extends ToolbarPosition
}
