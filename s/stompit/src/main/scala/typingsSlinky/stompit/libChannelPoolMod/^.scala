package typingsSlinky.stompit.libChannelPoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stompit/lib/ChannelPool", JSImport.Namespace)
@js.native
class ^ protected () extends ChannelPool {
  def this(connectFailover: typingsSlinky.stompit.libConnectFailoverMod.^) = this()
  def this(connectFailover: typingsSlinky.stompit.libConnectFailoverMod.^, options: ChannelPoolOptions) = this()
  /* CompleteClass */
  override def channel(
    callback: js.Function2[/* err */ js.Error | Null, /* channel */ typingsSlinky.stompit.libChannelMod.^, Unit]
  ): Unit = js.native
  /* CompleteClass */
  override def close(): Unit = js.native
}

