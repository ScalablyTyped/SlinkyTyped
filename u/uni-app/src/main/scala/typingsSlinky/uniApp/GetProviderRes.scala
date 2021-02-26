package typingsSlinky.uniApp

import typingsSlinky.uniApp.uniAppStrings.oauth
import typingsSlinky.uniApp.uniAppStrings.payment
import typingsSlinky.uniApp.uniAppStrings.push
import typingsSlinky.uniApp.uniAppStrings.share
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetProviderRes extends StObject {
  
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
  implicit class GetProviderResMutableBuilder[Self <: GetProviderRes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProvider(value: js.Array[_]): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    @scala.inline
    def setProviderVarargs(value: js.Any*): Self = StObject.set(x, "provider", js.Array(value :_*))
    
    @scala.inline
    def setService(value: oauth | share | payment | push): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
