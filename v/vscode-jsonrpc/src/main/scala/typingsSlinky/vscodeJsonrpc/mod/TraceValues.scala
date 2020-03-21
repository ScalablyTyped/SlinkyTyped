package typingsSlinky.vscodeJsonrpc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vscodeJsonrpc.vscodeJsonrpcStrings.off
  - typingsSlinky.vscodeJsonrpc.vscodeJsonrpcStrings.messages
  - typingsSlinky.vscodeJsonrpc.vscodeJsonrpcStrings.verbose
*/
trait TraceValues extends js.Object

object TraceValues {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def messages: typingsSlinky.vscodeJsonrpc.vscodeJsonrpcStrings.messages = this.cast("messages")
  @scala.inline
  def off: typingsSlinky.vscodeJsonrpc.vscodeJsonrpcStrings.off = this.cast("off")
  @scala.inline
  def verbose: typingsSlinky.vscodeJsonrpc.vscodeJsonrpcStrings.verbose = this.cast("verbose")
}

