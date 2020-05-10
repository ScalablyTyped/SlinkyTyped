package typingsSlinky.winrt.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISimpleOrientationSensor extends js.Object {
  var onorientationchanged: js.Any = js.native
  def getCurrentOrientation(): SimpleOrientation = js.native
}

object ISimpleOrientationSensor {
  @scala.inline
  def apply(getCurrentOrientation: () => SimpleOrientation, onorientationchanged: js.Any): ISimpleOrientationSensor = {
    val __obj = js.Dynamic.literal(getCurrentOrientation = js.Any.fromFunction0(getCurrentOrientation), onorientationchanged = onorientationchanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISimpleOrientationSensor]
  }
  @scala.inline
  implicit class ISimpleOrientationSensorOps[Self <: ISimpleOrientationSensor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetCurrentOrientation(value: () => SimpleOrientation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentOrientation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnorientationchanged(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onorientationchanged")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

