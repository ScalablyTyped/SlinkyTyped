package typingsSlinky.tablesorter.filteringColumnFilterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.tablesorter.tablesorterStrings.`false`
  - typings.tablesorter.tablesorterStrings.parsed
  - typings.tablesorter.tablesorterStrings.default
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

