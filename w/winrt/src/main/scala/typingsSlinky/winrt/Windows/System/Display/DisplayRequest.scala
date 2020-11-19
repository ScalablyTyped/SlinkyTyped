package typingsSlinky.winrt.Windows.System.Display

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisplayRequest extends IDisplayRequest
object DisplayRequest {
  
  @scala.inline
  def apply(requestActive: () => Unit, requestRelease: () => Unit): DisplayRequest = {
    val __obj = js.Dynamic.literal(requestActive = js.Any.fromFunction0(requestActive), requestRelease = js.Any.fromFunction0(requestRelease))
    __obj.asInstanceOf[DisplayRequest]
  }
}
