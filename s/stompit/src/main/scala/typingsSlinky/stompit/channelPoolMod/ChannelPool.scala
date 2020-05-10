package typingsSlinky.stompit.channelPoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelPool extends js.Object {
  def channel(
    callback: js.Function2[/* err */ js.Error | Null, /* channel */ typingsSlinky.stompit.channelMod.^, Unit]
  ): Unit = js.native
  def close(): Unit = js.native
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
  @scala.inline
  implicit class ChannelPoolOps[Self <: ChannelPool] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannel(
      value: js.Function2[/* err */ js.Error | Null, /* channel */ typingsSlinky.stompit.channelMod.^, Unit] => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

