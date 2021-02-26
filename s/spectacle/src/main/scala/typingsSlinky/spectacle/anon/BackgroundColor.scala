package typingsSlinky.spectacle.anon

import slinky.core.facade.ReactElement
import typingsSlinky.spectacle.mod.TemplateFn
import typingsSlinky.spectacle.mod.TransitionEffect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackgroundColor extends StObject {
  
  var backgroundColor: js.UndefOr[String] = js.native
  
  var backgroundImage: js.UndefOr[String] = js.native
  
  var backgroundOpacity: js.UndefOr[Double] = js.native
  
  var backgroundPosition: js.UndefOr[String] = js.native
  
  var backgroundRepeat: js.UndefOr[String] = js.native
  
  var backgroundSize: js.UndefOr[String] = js.native
  
  var children: ReactElement = js.native
  
  var scaleRatio: js.UndefOr[Double] = js.native
  
  var template: js.UndefOr[TemplateFn] = js.native
  
  var textColor: js.UndefOr[String] = js.native
  
  var transitionEffect: js.UndefOr[TransitionEffect] = js.native
}
object BackgroundColor {
  
  @scala.inline
  def apply(): BackgroundColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundColor]
  }
  
  @scala.inline
  implicit class BackgroundColorMutableBuilder[Self <: BackgroundColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setBackgroundImage(value: String): Self = StObject.set(x, "backgroundImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundImageUndefined: Self = StObject.set(x, "backgroundImage", js.undefined)
    
    @scala.inline
    def setBackgroundOpacity(value: Double): Self = StObject.set(x, "backgroundOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundOpacityUndefined: Self = StObject.set(x, "backgroundOpacity", js.undefined)
    
    @scala.inline
    def setBackgroundPosition(value: String): Self = StObject.set(x, "backgroundPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundPositionUndefined: Self = StObject.set(x, "backgroundPosition", js.undefined)
    
    @scala.inline
    def setBackgroundRepeat(value: String): Self = StObject.set(x, "backgroundRepeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundRepeatUndefined: Self = StObject.set(x, "backgroundRepeat", js.undefined)
    
    @scala.inline
    def setBackgroundSize(value: String): Self = StObject.set(x, "backgroundSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundSizeUndefined: Self = StObject.set(x, "backgroundSize", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setScaleRatio(value: Double): Self = StObject.set(x, "scaleRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleRatioUndefined: Self = StObject.set(x, "scaleRatio", js.undefined)
    
    @scala.inline
    def setTemplate(value: /* options */ CurrentSlide => ReactElement): Self = StObject.set(x, "template", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    @scala.inline
    def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
    
    @scala.inline
    def setTransitionEffect(value: TransitionEffect): Self = StObject.set(x, "transitionEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionEffectUndefined: Self = StObject.set(x, "transitionEffect", js.undefined)
  }
}
