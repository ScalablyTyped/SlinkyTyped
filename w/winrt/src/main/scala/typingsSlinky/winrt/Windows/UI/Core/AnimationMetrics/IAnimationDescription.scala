package typingsSlinky.winrt.Windows.UI.Core.AnimationMetrics

import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAnimationDescription extends StObject {
  
  var animations: IVectorView[IPropertyAnimation] = js.native
  
  var delayLimit: Double = js.native
  
  var staggerDelay: Double = js.native
  
  var staggerDelayFactor: Double = js.native
  
  var zOrder: Double = js.native
}
object IAnimationDescription {
  
  @scala.inline
  def apply(
    animations: IVectorView[IPropertyAnimation],
    delayLimit: Double,
    staggerDelay: Double,
    staggerDelayFactor: Double,
    zOrder: Double
  ): IAnimationDescription = {
    val __obj = js.Dynamic.literal(animations = animations.asInstanceOf[js.Any], delayLimit = delayLimit.asInstanceOf[js.Any], staggerDelay = staggerDelay.asInstanceOf[js.Any], staggerDelayFactor = staggerDelayFactor.asInstanceOf[js.Any], zOrder = zOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAnimationDescription]
  }
  
  @scala.inline
  implicit class IAnimationDescriptionMutableBuilder[Self <: IAnimationDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimations(value: IVectorView[IPropertyAnimation]): Self = StObject.set(x, "animations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayLimit(value: Double): Self = StObject.set(x, "delayLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaggerDelay(value: Double): Self = StObject.set(x, "staggerDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaggerDelayFactor(value: Double): Self = StObject.set(x, "staggerDelayFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZOrder(value: Double): Self = StObject.set(x, "zOrder", value.asInstanceOf[js.Any])
  }
}
