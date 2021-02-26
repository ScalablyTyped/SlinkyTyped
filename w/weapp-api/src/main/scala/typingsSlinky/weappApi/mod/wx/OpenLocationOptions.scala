package typingsSlinky.weappApi.mod.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenLocationOptions extends StObject {
  
  /** 地址的详细说明 */
  var address: js.UndefOr[String] = js.native
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ResponseCallback] = js.native
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ResponseCallback] = js.native
  
  /** 纬度，范围为-90~90，负数表示南纬 */
  var latitude: Double = js.native
  
  /** 经度，范围为-180~180，负数表示西经 */
  var longitude: Double = js.native
  
  /** 位置名 */
  var name: js.UndefOr[String] = js.native
  
  /** 缩放比例，范围1~28，默认为28 */
  var scale: js.UndefOr[Double] = js.native
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[ResponseCallback] = js.native
}
object OpenLocationOptions {
  
  @scala.inline
  def apply(latitude: Double, longitude: Double): OpenLocationOptions = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenLocationOptions]
  }
  
  @scala.inline
  implicit class OpenLocationOptionsMutableBuilder[Self <: OpenLocationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setComplete(value: /* res */ js.Any => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ js.Any => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ js.Any => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
