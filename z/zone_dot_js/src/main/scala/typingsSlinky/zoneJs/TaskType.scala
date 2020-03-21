package typingsSlinky.zoneJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Task type: `microTask`, `macroTask`, `eventTask`.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.zoneJs.zoneJsStrings.microTask
  - typingsSlinky.zoneJs.zoneJsStrings.macroTask
  - typingsSlinky.zoneJs.zoneJsStrings.eventTask
*/
trait TaskType extends js.Object

object TaskType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def eventTask: typingsSlinky.zoneJs.zoneJsStrings.eventTask = this.cast("eventTask")
  @scala.inline
  def macroTask: typingsSlinky.zoneJs.zoneJsStrings.macroTask = this.cast("macroTask")
  @scala.inline
  def microTask: typingsSlinky.zoneJs.zoneJsStrings.microTask = this.cast("microTask")
}

