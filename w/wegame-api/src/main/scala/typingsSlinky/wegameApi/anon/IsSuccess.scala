package typingsSlinky.wegameApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsSuccess extends StObject {
  
  /**
    * 卡券的扩展参数，值为一个 JSON 字符串
    */
  var cardExt: String = js.native
  
  /**
    * 用户领取到卡券的 ID
    */
  var cardId: String = js.native
  
  /**
    * 加密 code，为用户领取到卡券的code加密后的字符串，解密请参照：code 解码接口
    */
  var code: String = js.native
  
  /**
    * 是否成功
    */
  var isSuccess: Boolean = js.native
}
object IsSuccess {
  
  @scala.inline
  def apply(cardExt: String, cardId: String, code: String, isSuccess: Boolean): IsSuccess = {
    val __obj = js.Dynamic.literal(cardExt = cardExt.asInstanceOf[js.Any], cardId = cardId.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], isSuccess = isSuccess.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsSuccess]
  }
  
  @scala.inline
  implicit class IsSuccessMutableBuilder[Self <: IsSuccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCardExt(value: String): Self = StObject.set(x, "cardExt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardId(value: String): Self = StObject.set(x, "cardId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSuccess(value: Boolean): Self = StObject.set(x, "isSuccess", value.asInstanceOf[js.Any])
  }
}
