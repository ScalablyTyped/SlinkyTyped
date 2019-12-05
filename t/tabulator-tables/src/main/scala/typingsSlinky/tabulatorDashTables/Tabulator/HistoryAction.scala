package typingsSlinky.tabulatorDashTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.tabulatorDashTables.tabulatorDashTablesStrings.cellEdit
  - typings.tabulatorDashTables.tabulatorDashTablesStrings.rowAdd
  - typings.tabulatorDashTables.tabulatorDashTablesStrings.rowDelete
  - typings.tabulatorDashTables.tabulatorDashTablesStrings.rowMoved
*/
trait HistoryAction extends js.Object

object HistoryAction {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cellEdit: typingsSlinky.tabulatorDashTables.tabulatorDashTablesStrings.cellEdit = this.cast("cellEdit")
  @scala.inline
  def rowAdd: typingsSlinky.tabulatorDashTables.tabulatorDashTablesStrings.rowAdd = this.cast("rowAdd")
  @scala.inline
  def rowDelete: typingsSlinky.tabulatorDashTables.tabulatorDashTablesStrings.rowDelete = this.cast("rowDelete")
  @scala.inline
  def rowMoved: typingsSlinky.tabulatorDashTables.tabulatorDashTablesStrings.rowMoved = this.cast("rowMoved")
}

