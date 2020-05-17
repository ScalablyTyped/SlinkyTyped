package typingsSlinky.vscodeJsonrpc.mod

import typingsSlinky.vscodeJsonrpc.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - R
  - typingsSlinky.vscodeJsonrpc.messagesMod.ResponseError[E]
  - typingsSlinky.vscodeJsonrpc.Thenable[R | typingsSlinky.vscodeJsonrpc.messagesMod.ResponseError[E]]
*/
trait HandlerResult[R, E] extends js.Object

object HandlerResult {
  @scala.inline
  implicit def apply[R, E](value: R): HandlerResult[R, E] = value.asInstanceOf[HandlerResult[R, E]]
  @scala.inline
  implicit def apply[R, E](value: typingsSlinky.vscodeJsonrpc.messagesMod.ResponseError[E]): HandlerResult[R, E] = value.asInstanceOf[HandlerResult[R, E]]
  @scala.inline
  implicit def apply[R, E](value: Thenable[R | typingsSlinky.vscodeJsonrpc.messagesMod.ResponseError[E]]): HandlerResult[R, E] = value.asInstanceOf[HandlerResult[R, E]]
}

