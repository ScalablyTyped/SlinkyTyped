package typingsSlinky.wiiu.wiiu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WiiuGamePad extends js.Object {
  var accX: Double = js.native
  var accY: Double = js.native
  var accZ: Double = js.native
  var angleX: Double = js.native
  var angleY: Double = js.native
  var angleZ: Double = js.native
  var contentX: Double = js.native
  var contentY: Double = js.native
  var dirXx: Double = js.native
  var dirXy: Double = js.native
  var dirXz: Double = js.native
  var dirYx: Double = js.native
  var dirYy: Double = js.native
  var dirYz: Double = js.native
  var dirZx: Double = js.native
  var dirZy: Double = js.native
  var dirZz: Double = js.native
  var gyroX: Double = js.native
  var gyroY: Double = js.native
  var gyroZ: Double = js.native
  var hold: Double = js.native
  var isDataValid: Boolean = js.native
  var isEnabled: Boolean = js.native
  var lStickX: Double = js.native
  var lStickY: Double = js.native
  var rStickX: Double = js.native
  var rStickY: Double = js.native
  var tpTouch: Boolean = js.native
  var tpValidity: Double = js.native
  def update(): WiiuGamePad = js.native
}

object WiiuGamePad {
  @scala.inline
  def apply(
    accX: Double,
    accY: Double,
    accZ: Double,
    angleX: Double,
    angleY: Double,
    angleZ: Double,
    contentX: Double,
    contentY: Double,
    dirXx: Double,
    dirXy: Double,
    dirXz: Double,
    dirYx: Double,
    dirYy: Double,
    dirYz: Double,
    dirZx: Double,
    dirZy: Double,
    dirZz: Double,
    gyroX: Double,
    gyroY: Double,
    gyroZ: Double,
    hold: Double,
    isDataValid: Boolean,
    isEnabled: Boolean,
    lStickX: Double,
    lStickY: Double,
    rStickX: Double,
    rStickY: Double,
    tpTouch: Boolean,
    tpValidity: Double,
    update: () => WiiuGamePad
  ): WiiuGamePad = {
    val __obj = js.Dynamic.literal(accX = accX.asInstanceOf[js.Any], accY = accY.asInstanceOf[js.Any], accZ = accZ.asInstanceOf[js.Any], angleX = angleX.asInstanceOf[js.Any], angleY = angleY.asInstanceOf[js.Any], angleZ = angleZ.asInstanceOf[js.Any], contentX = contentX.asInstanceOf[js.Any], contentY = contentY.asInstanceOf[js.Any], dirXx = dirXx.asInstanceOf[js.Any], dirXy = dirXy.asInstanceOf[js.Any], dirXz = dirXz.asInstanceOf[js.Any], dirYx = dirYx.asInstanceOf[js.Any], dirYy = dirYy.asInstanceOf[js.Any], dirYz = dirYz.asInstanceOf[js.Any], dirZx = dirZx.asInstanceOf[js.Any], dirZy = dirZy.asInstanceOf[js.Any], dirZz = dirZz.asInstanceOf[js.Any], gyroX = gyroX.asInstanceOf[js.Any], gyroY = gyroY.asInstanceOf[js.Any], gyroZ = gyroZ.asInstanceOf[js.Any], hold = hold.asInstanceOf[js.Any], isDataValid = isDataValid.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], lStickX = lStickX.asInstanceOf[js.Any], lStickY = lStickY.asInstanceOf[js.Any], rStickX = rStickX.asInstanceOf[js.Any], rStickY = rStickY.asInstanceOf[js.Any], tpTouch = tpTouch.asInstanceOf[js.Any], tpValidity = tpValidity.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[WiiuGamePad]
  }
  @scala.inline
  implicit class WiiuGamePadOps[Self <: WiiuGamePad] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccZ(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accZ")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAngleX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angleX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAngleY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angleY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAngleZ(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angleZ")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirXx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirXx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirXy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirXy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirXz(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirXz")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirYx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirYx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirYy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirYy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirYz(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirYz")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirZx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirZx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirZy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirZy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirZz(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirZz")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGyroX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gyroX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGyroY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gyroY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGyroZ(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gyroZ")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDataValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDataValid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLStickX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lStickX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLStickY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lStickY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRStickX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rStickX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRStickY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rStickY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTpTouch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tpTouch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTpValidity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tpValidity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate(value: () => WiiuGamePad): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

