package typingsSlinky.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChooseInvoiceSuccessCallbackResult extends StObject {
  
  var errMsg: String = js.native
  
  /** 用户选中的发票信息，格式为一个 JSON 字符串，包含三个字段： card_id：所选发票卡券的 cardId，encrypt_code：所选发票卡券的加密 code，报销方可以通过 cardId 和 encryptCode 获得报销发票的信息，app_id： 发票方的 appId。 */
  var invoiceInfo: String = js.native
}
object ChooseInvoiceSuccessCallbackResult {
  
  @scala.inline
  def apply(errMsg: String, invoiceInfo: String): ChooseInvoiceSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], invoiceInfo = invoiceInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseInvoiceSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class ChooseInvoiceSuccessCallbackResultMutableBuilder[Self <: ChooseInvoiceSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvoiceInfo(value: String): Self = StObject.set(x, "invoiceInfo", value.asInstanceOf[js.Any])
  }
}
