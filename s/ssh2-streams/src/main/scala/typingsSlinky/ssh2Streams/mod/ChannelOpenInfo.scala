package typingsSlinky.ssh2Streams.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit def apply(value: DirectTcpipChannelInfo): ChannelOpenInfo = value.asInstanceOf[ChannelOpenInfo]
  @scala.inline
  implicit def apply(value: ForwardedTcpipChannelInfo): ChannelOpenInfo = value.asInstanceOf[ChannelOpenInfo]
  @scala.inline
  implicit def apply(value: SessionChannelInfo): ChannelOpenInfo = value.asInstanceOf[ChannelOpenInfo]
  @scala.inline
  implicit def apply(value: X11ChannelInfo): ChannelOpenInfo = value.asInstanceOf[ChannelOpenInfo]
  @scala.inline
  implicit def apply(value: opensshAuthAgentChannelInfo): ChannelOpenInfo = value.asInstanceOf[ChannelOpenInfo]
  @scala.inline
  implicit def apply(value: opensshDirectStreamLocalChannelInfo): ChannelOpenInfo = value.asInstanceOf[ChannelOpenInfo]
  @scala.inline
  implicit def apply(value: opensshForwardedStreamLocalChannelInfo): ChannelOpenInfo = value.asInstanceOf[ChannelOpenInfo]
}

