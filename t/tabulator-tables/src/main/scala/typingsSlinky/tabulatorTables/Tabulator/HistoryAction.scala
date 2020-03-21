package typingsSlinky.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tabulatorTables.tabulatorTablesStrings.cellEdit
  - typingsSlinky.tabulatorTables.tabulatorTablesStrings.rowAdd
  - typingsSlinky.tabulatorTables.tabulatorTablesStrings.rowDelete
  - typingsSlinky.tabulatorTables.tabulatorTablesStrings.rowMoved
*/
trait HistoryAction extends js.Object

object HistoryAction {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cellEdit: typingsSlinky.tabulatorTables.tabulatorTablesStrings.cellEdit = this.cast("cellEdit")
  @scala.inline
  def rowAdd: typingsSlinky.tabulatorTables.tabulatorTablesStrings.rowAdd = this.cast("rowAdd")
  @scala.inline
  def rowDelete: typingsSlinky.tabulatorTables.tabulatorTablesStrings.rowDelete = this.cast("rowDelete")
  @scala.inline
  def rowMoved: typingsSlinky.tabulatorTables.tabulatorTablesStrings.rowMoved = this.cast("rowMoved")
}

