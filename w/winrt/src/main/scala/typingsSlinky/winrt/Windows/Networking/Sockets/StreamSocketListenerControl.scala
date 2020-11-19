package typingsSlinky.winrt.Windows.Networking.Sockets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreamSocketListenerControl extends IStreamSocketListenerControl
object StreamSocketListenerControl {
  
  @scala.inline
  def apply(qualityOfService: SocketQualityOfService): StreamSocketListenerControl = {
    val __obj = js.Dynamic.literal(qualityOfService = qualityOfService.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamSocketListenerControl]
  }
}
