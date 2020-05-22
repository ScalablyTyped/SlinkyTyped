package typingsSlinky.tableau.global.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("tableau.Field")
@js.native
class Field ()
  extends typingsSlinky.tableau.tableau.Field {
  /* CompleteClass */
  override def getAggregation(): typingsSlinky.tableau.tableau.FieldAggregationType = js.native
  /** Gets the data source to which this field belongs. */
  /* CompleteClass */
  override def getDataSource(): typingsSlinky.tableau.tableau.DataSource = js.native
  /** Gets the field name (i.e. caption). */
  /* CompleteClass */
  override def getName(): String = js.native
  /** One of the following values: DIMENSION, MEASURE, UKNOWN */
  /* CompleteClass */
  override def getRole(): typingsSlinky.tableau.tableau.FieldRoleType = js.native
}

