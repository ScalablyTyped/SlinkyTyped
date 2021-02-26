package typingsSlinky.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetStorageInfoSuccessCallbackOption extends StObject {
  
  /** 当前占用的空间大小, 单位 KB */
  var currentSize: Double = js.native
  
  /** 当前 storage 中所有的 key */
  var keys: js.Array[String] = js.native
  
  /** 限制的空间大小，单位 KB */
  var limitSize: Double = js.native
}
object GetStorageInfoSuccessCallbackOption {
  
  @scala.inline
  def apply(currentSize: Double, keys: js.Array[String], limitSize: Double): GetStorageInfoSuccessCallbackOption = {
    val __obj = js.Dynamic.literal(currentSize = currentSize.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], limitSize = limitSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStorageInfoSuccessCallbackOption]
  }
  
  @scala.inline
  implicit class GetStorageInfoSuccessCallbackOptionMutableBuilder[Self <: GetStorageInfoSuccessCallbackOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentSize(value: Double): Self = StObject.set(x, "currentSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value :_*))
    
    @scala.inline
    def setLimitSize(value: Double): Self = StObject.set(x, "limitSize", value.asInstanceOf[js.Any])
  }
}
