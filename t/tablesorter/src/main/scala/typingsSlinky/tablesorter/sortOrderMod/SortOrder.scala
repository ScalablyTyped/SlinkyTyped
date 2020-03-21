package typingsSlinky.tablesorter.sortOrderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tablesorter.tablesorterStrings.asc
  - typingsSlinky.tablesorter.tablesorterStrings.desc
*/
trait SortOrder extends js.Object

object SortOrder {
  @scala.inline
  def asc: typingsSlinky.tablesorter.tablesorterStrings.asc = this.cast("asc")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def desc: typingsSlinky.tablesorter.tablesorterStrings.desc = this.cast("desc")
}

