package typingsSlinky.tableau.global.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("tableau.CustomViewEvent")
@js.native
class CustomViewEvent ()
  extends typingsSlinky.tableau.tableau.CustomViewEvent {
  /** Gets the CustomView object associated with the event. */
  /* CompleteClass */
  override def getCustomViewAsync(): js.Promise[typingsSlinky.tableau.tableau.CustomView] = js.native
  /** Gets the name of the event, which is a string, but is also one of the items in the TableauEventName enum. */
  /* CompleteClass */
  override def getEventName(): typingsSlinky.tableau.tableau.TableauEventName = js.native
  /** Gets the Viz object associated with the event. */
  /* CompleteClass */
  override def getViz(): typingsSlinky.tableau.tableau.Viz = js.native
}

