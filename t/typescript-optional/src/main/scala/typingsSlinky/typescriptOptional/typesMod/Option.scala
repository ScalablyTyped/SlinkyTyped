package typingsSlinky.typescriptOptional.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescriptOptional.typesMod.Present[T]
  - typingsSlinky.typescriptOptional.typesMod.Empty[T]
*/
trait Option[T] extends js.Object

object Option {
  @scala.inline
  implicit def apply[T](value: Empty[T]): Option[T] = value.asInstanceOf[Option[T]]
  @scala.inline
  implicit def apply[T](value: Present[T]): Option[T] = value.asInstanceOf[Option[T]]
}

