package typingsSlinky.weappApi.mod.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//  调试  TODO
// 路由
@js.native
trait routerOptions extends CommonCallbackOptions {
  
  //  需要跳转的应用内非 tabBar 的页面的路径, 路径后可以带参数。参数与路径之间使用 ? 分隔，参数键与参数值用 = 相连，不同参数用 & 分隔；如 'path?key=value&key2=value2'
  var url: String = js.native
}
object routerOptions {
  
  @scala.inline
  def apply(url: String): routerOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[routerOptions]
  }
  
  @scala.inline
  implicit class routerOptionsMutableBuilder[Self <: routerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
