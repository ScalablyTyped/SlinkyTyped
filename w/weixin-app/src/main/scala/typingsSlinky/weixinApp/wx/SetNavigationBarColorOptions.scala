package typingsSlinky.weixinApp.wx

import typingsSlinky.weixinApp.anon.Duration
import typingsSlinky.weixinApp.weixinAppStrings.Numbersign000000
import typingsSlinky.weixinApp.weixinAppStrings.Numbersignffffff
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetNavigationBarColorOptions
  extends BaseOptions[js.Any, js.Any] {
  
  /**
    * 动画效果
    */
  var animation: js.UndefOr[Duration] = js.native
  
  /**
    * 背景颜色值，有效值为十六进制颜色
    */
  var backgroundColor: String = js.native
  
  /**
    * 前景颜色值，包括按钮、标题、状态栏的颜色，仅支持 #ffffff 和 #000000
    */
  var frontColor: Numbersignffffff | Numbersign000000 = js.native
}
object SetNavigationBarColorOptions {
  
  @scala.inline
  def apply(backgroundColor: String, frontColor: Numbersignffffff | Numbersign000000): SetNavigationBarColorOptions = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], frontColor = frontColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetNavigationBarColorOptions]
  }
  
  @scala.inline
  implicit class SetNavigationBarColorOptionsOps[Self <: SetNavigationBarColorOptions] (val x: Self) extends AnyVal {
    
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrontColor(value: Numbersignffffff | Numbersign000000): Self = this.set("frontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimation(value: Duration): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
  }
}
