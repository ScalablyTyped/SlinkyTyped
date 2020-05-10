package typingsSlinky.winrt.Windows.System.Threading.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.System.Threading.Core.SignalNotifier")
@js.native
class SignalNotifier () extends ISignalNotifier

/* static members */
@JSGlobal("Windows.System.Threading.Core.SignalNotifier")
@js.native
object SignalNotifier extends js.Object {
  def attachToEvent(name: String, handler: SignalHandler): SignalNotifier = js.native
  def attachToEvent(name: String, handler: SignalHandler, timeout: Double): SignalNotifier = js.native
  def attachToSemaphore(name: String, handler: SignalHandler): SignalNotifier = js.native
  def attachToSemaphore(name: String, handler: SignalHandler, timeout: Double): SignalNotifier = js.native
}

