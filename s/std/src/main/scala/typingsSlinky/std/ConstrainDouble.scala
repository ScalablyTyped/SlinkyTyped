package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - typingsSlinky.std.ConstrainDoubleRange
*/
trait ConstrainDouble extends js.Object

object ConstrainDouble {
  @scala.inline
  implicit def apply(value: ConstrainDoubleRange): ConstrainDouble = value.asInstanceOf[ConstrainDouble]
  @scala.inline
  implicit def apply(value: Double): ConstrainDouble = value.asInstanceOf[ConstrainDouble]
}

