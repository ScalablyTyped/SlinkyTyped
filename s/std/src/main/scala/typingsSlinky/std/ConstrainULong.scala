package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - typingsSlinky.std.ConstrainULongRange
*/
trait ConstrainULong extends js.Object

object ConstrainULong {
  @scala.inline
  implicit def apply(value: ConstrainULongRange): ConstrainULong = value.asInstanceOf[ConstrainULong]
  @scala.inline
  implicit def apply(value: Double): ConstrainULong = value.asInstanceOf[ConstrainULong]
}

