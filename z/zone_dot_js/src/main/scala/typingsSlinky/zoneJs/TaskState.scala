package typingsSlinky.zoneJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Task type: `notScheduled`, `scheduling`, `scheduled`, `running`, `canceling`, 'unknown'.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.zoneJs.zoneJsStrings.notScheduled
  - typingsSlinky.zoneJs.zoneJsStrings.scheduling
  - typingsSlinky.zoneJs.zoneJsStrings.scheduled
  - typingsSlinky.zoneJs.zoneJsStrings.running
  - typingsSlinky.zoneJs.zoneJsStrings.canceling
  - typingsSlinky.zoneJs.zoneJsStrings.unknown
*/
trait TaskState extends js.Object

object TaskState {
  @scala.inline
  def canceling: typingsSlinky.zoneJs.zoneJsStrings.canceling = this.cast("canceling")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def notScheduled: typingsSlinky.zoneJs.zoneJsStrings.notScheduled = this.cast("notScheduled")
  @scala.inline
  def running: typingsSlinky.zoneJs.zoneJsStrings.running = this.cast("running")
  @scala.inline
  def scheduled: typingsSlinky.zoneJs.zoneJsStrings.scheduled = this.cast("scheduled")
  @scala.inline
  def scheduling: typingsSlinky.zoneJs.zoneJsStrings.scheduling = this.cast("scheduling")
  @scala.inline
  def unknown: typingsSlinky.zoneJs.zoneJsStrings.unknown = this.cast("unknown")
}

