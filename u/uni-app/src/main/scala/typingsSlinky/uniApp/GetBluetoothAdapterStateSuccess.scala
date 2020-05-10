package typingsSlinky.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBluetoothAdapterStateSuccess extends js.Object {
  /**
    * 蓝牙适配器是否可用
    */
  var available: js.UndefOr[Boolean] = js.native
  /**
    * 是否正在搜索设备
    */
  var discovering: js.UndefOr[Boolean] = js.native
  /**
    * 成功：ok，错误：详细信息
    */
  var errMsg: js.UndefOr[String] = js.native
}

object GetBluetoothAdapterStateSuccess {
  @scala.inline
  def apply(): GetBluetoothAdapterStateSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBluetoothAdapterStateSuccess]
  }
  @scala.inline
  implicit class GetBluetoothAdapterStateSuccessOps[Self <: GetBluetoothAdapterStateSuccess] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withErrMsg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errMsg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrMsg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errMsg")(js.undefined)
        ret
    }
  }
  
}

