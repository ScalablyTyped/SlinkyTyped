package typingsSlinky.tabulatorTables.Tabulator

import typingsSlinky.tabulatorTables.tabulatorTablesStrings.clipboard
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.data
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.download
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Object
  - js.Function4[
/ * value * / js.Any, 
/ * data * / js.Any, 
/ * type * / typingsSlinky.tabulatorTables.tabulatorTablesStrings.data | typingsSlinky.tabulatorTables.tabulatorTablesStrings.download | typingsSlinky.tabulatorTables.tabulatorTablesStrings.clipboard, 
/ * column * / js.UndefOr[typingsSlinky.tabulatorTables.Tabulator.ColumnComponent], 
js.Any]
*/
trait CustomAccessorParams extends js.Object

object CustomAccessorParams {
  @scala.inline
  implicit def apply(
    value: js.Function4[
      /* value */ js.Any, 
      /* data */ js.Any, 
      /* type */ data | download | clipboard, 
      /* column */ js.UndefOr[ColumnComponent], 
      js.Any
    ]
  ): CustomAccessorParams = value.asInstanceOf[CustomAccessorParams]
  @scala.inline
  implicit def apply(value: js.Object): CustomAccessorParams = value.asInstanceOf[CustomAccessorParams]
}

