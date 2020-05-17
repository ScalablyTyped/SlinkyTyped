package typingsSlinky.trezorConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.trezorConnect.mod.Error
  - typingsSlinky.trezorConnect.mod.Success[T]
*/
trait ResponseMessage[T] extends js.Object

object ResponseMessage {
  @scala.inline
  implicit def apply[T](value: Error): ResponseMessage[T] = value.asInstanceOf[ResponseMessage[T]]
  @scala.inline
  implicit def apply[T](value: Success[T]): ResponseMessage[T] = value.asInstanceOf[ResponseMessage[T]]
}

