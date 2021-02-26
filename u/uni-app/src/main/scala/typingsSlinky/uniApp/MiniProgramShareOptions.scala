package typingsSlinky.uniApp

import typingsSlinky.uniApp.uniAppStrings.`0`
import typingsSlinky.uniApp.uniAppStrings.`1`
import typingsSlinky.uniApp.uniAppStrings.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MiniProgramShareOptions extends StObject {
  
  /**
    * 微信小程序原始id
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * 点击链接进入的页面
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * 微信小程序版本类型，默认为0。
    * - 0: 正式版
    * - 1: 测试版
    * - 2: 体验版
    */
  var `type`: js.UndefOr[`0` | `1` | `2`] = js.native
  
  /**
    * 兼容低版本的网页链接
    */
  var webUrl: js.UndefOr[String] = js.native
}
object MiniProgramShareOptions {
  
  @scala.inline
  def apply(): MiniProgramShareOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MiniProgramShareOptions]
  }
  
  @scala.inline
  implicit class MiniProgramShareOptionsMutableBuilder[Self <: MiniProgramShareOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setType(value: `0` | `1` | `2`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setWebUrl(value: String): Self = StObject.set(x, "webUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebUrlUndefined: Self = StObject.set(x, "webUrl", js.undefined)
  }
}
