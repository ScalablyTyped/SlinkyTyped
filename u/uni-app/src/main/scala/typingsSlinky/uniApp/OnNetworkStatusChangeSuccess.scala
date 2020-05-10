package typingsSlinky.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnNetworkStatusChangeSuccess extends js.Object {
  /**
    * 当前是否有网络连接
    */
  var isConnected: js.UndefOr[Double] = js.native
  /**
    * 网络类型
    */
  var networkType: js.UndefOr[String] = js.native
}

object OnNetworkStatusChangeSuccess {
  @scala.inline
  def apply(): OnNetworkStatusChangeSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnNetworkStatusChangeSuccess]
  }
  @scala.inline
  implicit class OnNetworkStatusChangeSuccessOps[Self <: OnNetworkStatusChangeSuccess] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsConnected(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isConnected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsConnected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isConnected")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkType")(js.undefined)
        ret
    }
  }
  
}

