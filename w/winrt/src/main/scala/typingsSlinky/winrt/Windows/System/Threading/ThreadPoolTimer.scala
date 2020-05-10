package typingsSlinky.winrt.Windows.System.Threading

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.System.Threading.ThreadPoolTimer")
@js.native
class ThreadPoolTimer () extends IThreadPoolTimer

/* static members */
@JSGlobal("Windows.System.Threading.ThreadPoolTimer")
@js.native
object ThreadPoolTimer extends js.Object {
  def createPeriodicTimer(handler: TimerElapsedHandler, period: Double): ThreadPoolTimer = js.native
  def createPeriodicTimer(handler: TimerElapsedHandler, period: Double, destroyed: TimerDestroyedHandler): ThreadPoolTimer = js.native
  def createTimer(handler: TimerElapsedHandler, delay: Double): ThreadPoolTimer = js.native
  def createTimer(handler: TimerElapsedHandler, delay: Double, destroyed: TimerDestroyedHandler): ThreadPoolTimer = js.native
}

