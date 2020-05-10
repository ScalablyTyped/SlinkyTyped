package typingsSlinky.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnBluetoothAdapterStateChangeResult extends js.Object {
  /**
    * 蓝牙适配器是否可用
    */
  var available: js.UndefOr[Boolean] = js.native
  /**
    * 是否正在搜索设备
    */
  var discovering: js.UndefOr[Boolean] = js.native
}

object OnBluetoothAdapterStateChangeResult {
  @scala.inline
  def apply(): OnBluetoothAdapterStateChangeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnBluetoothAdapterStateChangeResult]
  }
  @scala.inline
  implicit class OnBluetoothAdapterStateChangeResultOps[Self <: OnBluetoothAdapterStateChangeResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("available")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("available")(js.undefined)
        ret
    }
    @scala.inline
    def withDiscovering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discovering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiscovering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discovering")(js.undefined)
        ret
    }
  }
  
}

