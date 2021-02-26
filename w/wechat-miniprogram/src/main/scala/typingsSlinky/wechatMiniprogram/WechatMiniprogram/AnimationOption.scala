package typingsSlinky.wechatMiniprogram.WechatMiniprogram

import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.easeIn
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.easeInOut
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.easeOut
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.linear
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 动画效果 */
@js.native
trait AnimationOption extends StObject {
  
  /** 动画变化时间，单位 ms */
  var duration: js.UndefOr[Double] = js.native
  
  /** 动画变化方式
    *
    * 可选值：
    * - 'linear': 动画从头到尾的速度是相同的;
    * - 'easeIn': 动画以低速开始;
    * - 'easeOut': 动画以低速结束;
    * - 'easeInOut': 动画以低速开始和结束; */
  var timingFunc: js.UndefOr[linear | easeIn | easeOut | easeInOut] = js.native
}
object AnimationOption {
  
  @scala.inline
  def apply(): AnimationOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationOption]
  }
  
  @scala.inline
  implicit class AnimationOptionMutableBuilder[Self <: AnimationOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setTimingFunc(value: linear | easeIn | easeOut | easeInOut): Self = StObject.set(x, "timingFunc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimingFuncUndefined: Self = StObject.set(x, "timingFunc", js.undefined)
  }
}
