package typingsSlinky.winrt.Windows.Networking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.EndpointPair")
@js.native
class EndpointPair protected () extends IEndpointPair {
  def this(
    localHostName: HostName,
    localServiceName: String,
    remoteHostName: HostName,
    remoteServiceName: String
  ) = this()
}

