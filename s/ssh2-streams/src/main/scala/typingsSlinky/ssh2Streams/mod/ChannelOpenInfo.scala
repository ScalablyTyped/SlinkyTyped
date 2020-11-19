package typingsSlinky.ssh2Streams.mod

import typingsSlinky.ssh2Streams.ssh2StreamsStrings.`auth-agent@opensshDotcom`
import typingsSlinky.ssh2Streams.ssh2StreamsStrings.`direct-streamlocal@opensshDotcom`
import typingsSlinky.ssh2Streams.ssh2StreamsStrings.`direct-tcpip`
import typingsSlinky.ssh2Streams.ssh2StreamsStrings.`forwarded-streamlocal@opensshDotcom`
import typingsSlinky.ssh2Streams.ssh2StreamsStrings.`forwarded-tcpip`
import typingsSlinky.ssh2Streams.ssh2StreamsStrings.session
import typingsSlinky.ssh2Streams.ssh2StreamsStrings.x11
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ssh2Streams.mod.X11ChannelInfo
  - typingsSlinky.ssh2Streams.mod.ForwardedTcpipChannelInfo
  - typingsSlinky.ssh2Streams.mod.opensshForwardedStreamLocalChannelInfo
  - typingsSlinky.ssh2Streams.mod.opensshAuthAgentChannelInfo
  - typingsSlinky.ssh2Streams.mod.DirectTcpipChannelInfo
  - typingsSlinky.ssh2Streams.mod.opensshDirectStreamLocalChannelInfo
  - typingsSlinky.ssh2Streams.mod.SessionChannelInfo
*/
trait ChannelOpenInfo extends js.Object
object ChannelOpenInfo {
  
  @scala.inline
  def SessionChannelInfo(packetSize: Double, sender: Double, `type`: session, window: Double): ChannelOpenInfo = {
    val __obj = js.Dynamic.literal(packetSize = packetSize.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelOpenInfo]
  }
  
  @scala.inline
  def opensshAuthAgentChannelInfo(packetSize: Double, sender: Double, `type`: `auth-agent@opensshDotcom`, window: Double): ChannelOpenInfo = {
    val __obj = js.Dynamic.literal(packetSize = packetSize.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelOpenInfo]
  }
  
  @scala.inline
  def X11ChannelInfo(data: X11ChannelData, packetSize: Double, sender: Double, `type`: x11, window: Double): ChannelOpenInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], packetSize = packetSize.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelOpenInfo]
  }
  
  @scala.inline
  def DirectTcpipChannelInfo(data: TcpipChannelData, packetSize: Double, sender: Double, `type`: `direct-tcpip`, window: Double): ChannelOpenInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], packetSize = packetSize.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelOpenInfo]
  }
  
  @scala.inline
  def opensshForwardedStreamLocalChannelInfo(
    data: SocketChannelData,
    packetSize: Double,
    sender: Double,
    `type`: `forwarded-streamlocal@opensshDotcom`,
    window: Double
  ): ChannelOpenInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], packetSize = packetSize.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelOpenInfo]
  }
  
  @scala.inline
  def ForwardedTcpipChannelInfo(
    data: TcpipChannelData,
    packetSize: Double,
    sender: Double,
    `type`: `forwarded-tcpip`,
    window: Double
  ): ChannelOpenInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], packetSize = packetSize.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelOpenInfo]
  }
  
  @scala.inline
  def opensshDirectStreamLocalChannelInfo(
    data: SocketChannelData,
    packetSize: Double,
    sender: Double,
    `type`: `direct-streamlocal@opensshDotcom`,
    window: Double
  ): ChannelOpenInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], packetSize = packetSize.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelOpenInfo]
  }
}
