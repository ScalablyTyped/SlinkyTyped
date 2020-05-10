package typingsSlinky.winrt.Windows.Networking.Sockets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.Sockets.ControlChannelTrigger")
@js.native
class ControlChannelTrigger protected () extends IControlChannelTrigger {
  def this(channelId: String, serverKeepAliveIntervalInMinutes: Double) = this()
  def this(
    channelId: String,
    serverKeepAliveIntervalInMinutes: Double,
    resourceRequestType: ControlChannelTriggerResourceType
  ) = this()
  def dispose(): Unit = js.native
}

