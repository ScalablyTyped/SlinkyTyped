package typingsSlinky.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetTabBarItemOptions
  extends BaseOptions[js.Any, js.Any] {
  
  /**
    * 图片路径, icon 大小限制为40kb
    * 建议尺寸为 81px * 81px
    * 当 postion 为 top 时，此参数无效，不支持网络图片
    */
  var iconPath: js.UndefOr[String] = js.native
  
  /** tabBar 的哪一项，从左边算起 */
  var index: Double = js.native
  
  /**
    * 选中时的图片路径
    * icon 大小限制为40kb，建议尺寸为 81px * 81px
    * 当 postion 为 top
    */
  var selectedIconPath: js.UndefOr[String] = js.native
  
  /** tab 上按钮文字 */
  var text: js.UndefOr[String] = js.native
}
object SetTabBarItemOptions {
  
  @scala.inline
  def apply(index: Double): SetTabBarItemOptions = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetTabBarItemOptions]
  }
  
  @scala.inline
  implicit class SetTabBarItemOptionsMutableBuilder[Self <: SetTabBarItemOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIconPath(value: String): Self = StObject.set(x, "iconPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconPathUndefined: Self = StObject.set(x, "iconPath", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedIconPath(value: String): Self = StObject.set(x, "selectedIconPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedIconPathUndefined: Self = StObject.set(x, "selectedIconPath", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
