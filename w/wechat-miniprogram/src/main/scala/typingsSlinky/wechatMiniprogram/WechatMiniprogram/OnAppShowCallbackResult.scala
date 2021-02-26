package typingsSlinky.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnAppShowCallbackResult extends StObject {
  
  /** 小程序切前台的路径 (代码包路径) */
  var path: String = js.native
  
  /** 小程序切前台的 query 参数 */
  var query: IAnyObject = js.native
  
  /** 来源信息。从另一个小程序、公众号或 App 进入小程序时返回。否则返回 `{}`。(参见后文注意) */
  var referrerInfo: ReferrerInfo = js.native
  
  /** 小程序切前台的[场景值](https://developers.weixin.qq.com/miniprogram/dev/framework/app-service/scene.html) */
  var scene: Double = js.native
  
  /** shareTicket，详见[获取更多转发信息](https://developers.weixin.qq.com/miniprogram/dev/framework/open-ability/share.html) */
  var shareTicket: js.UndefOr[String] = js.native
}
object OnAppShowCallbackResult {
  
  @scala.inline
  def apply(path: String, query: IAnyObject, referrerInfo: ReferrerInfo, scene: Double): OnAppShowCallbackResult = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], referrerInfo = referrerInfo.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnAppShowCallbackResult]
  }
  
  @scala.inline
  implicit class OnAppShowCallbackResultMutableBuilder[Self <: OnAppShowCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: IAnyObject): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferrerInfo(value: ReferrerInfo): Self = StObject.set(x, "referrerInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScene(value: Double): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShareTicket(value: String): Self = StObject.set(x, "shareTicket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShareTicketUndefined: Self = StObject.set(x, "shareTicket", js.undefined)
  }
}
