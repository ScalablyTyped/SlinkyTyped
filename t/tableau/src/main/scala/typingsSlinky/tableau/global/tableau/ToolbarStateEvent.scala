package typingsSlinky.tableau.global.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("tableau.ToolbarStateEvent")
@js.native
class ToolbarStateEvent ()
  extends typingsSlinky.tableau.tableau.ToolbarStateEvent {
  /** Gets the name of the event, which is a string, but is also one of the items in the TableauEventName enum. */
  /* CompleteClass */
  override def getEventName(): typingsSlinky.tableau.tableau.TableauEventName = js.native
  /** Returns the new ToolbarState. */
  /* CompleteClass */
  override def getToolbarState(): typingsSlinky.tableau.tableau.ToolbarState = js.native
  /** Gets the Viz object associated with the event. */
  /* CompleteClass */
  override def getViz(): typingsSlinky.tableau.tableau.Viz = js.native
}

