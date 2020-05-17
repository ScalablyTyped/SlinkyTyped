package typingsSlinky.w3cGenericSensor

import typingsSlinky.std.DOMMatrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Orientation Sensor: https://www.w3.org/TR/orientation-sensor/
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Float32Array
  - typingsSlinky.std.Float64Array
  - typingsSlinky.std.DOMMatrix
*/
trait RotationMatrixType extends js.Object

object RotationMatrixType {
  @scala.inline
  implicit def apply(value: DOMMatrix): RotationMatrixType = value.asInstanceOf[RotationMatrixType]
  @scala.inline
  implicit def apply(value: js.typedarray.Float32Array): RotationMatrixType = value.asInstanceOf[RotationMatrixType]
  @scala.inline
  implicit def apply(value: js.typedarray.Float64Array): RotationMatrixType = value.asInstanceOf[RotationMatrixType]
}

