package typingsSlinky.winrtUwp.global.Windows.Networking.Sockets

import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The context associated with a socket while transferring ownership of the socket between an app and the socket brokering service. */
@JSGlobal("Windows.Networking.Sockets.SocketActivityContext")
@js.native
class SocketActivityContext protected ()
  extends typingsSlinky.winrtUwp.Windows.Networking.Sockets.SocketActivityContext {
  /**
    * Constructs a new SocketActivityContext object with given context data.
    * @param data Context data to be used when the socket broker notifies the app of socket activity.
    */
  def this(data: IBuffer) = this()
}
