package typingsSlinky.wechatMiniprogram.WechatMiniprogram.Component

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Property[P /* <: PropertyOption */] extends StObject {
  
  /** 组件的对外属性，是属性名到属性设置的映射表 */
  var properties: P = js.native
}
object Property {
  
  @scala.inline
  def apply[P /* <: PropertyOption */](properties: P): Property[P] = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Property[P]]
  }
  
  @scala.inline
  implicit class PropertyMutableBuilder[Self <: Property[_], P /* <: PropertyOption */] (val x: Self with Property[P]) extends AnyVal {
    
    @scala.inline
    def setProperties(value: P): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
