package typingsSlinky.winrt.Windows.Networking.Sockets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IControlChannelTriggerFactory extends js.Object {
  
  def createControlChannelTrigger(channelId: String, serverKeepAliveIntervalInMinutes: Double): ControlChannelTrigger = js.native
  def createControlChannelTrigger(
    channelId: String,
    serverKeepAliveIntervalInMinutes: Double,
    resourceRequestType: ControlChannelTriggerResourceType
  ): ControlChannelTrigger = js.native
}
