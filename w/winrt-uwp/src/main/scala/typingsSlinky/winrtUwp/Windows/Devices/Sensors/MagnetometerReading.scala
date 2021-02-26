package typingsSlinky.winrtUwp.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a magnetometer reading. */
@js.native
trait MagnetometerReading extends StObject {
  
  /** Gets the magnetometer's directional accuracy. */
  var directionalAccuracy: MagnetometerAccuracy = js.native
  
  /** Gets the magnetic field strength in microteslas along the X axis. */
  var magneticFieldX: Double = js.native
  
  /** Gets the magnetic field strength in microteslas along the Y axis. */
  var magneticFieldY: Double = js.native
  
  /** Gets the magnetic field strength in microteslas along the Z axis. */
  var magneticFieldZ: Double = js.native
  
  /** Gets the time at which the sensor reported the reading. */
  var timestamp: js.Date = js.native
}
object MagnetometerReading {
  
  @scala.inline
  def apply(
    directionalAccuracy: MagnetometerAccuracy,
    magneticFieldX: Double,
    magneticFieldY: Double,
    magneticFieldZ: Double,
    timestamp: js.Date
  ): MagnetometerReading = {
    val __obj = js.Dynamic.literal(directionalAccuracy = directionalAccuracy.asInstanceOf[js.Any], magneticFieldX = magneticFieldX.asInstanceOf[js.Any], magneticFieldY = magneticFieldY.asInstanceOf[js.Any], magneticFieldZ = magneticFieldZ.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[MagnetometerReading]
  }
  
  @scala.inline
  implicit class MagnetometerReadingMutableBuilder[Self <: MagnetometerReading] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectionalAccuracy(value: MagnetometerAccuracy): Self = StObject.set(x, "directionalAccuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMagneticFieldX(value: Double): Self = StObject.set(x, "magneticFieldX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMagneticFieldY(value: Double): Self = StObject.set(x, "magneticFieldY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMagneticFieldZ(value: Double): Self = StObject.set(x, "magneticFieldZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
