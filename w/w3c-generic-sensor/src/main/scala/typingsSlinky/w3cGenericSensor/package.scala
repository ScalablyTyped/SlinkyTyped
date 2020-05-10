package typingsSlinky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object w3cGenericSensor {
  // Orientation Sensor: https://www.w3.org/TR/orientation-sensor/
  type RotationMatrixType = js.typedarray.Float32Array | js.typedarray.Float64Array | typingsSlinky.std.DOMMatrix
}
