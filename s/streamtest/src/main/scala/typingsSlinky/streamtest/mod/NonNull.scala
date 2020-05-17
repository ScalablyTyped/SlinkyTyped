package typingsSlinky.streamtest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Object
  - js.UndefOr[scala.Nothing]
*/
trait NonNull extends js.Object

object NonNull {
  @scala.inline
  implicit def apply(value: js.Object): NonNull = value.asInstanceOf[NonNull]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => NonNull): NonNull = value.asInstanceOf[NonNull]
}

