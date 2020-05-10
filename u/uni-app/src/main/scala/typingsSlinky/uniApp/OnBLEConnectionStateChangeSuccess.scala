package typingsSlinky.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnBLEConnectionStateChangeSuccess extends js.Object {
  /**
    * 连接目前的状态
    */
  var connected: js.UndefOr[Boolean] = js.native
  /**
    * 蓝牙设备 id，参考 device 对象
    */
  var deviceId: js.UndefOr[String] = js.native
}

object OnBLEConnectionStateChangeSuccess {
  @scala.inline
  def apply(): OnBLEConnectionStateChangeSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnBLEConnectionStateChangeSuccess]
  }
  @scala.inline
  implicit class OnBLEConnectionStateChangeSuccessOps[Self <: OnBLEConnectionStateChangeSuccess] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connected")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceId")(js.undefined)
        ret
    }
  }
  
}

