package typingsSlinky.w3cGenericSensor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("AbsoluteOrientationSensor")
  @js.native
  class AbsoluteOrientationSensor ()
    extends typingsSlinky.w3cGenericSensor.OrientationSensor {
    def this(options: SensorOptions) = this()
  }
  
  // Accelerometer: https://www.w3.org/TR/accelerometer/
  @JSGlobal("Accelerometer")
  @js.native
  class Accelerometer ()
    extends typingsSlinky.w3cGenericSensor.Accelerometer {
    def this(options: SensorOptions) = this()
  }
  
  @JSGlobal("GravitySensor")
  @js.native
  class GravitySensor ()
    extends typingsSlinky.w3cGenericSensor.Accelerometer {
    def this(options: SensorOptions) = this()
  }
  
  // Gyroscope: https://www.w3.org/TR/gyroscope/
  @JSGlobal("Gyroscope")
  @js.native
  class Gyroscope ()
    extends typingsSlinky.w3cGenericSensor.Gyroscope {
    def this(options: SensorOptions) = this()
  }
  
  @JSGlobal("LinearAccelerationSensor")
  @js.native
  class LinearAccelerationSensor ()
    extends typingsSlinky.w3cGenericSensor.Accelerometer {
    def this(options: SensorOptions) = this()
  }
  
  // Magnetometer: https://www.w3.org/TR/magnetometer/
  @JSGlobal("Magnetometer")
  @js.native
  class Magnetometer ()
    extends typingsSlinky.w3cGenericSensor.Magnetometer {
    def this(options: SensorOptions) = this()
  }
  
  @JSGlobal("OrientationSensor")
  @js.native
  class OrientationSensor ()
    extends typingsSlinky.w3cGenericSensor.OrientationSensor
  
  @JSGlobal("RelativeOrientationSensor")
  @js.native
  class RelativeOrientationSensor ()
    extends typingsSlinky.w3cGenericSensor.OrientationSensor {
    def this(options: SensorOptions) = this()
  }
  
  @JSGlobal("Sensor")
  @js.native
  class Sensor ()
    extends typingsSlinky.w3cGenericSensor.Sensor
  
  @JSGlobal("SensorErrorEvent")
  @js.native
  class SensorErrorEvent protected ()
    extends typingsSlinky.w3cGenericSensor.SensorErrorEvent {
    def this(`type`: String, errorEventInitDict: SensorErrorEventInit) = this()
  }
  
  @JSGlobal("UncalibratedMagnetometer")
  @js.native
  class UncalibratedMagnetometer ()
    extends typingsSlinky.w3cGenericSensor.UncalibratedMagnetometer {
    def this(options: SensorOptions) = this()
  }
}
