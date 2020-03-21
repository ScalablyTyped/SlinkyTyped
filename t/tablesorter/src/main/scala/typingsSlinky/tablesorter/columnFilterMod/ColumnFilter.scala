package typingsSlinky.tablesorter.columnFilterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tablesorter.tablesorterStrings.`false`
  - typingsSlinky.tablesorter.tablesorterStrings.parsed
  - typingsSlinky.tablesorter.tablesorterStrings.default
*/
trait ColumnFilter extends js.Object

object ColumnFilter {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: typingsSlinky.tablesorter.tablesorterStrings.default = this.cast("default")
  @scala.inline
  def `false`: typingsSlinky.tablesorter.tablesorterStrings.`false` = this.cast("false")
  @scala.inline
  def parsed: typingsSlinky.tablesorter.tablesorterStrings.parsed = this.cast("parsed")
}

