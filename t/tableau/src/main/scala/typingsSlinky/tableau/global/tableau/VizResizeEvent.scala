package typingsSlinky.tableau.global.tableau

import typingsSlinky.tableau.tableau.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("tableau.VizResizeEvent")
@js.native
class VizResizeEvent ()
  extends typingsSlinky.tableau.tableau.VizResizeEvent {
  /** Gets the name of the event, which is a string, but is also one of the items in the TableauEventName enum. */
  /* CompleteClass */
  override def getEventName(): typingsSlinky.tableau.tableau.TableauEventName = js.native
  /** Gets the Viz object associated with the event. */
  /* CompleteClass */
  override def getViz(): typingsSlinky.tableau.tableau.Viz = js.native
  /** Gets the sheetSize record for the current sheet. For more information, see SheetSizeOptions Record. */
  /* CompleteClass */
  override def getVizSize(): Size = js.native
}

