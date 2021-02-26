package typingsSlinky.wechatMiniprogram.WechatMiniprogram

import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.dark
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.light
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnThemeChangeCallbackResult extends StObject {
  
  /** 系统当前的主题，取值为`light`或`dark`
    *
    * 可选值：
    * - 'dark': 深色主题;
    * - 'light': 浅色主题; */
  var theme: dark | light = js.native
}
object OnThemeChangeCallbackResult {
  
  @scala.inline
  def apply(theme: dark | light): OnThemeChangeCallbackResult = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnThemeChangeCallbackResult]
  }
  
  @scala.inline
  implicit class OnThemeChangeCallbackResultMutableBuilder[Self <: OnThemeChangeCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTheme(value: dark | light): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
