package typingsSlinky.socketclusterClient.clientsocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.socketclusterClient.socketclusterClientStrings.connecting
  - typingsSlinky.socketclusterClient.socketclusterClientStrings.open
  - typingsSlinky.socketclusterClient.socketclusterClientStrings.closed
*/
trait States extends js.Object

object States {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def closed: typingsSlinky.socketclusterClient.socketclusterClientStrings.closed = this.cast("closed")
  @scala.inline
  def connecting: typingsSlinky.socketclusterClient.socketclusterClientStrings.connecting = this.cast("connecting")
  @scala.inline
  def open: typingsSlinky.socketclusterClient.socketclusterClientStrings.open = this.cast("open")
}

