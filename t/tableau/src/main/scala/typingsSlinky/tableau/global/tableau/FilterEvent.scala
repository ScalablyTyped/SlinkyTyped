package typingsSlinky.tableau.global.tableau

import typingsSlinky.tableau.tableau.ConcreteFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("tableau.FilterEvent")
@js.native
class FilterEvent ()
  extends typingsSlinky.tableau.tableau.FilterEvent {
  /** Gets the name of the event, which is a string, but is also one of the items in the TableauEventName enum. */
  /* CompleteClass */
  override def getEventName(): typingsSlinky.tableau.tableau.TableauEventName = js.native
  /** Gets the name of the field. */
  /* CompleteClass */
  override def getFieldName(): String = js.native
  /** Gets the Filter object associated with the event. */
  /* CompleteClass */
  override def getFilterAsync(): js.Promise[ConcreteFilter] = js.native
  /** Gets the Viz object associated with the event. */
  /* CompleteClass */
  override def getViz(): typingsSlinky.tableau.tableau.Viz = js.native
  /** Gets the Worksheet object associated with the event. */
  /* CompleteClass */
  override def getWorksheet(): typingsSlinky.tableau.tableau.Worksheet = js.native
}

