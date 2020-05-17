package typingsSlinky.tensorflowTfjsCore.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tensorflowTfjsCore.distTypesMod.TypedArray
  - scala.Double
  - scala.Boolean
  - java.lang.String
  - typingsSlinky.tensorflowTfjsCore.distTypesMod.RecursiveArray[
js.Array[scala.Double] | scala.Boolean | scala.Double | java.lang.String | typingsSlinky.tensorflowTfjsCore.distTypesMod.TypedArray]
  - js.Array[typingsSlinky.std.Uint8Array]
*/
trait TensorLike extends js.Object

object TensorLike {
  @scala.inline
  implicit def apply(value: js.Array[js.typedarray.Uint8Array]): TensorLike = value.asInstanceOf[TensorLike]
  @scala.inline
  implicit def apply(value: Boolean): TensorLike = value.asInstanceOf[TensorLike]
  @scala.inline
  implicit def apply(value: Double): TensorLike = value.asInstanceOf[TensorLike]
  @scala.inline
  implicit def apply(value: RecursiveArray[js.Array[Double] | Boolean | Double | String | TypedArray]): TensorLike = value.asInstanceOf[TensorLike]
  @scala.inline
  implicit def apply(value: String): TensorLike = value.asInstanceOf[TensorLike]
  @scala.inline
  implicit def apply(value: TypedArray): TensorLike = value.asInstanceOf[TensorLike]
}

