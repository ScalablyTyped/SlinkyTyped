package typingsSlinky.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 参照区域的边界 */
@js.native
trait RelativeRectResult extends StObject {
  
  /** 下边界 */
  var bottom: Double = js.native
  
  /** 左边界 */
  var left: Double = js.native
  
  /** 右边界 */
  var right: Double = js.native
  
  /** 上边界 */
  var top: Double = js.native
}
object RelativeRectResult {
  
  @scala.inline
  def apply(bottom: Double, left: Double, right: Double, top: Double): RelativeRectResult = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelativeRectResult]
  }
  
  @scala.inline
  implicit class RelativeRectResultMutableBuilder[Self <: RelativeRectResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
