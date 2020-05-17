package typingsSlinky.tensorflowTfjsCore.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - scala.Boolean
  - java.lang.String
  - typingsSlinky.std.Uint8Array
*/
trait ScalarLike extends js.Object

object ScalarLike {
  @scala.inline
  implicit def apply(value: Boolean): ScalarLike = value.asInstanceOf[ScalarLike]
  @scala.inline
  implicit def apply(value: Double): ScalarLike = value.asInstanceOf[ScalarLike]
  @scala.inline
  implicit def apply(value: String): ScalarLike = value.asInstanceOf[ScalarLike]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): ScalarLike = value.asInstanceOf[ScalarLike]
}

