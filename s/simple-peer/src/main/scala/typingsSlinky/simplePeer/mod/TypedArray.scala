package typingsSlinky.simplePeer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Int8Array
  - typingsSlinky.std.Uint8Array
  - typingsSlinky.std.Uint8ClampedArray
  - typingsSlinky.std.Int16Array
  - typingsSlinky.std.Uint16Array
  - typingsSlinky.std.Int32Array
  - typingsSlinky.std.Uint32Array
  - typingsSlinky.std.Float32Array
  - typingsSlinky.std.Float64Array
*/
trait TypedArray extends SimplePeerData

object TypedArray {
  @scala.inline
  implicit def apply(value: js.typedarray.Float32Array): TypedArray = value.asInstanceOf[TypedArray]
  @scala.inline
  implicit def apply(value: js.typedarray.Float64Array): TypedArray = value.asInstanceOf[TypedArray]
  @scala.inline
  implicit def apply(value: js.typedarray.Int16Array): TypedArray = value.asInstanceOf[TypedArray]
  @scala.inline
  implicit def apply(value: js.typedarray.Int32Array): TypedArray = value.asInstanceOf[TypedArray]
  @scala.inline
  implicit def apply(value: js.typedarray.Int8Array): TypedArray = value.asInstanceOf[TypedArray]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint16Array): TypedArray = value.asInstanceOf[TypedArray]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint32Array): TypedArray = value.asInstanceOf[TypedArray]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): TypedArray = value.asInstanceOf[TypedArray]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8ClampedArray): TypedArray = value.asInstanceOf[TypedArray]
}

