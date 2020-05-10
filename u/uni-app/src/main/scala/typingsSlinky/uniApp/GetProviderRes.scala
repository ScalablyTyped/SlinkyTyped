package typingsSlinky.uniApp

import typingsSlinky.uniApp.uniAppStrings.oauth
import typingsSlinky.uniApp.uniAppStrings.payment
import typingsSlinky.uniApp.uniAppStrings.push
import typingsSlinky.uniApp.uniAppStrings.share
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetProviderRes extends js.Object {
  /**
    * 得到的服务供应商
    */
  var provider: js.UndefOr[js.Array[_]] = js.native
  /**
    * 服务类型
    * - oauth: 授权登录
    * - share: 分享
    * - payment: 支付
    * - push: 推送
    */
  var service: js.UndefOr[oauth | share | payment | push] = js.native
}

object GetProviderRes {
  @scala.inline
  def apply(): GetProviderRes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetProviderRes]
  }
  @scala.inline
  implicit class GetProviderResOps[Self <: GetProviderRes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProvider(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(js.undefined)
        ret
    }
    @scala.inline
    def withService(value: oauth | share | payment | push): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(js.undefined)
        ret
    }
  }
  
}

