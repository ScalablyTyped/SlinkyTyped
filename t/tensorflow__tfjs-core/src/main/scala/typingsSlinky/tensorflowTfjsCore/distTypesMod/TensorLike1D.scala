package typingsSlinky.tensorflowTfjsCore.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tensorflowTfjsCore.distTypesMod.TypedArray
  - js.Array[scala.Boolean | scala.Double | java.lang.String | typingsSlinky.std.Uint8Array]
*/
trait TensorLike1D extends js.Object

object TensorLike1D {
  @scala.inline
  implicit def apply(value: js.Array[Boolean | Double | String | js.typedarray.Uint8Array]): TensorLike1D = value.asInstanceOf[TensorLike1D]
  @scala.inline
  implicit def apply(value: TypedArray): TensorLike1D = value.asInstanceOf[TensorLike1D]
}

