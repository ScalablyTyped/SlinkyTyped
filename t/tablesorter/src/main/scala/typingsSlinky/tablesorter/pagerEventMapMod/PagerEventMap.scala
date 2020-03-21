package typingsSlinky.tablesorter.pagerEventMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tablesorter.tablesorterStrings.pagerInitialized
  - typingsSlinky.tablesorter.tablesorterStrings.pageMoved
  - typingsSlinky.tablesorter.tablesorterStrings.pagerChange
  - typingsSlinky.tablesorter.tablesorterStrings.pagerComplete
  - typingsSlinky.tablesorter.tablesorterStrings.pagerBeforeInitialized
*/
trait PagerEventMap extends js.Object

object PagerEventMap {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def pageMoved: typingsSlinky.tablesorter.tablesorterStrings.pageMoved = this.cast("pageMoved")
  @scala.inline
  def pagerBeforeInitialized: typingsSlinky.tablesorter.tablesorterStrings.pagerBeforeInitialized = this.cast("pagerBeforeInitialized")
  @scala.inline
  def pagerChange: typingsSlinky.tablesorter.tablesorterStrings.pagerChange = this.cast("pagerChange")
  @scala.inline
  def pagerComplete: typingsSlinky.tablesorter.tablesorterStrings.pagerComplete = this.cast("pagerComplete")
  @scala.inline
  def pagerInitialized: typingsSlinky.tablesorter.tablesorterStrings.pagerInitialized = this.cast("pagerInitialized")
}

