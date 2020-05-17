package typingsSlinky.signalExit

import typingsSlinky.signalExit.mod.Signal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object signalExitStrings {
  @js.native
  sealed trait SIGABRT extends Signal
  
  @js.native
  sealed trait SIGALRM extends Signal
  
  @js.native
  sealed trait SIGHUP extends Signal
  
  @js.native
  sealed trait SIGINT extends Signal
  
  @js.native
  sealed trait SIGTERM extends Signal
  
  @scala.inline
  def SIGABRT: SIGABRT = "SIGABRT".asInstanceOf[SIGABRT]
  @scala.inline
  def SIGALRM: SIGALRM = "SIGALRM".asInstanceOf[SIGALRM]
  @scala.inline
  def SIGHUP: SIGHUP = "SIGHUP".asInstanceOf[SIGHUP]
  @scala.inline
  def SIGINT: SIGINT = "SIGINT".asInstanceOf[SIGINT]
  @scala.inline
  def SIGTERM: SIGTERM = "SIGTERM".asInstanceOf[SIGTERM]
}

