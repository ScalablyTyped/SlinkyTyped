package typingsSlinky.wegameApi

import typingsSlinky.wegameApi.wx.types.NetworkType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIsConnected extends js.Object {
  /**
    * 当前是否有网络链接
    */
  var isConnected: Boolean = js.native
  /**
    * none - 无网络, unknown - Android 下不常见的网络类型
    */
  var networkType: NetworkType = js.native
}

object AnonIsConnected {
  @scala.inline
  def apply(isConnected: Boolean, networkType: NetworkType): AnonIsConnected = {
    val __obj = js.Dynamic.literal(isConnected = isConnected.asInstanceOf[js.Any], networkType = networkType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsConnected]
  }
  @scala.inline
  implicit class AnonIsConnectedOps[Self <: AnonIsConnected] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsConnected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isConnected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetworkType(value: NetworkType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

