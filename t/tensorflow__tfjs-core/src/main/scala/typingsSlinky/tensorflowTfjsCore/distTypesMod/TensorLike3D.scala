package typingsSlinky.tensorflowTfjsCore.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tensorflowTfjsCore.distTypesMod.TypedArray
  - js.Array[
(js.Array[
  js.Array[scala.Boolean | scala.Double | java.lang.String | typingsSlinky.std.Uint8Array]
]) | scala.Boolean | scala.Double | java.lang.String | typingsSlinky.std.Uint8Array]
*/
trait TensorLike3D extends js.Object

object TensorLike3D {
  @scala.inline
  implicit def apply(
    value: js.Array[
      (js.Array[js.Array[Boolean | Double | String | js.typedarray.Uint8Array]]) | Boolean | Double | String | js.typedarray.Uint8Array
    ]
  ): TensorLike3D = value.asInstanceOf[TensorLike3D]
  @scala.inline
  implicit def apply(value: TypedArray): TensorLike3D = value.asInstanceOf[TensorLike3D]
}

