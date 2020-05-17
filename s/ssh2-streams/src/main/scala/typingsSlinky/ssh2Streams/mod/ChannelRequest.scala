package typingsSlinky.ssh2Streams.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ssh2Streams.mod.ExitStatusChannelRequest
  - typingsSlinky.ssh2Streams.mod.ExitSignalChannelRequest
  - typingsSlinky.ssh2Streams.mod.PseudoTtyChannelRequest
  - typingsSlinky.ssh2Streams.mod.WindowChangeChannelRequest
  - typingsSlinky.ssh2Streams.mod.X11ChannelRequest
  - typingsSlinky.ssh2Streams.mod.EnvChannelRequest
  - typingsSlinky.ssh2Streams.mod.ShellChannelRequest
  - typingsSlinky.ssh2Streams.mod.ExecChannelRequest
  - typingsSlinky.ssh2Streams.mod.SubsystemChannelRequest
  - typingsSlinky.ssh2Streams.mod.SignalChannelRequest
  - typingsSlinky.ssh2Streams.mod.FlowControlChannelRequest
*/
trait ChannelRequest extends js.Object

object ChannelRequest {
  @scala.inline
  implicit def apply(value: EnvChannelRequest): ChannelRequest = value.asInstanceOf[ChannelRequest]
  @scala.inline
  implicit def apply(value: ExecChannelRequest): ChannelRequest = value.asInstanceOf[ChannelRequest]
  @scala.inline
  implicit def apply(value: ExitSignalChannelRequest): ChannelRequest = value.asInstanceOf[ChannelRequest]
  @scala.inline
  implicit def apply(value: ExitStatusChannelRequest): ChannelRequest = value.asInstanceOf[ChannelRequest]
  @scala.inline
  implicit def apply(value: FlowControlChannelRequest): ChannelRequest = value.asInstanceOf[ChannelRequest]
  @scala.inline
  implicit def apply(value: PseudoTtyChannelRequest): ChannelRequest = value.asInstanceOf[ChannelRequest]
  @scala.inline
  implicit def apply(value: ShellChannelRequest): ChannelRequest = value.asInstanceOf[ChannelRequest]
  @scala.inline
  implicit def apply(value: SignalChannelRequest): ChannelRequest = value.asInstanceOf[ChannelRequest]
  @scala.inline
  implicit def apply(value: SubsystemChannelRequest): ChannelRequest = value.asInstanceOf[ChannelRequest]
  @scala.inline
  implicit def apply(value: WindowChangeChannelRequest): ChannelRequest = value.asInstanceOf[ChannelRequest]
  @scala.inline
  implicit def apply(value: X11ChannelRequest): ChannelRequest = value.asInstanceOf[ChannelRequest]
}

