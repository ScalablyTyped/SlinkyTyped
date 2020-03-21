package typingsSlinky.timerMachine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.timerMachine.timerMachineStrings.start
  - typingsSlinky.timerMachine.timerMachineStrings.stop
  - typingsSlinky.timerMachine.timerMachineStrings.time
*/
trait TimerEvent extends js.Object

object TimerEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def start: typingsSlinky.timerMachine.timerMachineStrings.start = this.cast("start")
  @scala.inline
  def stop: typingsSlinky.timerMachine.timerMachineStrings.stop = this.cast("stop")
  @scala.inline
  def time: typingsSlinky.timerMachine.timerMachineStrings.time = this.cast("time")
}

