package typingsSlinky.winrtUwp.Windows.Devices.Custom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the control code. */
@js.native
trait IOControlCode extends js.Object {
  /** The access mode. */
  var accessMode: IOControlAccessMode = js.native
  /** The buffering method. */
  var bufferingMethod: IOControlBufferingMethod = js.native
  /** The control code. */
  var controlCode: Double = js.native
  /** The device type. */
  var deviceType: Double = js.native
  /** The function. */
  var function: Double = js.native
}

object IOControlCode {
  @scala.inline
  def apply(
    accessMode: IOControlAccessMode,
    bufferingMethod: IOControlBufferingMethod,
    controlCode: Double,
    deviceType: Double,
    function: Double
  ): IOControlCode = {
    val __obj = js.Dynamic.literal(accessMode = accessMode.asInstanceOf[js.Any], bufferingMethod = bufferingMethod.asInstanceOf[js.Any], controlCode = controlCode.asInstanceOf[js.Any], deviceType = deviceType.asInstanceOf[js.Any], function = function.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOControlCode]
  }
  @scala.inline
  implicit class IOControlCodeOps[Self <: IOControlCode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessMode(value: IOControlAccessMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBufferingMethod(value: IOControlBufferingMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferingMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withControlCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFunction(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("function")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

