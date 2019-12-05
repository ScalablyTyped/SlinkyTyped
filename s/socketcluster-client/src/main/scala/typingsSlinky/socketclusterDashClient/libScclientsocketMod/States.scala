package typingsSlinky.socketclusterDashClient.libScclientsocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.socketclusterDashClient.socketclusterDashClientStrings.connecting
  - typings.socketclusterDashClient.socketclusterDashClientStrings.open
  - typings.socketclusterDashClient.socketclusterDashClientStrings.closed
*/
trait States extends js.Object

object States {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def closed: typingsSlinky.socketclusterDashClient.socketclusterDashClientStrings.closed = this.cast("closed")
  @scala.inline
  def connecting: typingsSlinky.socketclusterDashClient.socketclusterDashClientStrings.connecting = this.cast("connecting")
  @scala.inline
  def open: typingsSlinky.socketclusterDashClient.socketclusterDashClientStrings.open = this.cast("open")
}

