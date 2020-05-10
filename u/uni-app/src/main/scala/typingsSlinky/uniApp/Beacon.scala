package typingsSlinky.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Beacon extends js.Object {
  /**
    * iBeacon 设备的距离
    */
  var accuracy: js.UndefOr[Double] = js.native
  /**
    * iBeacon 设备的主 id
    */
  var major: js.UndefOr[String] = js.native
  /**
    * iBeacon 设备的次 id
    */
  var minor: js.UndefOr[String] = js.native
  /**
    * 表示设备距离的枚举值
    */
  var proximity: js.UndefOr[Double] = js.native
  /**
    * 表示设备的信号强度
    */
  var rssi: js.UndefOr[Double] = js.native
  /**
    * iBeacon 设备广播的 uuid
    */
  var uuid: js.UndefOr[String] = js.native
}

object Beacon {
  @scala.inline
  def apply(): Beacon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Beacon]
  }
  @scala.inline
  implicit class BeaconOps[Self <: Beacon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccuracy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accuracy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccuracy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accuracy")(js.undefined)
        ret
    }
    @scala.inline
    def withMajor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("major")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMajor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("major")(js.undefined)
        ret
    }
    @scala.inline
    def withMinor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minor")(js.undefined)
        ret
    }
    @scala.inline
    def withProximity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proximity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProximity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proximity")(js.undefined)
        ret
    }
    @scala.inline
    def withRssi(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rssi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRssi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rssi")(js.undefined)
        ret
    }
    @scala.inline
    def withUuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUuid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(js.undefined)
        ret
    }
  }
  
}

