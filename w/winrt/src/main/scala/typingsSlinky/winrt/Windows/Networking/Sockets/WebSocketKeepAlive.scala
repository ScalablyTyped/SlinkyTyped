package typingsSlinky.winrt.Windows.Networking.Sockets

import typingsSlinky.winrt.Windows.ApplicationModel.Background.IBackgroundTask
import typingsSlinky.winrt.Windows.ApplicationModel.Background.IBackgroundTaskInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebSocketKeepAlive extends IBackgroundTask
object WebSocketKeepAlive {
  
  @scala.inline
  def apply(run: IBackgroundTaskInstance => Unit): WebSocketKeepAlive = {
    val __obj = js.Dynamic.literal(run = js.Any.fromFunction1(run))
    __obj.asInstanceOf[WebSocketKeepAlive]
  }
}
