package typingsSlinky.weappApi.mod.wx

import typingsSlinky.weappApi.weappApiStrings.easeIn
import typingsSlinky.weappApi.weappApiStrings.easeInOut
import typingsSlinky.weappApi.weappApiStrings.easeOut
import typingsSlinky.weappApi.weappApiStrings.linear
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationBarColorAnimationOptions extends StObject {
  
  //  动画变化时间，单位 ms，默认0
  var animation: js.UndefOr[Double] = js.native
  
  //  动画变化方式.动画从头到尾的速度是相同的,动画以低速开始,动画以低速结束,动画以低速开始和结束
  var timingFunc: js.UndefOr[linear | easeIn | easeOut | easeInOut] = js.native
}
object NavigationBarColorAnimationOptions {
  
  @scala.inline
  def apply(): NavigationBarColorAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationBarColorAnimationOptions]
  }
  
  @scala.inline
  implicit class NavigationBarColorAnimationOptionsMutableBuilder[Self <: NavigationBarColorAnimationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: Double): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setTimingFunc(value: linear | easeIn | easeOut | easeInOut): Self = StObject.set(x, "timingFunc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimingFuncUndefined: Self = StObject.set(x, "timingFunc", js.undefined)
  }
}
