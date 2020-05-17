package typingsSlinky.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tabulatorTables.tabulatorTablesStrings.avg
  - typingsSlinky.tabulatorTables.tabulatorTablesStrings.max
  - typingsSlinky.tabulatorTables.tabulatorTablesStrings.min
  - typingsSlinky.tabulatorTables.tabulatorTablesStrings.sum
  - typingsSlinky.tabulatorTables.tabulatorTablesStrings.concat
  - typingsSlinky.tabulatorTables.tabulatorTablesStrings.count
  - js.Function3[
/ * values * / js.Array[js.Any], 
/ * data * / js.Array[js.Any], 
/ * calcParams * / js.Object, 
scala.Double]
*/
trait ColumnCalc extends js.Object

object ColumnCalc {
  @scala.inline
  def avg: typingsSlinky.tabulatorTables.tabulatorTablesStrings.avg = "avg".asInstanceOf[typingsSlinky.tabulatorTables.tabulatorTablesStrings.avg]
  @scala.inline
  def max: typingsSlinky.tabulatorTables.tabulatorTablesStrings.max = "max".asInstanceOf[typingsSlinky.tabulatorTables.tabulatorTablesStrings.max]
  @scala.inline
  def min: typingsSlinky.tabulatorTables.tabulatorTablesStrings.min = "min".asInstanceOf[typingsSlinky.tabulatorTables.tabulatorTablesStrings.min]
  @scala.inline
  def sum: typingsSlinky.tabulatorTables.tabulatorTablesStrings.sum = "sum".asInstanceOf[typingsSlinky.tabulatorTables.tabulatorTablesStrings.sum]
  @scala.inline
  def concat: typingsSlinky.tabulatorTables.tabulatorTablesStrings.concat = "concat".asInstanceOf[typingsSlinky.tabulatorTables.tabulatorTablesStrings.concat]
  @scala.inline
  def count: typingsSlinky.tabulatorTables.tabulatorTablesStrings.count = "count".asInstanceOf[typingsSlinky.tabulatorTables.tabulatorTablesStrings.count]
  @scala.inline
  implicit def apply(
    value: js.Function3[
      /* values */ js.Array[js.Any], 
      /* data */ js.Array[js.Any], 
      /* calcParams */ js.Object, 
      Double
    ]
  ): ColumnCalc = value.asInstanceOf[ColumnCalc]
}

