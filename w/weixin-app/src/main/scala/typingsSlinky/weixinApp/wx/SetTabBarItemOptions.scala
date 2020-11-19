package typingsSlinky.weixinApp.wx

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
  implicit class SetTabBarItemOptionsOps[Self <: SetTabBarItemOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconPath(value: String): Self = this.set("iconPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconPath: Self = this.set("iconPath", js.undefined)
    
    @scala.inline
    def setSelectedIconPath(value: String): Self = this.set("selectedIconPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedIconPath: Self = this.set("selectedIconPath", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
