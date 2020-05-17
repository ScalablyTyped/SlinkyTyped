package typingsSlinky.tensorflowTfjsCore.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Float32Array
  - typingsSlinky.std.Int32Array
  - typingsSlinky.std.Uint8Array
*/
trait TypedArray
  extends FlatVector
     with TensorLike
     with TensorLike1D
     with TensorLike2D
     with TensorLike3D
     with TensorLike4D
     with TensorLike5D
     with TensorLike6D

object TypedArray {
  @scala.inline
  implicit def apply(value: js.typedarray.Float32Array): TypedArray = value.asInstanceOf[TypedArray]
  @scala.inline
  implicit def apply(value: js.typedarray.Int32Array): TypedArray = value.asInstanceOf[TypedArray]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): TypedArray = value.asInstanceOf[TypedArray]
}

