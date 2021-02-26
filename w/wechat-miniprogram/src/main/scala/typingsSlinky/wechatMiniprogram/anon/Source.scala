package typingsSlinky.wechatMiniprogram.anon

import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings._empty
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.`out-of-bounds`
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.`touch-out-of-bounds`
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.friction
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.touch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Source extends StObject {
  
  /**
    * 产生移动的原因
    *
    * - `touch` 拖动
    * - `touch-out-of-bounds` 超出移动范围
    * - `out-of-bounds` 超出移动范围后的回弹
    * - `friction` 惯性
    * - `空字符串` setData
    */
  var source: touch | `touch-out-of-bounds` | `out-of-bounds` | friction | _empty = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object Source {
  
  @scala.inline
  def apply(source: touch | `touch-out-of-bounds` | `out-of-bounds` | friction | _empty, x: Double, y: Double): Source = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
  
  @scala.inline
  implicit class SourceMutableBuilder[Self <: Source] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: touch | `touch-out-of-bounds` | `out-of-bounds` | friction | _empty): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
