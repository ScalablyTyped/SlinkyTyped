package typingsSlinky.tableau.global.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("tableau.ToolbarState")
@js.native
class ToolbarState ()
  extends typingsSlinky.tableau.tableau.ToolbarState {
  /** Gets the Viz object associated with the toolbar. */
  /* CompleteClass */
  override def getViz(): typingsSlinky.tableau.tableau.Viz = js.native
  /**
    * Gets a value indicating whether the specified toolbar button is enabled.
    * The supported buttons are defined in the ToobarButtonName enum.
    * Currently, only Undo and Redo are supported.
    * Checking this property with a toolbar button that is not supported causes an InvalidToolbarButtonName error.
    */
  /* CompleteClass */
  override def isButtonEnabled(toolbarButtonName: typingsSlinky.tableau.tableau.ToolbarButtonName): Boolean = js.native
}

