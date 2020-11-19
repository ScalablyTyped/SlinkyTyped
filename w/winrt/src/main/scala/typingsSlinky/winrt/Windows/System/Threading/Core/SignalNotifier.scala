package typingsSlinky.winrt.Windows.System.Threading.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignalNotifier extends ISignalNotifier
object SignalNotifier {
  
  @scala.inline
  def apply(enable: () => Unit, terminate: () => Unit): SignalNotifier = {
    val __obj = js.Dynamic.literal(enable = js.Any.fromFunction0(enable), terminate = js.Any.fromFunction0(terminate))
    __obj.asInstanceOf[SignalNotifier]
  }
}
