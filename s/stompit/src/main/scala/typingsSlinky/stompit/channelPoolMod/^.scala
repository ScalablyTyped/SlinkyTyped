package typingsSlinky.stompit.channelPoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stompit/lib/ChannelPool", JSImport.Namespace)
@js.native
class ^ protected () extends ChannelPool {
  def this(connectFailover: typingsSlinky.stompit.connectFailoverMod.^) = this()
  def this(connectFailover: typingsSlinky.stompit.connectFailoverMod.^, options: ChannelPoolOptions) = this()
  /* CompleteClass */
  override def channel(
    callback: js.Function2[/* err */ js.Error | Null, /* channel */ typingsSlinky.stompit.channelMod.^, Unit]
  ): Unit = js.native
  /* CompleteClass */
  override def close(): Unit = js.native
}

