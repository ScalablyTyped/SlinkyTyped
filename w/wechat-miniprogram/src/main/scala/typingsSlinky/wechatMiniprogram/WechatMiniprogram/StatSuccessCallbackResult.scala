package typingsSlinky.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatSuccessCallbackResult extends StObject {
  
  var errMsg: String = js.native
  
  /** [Stats](https://developers.weixin.qq.com/miniprogram/dev/api/file/Stats.html)|Object
    *
    * 当 recursive 为 false 时，res.stats 是一个 Stats 对象。当 recursive 为 true 且 path 是一个目录的路径时，res.stats 是一个 Object，key 以 path 为根路径的相对路径，value 是该路径对应的 Stats 对象。 */
  var stats: Stats | IAnyObject = js.native
}
object StatSuccessCallbackResult {
  
  @scala.inline
  def apply(errMsg: String, stats: Stats | IAnyObject): StatSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class StatSuccessCallbackResultMutableBuilder[Self <: StatSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStats(value: Stats | IAnyObject): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
  }
}
