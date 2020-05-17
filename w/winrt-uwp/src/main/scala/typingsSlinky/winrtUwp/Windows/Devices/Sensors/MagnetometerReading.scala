package typingsSlinky.winrtUwp.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a magnetometer reading. */
@js.native
trait MagnetometerReading extends js.Object {
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
  implicit class MagnetometerReadingOps[Self <: MagnetometerReading] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectionalAccuracy(value: MagnetometerAccuracy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionalAccuracy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMagneticFieldX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magneticFieldX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMagneticFieldY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magneticFieldY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMagneticFieldZ(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magneticFieldZ")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

