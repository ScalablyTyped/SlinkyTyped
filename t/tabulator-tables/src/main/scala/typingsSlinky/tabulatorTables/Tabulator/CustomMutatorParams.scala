package typingsSlinky.tabulatorTables.Tabulator

import typingsSlinky.tabulatorTables.tabulatorTablesStrings.data
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.edit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Object
  - js.Function4[
/ * value * / js.Any, 
/ * data * / js.Any, 
/ * type * / typingsSlinky.tabulatorTables.tabulatorTablesStrings.data | typingsSlinky.tabulatorTables.tabulatorTablesStrings.edit, 
/ * cell * / js.UndefOr[typingsSlinky.tabulatorTables.Tabulator.CellComponent], 
js.Any]
*/
trait CustomMutatorParams extends js.Object

object CustomMutatorParams {
  @scala.inline
  implicit def apply(
    value: js.Function4[
      /* value */ js.Any, 
      /* data */ js.Any, 
      /* type */ data | edit, 
      /* cell */ js.UndefOr[CellComponent], 
      js.Any
    ]
  ): CustomMutatorParams = value.asInstanceOf[CustomMutatorParams]
  @scala.inline
  implicit def apply(value: js.Object): CustomMutatorParams = value.asInstanceOf[CustomMutatorParams]
}

