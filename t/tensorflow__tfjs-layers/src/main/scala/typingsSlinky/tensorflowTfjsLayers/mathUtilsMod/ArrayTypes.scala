package typingsSlinky.tensorflowTfjsLayers.mathUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Uint8Array
  - typingsSlinky.std.Int32Array
  - typingsSlinky.std.Float32Array
*/
trait ArrayTypes extends js.Object

object ArrayTypes {
  @scala.inline
  implicit def apply(value: js.typedarray.Float32Array): ArrayTypes = value.asInstanceOf[ArrayTypes]
  @scala.inline
  implicit def apply(value: js.typedarray.Int32Array): ArrayTypes = value.asInstanceOf[ArrayTypes]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): ArrayTypes = value.asInstanceOf[ArrayTypes]
}

