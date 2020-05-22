package typingsSlinky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object w3cGenericSensor {
  type AbsoluteOrientationSensor = typingsSlinky.w3cGenericSensor.OrientationSensor
  type GravitySensor = typingsSlinky.w3cGenericSensor.Accelerometer
  type LinearAccelerationSensor = typingsSlinky.w3cGenericSensor.Accelerometer
  type RelativeOrientationSensor = typingsSlinky.w3cGenericSensor.OrientationSensor
  // Orientation Sensor: https://www.w3.org/TR/orientation-sensor/
  type RotationMatrixType = js.typedarray.Float32Array | js.typedarray.Float64Array | typingsSlinky.std.DOMMatrix
}
