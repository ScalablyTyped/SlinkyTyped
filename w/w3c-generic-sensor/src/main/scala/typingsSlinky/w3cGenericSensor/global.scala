package typingsSlinky.w3cGenericSensor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class AbsoluteOrientationSensor ()
    extends typingsSlinky.w3cGenericSensor.OrientationSensor {
    def this(options: SensorOptions) = this()
  }
  
  // Accelerometer: https://www.w3.org/TR/accelerometer/
  @js.native
  class Accelerometer ()
    extends typingsSlinky.w3cGenericSensor.Accelerometer {
    def this(options: SensorOptions) = this()
  }
  
  @js.native
  class GravitySensor ()
    extends typingsSlinky.w3cGenericSensor.Accelerometer {
    def this(options: SensorOptions) = this()
  }
  
  // Gyroscope: https://www.w3.org/TR/gyroscope/
  @js.native
  class Gyroscope ()
    extends typingsSlinky.w3cGenericSensor.Gyroscope {
    def this(options: SensorOptions) = this()
  }
  
  @js.native
  class LinearAccelerationSensor ()
    extends typingsSlinky.w3cGenericSensor.Accelerometer {
    def this(options: SensorOptions) = this()
  }
  
  // Magnetometer: https://www.w3.org/TR/magnetometer/
  @js.native
  class Magnetometer ()
    extends typingsSlinky.w3cGenericSensor.Magnetometer {
    def this(options: SensorOptions) = this()
  }
  
  @js.native
  class OrientationSensor ()
    extends typingsSlinky.w3cGenericSensor.OrientationSensor
  
  @js.native
  class RelativeOrientationSensor ()
    extends typingsSlinky.w3cGenericSensor.OrientationSensor {
    def this(options: SensorOptions) = this()
  }
  
  @js.native
  class Sensor ()
    extends typingsSlinky.w3cGenericSensor.Sensor
  
  @js.native
  class SensorErrorEvent protected ()
    extends typingsSlinky.w3cGenericSensor.SensorErrorEvent {
    def this(`type`: String, errorEventInitDict: SensorErrorEventInit) = this()
  }
  
  @js.native
  class UncalibratedMagnetometer ()
    extends typingsSlinky.w3cGenericSensor.UncalibratedMagnetometer {
    def this(options: SensorOptions) = this()
  }
  
}

