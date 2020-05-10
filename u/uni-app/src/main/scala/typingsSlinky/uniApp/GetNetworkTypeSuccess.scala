package typingsSlinky.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetNetworkTypeSuccess extends js.Object {
  /**
    * 网络类型
    */
  var networkType: js.UndefOr[String] = js.native
}

object GetNetworkTypeSuccess {
  @scala.inline
  def apply(): GetNetworkTypeSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetNetworkTypeSuccess]
  }
  @scala.inline
  implicit class GetNetworkTypeSuccessOps[Self <: GetNetworkTypeSuccess] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

