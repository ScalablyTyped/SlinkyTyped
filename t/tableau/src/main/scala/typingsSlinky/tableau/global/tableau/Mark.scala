package typingsSlinky.tableau.global.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region Marks Selection
/**
  * A mark represents a single data point on the visualization.
  * It is independent of the type of visualization (bar, line, pie, etc.).
  */
@JSGlobal("tableau.Mark")
@js.native
class Mark protected ()
  extends typingsSlinky.tableau.tableau.Mark {
  /** Creates a new Mark with the specified pairs. */
  def this(pairs: js.Array[typingsSlinky.tableau.tableau.Pair]) = this()
  /** Gets a collection of field name/value pairs associated with the mark. */
  /* CompleteClass */
  override def getPairs(): js.Array[typingsSlinky.tableau.tableau.Pair] = js.native
}

