package typingsSlinky.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 参数列表 */
@js.native
trait UpdatableMessageFrontEndParameter extends StObject {
  
  /** 参数名 */
  var name: String = js.native
  
  /** 参数值 */
  var value: String = js.native
}
object UpdatableMessageFrontEndParameter {
  
  @scala.inline
  def apply(name: String, value: String): UpdatableMessageFrontEndParameter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatableMessageFrontEndParameter]
  }
  
  @scala.inline
  implicit class UpdatableMessageFrontEndParameterMutableBuilder[Self <: UpdatableMessageFrontEndParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
