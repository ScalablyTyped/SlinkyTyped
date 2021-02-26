package typingsSlinky.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 需要添加的卡券列表 */
@js.native
trait AddCardRequestInfo extends StObject {
  
  /** 卡券的扩展参数。需将 CardExt 对象 JSON 序列化为**字符串**传入 */
  var cardExt: String = js.native
  
  /** 卡券 ID */
  var cardId: String = js.native
}
object AddCardRequestInfo {
  
  @scala.inline
  def apply(cardExt: String, cardId: String): AddCardRequestInfo = {
    val __obj = js.Dynamic.literal(cardExt = cardExt.asInstanceOf[js.Any], cardId = cardId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddCardRequestInfo]
  }
  
  @scala.inline
  implicit class AddCardRequestInfoMutableBuilder[Self <: AddCardRequestInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCardExt(value: String): Self = StObject.set(x, "cardExt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardId(value: String): Self = StObject.set(x, "cardId", value.asInstanceOf[js.Any])
  }
}
