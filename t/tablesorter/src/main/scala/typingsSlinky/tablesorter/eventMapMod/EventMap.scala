package typingsSlinky.tablesorter.eventMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tablesorter.tablesorterStrings.`tablesorter-initialized`
  - typingsSlinky.tablesorter.tablesorterStrings.`tablesorter-ready`
  - typingsSlinky.tablesorter.tablesorterStrings.refreshComplete
  - typingsSlinky.tablesorter.tablesorterStrings.updateComplete
  - typingsSlinky.tablesorter.tablesorterStrings.widgetRemoveEnd
  - typingsSlinky.tablesorter.tablesorterStrings.sortStart
  - typingsSlinky.tablesorter.tablesorterStrings.sortBegin
  - typingsSlinky.tablesorter.tablesorterStrings.sortEnd
*/
trait EventMap extends js.Object

object EventMap {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def refreshComplete: typingsSlinky.tablesorter.tablesorterStrings.refreshComplete = this.cast("refreshComplete")
  @scala.inline
  def sortBegin: typingsSlinky.tablesorter.tablesorterStrings.sortBegin = this.cast("sortBegin")
  @scala.inline
  def sortEnd: typingsSlinky.tablesorter.tablesorterStrings.sortEnd = this.cast("sortEnd")
  @scala.inline
  def sortStart: typingsSlinky.tablesorter.tablesorterStrings.sortStart = this.cast("sortStart")
  @scala.inline
  def `tablesorter-initialized`: typingsSlinky.tablesorter.tablesorterStrings.`tablesorter-initialized` = this.cast("tablesorter-initialized")
  @scala.inline
  def `tablesorter-ready`: typingsSlinky.tablesorter.tablesorterStrings.`tablesorter-ready` = this.cast("tablesorter-ready")
  @scala.inline
  def updateComplete: typingsSlinky.tablesorter.tablesorterStrings.updateComplete = this.cast("updateComplete")
  @scala.inline
  def widgetRemoveEnd: typingsSlinky.tablesorter.tablesorterStrings.widgetRemoveEnd = this.cast("widgetRemoveEnd")
}

