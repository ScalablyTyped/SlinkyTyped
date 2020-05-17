package typingsSlinky.waterline.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - T
  - typingsSlinky.waterline.mod.AttributeValidationSyncFn[T]
  - typingsSlinky.waterline.mod.AttributeValidationAsyncFn[T]
*/
trait AttributeValidation[T] extends js.Object

object AttributeValidation {
  @scala.inline
  implicit def apply[T](value: AttributeValidationAsyncFn[T]): AttributeValidation[T] = value.asInstanceOf[AttributeValidation[T]]
  @scala.inline
  implicit def apply[T](value: AttributeValidationSyncFn[T]): AttributeValidation[T] = value.asInstanceOf[AttributeValidation[T]]
  @scala.inline
  implicit def apply[T](value: T): AttributeValidation[T] = value.asInstanceOf[AttributeValidation[T]]
}

