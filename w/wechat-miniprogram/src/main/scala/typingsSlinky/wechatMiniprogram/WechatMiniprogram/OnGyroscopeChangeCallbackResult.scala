package typingsSlinky.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnGyroscopeChangeCallbackResult extends StObject {
  
  /** x 轴的角速度 */
  var x: Double = js.native
  
  /** y 轴的角速度 */
  var y: Double = js.native
  
  /** z 轴的角速度 */
  var z: Double = js.native
}
object OnGyroscopeChangeCallbackResult {
  
  @scala.inline
  def apply(x: Double, y: Double, z: Double): OnGyroscopeChangeCallbackResult = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnGyroscopeChangeCallbackResult]
  }
  
  @scala.inline
  implicit class OnGyroscopeChangeCallbackResultMutableBuilder[Self <: OnGyroscopeChangeCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
