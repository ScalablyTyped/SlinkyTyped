package typingsSlinky.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLogManagerOption extends StObject {
  
  /** 取值为0/1，取值为0表示是否会把 `App`、`Page` 的生命周期函数和 `wx` 命名空间下的函数调用写入日志，取值为1则不会。默认值是 0
    *
    * 最低基础库： `2.3.2` */
  var level: js.UndefOr[Double] = js.native
}
object GetLogManagerOption {
  
  @scala.inline
  def apply(): GetLogManagerOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLogManagerOption]
  }
  
  @scala.inline
  implicit class GetLogManagerOptionMutableBuilder[Self <: GetLogManagerOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
  }
}
