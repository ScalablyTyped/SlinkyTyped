package typingsSlinky.winrt.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGyrometerReading extends js.Object {
  var angularVelocityX: Double = js.native
  var angularVelocityY: Double = js.native
  var angularVelocityZ: Double = js.native
  var timestamp: js.Date = js.native
}

object IGyrometerReading {
  @scala.inline
  def apply(angularVelocityX: Double, angularVelocityY: Double, angularVelocityZ: Double, timestamp: js.Date): IGyrometerReading = {
    val __obj = js.Dynamic.literal(angularVelocityX = angularVelocityX.asInstanceOf[js.Any], angularVelocityY = angularVelocityY.asInstanceOf[js.Any], angularVelocityZ = angularVelocityZ.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGyrometerReading]
  }
  @scala.inline
  implicit class IGyrometerReadingOps[Self <: IGyrometerReading] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAngularVelocityX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angularVelocityX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAngularVelocityY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angularVelocityY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAngularVelocityZ(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angularVelocityZ")(value.asInstanceOf[js.Any])
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

