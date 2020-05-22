package typingsSlinky.winrt.global.Windows.Networking.Sockets

import typingsSlinky.winrt.Windows.Foundation.IAsyncAction
import typingsSlinky.winrt.Windows.Networking.HostName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.Sockets.StreamSocketListener")
@js.native
class StreamSocketListener ()
  extends typingsSlinky.winrt.Windows.Networking.Sockets.StreamSocketListener {
  /* CompleteClass */
  override var control: typingsSlinky.winrt.Windows.Networking.Sockets.StreamSocketListenerControl = js.native
  /* CompleteClass */
  override var information: typingsSlinky.winrt.Windows.Networking.Sockets.StreamSocketListenerInformation = js.native
  /* CompleteClass */
  override var onconnectionreceived: js.Any = js.native
  /* CompleteClass */
  override def bindEndpointAsync(localHostName: HostName, localServiceName: String): IAsyncAction = js.native
  /* CompleteClass */
  override def bindServiceNameAsync(localServiceName: String): IAsyncAction = js.native
  /* CompleteClass */
  override def close(): Unit = js.native
  /* CompleteClass */
  override def dispose(): Unit = js.native
}

