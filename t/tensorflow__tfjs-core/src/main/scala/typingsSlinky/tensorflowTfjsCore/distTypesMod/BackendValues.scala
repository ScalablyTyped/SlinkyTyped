package typingsSlinky.tensorflowTfjsCore.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Float32Array
  - typingsSlinky.std.Int32Array
  - typingsSlinky.std.Uint8Array
  - js.Array[typingsSlinky.std.Uint8Array]
*/
trait BackendValues extends js.Object

object BackendValues {
  @scala.inline
  implicit def apply(value: js.Array[js.typedarray.Uint8Array]): BackendValues = value.asInstanceOf[BackendValues]
  @scala.inline
  implicit def apply(value: js.typedarray.Float32Array): BackendValues = value.asInstanceOf[BackendValues]
  @scala.inline
  implicit def apply(value: js.typedarray.Int32Array): BackendValues = value.asInstanceOf[BackendValues]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): BackendValues = value.asInstanceOf[BackendValues]
}

