package typingsSlinky.socketclusterServer.serverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.socketclusterServer.socketclusterServerStrings.handshake
  - typingsSlinky.socketclusterServer.socketclusterServerStrings.inboundRaw
  - typingsSlinky.socketclusterServer.socketclusterServerStrings.inbound
  - typingsSlinky.socketclusterServer.socketclusterServerStrings.outbound
*/
trait Middlewares extends js.Object

object Middlewares {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def handshake: typingsSlinky.socketclusterServer.socketclusterServerStrings.handshake = this.cast("handshake")
  @scala.inline
  def inbound: typingsSlinky.socketclusterServer.socketclusterServerStrings.inbound = this.cast("inbound")
  @scala.inline
  def inboundRaw: typingsSlinky.socketclusterServer.socketclusterServerStrings.inboundRaw = this.cast("inboundRaw")
  @scala.inline
  def outbound: typingsSlinky.socketclusterServer.socketclusterServerStrings.outbound = this.cast("outbound")
}

