package typingsSlinky.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnPageNotFoundCallbackResult extends StObject {
  
  /** 是否本次启动的首个页面（例如从分享等入口进来，首个页面是开发者配置的分享页面） */
  var isEntryPage: Boolean = js.native
  
  /** 不存在页面的路径 (代码包路径) */
  var path: String = js.native
  
  /** 打开不存在页面的 query 参数 */
  var query: IAnyObject = js.native
}
object OnPageNotFoundCallbackResult {
  
  @scala.inline
  def apply(isEntryPage: Boolean, path: String, query: IAnyObject): OnPageNotFoundCallbackResult = {
    val __obj = js.Dynamic.literal(isEntryPage = isEntryPage.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnPageNotFoundCallbackResult]
  }
  
  @scala.inline
  implicit class OnPageNotFoundCallbackResultMutableBuilder[Self <: OnPageNotFoundCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsEntryPage(value: Boolean): Self = StObject.set(x, "isEntryPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: IAnyObject): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
