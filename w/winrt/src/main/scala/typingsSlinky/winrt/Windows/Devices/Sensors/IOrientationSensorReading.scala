package typingsSlinky.winrt.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOrientationSensorReading extends js.Object {
  
  var quaternion: SensorQuaternion = js.native
  
  var rotationMatrix: SensorRotationMatrix = js.native
  
  var timestamp: js.Date = js.native
}
object IOrientationSensorReading {
  
  @scala.inline
  def apply(quaternion: SensorQuaternion, rotationMatrix: SensorRotationMatrix, timestamp: js.Date): IOrientationSensorReading = {
    val __obj = js.Dynamic.literal(quaternion = quaternion.asInstanceOf[js.Any], rotationMatrix = rotationMatrix.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOrientationSensorReading]
  }
  
  @scala.inline
  implicit class IOrientationSensorReadingOps[Self <: IOrientationSensorReading] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setQuaternion(value: SensorQuaternion): Self = this.set("quaternion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationMatrix(value: SensorRotationMatrix): Self = this.set("rotationMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: js.Date): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
}
