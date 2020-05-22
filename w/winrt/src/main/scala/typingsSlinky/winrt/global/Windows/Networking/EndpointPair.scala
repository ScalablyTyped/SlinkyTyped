package typingsSlinky.winrt.global.Windows.Networking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.EndpointPair")
@js.native
class EndpointPair protected ()
  extends typingsSlinky.winrt.Windows.Networking.EndpointPair {
  def this(
    localHostName: typingsSlinky.winrt.Windows.Networking.HostName,
    localServiceName: String,
    remoteHostName: typingsSlinky.winrt.Windows.Networking.HostName,
    remoteServiceName: String
  ) = this()
  /* CompleteClass */
  override var localHostName: typingsSlinky.winrt.Windows.Networking.HostName = js.native
  /* CompleteClass */
  override var localServiceName: String = js.native
  /* CompleteClass */
  override var remoteHostName: typingsSlinky.winrt.Windows.Networking.HostName = js.native
  /* CompleteClass */
  override var remoteServiceName: String = js.native
}

