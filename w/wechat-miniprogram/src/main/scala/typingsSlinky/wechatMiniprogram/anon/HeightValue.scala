package typingsSlinky.wechatMiniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeightValue extends StObject {
  
  /** 键盘高度, 在基础库 `1.9.90` 起支持 */
  var height: Double = js.native
  
  /** 输入框内容 */
  var value: String = js.native
}
object HeightValue {
  
  @scala.inline
  def apply(height: Double, value: String): HeightValue = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeightValue]
  }
  
  @scala.inline
  implicit class HeightValueMutableBuilder[Self <: HeightValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
