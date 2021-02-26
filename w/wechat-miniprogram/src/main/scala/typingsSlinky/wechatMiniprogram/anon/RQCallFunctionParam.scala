package typingsSlinky.wechatMiniprogram.anon

import typingsSlinky.wechatMiniprogram.ICloud.CallFunctionData
import typingsSlinky.wechatMiniprogram.ICloudConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined wechat-miniprogram.RQ<wechat-miniprogram.ICloud.CallFunctionParam> */
@js.native
trait RQCallFunctionParam extends StObject {
  
  var config: js.UndefOr[ICloudConfig] = js.native
  
  var data: js.UndefOr[CallFunctionData] = js.native
  
  var name: String = js.native
  
  var slow: js.UndefOr[Boolean] = js.native
}
object RQCallFunctionParam {
  
  @scala.inline
  def apply(name: String): RQCallFunctionParam = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RQCallFunctionParam]
  }
  
  @scala.inline
  implicit class RQCallFunctionParamMutableBuilder[Self <: RQCallFunctionParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: ICloudConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setData(value: CallFunctionData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlow(value: Boolean): Self = StObject.set(x, "slow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlowUndefined: Self = StObject.set(x, "slow", js.undefined)
  }
}
