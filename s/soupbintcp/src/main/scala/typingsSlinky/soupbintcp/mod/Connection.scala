package typingsSlinky.soupbintcp.mod

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.node.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soupbintcp", "Connection")
@js.native
class Connection protected () extends EventEmitter {
  def this(socket: Socket, options: ConnectionOptions) = this()
  def end(): Unit = js.native
  def send(packetType: PacketType, payload: js.Any): Unit = js.native
  def send(
    packetType: PacketType,
    payload: js.Any,
    callback: js.Function1[/* data */ js.UndefOr[js.Any], Unit]
  ): Unit = js.native
}

