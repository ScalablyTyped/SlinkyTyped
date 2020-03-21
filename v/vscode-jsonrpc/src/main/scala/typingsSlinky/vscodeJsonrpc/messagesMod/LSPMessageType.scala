package typingsSlinky.vscodeJsonrpc.messagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vscodeJsonrpc.vscodeJsonrpcStrings.`send-request`
  - typingsSlinky.vscodeJsonrpc.vscodeJsonrpcStrings.`receive-request`
  - typingsSlinky.vscodeJsonrpc.vscodeJsonrpcStrings.`send-response`
  - typingsSlinky.vscodeJsonrpc.vscodeJsonrpcStrings.`receive-response`
  - typingsSlinky.vscodeJsonrpc.vscodeJsonrpcStrings.`send-notification`
  - typingsSlinky.vscodeJsonrpc.vscodeJsonrpcStrings.`receive-notification`
*/
trait LSPMessageType extends js.Object

object LSPMessageType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `receive-notification`: typingsSlinky.vscodeJsonrpc.vscodeJsonrpcStrings.`receive-notification` = this.cast("receive-notification")
  @scala.inline
  def `receive-request`: typingsSlinky.vscodeJsonrpc.vscodeJsonrpcStrings.`receive-request` = this.cast("receive-request")
  @scala.inline
  def `receive-response`: typingsSlinky.vscodeJsonrpc.vscodeJsonrpcStrings.`receive-response` = this.cast("receive-response")
  @scala.inline
  def `send-notification`: typingsSlinky.vscodeJsonrpc.vscodeJsonrpcStrings.`send-notification` = this.cast("send-notification")
  @scala.inline
  def `send-request`: typingsSlinky.vscodeJsonrpc.vscodeJsonrpcStrings.`send-request` = this.cast("send-request")
  @scala.inline
  def `send-response`: typingsSlinky.vscodeJsonrpc.vscodeJsonrpcStrings.`send-response` = this.cast("send-response")
}

