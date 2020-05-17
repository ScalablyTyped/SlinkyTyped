package typingsSlinky.signalExit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.signalExit.signalExitStrings.SIGABRT
  - typingsSlinky.signalExit.signalExitStrings.SIGALRM
  - typingsSlinky.signalExit.signalExitStrings.SIGHUP
  - typingsSlinky.signalExit.signalExitStrings.SIGINT
  - typingsSlinky.signalExit.signalExitStrings.SIGTERM
  - java.lang.String
*/
trait Signal extends js.Object

object Signal {
  @scala.inline
  def SIGABRT: typingsSlinky.signalExit.signalExitStrings.SIGABRT = "SIGABRT".asInstanceOf[typingsSlinky.signalExit.signalExitStrings.SIGABRT]
  @scala.inline
  def SIGALRM: typingsSlinky.signalExit.signalExitStrings.SIGALRM = "SIGALRM".asInstanceOf[typingsSlinky.signalExit.signalExitStrings.SIGALRM]
  @scala.inline
  def SIGHUP: typingsSlinky.signalExit.signalExitStrings.SIGHUP = "SIGHUP".asInstanceOf[typingsSlinky.signalExit.signalExitStrings.SIGHUP]
  @scala.inline
  def SIGINT: typingsSlinky.signalExit.signalExitStrings.SIGINT = "SIGINT".asInstanceOf[typingsSlinky.signalExit.signalExitStrings.SIGINT]
  @scala.inline
  def SIGTERM: typingsSlinky.signalExit.signalExitStrings.SIGTERM = "SIGTERM".asInstanceOf[typingsSlinky.signalExit.signalExitStrings.SIGTERM]
  @scala.inline
  implicit def apply(value: String): Signal = value.asInstanceOf[Signal]
}

