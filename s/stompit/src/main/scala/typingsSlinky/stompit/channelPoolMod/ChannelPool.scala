package typingsSlinky.stompit.channelPoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelPool extends js.Object {
  def channel(
    callback: js.Function2[/* err */ js.Error | Null, /* channel */ typingsSlinky.stompit.channelMod.^, Unit]
  ): Unit
  def close(): Unit
}

object ChannelPool {
  @scala.inline
  def apply(
    channel: js.Function2[/* err */ js.Error | Null, /* channel */ typingsSlinky.stompit.channelMod.^, Unit] => Unit,
    close: () => Unit
  ): ChannelPool = {
    val __obj = js.Dynamic.literal(channel = js.Any.fromFunction1(channel), close = js.Any.fromFunction0(close))
  
    __obj.asInstanceOf[ChannelPool]
  }
}

