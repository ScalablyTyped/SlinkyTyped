package typingsSlinky.tablesorter.matchTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tablesorter.tablesorterStrings.exact
  - typingsSlinky.tablesorter.tablesorterStrings.`match`
*/
trait MatchType extends js.Object

object MatchType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def exact: typingsSlinky.tablesorter.tablesorterStrings.exact = this.cast("exact")
  @scala.inline
  def `match`: typingsSlinky.tablesorter.tablesorterStrings.`match` = this.cast("match")
}

