package typingsSlinky.uikit.mod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIkitSliderOptions extends StObject {
  
  var autoplay: js.UndefOr[Boolean] = js.native
  
  var `autoplay-interval`: js.UndefOr[Double] = js.native
  
  var center: js.UndefOr[Boolean] = js.native
  
  var draggable: js.UndefOr[Boolean] = js.native
  
  var easing: js.UndefOr[String] = js.native
  
  var finite: js.UndefOr[Boolean] = js.native
  
  var index: js.UndefOr[Double] = js.native
  
  var `pause-on-hover`: js.UndefOr[Boolean] = js.native
  
  var sets: js.UndefOr[Boolean] = js.native
  
  var velocity: js.UndefOr[Double] = js.native
}
object UIkitSliderOptions {
  
  @scala.inline
  def apply(): UIkitSliderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitSliderOptions]
  }
  
  @scala.inline
  implicit class UIkitSliderOptionsMutableBuilder[Self <: UIkitSliderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAutoplay-interval`(value: Double): Self = StObject.set(x, "autoplay-interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAutoplay-intervalUndefined`: Self = StObject.set(x, "autoplay-interval", js.undefined)
    
    @scala.inline
    def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
    
    @scala.inline
    def setCenter(value: Boolean): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    @scala.inline
    def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    @scala.inline
    def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    @scala.inline
    def setFinite(value: Boolean): Self = StObject.set(x, "finite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiniteUndefined: Self = StObject.set(x, "finite", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def `setPause-on-hover`(value: Boolean): Self = StObject.set(x, "pause-on-hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPause-on-hoverUndefined`: Self = StObject.set(x, "pause-on-hover", js.undefined)
    
    @scala.inline
    def setSets(value: Boolean): Self = StObject.set(x, "sets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetsUndefined: Self = StObject.set(x, "sets", js.undefined)
    
    @scala.inline
    def setVelocity(value: Double): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVelocityUndefined: Self = StObject.set(x, "velocity", js.undefined)
  }
}
